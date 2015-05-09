package pl.designpatterns.structual.proxy;

import java.util.HashMap;
import java.util.Map;

public class Database implements PersonRetriever {

    private Map<Integer, Person> personMap = initializeDatabase();

    @Override
    public Person retrievePerson(int id) {
        // this suppose to take some time...
        return personMap.get(id);
    }

    private Map<Integer, Person> initializeDatabase() {
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, new Person("John","Smith" , 43));
        map.put(2, new Person("Mark","Twaing" , 55));
        map.put(3, new Person("Salma","hayek" , 39));
        return map;
    }
}
