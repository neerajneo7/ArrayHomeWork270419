import java.util.ArrayList;

public class CloneAnArrayList
{
    public static void main(String[] args)
    {

        ArrayList<String> clonearray = new ArrayList<String>();
        clonearray.add("Audi");
        clonearray.add("BMW");
        clonearray.add("Lambhorgini");
        clonearray.add("Ferrari");
        System.out.println("Original Array List : " + clonearray);
        ArrayList<String> newclone = (ArrayList<String>)clonearray.clone();
        System.out.println("Cloned Array List   : " + newclone);
    }


}
