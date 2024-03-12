package TechinicalProgs;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String input = "programming";

        char[] repeatedCharacters = findRepeatedCharacters(input);

        System.out.println("Original String: " + input);
        System.out.print("Repeated Characters: ");
        for (char c : repeatedCharacters) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }
    }

    private static char[] findRepeatedCharacters(String str) {
        char[] charCount = new char[256]; // Assuming ASCII characters, adjust if using Unicode

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Increment the count for the current character
            charCount[c]++;
        }

        // Create an array to store repeated characters
        char[] repeatedCharacters = new char[str.length()];
        int index = 0;

        // Iterate through each character count
        for (int i = 0; i < charCount.length; i++) {
            // Check if the character is repeated
            if (charCount[i] > 1) {
                repeatedCharacters[index++] = (char) i;
            }
        }

        return repeatedCharacters;
    }
}
