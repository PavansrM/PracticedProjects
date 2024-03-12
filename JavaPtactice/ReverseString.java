package TechinicalProgs;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters using a while loop until start pointer is less than the end
        // pointer
        while (start < end) {
            // Swap characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}