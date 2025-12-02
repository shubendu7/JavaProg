import java.util.*;
class sort_row{
    public static void main(String args[]){
        int sL=0,sR=0;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int M=sc.nextInt();
        int arr[][]=new int [M][M];
        int s=(M-2)*(M-2);
        int arr1[]=new int [s];
        if(M>2 && M<10){
            //Initializing
            System.out.println("Enter the elements of the array at");
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    System.out.println("Index "+i+","+j+" ");
                    arr[i][j]=sc.nextInt();
                }
            }
            //sorting
            int temp=0;
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    for(int k=j+1;k<M;k++){
                        if(arr[i][k]>arr[i][k+1]){
                            temp=arr[i][k+1];
                            arr[i][k+1]=arr[i][k];
                            arr[i][k]=temp;
                        }
                    }
                }
            }
            System.out.println("The sorted array ");
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}