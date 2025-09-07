package troca;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4};
        System.out.println("Antes da troca: " + java.util.Arrays.toString(numeros));
        Troca.troca(numeros, 0, 2);
        System.out.println("Depois da troca: " + java.util.Arrays.toString(numeros));

        String[] palavras = {"A", "B", "C", "D"};
        System.out.println("Antes da troca: " + java.util.Arrays.toString(palavras));
        Troca.troca(palavras, 1, 3);
        System.out.println("Depois da troca: " + java.util.Arrays.toString(palavras));
    }
}
