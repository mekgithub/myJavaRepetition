package javatekrar;
//in this example we are using compareTo() method
//*S1==S2 :0
//S1>S2   : Positive value System.Out.Println(s1.compareTo(s2)) ; //1
//s1<s2   :Negative Value
public class StringComparision2 {
    public static void main(String[] args) {
        String check1="a";
        String check2="a";
        System.out.println(check1.compareTo(check2));
        if(check1.compareTo(check2)==0){
            System.out.println("they are Equal");
        }
        else {
            System.out.println("They are not equal");
        }
    }
}
