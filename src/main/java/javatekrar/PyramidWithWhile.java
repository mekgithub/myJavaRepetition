package javatekrar;
//33 after HourGlass, Next is
public class PyramidWithWhile {
    public static void main(String[] args) {
        int lines=1;
        while (lines<8){
            int spaces=7;
            while (spaces>lines){
                System.out.print(" ");
                spaces--;
            }
            int stars=1;
            while (stars<=2*lines-1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            lines++;
        }
    }
}
