import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                pontos += calcularPontos(palpite,numeroAleatorio);
                System.out.println("Sua pontuação atual: "+ pontos);
            }
        }
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
    public static int calcularPontos(int palpite, int numeroAleatorio){
        if(palpite == numeroAleatorio){
            return 10;
        } else if (palpite == numeroAleatorio +1 || palpite == numeroAleatorio -1){
            return 5;
        }else {
            return 0;
        }
    }
}