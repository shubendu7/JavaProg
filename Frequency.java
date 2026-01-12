import java.util.*;
class Frequency{
    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        str=sc.nextLine().toLowerCase();
        for(char ch='a';ch<='z';ch++){
            int c=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    c++;
                }
            }
            if(c!=0)
            System.out.println("Character "+ch+" is of frequency "+c);
        }
        sc.close();
    }
}