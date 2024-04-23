
package tarefa_12;


public class VERIFICAR_TRIANGULO {

    public static boolean VERIFICARTRIANGULO(int lado1, int lado2, int lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return false;
        }
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int lado1 = 3;
        int lado2 = 4;
        int lado3 = 5;
        if (VERIFICARTRIANGULO(lado1, lado2, lado3)) {
            System.out.println("Os comprimentos podem formar um triângulo.");
        } else {
            System.out.println("Os comprimentos não podem formar um triângulo.");
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

