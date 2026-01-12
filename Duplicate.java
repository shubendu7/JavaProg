import java.util.*;
class  duplicate{
    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        str=sc.nextLine().toLowerCase();
        char ch=' ';
        String newStr=" ";
        for(int i=0;i<str.length();i++){
            if(ch!=str.charAt(i))
            newStr+=ch;
            ch=str.charAt(i);
        }
        System.out.println("The Resulted String\n"+newStr);
        sc.close();
        
    }
}