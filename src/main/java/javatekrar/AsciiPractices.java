package javatekrar;
//2 After methods example
public class AsciiPractices {
    public static void asciiCharacaters(){
        for(int i=1;i<=256; i++){
            System.out.printf("%2s",(char)i);
            if(i%32==0){
                System.out.println();
            }
        }
    }
    public static void printMultiplcationTable(){
        for(int i=1;i<=9; i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%4s",i+"X"+j+"=" +i*j);
            }
            System.out.println();
        }
    }
    public static void oddNumbers(int num1,int num2){

        for(int i=num1;i<=num2; i++) {
            if (i % 2 != 0) {
                System.out.print("Odd Numbers" + i);
            }
            System.out.println();
        }
    }
    public static void oddNum(int start,int stop){
        if(start<=stop){
            int number=start;
            do{
                if(number%2==1){
                    System.out.println(number);
                }
                number++;

            }while (number<stop);


        }else {
            System.out.println("Start should be smaller than the stop");
        }
    }

    public static void main(String[] args) {
       // AsciiPractices.asciiCharacaters();
       // AsciiPractices.printMultiplcationTable();
        //AsciiPractices.oddNumbers(6,56);
        AsciiPractices.oddNum(12,100);
    }

}
