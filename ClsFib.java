


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class ClsFib {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
                    int a[]=new int[26];
            String str=s.next();
            for(int j=0;j<str.length();j++){
                a[str.charAt(j)-97]++;
            }
            //int counter=0;
            ArrayList<Integer> al=new ArrayList();
            for(int j=0;j<26;j++){
            if(a[j]!=0){
                al.add(a[j]);
            }
            }
            
                    int temp[]=new int[al.size()];
                    
                    for(int j=0;j<al.size();j++){
                        temp[j]=al.get(j);
                    }
            Arrays.sort(temp);
            
            String ans="Dynamic";
            
            for(int j=2;j<temp.length;j++){
                if(temp[j]!=temp[j-1]+temp[j-2]){
                    ans="Not";
                    break;
                }
            }
            
            if(ans.equals("Not")){
                int swap=temp[0];
                temp[0]=temp[1];
                temp[1]=swap;
                ans="Dynamic";
                
            for(int j=2;j<temp.length;j++){
                if(temp[j]!=temp[j-1]+temp[j-2]){
                    ans="Not";
                    break;
                }
            }
                
            }
            System.out.println(ans);
        }
    }
}
