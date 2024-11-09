package Array;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Binary_Search {

    public static int BinarySearch(int arr[], int key) {
    int low=arr[0];
    int high = arr.length;
    int mid =(low +high)/2;
        for (int i = 0; i < arr.length ; i++) {
            if (mid <key){
                high =mid ;
            } else if (mid ==key) {
                return mid;

            } else{
                low =mid +1;
            }

        }
        return mid;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of the array");
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (Exception e) {
        }


        System.out.println("enter the key");
        int key=sc.nextInt();
       int pos = BinarySearch(arr,key);
        System.out.println(pos);
    }
}