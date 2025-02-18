import java.util.Scanner;

class SubjectiveAssignment14numberprinting{
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int space = 1;
        for(int i = n; i>0; i--){
            for(int j = 0; j<n; j++){
                System.out.print(n);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = 0; j<n; j++){
                System.out.print(n);
            }
            n--;
            System.out.println();
        }
        //2
        System.out.println("Enter a number:");
        n = sc.nextInt();
        space = 1;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(i+1);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = 0; j<n-i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }

        //3
        
        System.out.println("Enter a number:");
        n = sc.nextInt();
        space = n;
        int num = n;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(num);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = 0; j<=i; j++){
                System.out.print(num);
            }
            num--;
            System.out.println();
        }

        //4
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = n;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=i+1; j++){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = 1; j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //5
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = 1;
        num = n;
        for(int i = 0; i<num; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = 1; j<=n; j++){
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
        //6
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = n;
        for(int i = 1; i<=n; i++){
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        //7
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = 1;
        num = n;
        for(int i = n; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
        //8
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = n;
        for(int i = 0; i<n; i++){
            for(int j = n; j>=n-i; j--){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = n; j>=n-i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        //9
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = 1;
        for(int i = 0; i<n; i++){
            for(int j = n; j>i; j--){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = n; j>i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        //10
        System.out.println("Enter a number");
        n = sc.nextInt();
        space = n;
        for(int i = n; i>0; i--){
            for(int j = i; j<=n; j++){
                System.out.print(j);
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = i; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}