
class P1{
    public void Functional(int a ,int b){
        if(a>1){
            if(a%b==0)
                System.out.print(b+" ");
                Functional(a/b,b);
        }
        else
        Functional(a,b+1);
    }
}
