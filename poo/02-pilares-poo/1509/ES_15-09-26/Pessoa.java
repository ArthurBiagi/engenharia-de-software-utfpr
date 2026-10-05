public class Pessoa{//Tipo Abstrato de Dados

	private int cpf = 0;
	private String nome = "";
	
	private Endereco ender = new Endereco();
	
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