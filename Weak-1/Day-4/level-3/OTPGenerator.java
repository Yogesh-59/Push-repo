import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
   //method to generate otp
    public static int generateOTP() {
        int min = 100000; // declear minimum 6-digit number
        int max = 999999; // declear maximum 6-digit number
        return (int) (Math.random() * (max - min + 1) + min);
    }
    //method to provide are otp's unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use a boolean array to track generated OTPs
        boolean[] used = new boolean[1000000]; // Array to track used OTPs

        for (int otp : otps) {
            if (used[otp]) {
                return false; // duplicate OTP found
            }
            used[otp] = true;
        }

        return true; // all OTPs are unique
    }

    public static void main(String[] args) {
        int[] generatedOTPs = new int[10];
      //create array generated OTP as size is 10
        for (int i = 0; i < 10; i++) {
            generatedOTPs[i] = generateOTP();
        }
        //check is opt is unique
        if (areOTPsUnique(generatedOTPs)) {
            System.out.println("All generated OTPs are unique.");
            for (int otp : generatedOTPs) {
                System.out.println("OTP: " + otp);
            }
        } else {
            System.out.println("Generated OTPs are not unique.");
        }
    }
}