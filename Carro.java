public class Carro {
    //dando comandos ao carro
        private String volante;
        private String cor;
        private String banco;
        private String modelo;
        private Integer aro;
        private Boolean chave;
        private Boolean acelerador;
        private Boolean desligar;

        public String getVolante() {
            return volante;
        }

        public void setVolante(String volante) {
            this.volante = volante;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getBanco() {
            return banco;
        }

        public void setBanco(String banco) {
            this.banco = banco;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public Integer getAro() {
            return aro;
        }

        public void setAro(Integer aro) {
            this.aro = aro;
        }

        public Boolean getChave() {
            return chave;
        }

        public void setChave(Boolean chave) {
            this.chave = chave;
        }

        public Boolean getAcelerador(){
            return acelerador;
        }

        public void setAcelerador(Boolean acelerador){
            this.acelerador=acelerador;
        }

        public Boolean getDesligar(){
            return desligar;
        }

        public void setDesligar(Boolean desligar){
            this.desligar=desligar;
        }

        public static Boolean ligarCarro(Boolean chaveDoCarro) {
            if (chaveDoCarro !=null && chaveDoCarro) {
                System.out.println("Ligando carro...");
                acelerarCarro(chaveDoCarro, true);
                desligarCarro(chaveDoCarro, true);
            } else {
                System.out.println("Estou sem as chaves do carro");
                acelerarCarro(chaveDoCarro, true);
                desligarCarro(chaveDoCarro, true);
            }
            return chaveDoCarro;
        }

        public static Boolean acelerarCarro(Boolean chaveDoCarro, Boolean acelerador) {
            if(chaveDoCarro !=null && chaveDoCarro){
                System.out.println("Acelerar carro...Vrummmm!");
            }else {
                System.out.println("Voce nao pisou no acelerador");
            }
            return acelerador;
        }
        public static Boolean desligarCarro(Boolean chaveDoCarro, Boolean desligar) {
            if(chaveDoCarro !=null && chaveDoCarro) {
                System.out.println("Seu carro nao foi desligado. Seguindo rota, preste atencao na pista!...");
            } else {
                System.out.println("Seu carro foi desligado");
            }
            return desligar;
        }

        public static void main(String[] args){
            //se estiver no false o carro executa o else, se estiver no true o carro executa o if
            ligarCarro(true);
        }


    }

