import java.util.Scanner;

public class FindArrayThatContainsASpecificValue
{
    public static void main(String[] args) {

        // For loop to find the value
//        int[] myArray = {55, 45, 69, 44};
//        int num = 55;

//        for (int i = 0; i < myArray.length; i++) {
//            if (num == myArray[i]) {
//                System.out.println("Array contains the given element");
//            }
//        }


        // for each and if else loop to find the value using scanner value

        int[] a = {1, 2, 5, 6, 8, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to be found : ");
        int find = sc.nextInt();

        boolean found = false;

        for (int i : a){
            if (i == find)
            {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(find + " is found");
        }else
            System.out.println(find + " is not found");
    }

}