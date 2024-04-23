package tarefa_12;

public class CALCULAR_POTENCIA {

    public static int calcularPotencia(int base, int expoente) {
        if (expoente < 0) {
            throw new IllegalArgumentException("O expoente deve ser um número inteiro positivo.");
        }

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }


    public static void main(String[] args) {
        int base = 2;
        int expoente = 5;
        int resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

