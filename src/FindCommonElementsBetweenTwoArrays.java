public class FindCommonElementsBetweenTwoArrays
{
    public static void main(String[] args)
    {
        String[] cars1 = {"Audi", "BMW", "Lambhorgini", "Ferrari", "Aston Martin"};
        String[] cars2 = {"Audi", "BMW Z-Class", "Lambhorgini", "Ferrari", "Vauxhall"};

        // Itertaing cars1
        for (int i = 0; i < cars1.length; i++)
        {   //Iterating cars2
            for (int j = 0; j < cars2.length; j++)
            {   // Compares cars & cars2
                if (cars1[i] == cars2[j])
                {
                    System.out.println("Common Elements are : " + cars1[i]);
                }
            }
        }
    }
}
