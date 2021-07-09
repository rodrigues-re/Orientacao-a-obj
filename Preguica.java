package Turma28;

public class Preguica extends Animal {
private String especie;
private String habito;

public Preguica(String nome,String idade,String especie,String habito)
{
	super(nome,idade);
	this.especie = especie;
	this.habito = habito;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public String getHabito() {
	return habito;
}

public void setHabito(String habito) {
	this.habito = habito;
}
    
  public void imprimirInfo() 
  {
	System.out.println("\nO nome da preguiça é: "+getNome() +"\nTem a idade de: "+getIdade() +"\nÉ da espécie: "+especie+ "\nTem o hábito de: "+habito);
  }
	

	
}
