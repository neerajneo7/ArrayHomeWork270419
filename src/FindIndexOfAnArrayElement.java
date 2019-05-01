public class FindIndexOfAnArrayElement
{

    public static int find(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;

                return -1;// if the target is not found

    }

    public static void main(String[] args) {
        int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is : " + find(a, 25));
        System.out.println("Index position of 77 is : " + find(a, 77));
    }

    }

