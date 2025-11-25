package programaidade;
import java.util.Scanner;

public class ProgramaIdade {
    static void main(String[] args) {
       Scanner I = new Scanner(System.in);
        System.out.print(("em que ano você nasceu?:"));
       int nasc = I.nextInt();
       int idade = 2025-nasc;
        System.out.println(("Sua idade é:" + idade));
       if(idade >=18){
           System.out.println("parabéns já está na hora de lutar");
       }
       else{
           System.out.println(("calma ainda ta com sorte em, o Exército espera por você"));
       }
    }
}
