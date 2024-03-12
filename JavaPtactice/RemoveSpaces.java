package TechinicalProgs;

public class RemoveSpaces {

    public static void main(String[] args) {
        String input = "Hello World, I have spaces!";
        String result = removeSpaces(input);

        System.out.println("Original: " + input);
        System.out.println("After removing spaces: " + result);
    }

    private static String removeSpaces(String str) {
        // Use replaceAll to replace all spaces with an empty string
        return str.replaceAll(" ", "");
    }
}
