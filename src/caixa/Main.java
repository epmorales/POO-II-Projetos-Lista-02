package caixa;

public class Main {
    public static void main(String[] args) {

        Caixa<String> caixaString = new Caixa<>();
        caixaString.guardar("Olá!");
        System.out.println(caixaString.recuperar());

        Caixa<Integer> caixaInteger = new Caixa<>();
        caixaInteger.guardar(123);
        System.out.println(caixaInteger.recuperar());
    }
}
