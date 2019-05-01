import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Numeric$StringArray
{


    public static void main(String[] args)
    {
        // here we have assigned 5 values to int and String in Array
        int[] num = {15, 201, 2, 20, 521};
        String[] str = {"Audi", "BMW", "Ferrari", "Aston Martin", "Lambhorgini"};

        System.out.println("Original Numeric Values : " + Arrays.toString(num));
        Arrays.sort(num); // this will sort out the numbers in correct order
        System.out.println("Sorted Numeric Values : " + Arrays.toString(num));

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Original String Values are : " + Arrays.toString(str));
        // below is the inbuilt method.
        Arrays.sort(str);// this will sort out the string in correct order
        System.out.println("Sorted String Values are : " + Arrays.toString(str));

    }
}
