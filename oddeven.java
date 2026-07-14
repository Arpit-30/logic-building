
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size =sc.nextInt();
        int[]arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the elements of the array:");
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2==0){
                even++;
                
            }
            else{
                odd++;
                
            }
            
        }
        System.out.print("even:"+even);
         System.out.print("odd:"+odd);
    }
}
