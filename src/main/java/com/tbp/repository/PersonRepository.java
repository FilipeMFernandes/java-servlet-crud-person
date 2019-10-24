package com.tbp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PersonRepository {

    static Map<String, Person> personMap;

    static {
        Person john = new Person("John", "rua aaaa, 102", "5521997791170");
        Person mary = new Person("Mary", "rua bbbb, 2000", "5522999999999");
        Person andrew = new Person("Andrew", "rua cccc, 303", "5523998989898");

        personMap = new HashMap<String, Person>();
        personMap.put(john.getName(), john);
        personMap.put(mary.getName(), mary);
        personMap.put(andrew.getName(), andrew);
    }

    public List<Person> findAll() {
        List<Person> personList = new ArrayList<Person>();
        personList.addAll(personMap.values());
        return personList;
    }

    public void save(Person person) {
        personMap.put(person.getName(), person);
    }

    public void delete(String name) {
        personMap.remove(name);
    }

    public Person getByName(String name) {
        return personMap.get(name);
    }
}
