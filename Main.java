import java.util.*;

import static java.lang.Math.random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        1.Write a program to find all of the longest word in a given dictionary.
        String[] names = {"cat", "dog", "red", "is", "am"};
//        int maxLength = 0;
//        String longestWord = "";
//        for (String name : names) {
//            if (name.length() >= maxLength) {
//                maxLength = name.length();
//                longestWord = name;
//                System.out.print( longestWord+" ");
//
//            }}


//        2. Write a program that displays the number of occurrences of an element in the array.
//          int[] num = {1,1,1,3,3,5};
        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter a number (0 to quit):");
//            int no = input.nextInt();
//            if (no == 0) {
//                break;
//            }
//            int count = 0;
//            for (int i = 0; i < num.length; i++) {
//                if (num[i] == no) {
//                    count++;
//                }
//            }
//            System.out.println(no + " occurs " + count + " time(s)");
//
//
//        }
//        }


        //        3.Write a program to find the k largest elements in a given array. Elements in the array can be in
//        any order.
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(4);
//        nums.add(17);
//        nums.add(7);
//        nums.add(25);
//        nums.add(3);
//        nums.add(100);
//        System.out.println("please enter number: ");
//        int k = input.nextInt();
//        nums.sort((a, b) -> b.compareTo(a)); // *****************************
//        System.out.println("The largest " + k + " elements are:");
//        for (int i = 0; i < k  ; i++) {
//            System.out.println(nums.get(i));
//        }

//        4. Create a method to reverse an array of integers. Implement the method without creating a new
//                array.
//        int[] rev = {5,4,3,2,1};
//        System.out.println("Reversed array:");
//        reverseArray(rev);
//    }
//        public static void reverseArray(int[] arr) {
//            for (int i = 0; i < arr.length / 2; i++) {
//                int temp = arr[i];
//                arr[i] = arr[arr.length - 1 - i];
//                arr[arr.length - 1 - i] = temp;
//            }
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//        }


        //5. Write a menu driven Java program with following option:
//        int size1;
//        int elem;
//        int search;
//        ArrayList<Integer> nums1 = new ArrayList<>();
//        while (true){
//            System.out.println("1. Accept elements of an array\n" +
//                    "2. Display elements of an array\n" +
//                    "3. Search the element within array\n" +
//                    "4. Sort the array\n" +
//                    "5. To Stop");
//            System.out.println("please enter number: ");
//            int no1 = input.nextInt();
//        switch (no1) {
//            case 1:
//                System.out.println("enter size of array: ");
//                size1 = input.nextInt();
//                System.out.println("enter elemnt of array: ");
//
//                for (int i = 0; i <= size1 - 1; i++) {
//                    elem = input.nextInt();
//                    nums1.add(elem);
//                }
//               break;
//            case 2:
//                System.out.println(nums1);
//                break;
//            case 3:
//                System.out.println("enter numbers oto search in the array: ");
//                search = input.nextInt();
//                if (nums1.contains(search)) {
//                    System.out.println("the number is exixt in the array ");
//                } else {
//                    System.out.println("sorry not found!");
//                }
//                break;
//            case 4:
//                Collections.sort(nums1);
//                System.out.println("Sorted ArrayList: " + nums1);
//              break;
//            case 5:
//                System.out.println("Exiting...");
//                return;
//        }
//        }
//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers.
//                Hint: use Random class
//        System.out.println("Enter the minimum value of the range: ");
//        int numbers1 = input.nextInt();
//        System.out.println("Enter the maximum value of the range:");
//        int numbers2 = input.nextInt();
//        System.out.println("Enter the number of random numbers to generate: ");
//        int numbers3 = input.nextInt();
//        RandomNo(numbers1, numbers2, numbers3);
//    } // close main
//        public static void RandomNo(int numbers1, int numbers2, int numbers3) {
//            Random nums = new Random();
//            for (int i = 0; i < numbers3; i++) {
//                int randomNum = nums.nextInt(numbers2 - numbers1 + 1) + numbers1;
//                System.out.println("Random number " + (i+1) + ": " + randomNum);
//        }
//            }
//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and uppercase/lowercase
//        letters.
//                - We have three methods: checkLength, checkSpecialCharacters, and
//        checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
//                - The totalScore is calculated by adding the scores from these methods.
//        - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
//        based on the totalScore.
//        - The criteria for scoring:
//• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
//• Special characters: Absence (0 points), Presence (2 points).
//• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
//        points).
        //main
//        System.out.println("Enter password: ");
//        String password = input.nextLine();
//        checkLength(password);
//        checkSpecialCharacters(password);
//        checkUpperCaseLowerCase(password);
//        int lengthScore = checkLength(password);
//        int specialCharScore = checkSpecialCharacters(password);
//        int uppercaseLowercaseScore = checkUpperCaseLowerCase(password);
//        int totalScore = lengthScore + specialCharScore + uppercaseLowercaseScore;
//
//        if (totalScore >= 8) {
//            System.out.println("Password is strong.");
//        } else if (totalScore >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }
//
//    }
//    public static int checkLength(String password) {
//        int score = 0;
//        if (password.length() < 6) {
//            score = 0;
//            return 0;
//        } else if (password.length() >= 6 && password.length() <= 7) {
//            score = 2;
//            return 2;
//
//        } else if (password.length() > 8) {
//            score = 3;
//            return 3;
//        }
//        return score;
//    }
//
//        public static int checkSpecialCharacters (String password){
//            int score = 0;
//            if (password.matches("^.*[!@#$%^&*(),.?\":{}|<>].*$")) {
//                score = 2;
//                return 2;
//            } else if (!password.matches("^.*[!@#$%^&*(),.?\":{}|<>].*$")) {
//                return 0;
//            }
//            return score;
//        }
//
//        public static int checkUpperCaseLowerCase (String password) {
//            int score = 0;
//            if (password.matches("^(?=.*[a-z])(?=.*[A-Z]).*$")) {
//                score = 3;
//                return 3;
//            } else if (!password.matches("^(?=.*[a-z])(?=.*[A-Z]).*$")) {
//                return 0;
//
//            }
//            return score;
//        }

//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//                Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//                and each subsequent number in the sequence is the sum of the two preceding ones.
//        System.out.println("Enter the number of Fibonacci terms to generate: ");
//        int seq = input.nextInt();
//        FibonacciSequence(seq);
//    }
//        public static void FibonacciSequence(int seq) {
//            int no0 = 0, no1 = 1;
//
//            System.out.println("Fibonacci Sequence (up to " + seq + " terms):");
//
//            for (int i = 0; i < seq; i++) {
//                System.out.print(no0 + " ");
//                int temp = no0 +no1;
//                no0 = no1;
//                no1 = temp;
//
//            }


    }
}






