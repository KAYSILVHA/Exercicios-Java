import java.util.Scanner;
public class Conta {
        private String tipoOperacao;
        private Float valorSaque;
        private Boolean transferencia;
        private Float saldo;
        private Float valorTransferencia;
        private String tipoTransferencia;
        private String extrato;
        final static Scanner input= new Scanner(System.in);

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Float getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Float valorSaque) {
        this.valorSaque = valorSaque;
    }

    public Boolean getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Boolean transferencia) {
        this.transferencia = transferencia;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getValorTransferencia() {
        return valorTransferencia;
    }

    public void setValorTransferencia(Float valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }

    public static Conta saque(Conta conta) {
            if (conta.getSaldo() !=null && conta.getSaldo() > 0) {
                System.out.println("Saque realizado no valor de " + conta.getSaldo());

            }else {
                System.out.println("Nao existe nenhum saldo em conta, deseja fazer um deposito?");
                String perguntaDeDeposito=input.next();
                if(perguntaDeDeposito.equals("Sim")) {
                    System.out.println("Digite o valor do deposito:");
                    float valorDeDeposito=input.nextFloat();
                    deposito(valorDeDeposito);
                }
            }
            return conta;
        }

    public static void deposito(float saldoDeDeposito) {
        System.out.println("Deposito no valor de R$: " +saldoDeDeposito+ " reais foi realizado com sucesso!");
    }
    public static void transferencia(Conta conta, String nomeDoBeneficiado){
        if(nomeDoBeneficiado.length()<3){
            System.out.println("Nome invalido, digite um nome com mais de tres caracteres.");
        }else{
            System.out.println("Transferencia no valor de R$: "+conta.getValorTransferencia()+ " realizada com sucesso! Beneficiado "+nomeDoBeneficiado);
        }
    }
    public static void main(String[]args){
        Conta conta=new Conta();
        System.out.println("Qual o tipo de operacao desejada?");
        String tipoDeOperacaoDigitada=input.next();
        conta.setTipoOperacao(tipoDeOperacaoDigitada);
        if(conta.getTipoOperacao().equals("Saque")){
        System.out.println("A opcao escolhida foi de saque!");
        System.out.println("Informe o valor do saque:");
        float valorSaque=input.nextFloat();
        conta.setValorSaque(valorSaque);
        saque(conta);
    }else if(conta.getTipoOperacao().equals("Deposito")){
            System.out.println("Informe o valor do deposito:");
            float saldoDigitado=input.nextFloat();
            conta.setSaldo(saldoDigitado);
            deposito(saldoDigitado);
        }else if(conta.getTipoOperacao().equals("Transferencia")){
            System.out.println("Informe o nome do beneficiado:");
            String nomeDoBeneficiado=input.next();
            System.out.println("Digite o valor a ser transferido");
            float saldoDigitado=input.nextFloat();
            conta.setValorTransferencia(saldoDigitado);
            transferencia(conta,nomeDoBeneficiado);
        }
        }}
