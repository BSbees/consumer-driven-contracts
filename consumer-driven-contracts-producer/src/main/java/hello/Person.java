package hello;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Person {
    private Long id;
    private String name;
    private String surname;
}
