import java.util.*;
class Add_mat{
    int arr[][];
    int m,n;
    static Scanner sc=new Scanner(System.in);
    Add_mat(int mm,int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray(){
        
        System.out.println("Enter the Array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Index "+i+","+j);
                arr[i][j]=sc.nextInt();

            }
        }
    }
    Add_mat add(Add_mat p){
        Add_mat temp=new Add_mat(m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp.arr[i][j]=p.arr[i][j]+this.arr[i][j];
            }
        }
        return temp;
    }
    void display(){
        System.out.println("The array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the array size");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        Add_mat ob1=new Add_mat(a,b);
        Add_mat ob2=new Add_mat(a,b);
        Add_mat ob3=new Add_mat(a,b);
        
        ob1.fillarray();
        ob2.fillarray();
        
        ob3=ob1.add(ob2);
        System.out.println("Display");
        ob1.display();
        ob2.display();
        ob3.display();
    }
    
}