import java.util.Arrays;

public class BuscaBinaria {

    private String[] vetor = {"João", "Maria", "Pedro", "Ana", "Carlos", "Laura", "Fernanda", "Rafael", "Julia", "Miguel",
            "Isabella", "Gabriel", "Sophia", "Matheus", "Letícia", "Lucas", "Beatriz", "Enzo", "Lara",
            "Gustavo", "Manuela", "Luiz", "Valentina", "Eduardo", "Clara", "Felipe", "Helena", "Bruno",
            "Lívia", "Diego", "Larissa", "Arthur", "Melissa", "Vinícius", "Bianca", "Leonardo", "Amanda",
            "Cauã", "Sophie", "Antônio", "Luiza", "Thiago", "Alice", "Francisco", "Lorena", "Hugo", "Isadora",
            "Fernando", "Camila", "Henrique", "Marina", "Diego", "Vitória", "Raul", "Laura", "Guilherme",
            "Isabel", "Matias", "Stella", "Joaquim", "Giovanna", "Samuel", "Sarah", "Renan", "Carolina",
            "Nicolas", "Larissa", "Calebe", "Gabriela", "Ricardo", "Rebeca", "Alexandre", "Natália", "Rafaela",
            "Pedro", "Yasmin", "Vitor", "Fernanda", "Joana", "Valentim", "Luana", "Daniel"};

    public String[] setOrdenando(String[] ordem) {
        this.vetor = ordem;
        Arrays.sort(ordem); // Organiza por ordem alfabética.
        return ordem;
    }

    public String getRetorno(String nome) {
        String[] ordenado = setOrdenando(vetor);
        int inicio = 0;
        int fim = ordenado.length - 1;

        while (inicio <= fim)
        {
            int meio = (inicio + fim) / 2;
            String nome_meio = ordenado[meio];

            int compara = nome_meio.compareTo(nome); //compareTo() retorna 0 quando a sentença é true (que é retornado no equals()).

            if (compara == 0) {
                System.out.printf("%n%nAqui está a lista de nomes ordenados utilizada %s%n", Arrays.toString(ordenado));
                return "O nome " + nome + " está na " + (meio + 1) + "ª posição do vetor ordenado";
            } else if (compara < 0) { // compareTo retorna menor que zero quando, neste caso, o nome_meio é menor que nome.
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return "Não foi possível encontrar o nome digitado...";
    }
}
