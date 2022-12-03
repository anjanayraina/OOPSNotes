package Lecture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 4, -1, 5, 3 }; // Example int array
        int max = array[0];
        for(int  i=0;i<array.length;i++){
            if(array[i] > max)max = array[i];
        }
        System.out.println(max);
        int index = 0;
        // index++ is post increment , this executes the statement firt and then increments the value of index
        System.out.println(array[index++]); // 1
        System.out.println(index);// 1
        index =0;
        // ++index is the pre increment , this executes the statment after incrementing the value of index
        System.out.println(array[++index]); // 4
        System.out.println(index);// 1
    }
}
