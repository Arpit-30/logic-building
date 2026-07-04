import java.util.*;
public class arraysize {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int sum=0,i;
        for ( i = 0; i < size; i++) {
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
