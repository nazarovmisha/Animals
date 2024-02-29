package animals.entities;

import org.springframework.stereotype.Component;

@Component("Parrot-kesha")
public class Parrot {
    private String name = "Kesha";

    public String getName() {
        return name;
    }

    public Parrot setName(String name) {
        this.name = name;
        return this;
    }
}
