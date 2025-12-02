import java.util.*;
class Initials{
    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        str=sc.nextLine().toLowerCase();
        str=' '+str;
        String newstr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                newstr+=ch;
                i++;
                ch=str.charAt(i);
                newstr+=Character.toUpperCase(ch);
            }
            else{
                newstr+=ch;
            }
        }
        System.out.println("" + newstr);
    }
}