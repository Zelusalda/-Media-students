package aprovado;

public class Aluno {
	private String matricula_Aluno;
	private String nome_Aluno;
	private double nota1_Aluno;
	private double nota2_Aluno;
	private double nota_Trabalho_Aluno;

	public Aluno(String matricula, String nome, double nota1, double nota2, double nota_Trabalho) {
		System.out.println("\nNovo aluno");
		this.matricula_Aluno = matricula;
		this.nome_Aluno = nome;
		this.nota1_Aluno = nota1;
		this.nota2_Aluno = nota2;
		this.nota_Trabalho_Aluno = nota_Trabalho;
	}

	public double media_Aluno() {
		double pesoProvas = 2.5;
		double pesoTrabalho = 2.0;
		double somaPesos = (pesoProvas * 2) + pesoTrabalho;
		double media = ((nota1_Aluno * pesoProvas) + (nota2_Aluno * pesoProvas) + (nota_Trabalho_Aluno * pesoTrabalho)) / somaPesos;
		return media;
	}

	public double nota_Final() {
		double media = media_Aluno();
		if (media >= 6) {
			return 0;
		} else {
			return 6 - media;
		}
	}
		
	    public String getNome() {
	        return nome_Aluno;
	    }
	}
