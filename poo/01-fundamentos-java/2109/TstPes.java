public class TstPes{

	public static void main(String arg[]){//classLoader
		
		Leitura l = new Leitura();
		
		//Pessoa p1 = new Pessoa();
		Pessoa p1 = new Pessoa(16, "El Shalon", new Endereco());
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nNOME...: "+p1.getNome());	

//Alterando os dados de Pessoa

		p1.setCpf(Integer.parseInt(l.entDados("\n NOVO CPFx...: ")));
		p1.setNome(l.entDados("\nNOVO NOME..: "));
		
		p1.getEnder().setNum(Integer.parseInt(l.entDados("\n NUMERO...: "))); //Reflections
		p1.getEnder().setRua(l.entDados("\nRUA..: "));//Reflections		
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nNOME...: "+p1.getNome());			
		
		/*
		p1.getEnder().setNum(115); //Reflections
		p1.getEnder().setRua("das Pedras");//Reflections

		p1.setCpf(Integer.parseInt(l.entDados("\n CPFx...: ")));
		p1.setNome(l.entDados("\nNOME..: "));
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nCPF...: "+p1.getNome());

		System.out.println("\nRUA...: "+p1.getEnder().getRua()); //Reflections		
		System.out.println("\nNUMERO...: "+p1.getEnder().getNum());//Reflections
		*/

	}//fim do main

}