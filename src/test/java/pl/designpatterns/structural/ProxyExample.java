/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structural;

import pl.designpatterns.structual.proxy.CachingProxy;
import pl.designpatterns.structual.proxy.Database;
import pl.designpatterns.structual.proxy.LoggingProxy;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class ProxyExample extends DesignPatternTestTemplate {

    public ProxyExample() {
        super("Proxy");
    }

    @Test(description = "Tests proxy object that logs access to target object")
    public void testLoggingProxy() {
        Database database = new Database();

        LoggingProxy loggingProxy = new LoggingProxy();
        loggingProxy.retrievePerson(1);
        database.retrievePerson(1);

        loggingProxy.retrievePerson(10);
        database.retrievePerson(10);

    }

    @Test(description = "Tests Proxy that works as cache object")
    public void testCachingProxy() {

        CachingProxy cachingProxy = new CachingProxy();
        cachingProxy.retrievePerson(1);
        cachingProxy.retrievePerson(1);
        cachingProxy.retrievePerson(1);

        cachingProxy.retrievePerson(10);
        cachingProxy.retrievePerson(10);

    }

}
