package hello;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
class PersonService {

    private Map<Long, Person> personMap;

    public PersonService() {
        personMap = new HashMap<>();
        personMap.put(1L, new Person(1L, "Name1", "Surname1"));
        personMap.put(2L, new Person(2L, "Name2", "Surname2"));
        personMap.put(3L, new Person(3L, "Name3", "Surname3"));
    }

    Person findPersonById(Long id) {
        return personMap.get(id);
    }
}
