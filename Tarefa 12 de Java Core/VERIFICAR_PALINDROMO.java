package tarefa_12;

public class VERIFICAR_PALINDROMO {

    public static boolean verificarPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        String texto = "Ame a ema";
        if (verificarPalindromo(texto)) {
            System.out.println("'" + texto + "' é um palíndromo.");
        } else {
            System.out.println("'" + texto + "' não é um palíndromo.");
        }
    }
}
	
	
	
	
	
	
	
	
	
	

