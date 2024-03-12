package PracticePrograms;
public class Palindrome {
    public static void main(String[] args) {
        // Programe for Palindrome
        int Palin = 202;
        int reverse = 0; 
        int reminder;
        int Num = Palin;
        while(Palin > 0)
        {
            reminder = Palin % 10 ;
            Palin = Palin / 10;
            reverse = reverse * 10 + reminder;
        }
        if (reverse == Num)
        {
            System.out.println("The" + Num + "is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
