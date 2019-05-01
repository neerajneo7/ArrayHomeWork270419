public class Array2DToTransposeAMatrix
{

    public static void main(String[] args)
    {
        int original[][] = {{1,4,7},{2,5,8},{3,6,9}};
        int transpose [][] = new int [3][3];

        System.out.println("Matrix Before Transpose : ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                transpose [i][j] = original[i][j];// this will assign the original values to transpose
                // = means it assigns the value from right operand to left operand
                System.out.print(original[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix After Transpose : ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
               System.out.print(original[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
