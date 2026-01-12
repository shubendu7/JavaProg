                

import java.util.*;
class Selection_Sort{//Ascending Order
    public static void main(String args[]){
        int min,temp;
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the number at index "+i);
            arr[i]=sc.nextInt();
        }
        //Sorting 
        for(int i=0;i<9;i++){
            min=i;
            for(int j=i+1;j<10;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        //Display
        System.out.println("The sorted Array");
        for(int s=0;s<10;s++){
            System.out.print(arr[s]+" ");
        }
        sc.close();
    }
}