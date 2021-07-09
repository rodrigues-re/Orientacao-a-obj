package Turma28;

public class Cavalo extends Animal {
	private String crina;
	private String raca;

	  public Cavalo(String nome,String idade,String crina,String raca) 
	  {
		  super(nome,idade);
		  this.crina = crina;
		  this.raca = raca;
	  }

	public String getCrina() {
		return crina;
	}

	public void setCrina(String crina) {
		this.crina = crina;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
    
	public void imprimirInfo() 
	{
		System.out.println("\nO nome do cavalo é: "+getNome() +"\nTem a idade de: "+getIdade() +"\nA crina é: "+crina+ "\nSua raça é: "+raca);
	}
	
	
}


	

  

