public class Computador {
/*    1-a) Criar uma classe chamada Computador com as seguintes definições:
    atributos: marca, cor, modelo, serie e valor;
    Definir o método imprimirDados() de forma que imprima os dados advindos dos
    atributos.
1-b) Criar uma classe chamada Principal com a seguinte estrutura:
    Criar o método main() conforme o padrão do Java;
    Criar um objeto da classe Computador e atribuir valores aos seus atributos.
    Atribuir “HP” ao atributo marca;
    Executar o método imprimirDados() para exibir os dados
*/
        private String marca,cor,modelo,serie;
        private Double valor;

    public Computador(String marca, String cor, String modelo, String serie, Double valor) {
        this.marca = "HP"+marca;
        this.cor = cor;
        this.modelo = modelo;
        this.serie = serie;
        this.valor = valor;
    }
    public Computador(){
        this.marca += "HP";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = "HP"+marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void imprimirdados(){
        //atributos: marca, cor, modelo, serie e valor;
        System.out.printf("-".repeat(30)+"\n"+"marca: %s \ncor: %s \nmodelo: %s\nserie: %s\nvalor:%s\n"+"-".repeat(30)+"\n",this.marca,this.cor,this.modelo,this.serie,this.valor);
    }
}


