package javatekrar;
//29-after triangle whitwhilelopp, next TriangleUpSideDown
public class TriangleWithWhileLoop {
    public static void main(String[] args) {
        String star="*";
        int count=0;
        do{
            System.out.println(star);
            star=star+"*";
            count++;
        }while (count<6);
    }
}
