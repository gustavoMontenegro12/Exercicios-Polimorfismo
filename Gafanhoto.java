public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totalAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;
	}
	
	public void viuMaisUm() {
		
	}
	@Override
	public void ganharExperiencia() {
		
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public int getTotalAssistido() {
		return totalAssistido;
	}
	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}
	
	@Override
	public String toString() {
		return "Gafanhoto: " + this.nome + ", Idade: " + idade + ", Sexo: " 
				+ this.sexo + ", Experiencia: " + this.experiencia + ", Login: " + this.login + 
				", Total Assistido: " + this.totalAssistido;
		
	}
}
