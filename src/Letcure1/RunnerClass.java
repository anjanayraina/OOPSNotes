package Letcure1;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        // keywords are the predefined words of a language that execute a certain task
        Scanner s= new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        int height = s.nextInt();
        int weight = s.nextInt();
        Human human = new Human(name , age , height , weight);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
        human.incrementAge();
        System.out.println(human.getAge());

    }
}
