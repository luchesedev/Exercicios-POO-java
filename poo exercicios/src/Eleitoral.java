public class Eleitoral {
    /* 2-a) Criar uma classe chamada Eleitoral com as seguintes definições:
    atributos: nome, e idade;
    Definir os seguintes métodos:
    imprimir() : O método deverá imprimir os dados dos atributos nome e idade, e
    deverá executar o método verificar() como último comando.
    verificar() : O método não retorna valor nem recebe parâmetro. Deve exibir na
    tela mensagens de acordo com as seguintes condições: caso a idade seja inferior
    a 16 anos, exibir na tela “O Eleitor não pode votar”. Para idade superior ou igual
    a 16 e inferior ou igual 65, exibir “O Eleitor deve Votar”. Para maiores de 65
    anos, exibir “Voto facultativo”
            2-b) Cria uma classe chamada PrincipalEleitoral com a seguinte estrutura:
    Criar o método main() conforme o padrão da linguagem Java;
    Criar um objeto da classe Eleitoral e atribuir valores e atribuir valores aos
            parâmetros; Executar o método imprimir() para exibir os valores.
    Executar o método verificar() para saber se o eleitor pode VOTAR.*/
        private String nome;
        private int idade;

    public Eleitoral(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void imprimir(){
        getNome();
        getIdade();
        verificar();
    }
    public void verificar(){
        if(getIdade()<16){
            System.out.println("Leitor nao pode votar!\n \n");
        }
        else if(getIdade()>= 16 && getIdade()<65){
            System.out.println(" Eleitor deve Votar!\n \n");
        }
        else{
            System.out.println("voto facultativo!\n \n");
        }
    }
}
