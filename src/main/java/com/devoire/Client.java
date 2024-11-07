package com.devoire;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Client {
    
    @JsonProperty("numClient")
    private int numClient;
    
    @JsonProperty("nom")
    private String nom;
    
    @JsonProperty("prenom")
    private String prenom;
    
    @JsonProperty("adresse")
    private String adresse;
    
    @JsonProperty("phone")
    private String phone;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("comptes")
    private List<Compte> comptes;

    // Constructeur
    public Client(int numClient, String nom, String prenom, String adresse, String phone, String email, List<Compte> comptes) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.comptes = comptes;
    }

    // Getters et Setters
    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
