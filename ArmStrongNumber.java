package PracticePrograms;
/**
 * ArmStrongNumber
 */
public class ArmStrongNumber {

    public static void main(String[] args) {
        int armStrongNumber = 370;
        int reminder;
        int summing = 0;
        int armNumber = armStrongNumber;

        while(armStrongNumber > 0)
        {
            reminder = armStrongNumber % 10;
            armStrongNumber = armStrongNumber / 10;
            summing = summing + (reminder*reminder*reminder);
        }
        if(armNumber == summing){
            System.out.println("The Given Number is ArmStrong Numbers ie: " + summing);
        }
        else{
            System.out.println("The Given Number is Not ArmStrong Numbers ie:" + summing);
        }
        
    }
}