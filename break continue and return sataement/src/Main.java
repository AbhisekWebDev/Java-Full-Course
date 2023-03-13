class Break {

    //ye banaye constructor me
     Break() {
        for (int i = 1; i < 10; i++) {
            //terminate the loop if i is 5
            if (i == 5)
                break;
            System.out.println(i + " ");
        }
    }
}

class Continue {

    //ye banaye method me
    void show() {
        for (int i = 1; i < 10; i++) {
            //skip the value when i is 3
            if (i == 3)
                continue;
            System.out.println(i + " ");
        }
    }
}

class ContinueInNestedLoop {

    //ye banaye method me
    void show() {
        for (int i = 1; i <= 3; i++)
        {
            for (int j=1 ; j<=3 ; j++)
            {
                if (i==2 && j==2)
                    continue;
                System.out.println(i + " " + j);
            }
        }
    }
}

class BreakInNestedLoop {

    //ye banaye constructor me
    BreakInNestedLoop() {
        for (int i = 1; i <= 3; i++)
        {
            for (int j=1 ; j<=3 ; j++)
            {
                if (i==2 && j==2)
                    break;
                System.out.println(i + " " + j);
            }
        }
    }
}

class Return {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        Break obj1 = new Break();

        Continue obj2 = new Continue();

        ContinueInNestedLoop obj3 = new ContinueInNestedLoop();

        obj2.show();

        obj3.show();

        BreakInNestedLoop obj4 = new BreakInNestedLoop();
        

        Return obj5 = new Return();
        System.out.println(obj5.sum(10, 20));

    }
}