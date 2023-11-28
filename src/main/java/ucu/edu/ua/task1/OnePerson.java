package ucu.edu.ua.task1;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class OnePerson {

    protected String name;
    
    public OnePerson(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OnePerson{" + "clientName=" + name;
    }
}
