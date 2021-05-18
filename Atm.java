import java.util.*;
import java.io.*;

class atm 
{
public static void main(String args[])
{ 
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
int a=0;
for (int q=1;q<=t ;q++){ 
    int[][] p = new int[4][3];
    
    for(int i=0 ; i<3 ; i++ ){
        for(int j=0 ; j<3 ; j++ ){
            
            p[i][j] = sc.nextInt();
            
        }
    }
    
    p[3][0]= p[0][0];
    p[3][1]= p[0][1];
    p[3][2]= p[0][2];    
    
    for(int i=0 ; i<3 ; i++ ){
        {
            
            if(p[i][0] == p[i+1][0]&& p[i][1] == p[i+1][1] && p[i][2] == p[i+1][2])
            {}
            
            else
            {
            if(p[i][0] >= p[i+1][0]&& p[i][1] >= p[i+1][1] && p[i][2] >= p[i+1][2])
            {a++;}
            else if(p[i][0] <= p[i+1][0]&& p[i][1] <= p[i+1][1] && p[i][2] <= p[i+1][2])
            {a++;}
            }}
    }
    
    if(a==3)
        System.out.println("yes");
    else
        System.out.println("no");
    a=0;
    
    
}

    
}}  
