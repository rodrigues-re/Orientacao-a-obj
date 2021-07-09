package Turma28;

public class Cachorro extends Animal {
  private String cor;
  private String tamanho;
	
     public Cachorro(String nome,String idade,String cor,String tamanho)
     {
    	 super(nome,idade);
    	 this.cor = cor;
    	 this.tamanho = tamanho;
     }

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nO nome do cachorro é: "+getNome() +"\nTem a idade de: "+ getIdade() +"\nNa cor: "+cor+ "\nTem o tamanho de porte:" +tamanho);
	}
     
}

