package animals;

import animals.config.MyConf;
import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class, Cat.class, Dog.class, Parrot.class);
        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

    }
}
