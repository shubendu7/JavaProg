import java.util.Scanner;

class Anagram {
    private String str1, str2; // Instance variables

    // Method to get input strings
    public void getStringValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        str1 = sc.nextLine().toLowerCase(); // Convert to lowercase
        System.out.print("Enter second string: ");
        str2 = sc.nextLine().toLowerCase(); // Convert to lowercase
    }

    // Method to check if two strings are anagrams
    public boolean areAnagram() {
        if (str1.length() != str2.length()) {
            return false; // Different lengths can't be anagrams
        }

        int[] freq = new int[26]; // Array to store frequency of letters

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++; // Increase count for str1
            freq[str2.charAt(i) - 'a']--; // Decrease count for str2
        }

        // If all values are zero, they are anagrams
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void checkAnagram() {
        if (areAnagram()) {
            System.out.println("Both are Anagrams.");
        } else {
            System.out.println("Both are not Anagrams.");
        }
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        obj.getStringValues();
        obj.checkAnagram();
    }
}
