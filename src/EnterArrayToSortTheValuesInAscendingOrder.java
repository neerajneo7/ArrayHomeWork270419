import java.util.Arrays;
import java.util.Scanner;

public class EnterArrayToSortTheValuesInAscendingOrder {
    public static void main(String[] args)
    {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the Elements : ");
        // below is to read the elements
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        System.out.println("Ascending order for given elements are : ");
        for (int Number : a) {
            System.out.print(Number + ",");
        }
        // sorting elements
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = i+1; j < n; j++)
//            {
//                if (a[i] > a[j])
//                {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Ascending Order for the given elements are  : ");
//        // print sorted elements
//        for (int i = 0; i < n-1 ; i++)
//        {
//            System.out.print(a[i] + ",");
//        }
//        System.out.println(a[n-1]);
//    }

    }
}
