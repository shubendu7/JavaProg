import java.util.*;
class Mixarray{
    int arr[],cap;
    Mixarray(int mm){
        cap=mm;
        arr=new int[cap];
    }
    void input(Scanner sc){
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(" At index "+i);
            arr[i]=sc.nextInt();
        }
    }
    static Mixarray mix(Mixarray p, Mixarray q){
        Mixarray temp=new Mixarray(6);
        int index=0;
        for(int i=0;i<3;i++)
            temp.arr[index++]=p.arr[i];
        for(int i=0;i<3;i++)
            temp.arr[index++]=q.arr[i];
        return temp;
    }
    void display(){
        for(int i=0;i<cap;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of both the  arrays");
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        Mixarray ob1=new Mixarray(c1);
        System.out.println("Enter the array1");
        ob1.input(sc);
        Mixarray ob2=new Mixarray(c2);
        System.out.println("Enter the array2");
        ob2.input(sc);
        Mixarray ob3=mix(ob1,ob2);
        System.out.println("Display array1 ");
        ob1.display();
        System.out.println(" array2 ");
        ob2.display();
        System.out.println("Resultant array ");
        ob3.display();
        sc.close();
    }
}