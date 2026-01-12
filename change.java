import java.util.*;
class change{
    String wrd,newwrd,t;
    char ch1,ch2[]={'A','E','I','O','U'};
    int c=0,v=0;
    change(){
        wrd="";
        newwrd="";
        t="";
    }

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        wrd=sc.nextLine().toUpperCase();
        sc.close();
    }

    void freq(){
        int l=wrd.length();
        for(int i=0;i<l;i++){
            ch1=wrd.charAt(i);
            if(ch1=='A' ||ch1== 'E' || ch1=='I'||ch1=='O'||ch1=='U'){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("Freq of vowels "+v+"\n"+"Freq of consonants "+c);
    }
    
    void arrange(){
        for(int i=0;i<wrd.length();i++){
            ch1=wrd.charAt(i);
            if(ch1=='A' ||ch1== 'E' || ch1=='I'||ch1=='O'||ch1=='U'){
                newwrd+=ch1;
            }
            else{
                t+=ch1;
            }
        }
    }
    
    void display(){
        String concat=newwrd+t;
        System.out.println("The string : "+concat);
    }
    
    public  static void main(String args[]){
        change ob=new change();
        ob.accept();
        ob.freq();
        ob.arrange();
        ob.display();
    }
}
