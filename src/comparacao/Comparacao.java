package comparacao;

public class Comparacao {

    public static Integer maior(Integer a, Integer b) {
        return (a >= b) ? a : b;
    }

    public static String maior(String a, String b) {
        return (a.length() >= b.length()) ? a : b;
    }
}
