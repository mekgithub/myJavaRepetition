package javatekrar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ProblemsPerimeters {
    public static void main(String[] args) {
        Scanner parameter=new Scanner(System.in);
        System.out.println("Circle, Rectangle or Triangle ?");
        double perimeter=0;
        String User=parameter.next();
        if(User.equals("C")){
            System.out.println("Radius is=" );
            int radius=parameter.nextInt();
            perimeter=2*3.14*radius;
        }else if(User.equals("R")){
            System.out.println("Widht is=");
            int Width=parameter.nextInt();
            System.out.println("Height");
            int height=parameter.nextInt();
            perimeter=Width+height;
        }
        else {
            System.out.println("?");
            int zama=parameter.nextInt();
            perimeter=zama*2;
        }
        System.out.printf("Perimeter is: %.3f",perimeter);
    }
}
