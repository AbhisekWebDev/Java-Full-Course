class math {
    int min() {
        //min of 2 no using math.min function
        int min = Math.min(20, 30);
        return min;
    }

    int max() {
        //max of 2 no using math.max function
        int max = Math.max(50, 70);
        return max;
    }

    double sqrt() {
        //finding square root of a no using math.sqrt function
        double sqrt = Math.sqrt(144);
        return sqrt;
    }
}
public class Main {
    public static void main(String[] args) {
        math obj = new math();
        System.out.println(obj.min());
        System.out.println(obj.max());
        System.out.println(obj.sqrt());
    }
}