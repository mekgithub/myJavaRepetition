package javatekrar;

public class ConversionBiggerToSmaller {
    public static void main(String[] args) {
        double theBiggest=260.9876;
        float theBigger=(float) theBiggest;
        long big=(long) theBigger;
        int medium=(int) big;
        short smaller=(short) medium;
        byte theSmallest=(byte) smaller;

        System.out.println("this is double:" + theBiggest);
        System.out.println("this is float :"+ theBigger);
        System.out.println("This is long :"+big);
        System.out.println("This is integer:"+medium);
        System.out.println("The is short:"+smaller);
        System.out.println("This is byte :"+ theSmallest);

    }
}
