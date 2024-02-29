package animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name ="Vasya";

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }
}
