package tarefa_12;

public class CALCULAR_FATORIAL {

    
    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }

        int resultado = 1;
        
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5; 
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

