import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the element of the array");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to search");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Found......");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("number not availabe");
        }
    }
}
