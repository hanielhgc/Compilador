import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		Verificador verificador = new Verificador();
		
		String expressao;
		System.out.println("Informe a express�o:");
		expressao=scanner.nextLine();
		
		verificador.setExpressao(expressao);
		
		
		verificador.verificar(verificador);
		
		if(verificador.isValido()==true){
			System.out.println("Express�o v�lida!");
		}else{
			System.out.println("Express�o inv�lida!");
		}
		
		
		
	
		
		
		
		
	}
	
}
