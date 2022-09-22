//Descubra o maior e o menor numero
import java.util.Scanner;
public class MaiorEmenor {
    public static void main(String[] args) {
        //Treinando condições
        Scanner elemento = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        Integer valor01 = elemento.nextInt();
        System.out.print("Digite um segundo valor: ");
        Integer valor02 = elemento.nextInt();
        Integer resultado = valor01 + valor02;
        System.out.println("Resultado final: " + resultado+",");

        if(valor01>valor02){
            System.out.println("o primeiro valor:"+" "+valor01+" "+"e maior que o segundo valor:"+" "+valor02);
        }else{
            System.out.println("o primeiro valor:"+" "+valor02+" "+"e maior que o segundo valor:"+" "+valor01);
        }
    }
    }
