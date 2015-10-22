package Utilidades;

public class Encrypt {

    static String tabla = "abcdefghijklmñnopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ1234567890_-+,#$%&/()=¿?¡!|,.;:{}[] "; //cadena

    public static String Encriptar(String t, int key) {
        String texto = LimpiarCadena(t);
        String res = "";
        for (int i = 0; i < texto.length(); i++) {
            int pos = tabla.indexOf(texto.charAt(i));
            if ((pos + key) < tabla.length()) {
                res = res + tabla.charAt(pos + key);
            } else {
                res = res + tabla.charAt((pos + key) - tabla.length());
            }
        }
        return res;
    }

    public static String Desencriptar(String t, int key) {
        String texto = LimpiarCadena(t);
        String res = "";
        for (int i = 0; i < texto.length(); i++) {
            int pos = tabla.indexOf(texto.charAt(i));
            if ((pos - key) < 0) {
                res = res + tabla.charAt((pos - key) + tabla.length());
            } else {
                res = res + tabla.charAt(pos - key);
            }
        }
        return res;
    }

    private static String LimpiarCadena(String t) {
        t = t.toLowerCase();
        t = t.replaceAll("\n", "");
        for (int i = 0; i < t.length(); i++) {
            int pos = tabla.indexOf(t.charAt(i));
            if (pos == -1) {
                t = t.replace(t.charAt(i), ' ');
            }
        }
        return t;
    }

//CAMBIAR LA CADENA  DE LA tabla  POR:
//"abcdefghijklmñnopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ1234567890_-+,#$%&/()=¿?¡!|,.;:{}[] ";
    public static Object[] DencodeOb(Object[] objenc, int key) {
        Object[] objdesc = new Object[objenc.length];
        for (int i = 0; i < objenc.length; i++) {
            objdesc[i] = Desencriptar("" + objenc[i], key);
        }
        return objdesc;
    }

    public static Object[] EncodeOb(Object[] ob, int key) {
        Object[] obenc = new Object[ob.length];
        for (int i = 0; i < ob.length; i++) {
            obenc[i] = Encriptar("" + ob[i], key);
        }
        return obenc;
    }

}
