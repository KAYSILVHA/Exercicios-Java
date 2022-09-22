import java.util.Scanner;

public class ExercicioSOMA {
        public static void main(String[] args) {
            // Buscando informações com o usuário
            Scanner elemento = new Scanner(System.in);
            System.out.println("Digite um valor:");
            Integer valor01 = elemento.nextInt();
            System.out.print("Digite um segundo valor:");
            Integer valor02 = elemento.nextInt();
            Integer resultado = valor01 + valor02;
            System.out.print("Resultado final:" + resultado);
    }
}
