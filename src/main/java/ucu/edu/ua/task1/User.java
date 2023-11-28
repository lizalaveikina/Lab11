package ucu.edu.ua.task1;

import lombok.experimental.SuperBuilder;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;



import java.util.List;

enum Gender {
    FEMALE, MALE
}

@SuperBuilder
@ToString
@Getter

public class User extends OnePerson {

    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    @Singular(value = "job")
    private List<String> job;

    public User(String name, int age, Gender gender, double weight, double height, List<String> job) {

        super(name);
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.job = job;

    }

    public User(String name, int age, Gender gender, List<String> job) {

        super(name);
        this.age = age;
        this.gender = gender;
        this.job = job;

    }

    public User(String name, Gender gender, List<String> job) {

        super(name);
        this.gender = gender;
        this.job = job;

    }

    public User(String name, List<String> job) {

        super(name);
        this.job = job;
        
    }

    public static void main(String[] args) {
        User newUser = User.builder()
                            .name("Liza")
                            .age(18)
                            .gender(Gender.FEMALE)
                            .weight(60.0)
                            .height(175.0)
                            .job("UCU")
                            .build();
        System.out.println(newUser);
    }
}
