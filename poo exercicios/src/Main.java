import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int escolha = 1;
        Scanner sc = new Scanner(System.in);
        int novaescolha;

        // Força o Java a usar o LookAndFeel do sistema (evita janelas escondidas)


        while (escolha != 0) {
            // USANDO JANELA PARA O MENU: Isso mata o loop infinito do console!
            String menu = "--- MENU DE EXERCÍCIOS ---\n" +
                    "1 - Frase Reversa\n" +
                    "2 - Escada de Palavras\n" +
                    "9 - Classes (Computador/Eleitoral/Lâmpada)\n" +
                    "10 - População (Matriz)\n" +
                    "0 - Sair\n\n" +
                    "Digite sua escolha:";

            String inputMenu = JOptionPane.showInputDialog(null, menu);

            if (inputMenu == null) break; // Se clicar em Cancelar, sai
            try {
                escolha = Integer.parseInt(inputMenu);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números!");
                continue;
            }

            switch (escolha) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Fim do programa!");
                    break;

                case 1:
                    // Se o exercício pede console, o Scanner vai funcionar aqui
                    System.out.println("Digite a frase no CONSOLE:");
                    StringBuilder frasereversa = new StringBuilder(sc.next());
                    System.out.println("Resultado: " + frasereversa.reverse());
                    sc.nextLine(); // Limpa o buffer
                    break;

                case 2:
                    System.out.println("Digite a palavra no CONSOLE:");
                    String palavra = sc.next();
                    int num = palavra.length();
                    char[] frase = palavra.toCharArray();
                    String nova = "";
                    for (int i = 0; i < num; i++) {
                        nova += frase[i];
                        System.out.println(nova);
                    }
                    for (int i = num - 1; i >= 0; i--) {
                        StringBuilder sb = new StringBuilder(nova);
                        sb.deleteCharAt(i);
                        nova = sb.toString();
                        System.out.println(nova);
                    }
                    sc.nextLine();
                    break;

                case 9:
                    System.out.println("Escolha (1-3) no CONSOLE:");
                    novaescolha = sc.nextInt();
                    sc.nextLine();
                    if (novaescolha == 1) {
                        Computador computador = new Computador();
                        System.out.println("Marca:"); computador.setMarca(sc.nextLine());
                        System.out.println("Valor:"); computador.setValor(sc.nextDouble());
                        sc.nextLine();
                        computador.imprimirdados();
                    } else if (novaescolha == 2) {
                        System.out.println("Nome:"); String nome = sc.next();
                        System.out.println("Idade:"); int idade = sc.nextInt();
                        sc.nextLine();
                        Eleitoral el = new Eleitoral(nome, idade);
                        el.imprimir();
                    } else if (novaescolha == 3) {
                        Lampada l1 = new Lampada(); l1.ligar(); l1.observar();
                    }
                    break;

                case 10:
                    Populacao pop = new Populacao(4, 5);
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 5; j++) {
                            String inputPop = JOptionPane.showInputDialog(null,
                                    "Estado " + (i + 1) + " | Cidade " + (j + 1) + "\nDigite a população:");

                            if (inputPop != null && !inputPop.isEmpty()) {
                                pop.atualizarPopulacao(i, j, Integer.parseInt(inputPop));
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null,pop.mediaPop());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        System.exit(0); // Garante que o processo feche de verdade
    }
}