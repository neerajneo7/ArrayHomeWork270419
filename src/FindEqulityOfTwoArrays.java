import java.util.Arrays;

public class FindEqulityOfTwoArrays
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

        if(Arrays.equals(a,b))
        {
            System.out.println("The Elements are same ");
        }else
            System.out.println("The Elements are not same ");

    }
}
