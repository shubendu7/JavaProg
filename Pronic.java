import java.util.*;
class Pronic{
    int num,a;
    Pronic(){
        num=0;
    }
    
    void acceptnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        num=sc.nextInt();
    }
    
    boolean ispronic(int v){
        if(v*(v-1)==num){
            return true;
        }
        else if(v==0){
            return false;
        }
        else
            return ispronic(v-1);
    }
    
    void check(){
        if(ispronic(num))
        System.out.println("The number is pronic");
        else 
        System.out.println("The number is not pronic");

    }
    
    public static void main(String args[]){
        Pronic ob=new Pronic();
        ob.acceptnum();
        ob.check();
    }
}