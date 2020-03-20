package javatekrar;
//Example 15 next NestedIf
public class LeapYear {
    //The years 1600, 2000 and 2400 are leap years, while 1700, 1800, 1900, 2100, 2200 and 2300 are not leap years
    public static void main(String[] args) {
        int year=2000;
        if(year%100==0) {
            if (year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Not");
            }
        }
            else {
                if(year%4==0){
                    System.out.println("Leap");
                }
                else{
                    System.out.println("Not");
                }
            }
        }

}
/*
Or we can solve with this way;
if(year%4==0 && year%400==0 && year%100!==0){
  System.out.println("Leap");
  }
  else{
   System.out.println("Not");}
 */