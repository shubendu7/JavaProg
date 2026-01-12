
import java.util.*;
class Bubble_Sort{
    public static void main(String args[]){
        int temp;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];;
        for(int i=0;i<10;i++){
            System.out.println("Index "+i);
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<10-1;i++){
            for(int j=0;j<10-1-i;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println("The sorted array");
        
        for(int i=0;i<10;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close(); // Closing the scanner to prevent resource leak
    }
}