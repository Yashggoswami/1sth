import java.util.*;

class Theatre {
    private int  theatreid;
    private String theatreName;
    private int seatCapacity;
    private double ticketRate;
    private double theatreRating;
    private boolean balconyAvailable;
    Theatre(){
        this.theatreid=0;
        this.theatreName=null;
        this.seatCapacity=0;
        this.ticketRate=0;
        this.theatreRating=0;
        this.balconyAvailable=false;
    }
    Theatre(int theatreid,String theatreName,int seatCapacity,double ticketRate,double theatreRating,boolean balconyAvailable)
    {
        this.theatreid=theatreid;
        this.theatreName=theatreName;
        this.seatCapacity=seatCapacity;
        this.ticketRate=ticketRate;
        this.theatreRating=theatreRating;
        this.balconyAvailable=balconyAvailable;
    }

    public int getTheatreid() {
        return theatreid;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public double getTicketRate() {
        return ticketRate;
    }

    public double getTheatreRating() {
        return theatreRating;
    }

    public boolean isBalconyAvailable() {
        return balconyAvailable;
    }
    public void setTheatreid(int theatreid) {
        this.theatreid = theatreid;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public void setTicketRate(double ticketRate) {
        this.ticketRate = ticketRate;
    }

    public void setTheatreRating(double theatreRating) {
        this.theatreRating = theatreRating;
    }

    public void setBalconyAvailable(boolean balconyAvailable) {
        this.balconyAvailable = balconyAvailable;
    }
}

public class MyClass{

    public static String findTheatreCategory(Theatre[] arr,int value){
        Theatre t=null;
        System.out.println(value);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getTheatreid()==value)
            {
                System.out.println(value);
                t=arr[i];
                break;
            }
        }
        if(t==null)
            return "";

        if(t.isBalconyAvailable())
        {   double rating=t.getTheatreRating();
            if(rating>4)
                return "Ultra Premium";
            else if(rating<=4 || rating>=3)
                return "Premium";
        }

        return "Normal";

    }
    public static Theatre[] searchTheatreByCapacity(Theatre[] arr, double values){

        ArrayList<Theatre> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getSeatCapacity()>(int)values){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty())
            return null;

        Collections.sort(list, new Comparator<Theatre>() {
            @Override
            public int compare(Theatre t2, Theatre t1) {
                double rate1=t1.getTicketRate();
                double rate2= t2.getTicketRate();
                return (int)(rate2-rate1);
            }
        });

     return list.toArray(new Theatre[list.size()]);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Theatre[] arr=new Theatre[4];
        for(int i=0;i<4;i++)
        {
                int  theatreid=sc.nextInt();
                String theatreName= sc.next();
                int seatCapacity=sc.nextInt();
                double ticketRate=sc.nextDouble();
                double theatreRating=sc.nextDouble();
                boolean balconyAvailable=sc.nextBoolean();
                arr[i]=new Theatre(theatreid,theatreName,seatCapacity,ticketRate,theatreRating,balconyAvailable);
        }
        int value=sc.nextInt();
        double values=sc.nextDouble();
        String str = MyClass.findTheatreCategory(arr,value);
        Theatre[] ans = MyClass.searchTheatreByCapacity(arr,values);

        if(str==null || str.length()<=0)
            System.out.println("There is no Theatre with the given Theatre ID");
        else
            System.out.println(str);
        if(ans==null)
            System.out.println("Only low capacity theatres available");
        else
            for(Theatre t:ans)
            {
                System.out.println(t.getTheatreid());
            }
    }
}


//111
//Centrallllllll
//1200
//350
//5
//true
//222
//yashgoswami
//1100
//250
//4
//true
//333
//arjun
//1000
//150
//3.5
//false
//444
//ellora
//1150
//180
//4.2
//false
//333
//1000