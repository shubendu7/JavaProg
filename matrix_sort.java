import java.util.*;
class matrix_sort{
    public static void main(String args[]){
        int sL=0,sR=0;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int M=sc.nextInt();
        int arr[][]=new int [M][M];
        int s=(M-2)*(M-2);
        int arr1[]=new int [s];
        if(M>3 && M<10){
            //Initializing
            System.out.println("Enter the elements of the array at");
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    System.out.println("Index "+i+","+j+" ");
                    arr[i][j]=sc.nextInt();
                }
            }
            // sorting 
            int k=0;
            for(int i=1;i<M-1;i++){
                for(int j=1;j<M-1;j++){
                    arr1[k]=arr[i][j];  
                    k++;
                }
            }
            int tmp=0;
            for(int i=0;i<s;i++){
                for(int j=i+1;j<s;j++){
                    if(arr1[i]>arr1[j]){
                        tmp=arr1[j];
                        arr1[j]=arr1[i];
                        arr1[i]=tmp;
                    }
                }
                tmp=0;
            }
            k=0;
            for(int i=1;i<M-1;i++){
                for(int j=1;j<M-1;j++){
                    arr[i][j]=arr1[k];
                    k++;
                }
            }
            //Rearranged matrix
            System.out.println("The Rearranged Matrix");
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}