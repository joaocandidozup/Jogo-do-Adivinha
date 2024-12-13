import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = -1;
        while (opcao !=2){
            exibirMenu();
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("Escolha o nivel de dificuldade ( facil, medio, dificil");
                String nivel = leitura.next();
                System.out.println(nivel);


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
}