import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        BuscaBinaria busca = new BuscaBinaria();
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite um nome que deseja buscar do vetor: ");
        nome = entrada.nextLine();
        System.out.println(busca.getRetorno(nome));
    }
}
