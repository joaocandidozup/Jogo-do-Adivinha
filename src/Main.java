import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeAcertos = new ArrayList<>();
        List<Integer> listaDeErros = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        int opcao = 1;
        int pontos = 0;
        System.out.println("Bem vindo ao Jogo do Adivinha!!!");
        System.out.println("Escolha o nivel de dificuldade ( facil, medio, dificil)");
        String nivel = leitura.next();
        int numeroAleatorio = gerarNumeroAleatorio(intervalo(nivel));
        exibirMenu();
        opcao = lerEntrada(leitura);
        while (opcao == 1) {
            if (nivel.equalsIgnoreCase("facil") || nivel.equalsIgnoreCase("medio") || nivel.equalsIgnoreCase("dificil")) {
                System.out.println("Digite um numero inteiro");
                int palpite = lerEntrada(leitura);
                pontos += registrarTentativas(palpite, numeroAleatorio, listaDeAcertos, listaDeErros);
                if (palpite == numeroAleatorio) {
                    numeroAleatorio = gerarNumeroAleatorio(intervalo(nivel));
                    exibirMenu();
                    opcao = lerEntrada(leitura);
                }
            } else {
                System.out.println("nivel não encontrado!!!!");
            }
        }
        System.out.println("Pontuação Final: " + pontos + " pontos.");
        System.out.println("Números acertados:" + listaDeAcertos);
        System.out.println("Números errados:" + listaDeErros);
    }

    public static void exibirMenu() {
        String menu = """
                
                1 - Jogar
                2 - Sair do jogo
                Digite uma opção:
                """;
        System.out.print(menu);
    }

    public static int gerarNumeroAleatorio(int intervalo) {
        Random numeroAleatorio = new Random();
        if (intervalo != -1) {
            return numeroAleatorio.nextInt(intervalo) + 1;
        } else {
            return numeroAleatorio.nextInt(1);
        }
    }

    public static int intervalo(String nivel) {
        switch (nivel.toLowerCase()) {
            case "facil":
                return 10;
            case "medio":
                return 50;
            case "dificil":
                return 100;
            default:
                return -1;
        }
    }

    public static int lerEntrada(Scanner leitura) {
        while (!leitura.hasNextInt()) {
            System.out.println("digite um numero inteiro ");
            leitura.next();
        }
        return leitura.nextInt();
    }

    public static int registrarTentativas(int palpite, int numeroAleatorio, List<Integer> numerosCertos, List<Integer> numerosErrados) {
        if (palpite == numeroAleatorio) {
            if (!numerosCertos.contains(palpite)) {
                numerosCertos.add(palpite);
            }
            System.out.println("Parabéns! Você acertou!");
            return 10;
        } else if (palpite == numeroAleatorio + 1) {
            if (!numerosErrados.contains(palpite)) {
                numerosErrados.add(palpite);
            }
            System.out.println("Errou! numero aleatorio é menor");
            return 5;
        } else if (palpite == numeroAleatorio - 1) {
            if (!numerosErrados.contains(palpite)) {
                numerosErrados.add(palpite);
            }
            System.out.println("Errou! numero aleatorio é maior");
            return 5;
        } else {
            if (!numerosErrados.contains(palpite)) {
                numerosErrados.add(palpite);
            }
            if (palpite < numeroAleatorio) {
                System.out.println("Errou! numero aleatorio é maior");
            } else {
                System.out.println("Errou! numero aleatorio é menor");
            }

            return 0;
        }
    }

}