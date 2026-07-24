public class Area {
    static int area(int side){
        return side*side;
    }
    static int area(int length,int breath){
        return length*breath;
    }
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(10,20));
    }
}
