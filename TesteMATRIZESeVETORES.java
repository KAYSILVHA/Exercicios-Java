import java.util.ArrayList;
import java.util.List;

public class TesteMATRIZESeVETORES {
    public static void main(String[] args) {
        //vetor--> armazena uma quantidade de informações determinadas por você

        String[] listaDeInformacoes=new String[5];
        listaDeInformacoes[0]="Detergente";
        listaDeInformacoes[1]="Chocolate";
        listaDeInformacoes[2]="Sucrilhos";
        listaDeInformacoes[3]="Arroz";
        listaDeInformacoes[4]="Bacon";
        System.out.println(listaDeInformacoes[0]+" "+listaDeInformacoes[4]);

        //matriz--> armazena uma quantidade de informações indeterminadas(infinitas)

        List<String> listaDeInformacoesb= new ArrayList<>();
        listaDeInformacoesb.add("carteira");
        listaDeInformacoesb.add("bone");
        listaDeInformacoesb.add("lapis");
        listaDeInformacoesb.add("mouse");
        listaDeInformacoesb.add("oculos");
        listaDeInformacoesb.add("lente");
        System.out.println(listaDeInformacoesb);
    }}
