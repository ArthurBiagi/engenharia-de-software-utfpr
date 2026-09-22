public class Pessoa{//Tipo Abstrato de Dados

	private int cpf;
	private String nome;
	private Endereco ender;
	
//========================================
	public Pessoa(){
		System.out.println("\n Construtor Default de Pessoa");
		cpf = 10;
		nome = "El Rapha";
		ender = new Endereco();
	}
	
	public Pessoa(int cpf, String nome, Endereco ender){
		
		System.out.println("\n Construtor SOBREC1 de Pessoa");
				
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
		
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