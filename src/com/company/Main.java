import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here Sum of Array
        int myArray[] = {45, 4, 3, 2};
        int sum = 0;
        for (int i : myArray)
            sum += i;
        System.out.println("The sum is:" + sum);


        //#3
        double a = 30;
        double b = 2;
        System.out.println(Math.pow(a, b));

        a = 3;
        b = 4;
        System.out.println(Math.pow(a, b));

        //For Loop Practice

        int arr[]={2,4,5,6};
        for ( int num : arr){
            System.out.println(num);
        }


    }
}
