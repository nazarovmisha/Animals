package animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Sharik";

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }
}
