package com.project.trabjava.serasinha.models;

import java.io.Serializable;
import javax.persistence.*;
//import serasinha.model.*;

@Entity
public class Transaction implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private Long buyer_account_id;
    @Column(nullable=false)
    private Long seller_account_id;
    @Column(nullable=false)
    private Float value;
    @Column
    private String date;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
    public Long getBuyer_account_id() {
		return buyer_account_id;
	}
	public void setBuyer_account_id(Long buyer) {
		this.buyer_account_id = buyer;
	}
	
    public Long getSeller_account_id() {
		return seller_account_id;
	}
	public void setSeller_account_id(Long seller) {
		this.seller_account_id = seller;
	}
	
    public Float getValue() {
		return value;
	}
	public void setValue(Float v) {
		this.value = v;
	}
	
    public String getDate() {
		return date;
	}
	public void setDate(String d) {
		this.date = d;
	}
	
	public Transaction(Long buyer_account_id, Long seller_account_id, Float value, String date) {
		super();
		this.buyer_account_id = buyer_account_id;
		this.seller_account_id = seller_account_id;
		this.value = value;
		this.date = date;
	}

//	public void createTransaction(
//            Transaction t
//    ) {
////		System.out.println(t.getDate());
//        Transaction transaction = new Transaction(t.buyer_account_id, t.seller_account_id, t.value, t.date);
//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "heroku_ab409c421a22263" );
//        EntityManager entityManager = emfactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(transaction);
//        entityManager.getTransaction().commit();
//    }
	
//	public void transferMoney(Long seller_account_id, Float value, String date) {
//		Transaction transaction = new Transaction(this.getId(), seller_account_id, value, date);
//		transaction.createTransaction(transaction);
//	}
    
}
