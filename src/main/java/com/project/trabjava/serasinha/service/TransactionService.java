package com.project.trabjava.serasinha.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.project.trabjava.serasinha.models.Transaction;


@Path("transaction")
@Produces(MediaType.APPLICATION_JSON)
public class TransactionService {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String createTransaction(
           Transaction t
    ) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String data = formato.format(new Date());

        Transaction transaction = new Transaction(
	    		t.getBuyer_account_id(), 
	    		t.getBuyer_account_id(), 
	    		t.getValue(), 
	    		data
        );
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "serasinhadb" );
        EntityManager entityManager = emfactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(transaction);
        entityManager.getTransaction().commit();

		return "Transacao feita com sucesso!";
	}
}
