
import java.util.*;
class capital{
    String sent;
    int freq;
    capital(){
        sent="";
        freq=0;

    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        sent=sc.nextLine();
        
    }
    public boolean iscap(String w){
        char ch=w.charAt(0);
        if(ch>='A' || ch<='Z')
        return true;
        else 
        return false;
    }
    public void  display(){
        System.out.println("The String  "+sent);
        System.out.println("The frequency  "+freq);
    }
    public static void main(String args[]){
        capital ob=new capital();
        ob.input();
        StringTokenizer st=new StringTokenizer(ob.sent);
        int x=st.countTokens();
        for(int i=1;i<=x;i++){
            if(ob.iscap(st.nextToken()))
            ob.freq++;
        }
        ob.display();
    }
}