package Array;
import java.util.Scanner;

public class Linear_search {

    public static int linearSearch(int arr[],int key){
        try {
            for (int i = 0; i <= arr.length; i++) {
                if (arr[i] == key) {
                    return i + 1;
                }

            }
        }
        catch (Exception e){

        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[]={2,5,8,9,6,0};
        System.out.println("enter the key");
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();

 int pos =linearSearch(arr,key);
 if(pos ==0){
     System.out.println("element not found ");
 }
 else {
     System.out.println( pos);
 }
    }
}
