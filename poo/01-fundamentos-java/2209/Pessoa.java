public class Pessoa{//Tipo Abstrato de Dados

	private int cpf;
	private String nome;
	private Endereco ender;
	
//========================================
	public Pessoa(){
		System.out.println("\n Construtor Default de Pessoa");
		cpf = 0;
		nome = "";
		ender = new Endereco();
	}
	
	public Pessoa(int cpf, String nome, Endereco ender){
		System.out.println("\n Construtor SOBREC1 de Pessoa");
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
	}
	
	public Pessoa(String n, int c, Endereco e){
		
		System.out.println("\n Construtor SOBREC2 de Pessoa");
				
		this.cpf = c;
		this.nome = n;
		this.ender = e;
		
	}	
//====================================
// Sobrecarga de outro método qualquer

public void impDados(){
	System.out.println("\n\t IMPDADOS VOID - DEFAULT");
}

public int impDados(int k){
	System.out.println("\n\t IMPDADOS int - SOBREC1");
	return k;
}
	
	
//====================================	
	public Endereco getEnder(){
		return ender;		
	}
	public void setEnder(Endereco ender){
		this.ender = ender;
		
	}
//====================================
	
	public int getCpf(){
		return cpf;		
	}
	
	
	public String getNome(){
		return nome;
	}
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}


}// fim da classe