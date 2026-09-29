public class Aluno extends Pessoa {//Tipo Abstrato de Dados

	private int ra;
	private String curso;
	
//========================================
	public Aluno(){
		System.out.println("\n Construtor Default de Aluno -> Filha");
		ra = 0;
		curso = "";
	}
	
	public Aluno(int ra, String curso){
		System.out.println("\n Construtor SOBREC1 de Aluno -> Filha");
		this.ra = ra;
		this.curso = curso;
	}
	

	public int getRa(){
		return ra;		
	}
	
	
	public String getCurso(){
		return curso;
	}
	
	public void setRa(int ra){
		this.ra = ra;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}


}// fim da classe