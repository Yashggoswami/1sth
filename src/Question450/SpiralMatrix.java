package Question450;
import java.util.ArrayList;
public class SpiralMatrix {

    public static void helperGetSprial(int[][] matrix,int direction,int R,int C,int i,int j,ArrayList<Integer> arrlist) {
        //check i and j is not out of bound
        if (i >= 0 && j >= 0 && i < R && j < C) {
            //if element is not visited
            if (matrix[i][j] > 0) {
                //add element to arrlist
                arrlist.add(matrix[i][j]);
                //setting value element to -1 i.e.visited element
                matrix[i][j] = -1;
                //left to right
                if (direction == 0) {
                    helperGetSprial(matrix, 0, R, C, i, j + 1, arrlist);
                    direction=1;
                }//top to bottom
                if (direction == 1) {
                    helperGetSprial(matrix, 1, R, C, i + 1, j, arrlist);
                    direction=2;
                }//right to left
                if (direction == 2) {
                    helperGetSprial(matrix, 2, R, C, i - 1, j, arrlist);
                    direction=3;
                }//bottom to top
                if (direction == 3) {
                    helperGetSprial(matrix, 3, R, C, i, j - 1, arrlist);
                }
                else{
                    helperGetSprial(matrix, 0, R, C, i, j , arrlist);

                }//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

                }

            }


        }







    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        int R=4;
        int C=4;
        ArrayList<Integer> arrlist=new ArrayList<>();
        helperGetSprial(matrix,0,R,C,0,0,arrlist);
        for(int x:arrlist)
        {
            System.out.print(x+" ");
        }
    }//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
}
