import java.util.*;
class GCD{//Also known as HCF
    int num1;
    int num2;
    GCD(){
        num1=0;num2=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two non-negative numbers:");
        // Use Math.abs to ensure numbers are non-negative for GCD calculation.
        num1=Math.abs(sc.nextInt());
        num2=Math.abs(sc.nextInt());
        sc.close(); // Good practice to close the scanner.
    }
    // This is a more standard and robust recursive implementation of the Euclidean algorithm.
    // gcd(a, b) = gcd(b, a % b)
    int gcd(int a, int b){
        if(b==0)//base case
            return a;
        else
            return gcd(b, a % b); 
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