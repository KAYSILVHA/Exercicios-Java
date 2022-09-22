//se o aluno tirar acima ou igual a 70 ele passa
//se o aluno tirar abaixo ou igual a 50 ele reprova
//caso contrário ele fica de recuperação
import java.util.Scanner;
public class Reprovadoounao {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = valores.next();
        System.out.println("Digite uma nota:");
        Integer nota01 = valores.nextInt();
        System.out.println("Digite a segunda nota:");
        Integer nota02 = valores.nextInt();
        System.out.println("Digite a terceira nota:");
        Integer nota03 = valores.nextInt();
        Integer resultado = (nota01 + nota02 + nota03) / 3;
        if (resultado>=70) {
            System.out.println(nome+" parabens sua media foi de"+" "+resultado+" "+"e voce foi aprovado!");
        }
        else if(resultado<=50){
            System.out.println(nome+" infelizmente,sua media foi de"+" "+resultado+" "+"e voce foi reprovado!");
        } else{
            System.out.println(nome+" voce ainda tem uma chance,sua media foi de"+" "+resultado+" "+"e voce ficou de recuperacao!");
        }
    }
}
