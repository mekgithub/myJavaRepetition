package javatekrar;

public class YazBoz3 {
    public static void main(String[] args) {
        int counter1=1;
        while (counter1<=5){
            System.out.print(counter1);
            int counter2=1;
            char letter='a';
            while (counter2<20){
                System.out.print(letter);
                counter2++;
                letter++;
            }
            System.out.println();
            counter1++;
        }
    }
}
