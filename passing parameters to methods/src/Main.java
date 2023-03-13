public class Main {
    public static void increase(int x, int y) {
        x++;
        y+=2;
        //x & y are formal parameters
        System.out.println(x+ ":" +y);
    }
    public static void main(String[] args) {
        int a = 20, b = 10;
        increase(a,b);
        //a & b are actual parameters
        System.out.println(a+ ":" +b);
    }
}