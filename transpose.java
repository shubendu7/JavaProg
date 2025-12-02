import java.util.*;
class transpose{
    int arr[][];
    int m;
    transpose(int mm){
        m=mm;
        arr=new int[m][m];
    }
    
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("Index "+i+","+j);
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    static transpose trans(transpose t){
        transpose temp=new transpose(3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                temp.arr[i][j]=t.arr[j][i];
            }
        }
        return temp;
    }
    
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        transpose ob1=new transpose(size);
        System.out.println("Enter the Elements in the array");
        ob1.fillarray();
        transpose ob2=trans(ob1);
        System.out.println("Display original");
        ob1.display();
        System.out.println("Display transpose");
        ob2.display();        
    }
}