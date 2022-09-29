import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner novo=new Scanner(System.in);

        String[] listaDeInformacoes=new String[5];
        listaDeInformacoes[0]="AGUA";
        listaDeInformacoes[1]="SUCO";
        listaDeInformacoes[2]="REFRIGERANTE";
        listaDeInformacoes[3]="ENERGETICO";
        listaDeInformacoes[4]="ACHOCOLATADO";

        System.out.println("Digite um nome qualquer de bebida:");
        String nome = novo.next();

        for(int i=0;i<listaDeInformacoes.length;i++) {
            if(nome.equals(listaDeInformacoes[i])) {
                System.out.println("Encontramos a bebida na posicao:"+i);
            }else{System.out.println("Nao encontramos a bebida!");
            }

    }}}