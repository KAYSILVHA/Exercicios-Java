//Quanto um professor de nivel 1,2,ou 3 ganha?
import java.util.Scanner;
public class Niveis {
    public static void main(String[] args) {
            Scanner professor=new Scanner(System.in);
            System.out.println("Digite o seu nivel:");
            Integer nivel=professor.nextInt();
            System.out.println("Digite as suas horas trabalhadas:");
            Double horas= Double.valueOf(professor.nextInt());
            Double professorNivel1= Double.valueOf(12.00*horas);
            Double professorNivel2= Double.valueOf(17.00*horas);
            Double professorNivel3= Double.valueOf(25.00*horas);

            if(1==nivel){
                System.out.println("Sendo um professor do Nivel 1, voce recebera: R$"+professorNivel1);
            }else if(2==nivel){
                System.out.println("Sendo um professor do Nivel 2, voce recebera: R$"+professorNivel2);
            }else if(3==nivel){
                System.out.println("Sendo um professor do Nivel 3, voce recebera: R$"+professorNivel3);
            }
        }
    }
