class string {
    void str1() {
        String str1 = "ABHISEK KUMAR";
        System.out.println(str1.length());
    }

    void str2() {
        String str2 = "abhisek kumar";
        System.out.println(str2.toUpperCase());
    }

    String str3() {
        String str3 = "ABHISEK KUMAR";
        return str3;
    }
}
public class Main {
    public static void main(String[] args) {
        string obj = new string();
        obj.str1();
        obj.str2();
        System.out.println(obj.str3().toLowerCase());
    }
}