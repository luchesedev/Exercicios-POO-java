import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // exercicio lista dois 1

        int escolha = 1;
        Scanner sc = new Scanner(System.in);
        int novaescolha;
        while (escolha != 0) {
            //da um tempo de 2 segundos
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("escolha o exercicio");
            escolha =sc.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Fim do programa");
                    break;
                case 1:
                    StringBuilder frasereversa = new StringBuilder(sc.next());
                    System.out.println(frasereversa.reverse());
                    break;
                case 2:
                    String palavra = sc.next();
                    int num = palavra.length();
                    char[] frase = new char[num];
                    frase = palavra.toCharArray();

                    String nova = "";
                    for (int i = 0; i < num; i++) {
                        nova += frase[i];
                        System.out.println(nova);
                    }
                    for (int i = num - 1; i >= 0; i--) {
                        StringBuilder sb = new StringBuilder(nova);
                        sb.deleteCharAt(i); // Remove o caractere na posição exata i
                        nova = sb.toString();
                        System.out.println(nova);
                    }

                case 9:
                    //CLASSES COMPUTADOR,ELEITORAL,LAMPADA
                    //exercicio 1a/b da lista nove
                    System.out.println("exercicio um : 1 \nexercicio dois : 2 \nexercicio tres : 3" );
                    novaescolha = sc.nextInt();
                    if ( novaescolha == 1) {
                        Computador computador = new Computador();
                        //definindo sem contrutor;
                        //atributos: marca, cor, modelo, serie e valor;
                        System.out.println("Digite a marca ");
                        computador.setMarca(sc.next());
                        System.out.println("Digite a cor ");
                        computador.setCor(sc.next());
                        System.out.println("Digite a modelo ");
                        computador.setModelo(sc.next());
                        System.out.println("Digite a serie ");
                        computador.setSerie(sc.next());
                        System.out.println("Digite a valor ");
                        computador.setValor(sc.nextDouble());
                        //com valor o contrutor seria praticamente a mesma coisa so que sem o set e ja que voce da um "set" com os parametro do construtor voce apenas chamaria o metodo imprimirdados()
                        computador.imprimirdados();
                        break;
                    }
                    else if (novaescolha == 2){
                        System.out.println("digite seu nome");
                        String nome = sc.next();
                        System.out.println("digite sua idade");
                        int idade = sc.nextInt();

                        Eleitoral eleitoral = new Eleitoral(nome , idade);

                        System.out.println("verificando....");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        System.out.println("Pronto!");
                        eleitoral.imprimir();
                    }
                    else if(novaescolha == 3){
                        Lampada lampada1 = new Lampada();
                        Lampada lampada2 = new Lampada();

                        lampada1.ligar();
                        lampada2.desligar();

                        System.out.print("lampada 1 :");
                        lampada1.observar();
                        System.out.print("lampada 2 :");
                        lampada2.observar();
                    }
                    else{
                        System.out.println("exercicio invalido");
                    }
                    break;
                default:
                    System.out.println("numero invalido digite novamente:");
                    escolha = sc.nextInt();
                    break;

            }
        }
        }
    }
