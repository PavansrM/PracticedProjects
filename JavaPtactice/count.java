package PracticePrograms;
public class count {
    public static void main(String[] args) {
        // int[] array = new int[6]; Declararion with size
        int[] array = {1,2,3,4,5,8}; // declaration with specific values
       int sum = 0;

        for (int i = 0; i<array.length; i++){
           sum += array[i];

            if (sum == 7){
                System.out.println(sum);
            }
        }
        
    }
}
