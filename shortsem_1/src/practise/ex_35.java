package practise;

import java.util.*;

public class ex_35 {
    public static void main(String[] args) {
        payment p = new payment();
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        while (attempts < 3) {
            try {
                System.out.print("Enter phone number: ");
                String ph = sc.nextLine();
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                sc.nextLine(); 
                p.payto(ph, amt); 
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (TimeoutException e1) {
                System.out.println("Timeout error: " + e1.getMessage());
            } catch (NetworkException e2) {
                System.out.println("Network error: " + e2.getMessage());
            } catch (Exception e3) {
                System.out.println("Other error: " + e3.getMessage());
            } finally {
                System.out.println("Attempt: " + (attempts + 1));
                attempts++;
            }

            if (attempts == 3) {
                System.out.println("No more attempts allowed.");
            }
        }
        sc.close();
    }
}

class payment {
    int amount;
    long phno;

    public void payto(String a, int amount) throws Exception {
        if (!a.matches("\\d{10}")) {
            throw new InputMismatchException("Phone number must be 10 digits");
        } else if (amount < 0) {
            throw new NetworkException("Negative amount not allowed");
        } else if (amount > 1000) {
            throw new TimeoutException("Amount too high, transaction timed out");
        }
        System.out.println("Payment successful to " + a + " of Rs." + amount);
    }
}

class NetworkException extends Exception {
    NetworkException(String m) {
        super(m);
    }
}

class TimeoutException extends Exception {
    TimeoutException(String m) {
        super(m);
    }
}
