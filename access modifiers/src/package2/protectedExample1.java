package package2;

import package1.protectedExample;
public class protectedExample1 extends protectedExample {
    public static void main(String[] args) {
        protectedExample obj = new protectedExample();

        obj.val += 20;

        obj.show1();
    }
}

import package1.publicExample;

public class publicEx {
    public static void main(String[] args) {
        publicExample obj3 = publicExample();
        obj3.num += 40;
        obj3.show2();
    }
}
