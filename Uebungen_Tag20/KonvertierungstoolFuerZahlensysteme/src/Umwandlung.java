public class Umwandlung {

    public static String binaer(int dezimalZahl) {
        return Integer.toBinaryString(dezimalZahl);
    }

    public static String oktal(int dezimalZahl) {
        return Integer.toOctalString(dezimalZahl);
    }

    public static String hexadezimal(int dezimalZahl) {
        return Integer.toHexString(dezimalZahl);
    }
}