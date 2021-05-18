import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*;
import java.math.*;
class ButterflyArray
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 
        int T = s.nextInt(); 
		while(T-->=1)
		{
			int n = s.nextInt();
			int arr[] = new int[n];
			int zero= 0,one = 0,minus_one=0,others = 0;
			for(int i=0;i<n;i++)
			{
				arr[i] = s.nextInt();
				if(arr[i]==0)
					zero++;
				else if(arr[i] == 1)
					one++;
				else if(arr[i] == -1)
					minus_one++;
				else
					others++;
			}
			if(others>1)
				System.out.println("no");
			else
			{
				if(minus_one>1&&one==0)
					System.out.println("no");
				else if(others==1&&minus_one>0)
					System.out.println("no");
				else
					System.out.println("yes");
			}
		}
    } 
} 
