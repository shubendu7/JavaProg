import java.util.*;
class MISP{
    public static void main(String args[]){
        String str,newstr="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        str=sc.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()-i-1;j++){
                if(str.charAt(i)!=str.charAt(j)){
                    newstr+=str.charAt(i);
                }
            }
        }
        System.out.println("The new String "+newstr);
        
    }
}