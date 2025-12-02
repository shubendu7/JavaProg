package Array;

import java.util.*;
class Insertion_Sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the elements");
        for(int i=1;i<10;i++){
            System.out.print("Index "+i+" ");
            arr[i]=sc.nextInt();
        }
        
        //Insertion Sort
        
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        
        // Display
        
        for(int i=1;i<10;i++){
            System.out.print(arr[i]+" ");
          
        }
    }
}