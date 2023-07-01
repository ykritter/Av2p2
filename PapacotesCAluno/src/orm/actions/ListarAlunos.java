package orm.actions;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import orm.model.Aluno;

public class ListarAlunos {
	public static void main(String[] args) {
		
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        String sql = "SELECT a FROM aluno AS a";
        Query query = manager.createQuery(sql);

        @SuppressWarnings("unchecked")
        List<Aluno> lista = query.getResultList();
        
        for (Aluno aluno : lista) {
			System.out.println("Aqui estão os alunos: \n" + aluno.toString());
		}
    }
}
