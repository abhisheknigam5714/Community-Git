package Recursion_Part_1;

public class Recusionbasic {

    //1.
    public static void printdec(int num){
        if (num<=0){
            return;
        }
        System.out.println(num);
        printdec(num-1);
    }

    //2.

    public static void printinc(int n){
        if (n <= 0) {

            return;
        }
        printinc(n -1);
        System.out.println(n);
    }
    //3.
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn =n*fnm1;
        return fn;
    }

    //4.
    public static int Natsum(int n){
        if (n==1){
            return 1;
        }
        int Sumnm1=Natsum(n-1);
        int Sum=n+Sumnm1;
        return Sum;
    }

    //5.

    public static int  fibbonacci(int n){
        if (n==0||n==1){
            return n;
        }
        int fnm1=fibbonacci(n-2);
        int fnm2= fibbonacci(n-1);
       int sum=fnm2+fnm1;
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
       // printdec(n);
       // printinc(n);
//        int factsum=fact(n);
//        System.out.println(factsum);
//        int totalsum=Natsum(n);
//        System.out.println(totalsum);
  int fibseries=  fibbonacci(n);
        System.out.println(fibseries);

    }
}
