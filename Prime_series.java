package Recursion;

import java.util.*;
class Prime_series{
    Scanner sc=new Scanner(System.in);
    int limit;
    int arr[];
    Prime_series(){
        limit=0;
        arr=new int[limit];
    }
    
    void readList(){
        System.out.println("Enter the limit");
        limit=sc.nextInt();
        for(int i=0;i<limit;i++){
            System.out.println("Enter the element at index "+i);
            arr[i]=sc.nextInt();
        }
    }
    
    int IsPrime(int num,int j,int f){
        if(j==num)
        return f;
        else{
            if(num%j==0)
            f=0;
            return (IsPrime(num,++j,f));
        }
    }
    
    void print(){
        int v;
        for(int i=0;i<limit;i++){
            v=IsPrime(arr[i],2,1);
            if(v==1){
                System.out.println("The number "+arr[i]+" is Prime");
            }
        }
    }
    
    public static void main(String args[]){
        Prime_series ob=new Prime_series();
        ob.readList();
        ob.print();
    }
}