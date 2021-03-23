package string.problems;

public class Palindrome {

//        String ss="dad";
//        System.out.println(Palindrome.checkIfPalindrome(ss.toCharArray()));
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */


        public static boolean checkIfPalindrome(char[] word){
            int i = 0;
            int j = word.length - 1;
            while (j > i) {
                if (word[i] != word[j]) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        public static void main(String[] args) {
            String ss="mom";
            System.out.println(checkIfPalindrome(ss.toCharArray()));
        }

    }






