package com.devoire;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Compte {
	@JsonProperty("numCompte")
    private int numCompte;
	@JsonProperty("dateCreation")

    private Date dateCreation;
	@JsonProperty("dateUpdate")
    private Date dateUpdate;
	@JsonProperty("devise")
    private String devise;
	@JsonProperty("client")

    private Client client;
	@JsonProperty("banque")

    private Banque banque;
	@JsonProperty("transactions")

    private List<Transaction> transactions;

    // Constructeur
    public Compte(int numCompte, Date dateCreation, String devise, Client client, Banque banque) {
        this.numCompte = numCompte;
        this.dateCreation = dateCreation;
        this.dateUpdate = dateCreation; // Initialise la date de mise à jour à la création
        this.devise = devise;
        this.client = client;
        this.banque = banque;
        this.transactions = new ArrayList<>();
    }

    // Getters et Setters

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    // Méthode pour ajouter une transaction à la liste des transactions
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
}
