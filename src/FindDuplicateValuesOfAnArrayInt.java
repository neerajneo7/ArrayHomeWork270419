import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDuplicateValuesOfAnArrayInt
{

    public static void main(String[] args)
    {
        int[] array = {1,1,2,3,4,4,5,6,6,1};

//        for (int i = 0; i < array.length; i++)
//        {
//            for (int j = i+1 ; j < array.length; j++)
//            {
//                if ((array[i] == array[j]))
//               {
//                System.out.println("Duplicate Values : " + array[j]);
//                }
//            }
//       }
        Arrays.sort(array);// array gets sorted in ascending order
        for (int i = 1; i < array.length ; i++)
        {
            if (array[i-1] == array[i])
            {
                System.out.println("Duplicate Values : " + array[i]);
                i+=1;
            }
        }
    }
}
