package tarefa_12;

public class VERIFICAR_ANO_BISSEXTO {

    
    public static boolean verificarAnoBissexto(int ano) {
        boolean divisivelPor4 = ano % 4 == 0;
        boolean divisivelPor100 = ano % 100 == 0;
        boolean divisivelPor400 = ano % 400 == 0;
        
        if (divisivelPor4 && (!divisivelPor100 || divisivelPor400)) {
            return true;
        } else {
            return false;
        }
    }

    
    public static void main(String[] args) {
        int ano = 2024;
        if (verificarAnoBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}

