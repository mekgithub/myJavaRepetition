package javatekrar;

public class FirstMethod {
    public static void printHello(int number){
        for(int i=1;i<=number;i++){
            System.out.println("hello method");
        }
    }

    public static void main(String[] args) {
        FirstMethod.printHello(10);
    }
}
