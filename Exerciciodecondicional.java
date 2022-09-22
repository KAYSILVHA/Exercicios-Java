import java.util.Locale;
import java.util.Scanner;
//se as letras m e f forem digitadas serão aceitas como gêneros válidos
public class Exerciciodecondicional {
    public static void main(String[] args) {
        String masc= "M";
        String fem= "F";
        Scanner genero = new Scanner(System.in);
        System.out.println("Digite a letra M ou F:");
        String qualquer= genero.next();
        if (masc.equals(qualquer)) {
            String generodigitado= qualquer.toUpperCase(Locale.ROOT);
            // ou if (qualquer.equals(masc)||qualquer.equals(fem))

            System.out.println("O genero e valido!");
        }
        else if(fem.equals(qualquer)){
            System.out.println("O genero e valido!");
        } else
        {System.out.println("Genero invalido!");
        }
    }}