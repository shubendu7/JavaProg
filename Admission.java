

import java.util.*;
class Admission{
    int admno[]=new int[100];
    Scanner sc=new Scanner(System.in);
    Admission(){
        for(int i=0;i<100;i++){
            admno[i]=0;
        }
    }

    void fillarray(){
        System.out.println("Enter the elements in the array");
        for(int i=0;i<100;i++){
            admno[i]=sc.nextInt();
        }
    }

    int binsearch(int l,int u,int y){// l=lower limit , u=upper limit , y=number to be searched
        if(l>u)
            return (-1);
        else{
            if(admno[(l+u)/2]==y)//Lower+upper/2 = finding the middle element
                return (1);
            else 
            {
                if(admno[(l+u)/2]>y)
                    return (binsearch((l+u)/2+1,u,y));//if the middle element is more than y i.e, 3|4|6|7|8|9|10  number searched is 9 mid is 7
                else 
                    return (binsearch(l,(l+u)/2-1,y));//if the middle element is more than y i.e, 3|4|6|7|8|9|10  number searched is 9 mid is 7
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Admission ob=new Admission();
        ob.fillarray();
        System.out.println("Enter the number to searched");
        int x=sc.nextInt();
        int k=ob.binsearch(0,99,x);
        if(k==1)
            System.out.println("The number is found");
        else
            System.out.println("The number is not found");
        sc.close();
    }
}