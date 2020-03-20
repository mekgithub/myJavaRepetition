package javatekrar;
import java.util.Scanner;
public class RectangleFromUser2 {
    public static void main(String []args){
        Scanner readTriangle=new Scanner(System.in);

        System.out.println("Please give Height :");
        int heigtht=readTriangle.nextInt();

        System.out.println("please give the edge :");
        int edge=readTriangle.nextInt();

        int area=(heigtht*edge)/2;
        System.out.println("triangle  area of : "+ area);
    }
}
