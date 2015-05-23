package pl.designpatterns.structual.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements PersonRetriever {

    private Map<Integer, Person> cashedPeopleMap = new HashMap<Integer, Person>();
    private final Database database;

    public CachingProxy(Database database) {
        this.database = database;
    }

    @Override
    public Person retrievePerson(int id) {
        Person personFromCache = cashedPeopleMap.get(id);
        if (personFromCache != null) {
            return personFromCache;
        } else {
            Person retrievedPerson = database.retrievePerson(id);
            if (retrievedPerson != null) {
                cashedPeopleMap.put(id, retrievedPerson);
            }
            return retrievedPerson;
        }
    }

    public boolean contains(Person person) {
        return cashedPeopleMap.containsValue(person);
    }
}
