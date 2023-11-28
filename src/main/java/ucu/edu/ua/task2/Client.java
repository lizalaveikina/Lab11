package ucu.edu.ua.task2;

import lombok.Getter;
import lombok.Setter;

enum Sex {
    FEMALE, MALE
}

@Getter
@Setter

public class Client {

    private int id;
    private String name;
    private int age;
    private Sex sex;
    private String mail;

    public static int num = 0;


    public Client(String name, int age, Sex sex, String mail) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;

        id = ++ num; 
    }
}
