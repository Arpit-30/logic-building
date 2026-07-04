
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0,i;
        for ( i = 0; i < 5; i++) {
            System.out.println("Enter the number in array:");
            arr[i]=sc.nextInt();
          
        }
        for(i=0;i<arr.length;i++){
            // System.out.println("sum of all the array are");
        sum = sum + arr[i];
         
        }
        System.out.println("sum of all the array is:");
       System.out.println(sum);
    }
}
