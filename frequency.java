import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[]arr=new int[size];
        boolean[] visited=new boolean[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the elements in array");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("output");
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
        int counter=1;
        for(int j=i+1;j<arr.length;j++){
            
            if(arr[i]==arr[j]){
                
                counter++;
                visited[j]=true;
            }
        }
        
        System.out.println(arr[i] + " = " + counter);
        }
      sc.close();  
    }
    
}
