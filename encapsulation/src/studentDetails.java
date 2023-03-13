public class studentDetails {
    public static void main(String[] args) {
        student obj = new student();

        //setting values of the variables
        obj.setName("Abhi");
        obj.setRoll(10);
        obj.setAge(26);

        //printing the values of the variables
        System.out.println("Name is = " +obj.getName());
        System.out.println("Roll is = " +obj.getRoll());
        System.out.println("Age is = " +obj.getAge());
    }
}