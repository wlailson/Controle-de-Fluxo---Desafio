import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o primeiro parametro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = scanner.nextInt();  
        try {
            contar(parametroUm, parametroDois);
        } catch (ParamentrosInvalidosException e) {
        System.out.println("O segundo Parametro deve ser maior que o primeiro");
        }

    }
    static void contar (int parametroUm, int parametroDois) throws ParamentrosInvalidosException {
       if (parametroUm>parametroDois)
        throw new ParamentrosInvalidosException();
       
        int contagem = parametroDois - parametroUm;
        for(int i=1;i<=contagem;i++){
            System.out.println("Parametro "+i);
        }
    }
}
