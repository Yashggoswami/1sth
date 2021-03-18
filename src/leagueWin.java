import java.util.*;
public class leagueWin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        HashMap<String,Integer>
                map = new HashMap<>();
        for(int j=0;j<i;j++){
        String team1=sc.next();
        String team2=sc.next();
        String[] matchscore=sc.next().split("-");
            if(!map.containsKey(team1)) map.put(team1,0);
            if(!map.containsKey(team2)) map.put(team2,0);
            if(Integer.valueOf(matchscore[0])>Integer.valueOf(matchscore[1]))    map.replace(team1,map.get(team1)+2);
            else if(Integer.valueOf(matchscore[0])<Integer.valueOf(matchscore[1]))    map.replace(team2,map.get(team2)+2);
            else {
                map.replace(team1, map.get(team1) + 1);
                map.replace(team2, map.get(team2) + 1);
            }
        }
        String wonTeam=Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        System.out.println(wonTeam);
        System.out.println(map.get(wonTeam));
    }
}
