public class addition {
    static int add(int a,int b) {
       return a + b; 
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(10,30));
        System.out.println(add(10.5,8.95,1.25));
    }
}
