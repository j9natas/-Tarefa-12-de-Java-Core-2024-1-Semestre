package tarefa_12;

public class INVERTER_STRING {

    public static String inverterString(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("A string não pode ser nula ou vazia.");
        }

        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String texto = "Adias a data da saída";
        String textoInvertido = inverterString(texto);
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + textoInvertido);
    }
}
