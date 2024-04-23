package tarefa_12;

public class CONTAR_VOGAIS {

    public static int contarVogais(String texto) {
        texto = texto.toLowerCase();
        int contadorVogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
           
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }
        
        return contadorVogais;
    }

    public static void main(String[] args) {
        String texto = "Hello World";
        int vogais = CONTAR_VOGAIS.contarVogais(texto);
        System.out.println("O número de vogais na string é: " + vogais);
    }
}
	

