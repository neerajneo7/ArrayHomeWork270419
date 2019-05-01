import java.util.ArrayList;

public class CompareArrayList
{
    public static void main(String[] args)
    {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Audi");
        a1.add("BMW");
        a1.add("Ferrari");
        a1.add("Lambhorgini");
        a1.add("Aston Martin");

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Audi");
        a2.add("BMW");
        a2.add("Ferrari");
        a2.add("Lambhorgini");
        a2.add("Vauxhall");

        System.out.println("Compared Array Result : ");
        ArrayList<String> a3 = new ArrayList<String >();

        for (String e: a1)

            a3.add(a2.contains(e) ? "Yes" : "No");
            System.out.println(a3);

        
    }
}
