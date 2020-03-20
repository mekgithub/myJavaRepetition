package javatekrar;
//Example 11 next ternary
import java.util.Scanner;

public class PurchaseDecision {
    public static void main(String[] args) {
        Scanner course=new Scanner(System.in);
        System.out.println("what is your course ?");
        String skill=course.next();
        if(skill.equals("Java")){
            System.out.println("QA Score");
        }else if(skill.equals("SQL")){
            System.out.println("hackerrank");
        }
        else{
            System.out.println("???");
        }
    }
}
