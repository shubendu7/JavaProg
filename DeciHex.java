


import java.util.*;
class DeciHex{
    int num;
    String hexa,strhex="";
    char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    DeciHex(){
        num=0;
        hexa="";
    }

    void getnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        num = sc.nextInt();
        sc.close();
    }

    String convert(int n){
        if(n==0)
            return "0";            
        else {
            int t=n%16;
            strhex=hex[t]+strhex;
            n/=16;
            convert (n);
        }
        return strhex;
    }

    void display(){
        hexa=convert(num);
        System.out.println("The number of base 10 "+num);
        System.out.println("The number of base 16 "+hexa);

    }

    public static void main(String args[]){
        DeciHex ob=new DeciHex();
        ob.getnum();
        ob.display();
    }
}
