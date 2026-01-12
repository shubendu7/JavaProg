package Recursion;

import java.util.*;
class Fibo{
    int start,end;
    Fibo(){
        start=0;
        end=0;
    }
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and the end");
        start=sc.nextInt();
        end=sc.nextInt();
        sc.close();
    }
    int fibo_series(int n)
    {
        if(n==0||n==1)
        return n;
        else
        return fibo_series(n-1)+fibo_series(n-2);
    }
    void display(){
        
        System.out.println("The Fibo Series");
        for(int i=start;i<end;i++){
            int p=fibo_series(i);
            System.out.println(p+" ");
        }
    }
    public static void main(String args[]){
        Fibo ob=new Fibo();
        ob.read();
        ob.display();
    }
}