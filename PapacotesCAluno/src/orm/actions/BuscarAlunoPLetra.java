package orm.actions;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import orm.model.Aluno;



public class BuscarAlunoPLetra {

	public static void main(String[] args) {
		
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma letra a ser pesquisada: \n");
        String letra = sc.nextLine();

        String sql = "SELECT n FROM Aluno AS n WHERE LOWER(n.nome) LIKE :letra";
        Query query = manager.createQuery(sql);
        
        query.setParameter("letra", letra.toLowerCase()+"%");

        @SuppressWarnings("unchecked")
        List<Aluno> lista = query.getResultList();

        for (Aluno aluno : lista) {
            System.out.println(aluno.toString());
        }
        
        sc.close();
        manager.close();
        factory.close();
	    

	}

}
