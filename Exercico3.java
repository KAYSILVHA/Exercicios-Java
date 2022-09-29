public class Exercico3 {
    public static void main(String[] args) {
        Integer[] listaDeInformacoes = new Integer[15];
        listaDeInformacoes[0] = 1;
        listaDeInformacoes[1] = 2;
        listaDeInformacoes[2] = 3;
        listaDeInformacoes[3] = 4;
        listaDeInformacoes[4] = 5;
        listaDeInformacoes[5] = 6;
        listaDeInformacoes[6] = 7;
        listaDeInformacoes[7] = 8;
        listaDeInformacoes[8] = 9;
        listaDeInformacoes[9] = 10;
        listaDeInformacoes[10] = 11;
        listaDeInformacoes[11] = 12;
        listaDeInformacoes[12] = 13;
        listaDeInformacoes[13] = 14;
        listaDeInformacoes[14] = 15;

        for(int listadeNumeros: listaDeInformacoes){
            if(listadeNumeros%2==0){
                System.out.println("O numero "+listadeNumeros+" e par!");
            }else{
                System.out.println("O numero "+listadeNumeros+" e impar!");
            }
        }    }}