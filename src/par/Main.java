package par;

public class Main {
    public static void main(String[] args) {
        Par<String, Integer> nome = new Par<>("Eric", 43);
        Par<Integer, String> sala = new Par<>(306, "Laboratório de Informática");

        System.out.println("Nome: " + nome.getChave() + " - " + nome.getValor() + " anos");
        System.out.println("Sala: " + sala.getChave() + " - " + sala.getValor());
    }
}

