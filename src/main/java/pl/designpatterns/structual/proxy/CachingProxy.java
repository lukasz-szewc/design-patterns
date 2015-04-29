/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class CachingProxy implements PersonRetriever {

    private Map<Integer, Person> personMap = new HashMap<Integer, Person>();
    private final Database database;

    public CachingProxy() {
        database = new Database();
    }

    @Override
    public Person retrievePerson(int id) {
        Person personFromCache = personMap.get(id);
        if (personFromCache != null) {
            System.out.println("Retrieved object from cache: " + personFromCache);
            return personFromCache;
        } else {

            Person retrievedPerson = database.retrievePerson(id);

            if (retrievedPerson != null) {
                personMap.put(id, retrievedPerson);
                System.out.println("Caching object in cache : " + retrievedPerson);
            }
            return retrievedPerson;
        }

    }
}
