package orm.actions;
import java.util.Scanner;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import orm.model.Aluno;

public class CdstAluno {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		aluno.setNome(sc.nextLine());
		
		System.out.println("Cpf: ");
		aluno.setCPF(sc.nextLine());
		
		System.out.println("E-mail: ");
		aluno.setEmail(sc.nextLine());
		
		System.out.println("Endereço: ");
		aluno.setEndereco(sc.nextLine());
		
		System.out.println("Naturalidade: ");
		aluno.setNaturalidade(sc.nextLine());
		
		System.out.println("Data de nascimento: ");
		aluno.setDataDeNascimento(sc.nextLine());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Cadastro concluído!!");
		
		sc.close();
        manager.close();
        factory.close();
	}
}
