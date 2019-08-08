package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonRestController {

    private final PersonService personService;

    PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person/{id}")
    public Person findPersonById(@PathVariable Long id) {
        return personService.findPersonById(id);
    }
}
