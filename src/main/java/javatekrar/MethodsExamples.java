package javatekrar;
//1 Methods exapmle. AsciiPractices
public class MethodsExamples {
    public static int addNumbers(int number1,int number2){
        int result=number1+number2;
        System.out.println(result);
        return result;
    }
    static int multiplyNumbers(int number1,int number2){
        int result=number1*number2;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        MethodsExamples.addNumbers(5,10);
        MethodsExamples.multiplyNumbers(7,8);

    }

}
