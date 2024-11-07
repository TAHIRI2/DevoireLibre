package com.devoire;
import java.util.List;
import java.util.ArrayList;

public class Banque {
    private String idPays;
    private List<Compte> comptes;

    // Constructeur
    public Banque(String idPays) {
        this.idPays = idPays;
        this.comptes = new ArrayList<>();
    }

    // Getters et Setters

    public String getIdPays() {
        return idPays;
    }

    public void setIdPays(String idPays) {
        this.idPays = idPays;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    // Méthode pour ajouter un compte à la liste des comptes
    public void addCompte(Compte compte) {
        this.comptes.add(compte);
    }
}
