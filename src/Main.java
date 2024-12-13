import java.util.Random;

public class Main {
    public static void main(String[] args) {

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