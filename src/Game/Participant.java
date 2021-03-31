package Game;

import java.util.ArrayList;
import java.util.List;
public abstract class Participant {
    private String name;
    private int Age;

    public Participant(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }
}
