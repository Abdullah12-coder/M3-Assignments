package com.sunsoft.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sunsoft.Entity.Trainee;


	@Repository
	public class TraineeDAOImpl implements TraineeDAO {

	    @PersistenceContext
	    private EntityManager em;
	    
	    
	    public void save(Trainee t) {
	        em.persist(t);
	        em.flush();
	    }

	   
	    public Trainee findById(Integer id) {
	        return em.find(Trainee.class, id);
	    }

	   
	    public List<Trainee> findAll() {
	        Query q = em.createQuery("from Trainee t");//That's "JPQL" not SQL !!!
	        return q.getResultList();
	    }


		public void delete(Integer id) {
			// TODO Auto-generated method stub
			Trainee tr= em.find(Trainee.class, id);
			em.remove(tr);
			
			
		}


		public void modify(Trainee t) {
			em.merge(t);
		}
	}

