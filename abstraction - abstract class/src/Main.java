// Abstract class
abstract class School {

    // Non-abstract method
    public void show() {
    System.out.println("School Application");

}

// Abstract method
abstract int getAdmissionFee();
}
class DAV extends School {

    // Overriding the method from 'School'class
    int getAdmissionFee() {
    return 25000;
    }
}
class DPS extends School {

    // Overriding the method from 'School' class
    int getAdmissionFee() {
    return 35000;
    }
}
class JNV extends School {

    // Overriding the method from 'School' class
    int getAdmissionFee() {
    return 1000;
    }
}
public class Main {
    public static void main(String args[]) {
        School s = new DAV();
        s.show();
        System.out.println("DAV Admission Fee: " + s.getAdmissionFee());
        s = new DPS();
        System.out.println("DPS Admission Fee: " + s.getAdmissionFee());
        s = new JNV();
        System.out.println("JNV Admission Fee: " + s.getAdmissionFee());
    }
}