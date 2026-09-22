public class TstPes{

	public static void main(String arg[]){//classLoader
		
		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();
		
		String nomeP1 = p1.getClass().getName(); //Reflecion nativo
		
		l.entDados("\nNOME DA CLASSE de P1: "+ nomeP1 +" - <Press any key to prosseguir...>");
/*
		Endereco e1 = new Endereco();
		e1.setRua("dos Erros");
		e1.setNum(13);
*/		

		p1.getEnder().setNum(115); //Reflections
		p1.getEnder().setRua("das Pedras");//Reflections

		p1.setCpf(Integer.parseInt(l.entDados("\n CPFx...: ")));
		p1.setNome(l.entDados("\nNOME..: "));
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nCPF...: "+p1.getNome());

		System.out.println("\nRUA...: "+p1.getEnder().getRua()); //Reflections		
		System.out.println("\nNUMERO...: "+p1.getEnder().getNum());//Reflections
		
/*		
		System.out.println("\nRUA...: "+e1.getRua());		
		System.out.println("\nNUMERO...: "+e1.getNum());
			
*/		
	}//fim do main

}