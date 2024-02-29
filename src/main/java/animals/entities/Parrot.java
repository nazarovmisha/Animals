package animals.entities;


import org.springframework.context.annotation.Bean;

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
