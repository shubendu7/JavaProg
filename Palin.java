

import java.util.*;
class Palin{
    int num,revnum;
    Palin(){
        num=0;
        revnum=0;
    }

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        num=sc.nextInt();
        sc.close();
    }

    int reverse(int y){
        /*while(y!=0){
        d=y%10;
        sum+=Integer.toString(d);*/
        if(y==0){
            return revnum;
        }
        else
            revnum=revnum*10+y%10;
            
        return reverse(y/10);
    }
    
    void check(){
        if(num==reverse(num)){
            System.out.println("The number is palin :- "+num);
        }
        else
            System.out.println("The number is not palin :- "+num);
    }
    
    public static void main(String args[]){
        Palin ob=new Palin();
        ob.accept();
        ob.check();
    }
}
