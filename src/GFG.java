//public class GFG {
//    // function to print combinations of numbers
//// in given input string
//    static void printCombinations(char[] input,
//                                  int index,
//                                  char[] output,
//                                  int outLength)
//    {
//        // no more digits left in input string
//        if (input.length == index)
//        {
//            // print output string & return
//            System.out.println(String.valueOf(output));
//            return;
//        }
//
//        // place current digit in input string
//        output[outLength] = input[index];
//
//        // separate next digit with a space
//        output[outLength + 1] = ' ';
//
//        printCombinations(input, index + 1, output,
//                outLength + 2);
//        // if next digit exists make a
//        // call without including space
//        if(input.length!=index + 1){
//            System.out.println(index);
//            printCombinations(input, index + 1, output,
//                    outLength + 1);
//
//        }
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        char input[] = "1214".toCharArray();
//        char []output = new char[100];
//
//        printCombinations(input, 0, output, 0);
//    }
//}

// Java program to generate power set in
// lexicographic order.
import java.util.*;

public class GFG {

    // str : Stores input string
    // n : Length of str.
    // curr : Stores current permutation
    // index : Index in current permutation, curr
    static void permuteRec(String str, int n,
                           int index, String curr)
    {
        // base case
        if (index == n) {
            return;
        }
        System.out.println(curr);
        for (int i = index + 1; i < n; i++) {

            curr += str.charAt(i);
            permuteRec(str, n, i, curr);

            // backtracking
            curr = curr.substring(0, curr.length() - 1);
            System.out.print(curr +" ");

        }
        return;
    }

    // Generates power set in lexicographic
    // order.
    static void powerSet(String str)
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        permuteRec(new String(arr), str.length(), -1, "");
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "cab";
        powerSet(str);
    }
}


