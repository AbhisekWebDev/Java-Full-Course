public class student {
    public static int roll;
    public static String name = "Abhi";
}
class studentDemo {
    public static void main(String[] args) {
        //accessing static variable without creating object
        student.roll = 10;
        System.out.println(student.name + " roll " + student.roll);
    }
}
