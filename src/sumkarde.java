import java.util.Scanner;

public class sumkarde {
    public static int dateToDay(int y, int m, int d){

        int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};

        y -= m<3?1:0;

        return (y+t[m-1]+d+y/4-y/100+y/400)%7;

    }
    public static void main(String[] args) {
        System.out.println(dateToDay(2021,1,2));
    }
}
