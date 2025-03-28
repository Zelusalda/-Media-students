package aprovado;

import java.util.Scanner;

public class AppNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		Aluno [] alunos = new Aluno [3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.next();
			System.out.println("Digite a matricula do aluno: ");
			String matricula = sc.next();
			System.out.println("Digite a nota da primeira avaliação: ");
			double nota_Prova1 = sc.nextDouble();
			System.out.println("Digite a nota da segunda avaliação: ");
			double nota_Prova2 = sc.nextDouble();
			System.out.println("Digite a nota do trabalho: ");
			double nota_Trabalho = sc.nextDouble();
			alunos [i] = new Aluno(matricula, nome, nota_Prova1, nota_Prova2, nota_Trabalho);
		}

		
		System.out.println("Alunos que vão para a prova final: ");
		for(Aluno aluno : alunos) {
			double notaFinal = aluno.nota_Final();
			if (notaFinal > 0) {
		        System.out.printf("%s precisa de %.2f na prova final.%n", aluno.getNome(), notaFinal);
		    }
		}
		
		
	
	}
	
	
}
