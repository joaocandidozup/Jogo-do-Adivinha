import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeAcertos = new ArrayList<>();
        List<Integer> listaDeErros = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        int opcao = -1;
        int pontos = 0;
        while (opcao !=2){
            exibirMenu();
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("Escolha o nivel de dificuldade ( facil, medio, dificil)");
                String nivel = leitura.next();
                int numeroAleatorio = gerarNumeroAleatorio(intervalo(nivel));
                System.out.println("Digite um numero inteiro");
                int palpite = lerPalpite(leitura);
                pontos += calcularPontos(palpite,numeroAleatorio,listaDeAcertos,listaDeErros);

            }
        }
        System.out.println("Pontuação Final: "+ pontos +" pontos.");
        System.out.println("Números acertados:"+ listaDeAcertos);
        System.out.println("Números errados:"+ listaDeErros);
    }

    public static void exibirMenu(){
        String menu = """
                Bem vindo ao Jogo do Adivinha!!!
                1 - Iniciar o jogo
                2 - Sair do jogo
                Digite uma opção
                """;
        System.out.println(menu);
    }
    public static int gerarNumeroAleatorio(int intervalo){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(intervalo) +1;
    }
    public static int intervalo(String nivel){
        switch (nivel){
            case "facil":
                return 10;
            case "medio":
                return 50;
            case "dificil":
                return 100;
            default:
                System.out.println("Nivel inválido");
                return -1;
        }
    }
    public static int lerPalpite(Scanner leitura){
        while(!leitura.hasNextInt()){
            System.out.println("Digite um numero inteiro:");
            leitura.next();
        }
        return leitura.nextInt();
    }
    public static int calcularPontos(int palpite, int numeroAleatorio,List<Integer>numerosCertos,List<Integer>numerosErrados){
        if(palpite == numeroAleatorio){
            numerosCertos.add(palpite);
            return 10;
        } else if (palpite == numeroAleatorio +1 || palpite == numeroAleatorio -1){
            return 5;
        }else {
            numerosErrados.add(palpite);
            return 0;
        }
    }
}