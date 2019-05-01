import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArrayOfGivenValue
{
    public static void main(String[] args)
    {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array before reversing : " + Arrays.toString(a));

//         Reverse method using for loop
//        for (int i=0; i<a.length/2;i++)
//        {
//            int temp = a[i];
//            a[i] = a[a.length-i -1];
//            a[a.length-i -1] = temp;
//        }
        int temp; // to assign the temp value
        int start = 0;// this is where the index will start
        int end = a.length - 1; // this is doing to decrease the index by 1 in length

        while(start<end)
        {
            //{1,2,3,4,5,6,7,8,9,10}
            temp = a[start];// assign the first value of index to temp
            a[start]=a[end];//1st index is swapping its value by last index
            a[end]=temp;// now the value of temp that was given by start is assigned to end hence value is swapped.

            start++;// this will go from beginning to end
            end--;// this will go from end to beginning
        }


        System.out.println("Array after reversing : " + Arrays.toString(a));

    }

}
