
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
       int i;
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(i=0;i<arr.length;i++){
            System.out.println("enter a number:");
            arr[i]=sc.nextInt();
            
        }
        for ( i = 0; i <arr.length; i++) {  
        System.out.println(arr[i]);
        }
        // System.out.println("Array list are:");
        // System.out.println(arr[0]);
        //  System.out.println(arr[1]);
        //   System.out.println(arr[2]);
        //    System.out.println(arr[3]);
        //     System.out.println(arr[4]);
   }
}
