package tarefa_12;

import java.util.List;

public class CALCULAR_MEDIA {

    public static double calcularMedia(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia.");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.size();

        return media;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 10, 15, 20); 
        double media = calcularMedia(numeros);
        System.out.println("A média dos números é: " + media);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

