package Letcure1;

public class Pointers {
    public static void main(String[] args) {
        int n  = 10;
        int m  = n;
        Human h = new Human("Anaj" , 28, 10 ,10);
        Human human = h;
        human.incrementAge();
        m++;
        System.out.println(m); // 11
        // both of them will give 29 as they both are pointing to the same memory block and
        // some changes on any one of the  object will change the another as well
        System.out.println(h.getAge()); // 29
        System.out.println(human.getAge()); // 29
        Human h1 = new Human("Anjanay" , 21 , 178 , 75);
        Human h2 = new Human("Anjanay" , 21 , 178 , 75);
        // they will give false as both of them have different memory blocks
        System.out.println(h1 == h2); // false
        h1 = h2;
        // they will give true as both of them have the same memory blocks
        System.out.println(h1 == h2); // true

    }
}
