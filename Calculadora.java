import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calculadora= new Scanner(System.in);
        System.out.println("Digite a operacao:\nSoma=1"+"   "+"Subtracao=2"+"   "+"Divisao=3"+"   "+ "multiplicacao=4");
        Integer operacao=calculadora.nextInt();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Digite um valor:");
        Integer valor1= calculadora.nextInt();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Digite outro valor:");
        Integer valor2= calculadora.nextInt();
        System.out.println("---------------------------------------------------------------------");
        Integer soma=valor1+valor2;
        Integer subtracao=valor1-valor2;
        Integer divisao=valor1/valor2;
        Integer multiplicacao=valor1*valor2;
        if(1==operacao){
            System.out.println("Resultado:"+soma);
        }else if(2==operacao){
            System.out.println("Resultado:"+subtracao);
        }else if(3==operacao){
            System.out.println("Resultado:"+divisao);
        }else if(4==operacao){
            System.out.println("Resultado:"+multiplicacao);
        }}}
