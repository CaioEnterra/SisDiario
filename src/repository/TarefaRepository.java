package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Tarefa;

public class TarefaRepository extends Repository<Tarefa> {
	
	
	public TarefaRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	
	public List<Tarefa> getTarefa(String nome) {
		
		Query query = 
				getEntityManager().
					createQuery("SELECT p FROM Tarefa p WHERE lower(p.nome) like lower(:nome) ");
		query.setParameter("nome", "%" + nome + "%");
		
		List<Tarefa> lista = query.getResultList();
	
		if (lista == null)
			lista = new ArrayList<Tarefa>();
		
		return lista;
	}

}
