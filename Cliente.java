public class Cliente {
    private String nome;
    private Integer idade;
    private Long cpf;
    private String datadenascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
}
