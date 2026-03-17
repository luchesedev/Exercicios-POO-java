public class Lampada {
    /*
    3-a) Criar uma classe que simule o funcionamento de uma lâmpada. A classe
Lampada deve conter um atributo booleano chamado status e os métodos ligar()
e desligar() (ambos sem retorno). O método ligar() atribui o valor true ao atributo
status, já o método desligar() atribui o valor false à status. Crie também o método
observar() que retorna uma palavra referente ao estado da lâmpada (“Ligada” ou
“desligada”).
3-b) Crie uma classe chamada UsaLampada que utilize a classe Lampada do
exercício anterior. Ela deve conter o método main() e:
Instanciar dois objetos da classe Lampada (lampada1 e lampada2);
Ligar o objeto lampada1 e desligar o objeto lampada2;
Executar o método observar() para exibir o status das lâmpadas.
     */

    private Boolean status;

    public void ligar(){
        this.status = true;
    }
    public void desligar(){
        this.status = false;
    }
    public void observar(){
        System.out.println(status == true ? "lâmpada ligada":"lâmpada desligada");
    }

}
