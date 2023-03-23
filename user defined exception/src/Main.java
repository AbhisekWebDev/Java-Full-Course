public class Main {

    //creating a method to validate pin code
    public void validatePin(int pin) throws InvalidPinCodeException {
        if (!(pin >= 100000 && <=999999)) {
            throw new InvalidPinCodeException("pin must be of 6 digits")
        }
        System.out.println(pin);
    }
    public static void main(String[] args) throws InvalidPinCodeException {
        System.out.println("Hello world!");
        Main obj = new Main();
        obj.validatePin(12345);
    }




    public class InvalidPinCodeException extends Main {
        public InvalidPinCodeException(String s) {
            super(s);
        }
    }
}