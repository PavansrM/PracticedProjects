package TechinicalProgs;

public class ArrayPairSum {
        public static void main(String[] args) {
            int[] array = {1, 2, 4, 5, 6, 7, 8};
            int targetSum = 7;
    
            findPairs(array, targetSum);
        }
    
        private static void findPairs(int[] array, int targetSum) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == targetSum) {
                        System.out.println(array[i] + " plus " + array[j] + " equal to " + targetSum);
                    }
                }
            }
        }
    }
       

