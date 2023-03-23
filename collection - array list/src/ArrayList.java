import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList obj = new java.util.ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D");
        System.out.println(obj);
    }
}

// output A, D, B, C - explanation : obj is an object of a class ArrayList hence it is a dynamic array that can increase
// and  decrease its size. obj.add("X") adds to the array element X and obj.add(1, "X") adds element X at the index position 1 in the list,
// hence obj.add(1, "D") stores D at the index position 1 of obj and shifts the previous value stored at that position by 1





