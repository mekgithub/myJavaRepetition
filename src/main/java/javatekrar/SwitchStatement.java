package javatekrar;
//Example 13 next switch2
public class SwitchStatement {
    public static void main(String[] args) {
        int month=7;
        String monthString="";
        switch (month){
            case 1:monthString="January";
            break;
            case 2:monthString="Februaray";
            break;
            case 3:monthString="March";
            break;
            case 4:monthString="April";
            break;
            case 5:monthString="may";
            break;
            case 6:monthString="June";
            break;
            case 7:monthString="July";
            break;
            case 8:monthString="August";
            break;
            case 9:monthString="September";
            break;
            case 10:monthString="October";
            break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println(monthString);
    }
}
