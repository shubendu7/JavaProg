import java.util.*;
class matrix_rot{
    public static void main(String args[]){
        int sL=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int M=sc.nextInt();
        int arr[][]=new int [M][M];
       
        if(M>2 && M<10){
            //Initializing
            System.out.println("Enter the elements of the array at");
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    System.out.print("Index "+i+","+j+" ");
                    arr[i][j]=sc.nextInt();
                }
            }
            //Display original
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            //Rotate matrix
            for(int i=0;i<M;i++){
                for(int j=M-1;j>=0;j--){
                    System.out.print(arr[j][i]+ " ");
                    if((j==0 && (i==0 || i==M-1) || (i==0 && j==M-1) || (j==M-1 && i==M-1))){
                        sL+=arr[i][j];
                    }
                }
                System.out.println();
            }
            System.out.println("The sum of the cornor elements "+sL);
            sc.close();
        }
    }
}