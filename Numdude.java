package Recursion;

import java.util.*;
class Numdude{
    int num;
    Numdude(){
        num=0;
    }

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }

    int sumdigits(int x){
        if(x==0)
            return 0;

        else
            return x%10+sumdigits(x/10);
    }
    
    void isNumdude(){
        if((int)(Math.pow(sumdigits(num),3))==num){
            System.out.println("The number is numdude");
        }
        else
            System.out.println("The number is not numdude");
    }
    
    public static void main(String args[]){
        Numdude ob=new Numdude();
        ob.input();
        ob.isNumdude();
    }
}