import java.util.*;
class Merge{
    int arr[],cap;
    Merge(int mm){
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
    static Merge mix(Merge p, Merge q){
        Merge temp=new Merge(p.cap+q.cap);
        int index=0;
        for(int i=0;i<p.cap;i++)
            temp.arr[index++]=p.arr[i];
        for(int i=0;i<q.cap;i++)
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
        Merge ob1=new Merge(c1);
        System.out.println("Enter the array1");
        ob1.input(sc);
        Merge ob2=new Merge(c2);
        System.out.println("Enter the array2");
        ob2.input(sc);
        Merge ob3=mix(ob1,ob2);
        System.out.println("Display array1 ");
        ob1.display();
        System.out.println(" array2 ");
        ob2.display();
        System.out.println("Resultant array ");
        ob3.display();
        sc.close();
    }
}