package troca;

public class Troca {
    public static <T> void troca(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
