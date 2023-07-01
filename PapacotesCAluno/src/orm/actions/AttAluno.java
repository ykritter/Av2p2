package orm.actions;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import orm.model.Aluno;



public class AttAluno {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Id do aluno: ");
			aluno.setId(sc.nextLong());
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
			EntityManager manager = factory.createEntityManager();
			
			aluno = manager.find(Aluno.class, aluno.getId());
			
			if (aluno != null) {
				
				System.out.println(aluno.toString());
				
				
				sc.nextLine();
				
				//atualiza ou não nome
				System.out.println("\nNome: ");
				String nome = sc.nextLine();
				if (!nome.isBlank()) {
					aluno.setNome(nome);
				}

				
				//atualiza ou não cpf
				System.out.println("Cpf: ");
				String cpf = sc.nextLine();
				if (!cpf.isBlank()) {
					aluno.setCPF(cpf);
				}

				
				//atualiza ou não email
				System.out.println("E-mail: ");
				String email = sc.nextLine();
				if (!email.isBlank()) {
					aluno.setEmail(email);
				}

				//atualiza ou não endereço
				System.out.println("Endereço: ");
				String endereco = sc.nextLine();
				if (!endereco.isBlank()) {
					aluno.setEndereco(endereco);
				}

				//atualiza ou não naturalidade
				System.out.println("Naturalidade: ");
				String naturalidade = sc.nextLine();
				if (!naturalidade.isBlank()) {
					aluno.setNaturalidade(naturalidade);
				}

				//atualiza ou não data de nascimento
				System.out.println("Data de nascimento: ");
				String dataDeNascimento = sc.nextLine();
				if (!dataDeNascimento.isBlank()) {
					aluno.setDataDeNascimento(dataDeNascimento);
				}

				manager.getTransaction().begin();
				
				manager.merge(aluno);
				
				manager.getTransaction().commit();

				System.out.println("Concluído!");
			
				
			} else {
				System.out.println("Aluno não existe");}
			
			
			sc.close();
			manager.close();
			factory.close();
			
		} catch (NumberFormatException e) {
			System.out.println("Erro, tente novamente");
		}
	}
}
