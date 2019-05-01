import java.util.ArrayList;

public class CheckWhetherGivenElementIsPresentOrNot
{
    public static void main(String[] args)
    {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        aList.add("E");
       //Inbuilt code CONTAINS will check the element and give you the boolean statement
        System.out.println("The element C is available in ArrayList? " + aList.contains("C"));
        System.out.println("The element Z is available in ArrayList? " + aList.contains("Z"));
        /* another way to use boolean is as below
        * boolean ans = aList.contains("A)
        * if (ans)
        * System.out.println("The element A is available in ArrayList")
        * else
        * System.out.println("The element A is not available in ArrayList")

        * ans = aList,contains("G")
        *  if (ans)
        * System.out.println("The element G is available in ArrayList")
        * else
        * System.out.println("The element G is not available in ArrayList")  */

                    //OR

        //      if(aList.contains("C"))
        //         System.out.println("The element C is available in the ArrayList");
        //      else
        //         System.out.println("The element C is not available in the ArrayList");
        //      if(aList.contains("H"))
        //         System.out.println("The element H is available in the ArrayList");
        //      else
        //         System.out.println("The element H is not available in the ArrayList");


    }
}
