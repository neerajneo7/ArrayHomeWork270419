import java.util.Arrays;

public class SumValuesOfAnArray
{

    public static void main(String[] args)
    {

        int[] a = {5,6,7,8,9};
        int sum = 0;

        for(int i : a)
            sum = sum + i;
        // you can also use sum += i
        // += is an operator where left will add the right operand to the left operand and result to left operand

        System.out.println("The Sum is " + sum);

    }
}
