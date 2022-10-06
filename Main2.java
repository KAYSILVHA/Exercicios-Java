import java.util.Scanner;

public class Main2 {

        final static Scanner input=new Scanner(System.in);
        final static String acaocadastrarProduto="Produto";
        final static String acaocadastrarCliente="Cliente";
        final static String acaocadastrarEndereco="Endereco";
        final static String acaocadastrarEmpresa="Empresa";


        public static Cliente cadastrarCliente(Cliente cliente){
            if(cliente.getNome()!= null && !cliente.getNome().isEmpty()){
                System.out.println("Cadastro do cliente "+cliente.getNome()+" realizado com sucesso!");
            }
            return cliente;
        }
        public static Produto cadastrarProduto(Produto produto){
            if(produto.getNome()!= null && !produto.getNome().isEmpty()&& produto.getPreco()!=null && !produto.getPreco().isNaN()){
                System.out.println("Cadastro do produto"+produto.getNome()+" realizado com sucesso!");
            }else{
                System.out.println("Verifique os dados do produto e tente novamente...");
            }
            return produto;
        }
        public static Endereco cadastrarEndereco(Endereco endereco){
            if(endereco.getNomedarua()!= null && !endereco.getNomedarua().isEmpty()){
                System.out.println("Cadastro de endereco realizado com sucesso!");
            }else{
                System.out.println("Verifique os dados do endereco e tente novamente...");
            }
            return endereco;
        }
        public static Empresa cadastrarEmpresa(Empresa empresa){
            if(empresa.getNomeFantasia()!= null && !empresa.getNomeFantasia().isEmpty()&& empresa.getCnpj()!=null && !empresa.getCnpj().isEmpty()&& empresa.getRazaosocial()!= null && !empresa.getRazaosocial().isEmpty()){
                System.out.println("Cadastro de empresa realizado com sucesso!");
        }else{
                System.out.println("Verifique os dados da empresa e tente novamente...");
            }
            return empresa;
        }
        public static void main(String[] args) {
            Produto produto= new Produto();
            Endereco endereco= new Endereco();
            Cliente cliente= new Cliente();
            Empresa empresa= new Empresa();

            System.out.println("Cadastrar produto? Digitar -> Produto");
            System.out.println("Cadastrar cliente? Digitar -> Cliente");
            System.out.println("Cadastrar endereco? Digitar -> Endereco");
            System.out.println("Cadastrar empresa? Digitar -> Empresa");

            String operacaoescolhida=input.next();
            if(operacaoescolhida.equals(acaocadastrarCliente)){
                System.out.println("Seja bem vindo ao cadastro de cliente!");
                System.out.println("Digite seu nome:");

                cliente.setNome(input.next());
                System.out.println("Digite seu CPF:");
                Long cpfDigitado= input.nextLong();
                cliente.setCpf(cpfDigitado);
                System.out.println("Digite sua idade:");
                Integer idadeDigitada=input.nextInt();
                cliente.setIdade(idadeDigitada);
                System.out.println("Digite sua data de nascimento:");
                String datadenascimentoDigitada=input.next();
                cliente.setDatadenascimento(datadenascimentoDigitada);
                cadastrarCliente(cliente);

            }else if(operacaoescolhida.equals(acaocadastrarProduto)){
                System.out.println("Seja bem vindo ao cadastro de produto!");
                System.out.println("Digite o nome do produto:");
                String produtodigitado= input.next();
                produto.setNome(produtodigitado);
                System.out.println("Digite o preco do produto:");
                Double precodigitado= input.nextDouble();
                produto.setPreco(precodigitado);
                cadastrarProduto(produto);
            }else if(operacaoescolhida.equals(acaocadastrarEndereco)){
                System.out.println("Seja bem vindo ao cadastro de endereco!");
                System.out.println("Digite o nome da rua:");
                String ruadigitada= input.next();
                endereco.setNomedarua(ruadigitada);

                System.out.println("Digite o numero da sua casa:");
                String numerodigitado= input.next();
                endereco.setNumero(numerodigitado);

                System.out.println("Digite o cep:");
                Integer cepdigitado= input.nextInt();
                endereco.setCep(cepdigitado);

                System.out.println("Digite o bairro:");
                String bairrodigitado= input.next();
                endereco.setBairro(bairrodigitado);

                System.out.println("Digite o complemento:");
                String complementodigitado= input.next();
                endereco.setComplemento(complementodigitado);

                cadastrarEndereco(endereco);

            }else if(operacaoescolhida.equals(acaocadastrarEmpresa)){
                System.out.println("Seja bem vindo ao cadastro de empresa!");
                System.out.println("Digite a razao social da empresa:");
                String razaodigitada=input.next();
                empresa.setRazaosocial(razaodigitada);
                System.out.println("Digite o nome fantasia:");
                String nomefantasiadigitada=input.next();
                empresa.setRazaosocial(nomefantasiadigitada);
                System.out.println("Digite o cnpj:");
                String cnpjdigitado= input.next();
                empresa.setCnpj(cnpjdigitado);
                cadastrarEmpresa(empresa);

            }
        }}
