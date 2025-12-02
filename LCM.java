package Recursion;

import java.util.*;
class LCM{
    int n1,n2;
    int large,sm;
    int l;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>n2){
            large=n1;
            sm=n2;
        }
        else{
            large=n2;
            sm=n1;
        }
    }
    int getLCM(){
        if(large!=sm){
            if(large>sm)
                large=large-sm;
            
            else if(large<sm)
                sm=sm-large;
            return getLCM();
        }
        else
            return (n1*n2)/large;
    }
    void display(){
        l=getLCM();
        System.out.println("LCM of "+n1+","+n2+" is "+l);
    }
    public static void main(String args[]){
        LCM ob=new LCM();
        ob.accept();
        ob.display();
    }
}