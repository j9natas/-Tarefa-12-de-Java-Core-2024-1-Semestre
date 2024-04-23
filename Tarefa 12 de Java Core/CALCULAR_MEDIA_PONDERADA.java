package tarefa_12;

public class CALCULAR_MEDIA_PONDERADA {

	
	
	public static double calcularMediaPonderada(double valor1, double valor2, double valor3, double peso1, double peso2, double peso3) {
        
        if (peso1 <= 0 || peso2 <= 0 || peso3 <= 0) {
            throw new IllegalArgumentException("Os pesos devem ser números positivos.");
        }
        
        
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / somaPesos;
        
        return mediaPonderada;
    }

    
    public static void main(String[] args) {
        double valor1 = 5.0;
        double valor2 = 6.0;
        double valor3 = 7.0;
        double peso1 = 2.0;
        double peso2 = 3.0;
        double peso3 = 5.0;
        
        double mediaPonderada = calcularMediaPonderada(valor1, valor2, valor3, peso1, peso2, peso3);
        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

