package Question450;
import java.util.Scanner;

public class FindElementInMatrix {
public static boolean searchInMatrix(int [][]matrix,int row,int col,int target)
{
    if((row<0 || row>=matrix.length) || (col<0 || col>=matrix.length))
        return false;

    if(matrix[row][col]==target)
        return true;


        if(matrix[row][col]>target)
        {
            return searchInMatrix(matrix,row-1,col,target);
        }else{
            return searchInMatrix(matrix,row,col+1,target);
        }


}

public static void main(String args[])
{
    int[][] matrix={{16, 28, 60, 64},
            {22, 41, 63, 91},
            {27, 50, 87, 93},
            {36, 78, 87, 94 }};
    int target=64;

    System.out.println(searchInMatrix(matrix,matrix.length-1,0,target));
}
}
