import  java.util.*;
class Pattern{
    static void pattern1(int n){
        System.out.println("PATTERN - 1");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        System.out.println("PATTERN - 2");
        for(int i =0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        System.out.println("PATTERN - 3");
        for(int i = 0;i <= n;i++){
            for(int j = 1;j <=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        System.out.println("PATTERN - 4");
        for(int i = 0;i < n;i++){
            for(int j = 0;j <=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        System.out.println("PATTERN - 5");
        for(int i = n+1;i > 0;i--){
            for(int j = i-1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        System.out.println("PATTERN - 6");
        for(int i = n+1; i > 0; i--){
            for(int j = i-1; j > 0; j--){
                System.out.print(-1*(j-i));
            }
            System.out.println();
        }
    }


        static void pattern7(int n)
        {
            System.out.println("PATTERN - 7");
            for (int i = 0; i < n; i++)
            {
                for (int j =0; j<n-i-1; j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j< 2*i+1;j++){

                    System.out.print("*");
                }
                System.out.println();
            }
        }
        static void pattern8(int n){
        System.out.println("PATTERN - 8");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n*2-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        System.out.println("PATTERN - 9");
        for (int i = 0; i < n; i++)
        {
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j< 2*i+1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n*2-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        System.out.println("PATTERN - 10");
        for(int i =0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n+1;i > 1;i--){
            for(int j = i-1; j > 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
        System.out.println();
        pattern8(n);
        System.out.println();
        pattern9(n);
        System.out.println();
        pattern10(n);
    }
}
