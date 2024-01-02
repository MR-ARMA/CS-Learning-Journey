class CustomException extends Exception {
   public CustomException(String message) {
       super(message);
   }
}

public class Main {
   public static void validateInput(int input) throws IllegalArgumentException, CustomException {
       if (input < 0) {
           throw new IllegalArgumentException("Input cannot be negative.");
       } else if (input > 100) {
           throw new CustomException("Input exceeds maximum limit.");
       }
   }

   public static void main(String[] args) {
       try {
           validateInput(-5);
           validateInput(150);
           validateInput(50);
       } catch (IllegalArgumentException | CustomException e) {
           System.out.printtln(e.getMessage());
       }
   }
}
