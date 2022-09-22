import java.util.Locale;
import java.util.Scanner;

public class AceitarOUnão {
        public static void main(String[] args) {
            //cond. relacionada a um rodizio de pizza, se o sabor é o que queremos aceitamos se não devolver

            Scanner sabor = new Scanner(System.in);
            //essa variavel armazena o valor da minha pizza preferida
            String pizzafavorita= "FRANGO";
            System.out.println("Digite um sabor:");
            //essa armazena o valor da minha pizza
            String sabordigitado=sabor.next();
            System.out.println("Gostaria de uma pizza sabor"+" "+sabordigitado+" ?");

            if(pizzafavorita.equals(sabordigitado.toUpperCase(Locale.ROOT))){
                System.out.println("Sim, obrigada, vou comer!");
            } else{
                System.out.println("Nao, nao quero, obrigada!");
            }}}

