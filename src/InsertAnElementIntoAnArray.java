import java.util.Arrays;
import java.util.List;

public class InsertAnElementIntoAnArray {
    public static void main(String[] args)
    {
        int[] num = {10,20,40,50,60};
        int pos = 3;
        int element = 30;
        System.out.println("Original values : " + Arrays.toString(num) );

        for (int i = num.length-1; i > pos-1; i--)
        {
            num[i] = num [i-1];
        }

        num[pos-1] = element;
        System.out.print("New inserted value : " + Arrays.toString(num));

    }
    }

