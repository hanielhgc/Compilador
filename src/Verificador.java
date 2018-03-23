
public class Verificador {
	
	String expressao;
	boolean valido;
	
	
	public String getExpressao() {
		return expressao;
	}
	public void setExpressao(String expressao) {
		this.expressao = expressao;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public Verificador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Verificador(String expressao, boolean valido) {
		super();
		this.expressao = expressao;
		this.valido = valido;
	}
	
	public void verificar(Verificador verificador){
		char[] vetor = new char[verificador.getExpressao().length()];
		
		char[] comparador = new char[19];
		
		comparador[0]='0';
		comparador[1]='1';
		comparador[2]='2';
		comparador[3]='3';
		comparador[4]='4';
		comparador[5]='5';
		comparador[6]='6';
		comparador[7]='7';
		comparador[8]='8';
		comparador[9]='9';
		
		comparador[10]='+';
		comparador[11]='-';
		comparador[12]='/';
		comparador[13]='*';
		comparador[14]='=';
		comparador[15]='(';
		comparador[16]=')';
		comparador[17]='>';
		comparador[18]='<';
		
		vetor=verificador.getExpressao().toCharArray();
		
		verificador.setValido(true);
		for (int i = 0; i < vetor.length; i++) {
			if(verificador.isValido()==false){
				break;
			}
			if(vetor[i]==comparador[0] || vetor[i]==comparador[1] || vetor[i]==comparador[2] ||vetor[i]==comparador[3] ||vetor[i]==comparador[4] ||vetor[i]==comparador[5] ||vetor[i]==comparador[6] ||vetor[i]==comparador[7] ||vetor[i]==comparador[8] ||vetor[i]==comparador[9] ||vetor[i]==comparador[10] ||vetor[i]==comparador[11] ||vetor[i]==comparador[12] ||vetor[i]==comparador[13] ||vetor[i]==comparador[14] ||vetor[i]==comparador[15] ||vetor[i]==comparador[16] ||vetor[i]==comparador[17] ||vetor[i]==comparador[18]){
				verificador.setValido(true);
			}else{
				verificador.setValido(false);
			}
				
			
			
			
		}
		
		
		
	}

}
