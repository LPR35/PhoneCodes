import java.util.Scanner;

public class PhoneCodes {
    static String encode(long s)
    {
        String result = "";

// Stating the 2 Arrays ---------------------------------------

        char[]arr1 = new char[]{'0','1','A','D','L','U','K','E','R','W'};
        int[]arr2  = new int[]{1,1,3,3,4,5,6,7,8,4};

// While Loop to repeat the loop for each digit ---------------

        while(s!=0)
        {
            int digit = (int)(s%10);
            s = s/10;

// Divide by 10 to delete the last digit from the phone number --------

            int randomNum = (int)(Math.random()*arr2[digit]);
            int ASCII = (int)arr1[digit] + randomNum;

// Convert char to temperature ----------------------

            char c = (char)ASCII;
            String temp = String.valueOf(c);

// Add the results together -------------------------

            result = (temp + result);
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long s = 0;

// Make sure 7 digits are entered --------------------

        while(!(String.valueOf(s).length()==7))
        {
            System.out.print("Please enter your 305 phone number: ");
            s = sc.nextLong();
        }
        s = s + (long)305*10000000;
        String e = encode(s);
        System.out.println("The phone number " + s + " can be encoded as " + e);
    }
}
