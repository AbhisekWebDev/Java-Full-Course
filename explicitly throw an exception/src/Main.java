public class Main {
    public static void main(String[] args) {

        int availBalance = 5000, withdrawalAmount = 6000;

        try {
            if (availBalance < withdrawalAmount) {
                throw new ArithmeticException("insufficient balance");
            } else {
                availBalance -= withdrawalAmount;
                System.out.println("transaction successful");
                System.out.printf("available balance " + availBalance);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}