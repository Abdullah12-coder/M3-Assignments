package com.sunsoft.service;

import java.util.List;
import java.util.Optional;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sunsoft.DAO.TraineeDAO;
import com.sunsoft.Entity.Trainee;







@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

    @Autowired private TraineeDAO dao;
    
    @Transactional(readOnly=true)
    
    public Trainee find(int id) {
        Trainee t=dao.findById(id);
    	if(t!=null)
    		return dao.findById(id);
    	else
    		 System.out.println("Trainee with "+id+" doesn't exists!");
		return t;
    }

    @Transactional(readOnly=true)
    
    public List<Trainee> getAll() {
        return dao.findAll();
    }

    @Transactional(propagation=Propagation.REQUIRED)
    
    public void create(Trainee p) {
    	try {
        dao.save(p);
    	}
    	catch(Exception e) {
           System.out.println("Trainee with "+p.getId()+" already exists!");
    	}
    }

	public void delete(int id) {
		// TODO Auto-generated method stub
		Trainee t=dao.findById(id);
		if(t!=null){
		dao.delete(id);
		}
		else{
	           System.out.println("Trainee with "+id+" doesn't exists!");
	    	}
	}

	public void modify(Trainee t) {
		// TODO Auto-generated method stub
		Trainee t1=dao.findById(t.getId());
		
		if(t1!=null){
			dao.modify(t);
		}
		else
		        System.out.println("Trainee with "+t1.getId()+" doesn't exists!");
		    	
	}

}