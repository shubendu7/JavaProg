package Recursion;

import java.util.*;
class SeriesSum{
    int x,n,sum;
    SeriesSum(int xx,int nn){
        x=xx;
        n=nn;
        sum=0;
    }

    double FindFact(int m){
        if(m==0||m==1){
            return 1;
        }
        else 
            return (m*FindFact(m-1));
    }

    double FindPower(int x,int y){
        if(y==0){
            return 1;
        }
        else{
            return (x*(FindPower(x,y-1)));
        }
    }

    void calculate(){
        double t;
        for(int i=0;i<=n;i++){
            t=(double)(FindPower(x,2*i)/FindFact(2*i-1));
            sum+=t;
        }
    }

    void Display(){
        System.out.println("Sum of the series"+sum);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and the power");
        int a=sc.nextInt();
        int b=sc.nextInt();
        SeriesSum ob=new SeriesSum(a,b);
        ob.calculate();
        ob.Display();
    }
}