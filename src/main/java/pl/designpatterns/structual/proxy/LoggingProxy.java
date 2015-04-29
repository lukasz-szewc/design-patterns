/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.proxy;

/**
 *
 */
public class LoggingProxy implements PersonRetriever {
    private final Database database;

    public LoggingProxy() {
        database = new Database();
    }

    @Override
    public Person retrievePerson(int id) {

        System.out.println("Trying to retrieve person with ID: " + id);
        Person person = database.retrievePerson(id);
        if (person == null) {
            System.out.println("Sorry there is no person id DB with ID: " + id);
        } else {
            System.out.println("I found person : " + person);
        }
        return person;
    }

}
