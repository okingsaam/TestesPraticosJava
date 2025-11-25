package programamedia;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class ProgramaMedia {

    public static void main(String[]args){
        Scanner media = new Scanner(System.in);
        System.out.print((" primeira nota:"));
        float n1 = media.nextFloat();
        System.out.print((" segunda nota:"));
        float n2 = media.nextFloat();
        float m =(n1+n2)/2;
        System.out.println("Sua média é:" + m);
        if (m > 9) {
           System.out.println("parabéns");

}
       else{
            System.out.println("que Pena");
        }
    }
}


