package Lecture2;

public class StringExample {
    public static void main(String[] args) {
        String str = "ldkagnlaodng";
        System.out.println(str.charAt(3)); // 'a'
        System.out.println(str.length());// 12
        System.out.println(str.contains("a")); // true
        System.out.println(str.indexOf('z')); // 3
        int res  = str.indexOf('z');
        // res = -1

        if(res == -1)System.out.println("The character is not present");
        else
            System.out.println("The character is presenmt at : " + res);

    }
}
