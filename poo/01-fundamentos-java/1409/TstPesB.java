public class TstPesB{

	public static void main(String arg[]){//classLoader
		
		Leitura l = new Leitura();
		PessoaB p1 = new PessoaB();
		
		
		
		/*
		String cpf_S = l.entDados("\n CPF...: ");
		int cpf_I = Integer.parseInt(cpf_S);
		p1.setCpf(cpf_I);
		*/
		

		p1.setCpf(Integer.parseInt(l.entDados("\n CPFx...: ")));
		p1.setNome(l.entDados("\nNOME..: "));
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nCPF...: "+p1.getNome());		
		
	}//fim do main

}