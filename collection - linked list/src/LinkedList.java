import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        List<String> list1 = new java.util.LinkedList<>();
        list1.add("CN");
        list1.add("For");
        list1.add("CN");
        list1.add("Abhisek");
        list1.add("Yo");

        List<String> list2 = new java.util.LinkedList<>();
        list2.add("CN");
        list1.removeAll(list2);

        for (String temp : list1)
            System.out.println(temp + " ");
        System.out.println();
    }
}


//1. CN CN
//2. CN For CN
//3. Abhisek
//4. For Abhisek Yo


// answer is option 4. - explanation : list1.removeAll(list2) function deletes all the occurrences of the string in list2
// from list1. here the string "CN" appears in list2, so all the nodes of the linked list in the list1 that contains "CN"
// as its data are removed from list1