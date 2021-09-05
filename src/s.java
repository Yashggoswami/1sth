import java.util.*;
import java.io.*;

public class s {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
    }
    public static void main(String[] args) throws IOException{
        FastReader fast = new FastReader();
        int t = fast.nextInt();
        while(t-->0){
            int n = fast.nextInt();
            int k = fast.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = fast.nextInt();
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
            for(int i = 0 ; i<n; i++)
            {
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i);

            }

            int[] ans = new int[n];

            ArrayList<Integer> remaining = new ArrayList<>();

            for(Map.Entry<Integer,ArrayList<Integer>> pair:map.entrySet())
            {
                if(pair.getValue().size()>=k)
                {
                    for(int i = 1;i <= k; i++)
                    {
                        ans[pair.getValue().get(i-1)] = i;
                    }
                }else{
                    remaining.addAll(pair.getValue());
                }
            }

            int size = remaining.size()%k;
            for(int i = 0 ;i<remaining.size()-size;i++)
            {
                ans[remaining.get(i)] = (i%k)+1;
            }

            for(int a:ans) System.out.print(a+" ");
            System.out.println();


        }
    }
}


// 1 1 0 2 3 2 2 1 3 3