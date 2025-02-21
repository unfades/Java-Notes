class Num{
    private int a;
    private int b;

    public void setNum(int i, int j){
        a = i;
        b = j;
    }
    public void showNum(){
        System.out.println("Val of a,b: "+a+","+b);
    }

    public void swap(Num A, Num B){
        int temp = A.a;
        A.a = B.a;
        B.a = temp;
        temp = A.b;
        A.b = B.b;
        B.b = temp;
    }
}

class UseNum{
    public static void main(String[] args){
        Num N1 = new Num();
        Num N2 = new Num();
        N1.setNum(10,20);
        N2.setNum(90,100);
        System.out.println("Before swapping N1 and N2: ");
        N1.showNum();
        N2.showNum();
        Num Temp = new Num();
        Temp.swap(N1, N2);
        System.out.println("After swapping N1 and N2: ");
        N1.showNum();
        N2.showNum();
    }
}

//Will this swap?
/* 
public void swap(){
    Num X;
    X = P;
    P = Q;
    Q = X;
}
*/

//No it will not swap the values of Data members a and b,
//neither will it swap N1 and N2

//It will just swap P and Q, and this change will have 
//no effect on N1 and N2.

