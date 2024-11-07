package com.devoire;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

    public enum TypeTransaction {
        VIRING, VIREST, VIRTALIN
    }
    @JsonProperty("type")
    private TypeTransaction type;
    @JsonProperty("timestamp")

    private LocalDateTime timestamp;
    @JsonProperty("comptes")

    private List<Compte> comptes;
    @JsonProperty("reference")
    private String reference;

    // Constructeur
    public Transaction(List<Compte> comptes) {
        this.timestamp = LocalDateTime.now(); // Date et heure actuelles
        this.comptes = comptes;
        this.reference = generateReference(); // Référence aléatoire
        this.type = TypeTransaction.determineType(comptes.get(0).getBanque(), comptes.get(1).getBanque());// Calcul automatique du type de transaction
    }

    // Générer une référence aléatoire unique
    private String generateReference() {
        return UUID.randomUUID().toString();
    }

 

    // Getters et Setters

    public TypeTransaction getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public String getReference() {
        return reference;
    }
}
