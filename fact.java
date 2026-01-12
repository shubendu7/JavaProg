

import java.util.*;
class fact{
    int n,f;
    fact(){
        n=0;
    }
    int facto(int num){
        n=num;
        if(n==0||n==1)
            return 1;
        else 
            return (n*facto(n-1));
    }
    void get(int x){
        int b=x;
        f=facto(b);
        System.out.println("The factorial of "+x+" is "+f);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        fact ob=new fact();
        ob.get(a);
        sc.close();
    }
}