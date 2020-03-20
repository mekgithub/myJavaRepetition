package javatekrar;
//25 after dowhile,next Dowhile3
public class DoWhile2 {
    public static void main(String[] args) {
        int start1=100;
        double start2=99.5;
        do{
            System.out.printf("%5d",start2);
            start1--;
            start2=start2-1;
        }while (start1>=0);

    }
}
