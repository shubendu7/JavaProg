package Recursion;

import java.util.*;
class GCD{//Also known as HCF
    int num1;
    int num2;
    GCD(){
        num1=0;num2=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
    }
    int gcd(int x,int y){// 12 8 
        // 12=2*2 * 3
        //  8=2*2 * 2
        if(x==0)//base case
            return y;
        else
            return gcd(y%x,x); 
    }
    void display(){
        int t=gcd(num1,num2);
        System.out.print("The GCD of "+num1+","+num2+" is "+t);
    }
    public static void main(String args[]){
        GCD ob=new GCD();
        ob.accept();
        ob.display();
    }
}