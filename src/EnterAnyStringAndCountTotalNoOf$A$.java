import java.lang.reflect.Array;
import java.util.Scanner;

public class EnterAnyStringAndCountTotalNoOf$A$
{

    public static void main(String[] args)
    {

            Scanner scanner = new Scanner (System.in);
            System.out.println (" Please Enter Any String " );
            String sn = scanner.next ();
            //String[] str = new String[255];
            int count = 0;

            for (int i = 0; i<sn.length ();i++)
            {
                if (sn.charAt (i)=='a')
                {
                    count++;
                }
            }
            System.out.println ("Number of 'a' in a given string is = "+count );
    }
 }

