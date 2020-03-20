package javatekrar;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.*;
import java.io.*;

public class StringBuildr {

    public static void main(String[] args) {

        StringBuilder str1=new StringBuilder("Hello Java");
        System.out.println(str1.reverse());

        StringBuilder str2=new StringBuilder("Sky");
        System.out.println(str2.append(" Hawks"));

        StringBuilder str3=new StringBuilder("New");
        System.out.println(str3.insert(1,"York"));

        StringBuilder str4=new StringBuilder("New");
        System.out.println(str4.insert(2,"York"));

        StringBuilder str5=new StringBuilder("Hello");
        System.out.println(str5.replace(1,2,"World"));

        StringBuilder str6=new StringBuilder("Georgia");
        System.out.println(str6.delete(1,6));

        StringBuilder str7=new StringBuilder(111);
        System.out.println(str7.capacity());

        StringBuffer str8=new StringBuffer(222);
        System.out.println(str8.capacity());

    }
}
