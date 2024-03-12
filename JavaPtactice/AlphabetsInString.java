package TechinicalProgs;

/**
 * AlphabetsInString
 */
public class AlphabetsInString {
    public static void main(String[] args) {
        String input = "Selenium 123 Java 143 Interview 7";
        String output = extractAlphabets(input);
        System.out.println("Output: " + output);
    }

    private static String extractAlphabets(String input) {
        StringBuilder result = new StringBuilder();

        // Split the input string by space
        String[] parts = input.split(" ");

        // Iterate through each part and append alphabets to the result
        for (String part : parts) {
            // Remove non-alphabetic characters
            String alphabetsOnly = part.replaceAll("[^a-zA-Z]", "");

            // Append alphabets to the result
            result.append(alphabetsOnly);
        }

        return result.toString();
    }
}
