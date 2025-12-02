import java.util.*;
class Matrix{
    int arr[][];
    int m,n;
    static Scanner sc=new Scanner(System.in);
    Matrix(int mm,int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray(){
        
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Index "+i+","+j);
                arr[i][j]=sc.nextInt();
            }
        }
    }
    Matrix submat(Matrix A){
        Matrix temp=new Matrix(m,n);
        for(int i=0;i<A.m;i++){
            for(int j=0;j<A.n;j++){
                temp.arr[i][j]=A.arr[i][j]-this.arr[i][j];
            }
        }
        return temp;
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the values of m and n");
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        Matrix ob1=new Matrix(x,y);
        Matrix ob2=new Matrix(x,y);
        Matrix ob3=new Matrix(x,y);
        
        ob1.fillarray();
        ob2.fillarray();
        ob3=ob2.submat(ob1);
        System.out.println("1st Matrix");
        ob1.display();
        System.out.println("2nd Matrix");
        ob2.display();
        System.out.println("The subtracted matrix");
        ob3.display();
    }
}