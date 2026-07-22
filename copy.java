
import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =sc.nextInt();
        int[]copy=new int[size];
        int[]arr=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("enter the element of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("copied array");
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(copy[i]);
        }
    }
}
