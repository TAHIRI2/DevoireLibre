package com.devoire;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Exemple de création d'un client
            Client client = new Client(1, "Dupont", "Camélia", "123 Rue Exemple", "0123456789", "email@example.com", new ArrayList<>());
            
            // Conversion de l'objet Client en JSON
            String clientJson = JsonConverter.toJson(client);
            System.out.println("Client JSON: " + clientJson);

            // Conversion JSON vers objet Client
            Client clientFromJson = JsonConverter.fromJson(clientJson, Client.class);
            System.out.println("Nom du client à partir du JSON: " + clientFromJson.getNom());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

