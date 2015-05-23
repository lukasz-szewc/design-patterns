package pl.designpatterns.structural;

import org.testng.Assert;
import pl.designpatterns.structual.proxy.CachingProxy;
import pl.designpatterns.structual.proxy.Database;
import pl.designpatterns.structual.proxy.InvocationProxy;
import pl.designpatterns.structual.proxy.Person;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class ProxyExample extends DesignPatternTestTemplate {

    public ProxyExample() {
        super("Proxy");
    }

    @Test(description = "Tests the same object is retrieved via proxy and without")
    public void testLoggingProxy() {
        //given
        Database database = new Database();

        //when
        InvocationProxy invocationProxy = new InvocationProxy(database);

        //then
        Assert.assertEquals(database.retrievePerson(1), invocationProxy.retrievePerson(1));
    }

    @Test(description = "Tests proxy is intercepting invocations to database")
    public void testName() throws Exception {
        //given
        InvocationProxy invocationProxy = new InvocationProxy(new Database());

        //when
        invocationProxy.retrievePerson(1);
        invocationProxy.retrievePerson(2);
        invocationProxy.retrievePerson(3);

        //then
        Assert.assertEquals(invocationProxy.interceptedInvocationsNumber(), 3);
    }

    @Test(description = "Tests Cache contains person after invocation")
    public void testCachingProxy() {
        //given
        CachingProxy cachingProxy = new CachingProxy(new Database());

        //when
        Person person = cachingProxy.retrievePerson(1);

        //then
        Assert.assertTrue(cachingProxy.contains(person));
    }
}
