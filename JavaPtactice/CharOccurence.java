package TechinicalProgs;

public class CharOccurence {
    public static void main(String[] args) {
        String input = "pavan";
        char targetChar = 'a';

        int occurrenceCount = countCharacterOccurrence(input, targetChar);

        System.out.println("The character '" + targetChar + "' occurs in the string '" + input + "' " + occurrenceCount
                + " times.");
    }

    private static int countCharacterOccurrence(String str, char target) {
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is equal to the target character
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
