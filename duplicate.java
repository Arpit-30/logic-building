import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the field");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter teh elements of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
