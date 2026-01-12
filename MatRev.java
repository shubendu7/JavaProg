import java.util.*;
class MatRev{
    int m;
    int n;
    int arr[][];
    MatRev(int  mm,int nn){
        m=mm;
        n=nn;
        arr= new int[mm][nn];
    }
    
    void fillarray(Scanner sc){
        System.out.println("Enter the numbers");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("At "+i+","+j);
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    int reverse(int x){
        int sum=0;
        while(x!=0){
            int d=x%10;
            sum=sum*10+d;
            x/=10;
        }
        return sum;
    }
    
    void revMat(MatRev p){
        MatRev q=new MatRev(m,n);
        for(int i=0;i<p.m;i++){
            for(int j=0;j<p.n;j++){
                int temp=reverse(p.arr[i][j]);
                q.arr[i][j]=temp;
            }
        }
        System.out.println("The original array");
        p.show();
        System.out.println("The required array");
        q.show();
    }
    
    void show(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size i.e, m and n value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        MatRev ob=new MatRev(a,b);
        ob.fillarray(sc);
        ob.revMat(ob);
        sc.close();
    }
}