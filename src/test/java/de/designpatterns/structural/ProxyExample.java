/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structural;

import de.designpatterns.structual.proxy.CachingProxy;
import de.designpatterns.structual.proxy.Database;
import de.designpatterns.structual.proxy.LoggingProxy;
import de.designpatterns.template.DesignPatternTestTemplate;
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
