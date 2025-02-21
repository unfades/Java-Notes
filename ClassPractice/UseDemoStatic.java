class DemoStatic{
    public int a;
    public static int b;
}

class UseDemoStatic{
    public static void main(String[] args){
        DemoStatic D1 = new DemoStatic();
        DemoStatic D2 = new DemoStatic();
        DemoStatic D3 = new DemoStatic();
        D1.a = 10;
        D2.a = 20;
        D3.a = 30;
        System.out.println("D1.a is " + D1.a);
        System.out.println("D2.a is " + D2.a);
        System.out.println("D3.a is " + D3.a);

        DemoStatic.b = 10;
        D2.b = 20;
        D3.b = 30;
        System.out.println("D1.b is " + D1.b);
        System.out.println("D2.b is " + D2.b);
        System.out.println("D3.b is " + D3.b);
    }
}
