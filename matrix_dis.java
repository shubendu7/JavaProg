import java.util.*;
class matrix_dis{
    public static void main(String args[]){
        int sL=0,sR=0;
        boolean flag=true;
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
            //checking
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    if(arr[i][j]!=arr[j][i]){
                       flag=false;
                    }
                }
            }
            if(flag)
            System.out.println("Symmetric Matrix");

            //adding diagonals
            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    if(i==j){
                        sL+=arr[i][j];
                    }
                    else if(i+j==M-1){
                        sR+=arr[i][j];
                    }
                }
                
            }
            System.out.println("The sum of left diagonal = "+sL+"\n"+"The sum of right diagonal = "+sR);
        }
        sc.close();
    }
}