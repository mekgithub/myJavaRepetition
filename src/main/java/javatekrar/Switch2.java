package javatekrar;
// Example 14 next Leap Year
public class Switch2 {
    public static void main(String[] args) {
       String number="one";
       int numint = 0;
       switch (number){
           case "one":numint=1;
           break;
           case "two":numint=2;
           break;
           default:
               System.out.println("Invalid");
               break;
       }
        System.out.println(numint);
    }
}
