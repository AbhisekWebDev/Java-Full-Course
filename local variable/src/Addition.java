public class Addition {

        //function to add 2 num
        public void add() {

            //local variable
            int a = 20, b = 20, c;
            c = a + b;
            System.out.println(c);
        }
        public static void main(String[] args) {
            //creating an object of add class
            Addition obj = new Addition();
            obj.add();
        }

}
