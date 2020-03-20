package javatekrar;
//28 after Triangle,Next Triangle with whileLoop
public class LettersNumbers {
    public static void main(String[] args) {
        char letter='a';//character declaration
        for(int i=1; i<6; i++){
            System.out.printf("%2d",i);//printing numbers
            int count=1;//while loop initialization
            while (count<5){
                System.out.printf("%3s ",letter);//printing letters
                count++;//while increment
                letter++;//char increment
            }
            System.out.println();
        }
    }
}
