import java.util.*;
class adder{
    int a[];
    adder(int n){
        n=2;
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=0;
        }
        
    }
    void readTime(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Time");
         a[0]=sc.nextInt();
         a[1]=sc.nextInt();
    }
    static adder addtime(adder X, adder Y){
        adder temp=new adder(2);
        temp.a[0]=X.a[0]+Y.a[0];
        temp.a[1]=X.a[1]+Y.a[1];
        
        if(temp.a[1]>=60){
            temp.a[0]++;
            temp.a[1]-=60;
        }
        return temp;
    }
    void display(){
        System.out.println("Hours = "+a[0]+" Minutes = "+a[1]);
    }
    public static void main(String args[]){
        adder ob1=new adder(2);
        adder ob2=new adder(2);
        adder ob3=addtime(ob1,ob2);;
        ob1.readTime();
        ob2.readTime();
        
        ob1.display();
        ob2.display();
        ob3.display();
    }
}