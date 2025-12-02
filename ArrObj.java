// Reverse Number
import java.util.*;
class ArrObj{
    int size;
    int A[];
    ArrObj(int s){
        size=s;
        A=new int [size];
    }
    
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
    }
    
    
    /* if without object then 
     * A[]={51,25,98};
     * B[]={15,52,89};
     * if with object then
     * rb1.A[]
     */
    void findreverse(ArrObj rb1){
        ArrObj rb2=new ArrObj(size);
        for(int i=0;i<rb1.size;i++){
            int t=reverse(rb1.A[i]);  
            rb2.A[i]=t;
        }
        System.out.println("The original array");
        rb1.display();
        System.out.println("The reversed array");
        rb2.display();
    }
    
    int reverse(int v){
        int sum=0;
        while(v!=0){
            int d=v%10;
            sum=sum*10+d;
            v/=10;
        }
        return sum;
    }
    
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(A[i]+" ");
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int ss=sc.nextInt();
        ArrObj ob=new ArrObj(ss);
        ob.fillarray();
        ob.findreverse(ob);
    }
}