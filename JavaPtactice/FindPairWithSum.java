package PracticePrograms;
public class FindPairWithSum  {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 8 };
        int targetSum = 7;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                 if (array[i] + array[j] == targetSum) {
                    System.out.println(array[i] + " + " + array[j] + " = " + targetSum);
                }
            }
        }
    }

}
