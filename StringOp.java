import java.util.*;
class StringOp{
    String str,msk,nstr;
    char ch1,ch2;
    StringOp(){
        str="";
        msk="";
        nstr=" ";
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        str=sc.nextLine();
        System.out.println("Enter the Masking word");
        msk=sc.nextLine();
        sc.close();
    }
    void form(){
        int l1=str.length();//communication
       
        for(int i=0;i<l1;i++){
            ch1=str.charAt(i);
            if(msk.indexOf(ch1)==-1){//mont.indexOf(o);
                nstr+=ch1;//cuicai
            }
        }
    }
    void display(){
        
        System.out.println("The Required string :"+nstr);
        
    }
    public static void main(String args[]){
        StringOp ob=new StringOp();
        ob.accept();
        ob.form();
        ob.display();
    }
}