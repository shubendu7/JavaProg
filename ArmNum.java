package Recursion;

import java.util.*;
class ArmNum{
    int n,p;
    ArmNum(int nn){
        n=nn;
        p=0;
        int x=n;
        while(x!=0){
            x/=10;
            p++;
        }
    }

    int sum_pow(int i){
        int a=i;
        if(a==0){
            return 0;
        }
        else{
            return ((int)(Math.pow(a%10,3))+sum_pow(a/10));
        }
    }

    void isArmstrong(){
        if(sum_pow(n)==n){
            System.out.println("The number is ArmStrong");
        }
        else
            System.out.println("The number is not ArmStrong");
    }
    
    public static void main(String args[]){
        Scanner cs=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int c=cs.nextInt();
        ArmNum ob=new ArmNum(c);
        ob.isArmstrong();
    }
}