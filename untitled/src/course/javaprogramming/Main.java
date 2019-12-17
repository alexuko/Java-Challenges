package course.javaprogramming;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code
        System.out.println(isPalindrome(1234321));
        String str = "121";
        String strRev = "";
        char[] ch = str.toCharArray();

            for(int i = ch.length-1; i >= 0; i-- ){
                strRev += ch[i];
            }
        System.out.println(strRev);
            if(str.equals(strRev)){
                System.out.println(str + " IS a palindrome");
            }else{
                System.out.println("NOT a palindrome");
            }



//        int i;
//        for(i = 0; i < 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("fizz buzz");
//            }else if(i % 5 == 0){
//                System.out.println("buzz");
//            }else if(i % 3 == 0){
//                System.out.println("fizz");
//            }else {
//                System.out.println(i);
//            }
//        }
    }
    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;
        int lastDigit;

        while(num != 0){
            lastDigit = num % 10;
            System.out.println(lastDigit);
            reverse = (reverse * 10) + lastDigit;
            System.out.println(reverse);
            num /=10;
        }

        if(reverse == number){
            return true;
        }
        return false;

    }

}
