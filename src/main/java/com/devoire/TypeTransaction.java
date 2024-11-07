package com.devoire;

public enum TypeTransaction {
    VIRING,  // Même banque
    VIREST,  // Banques différentes mais même pays
    VIRTALIN;  // Banques et pays différents

    public static TypeTransaction determineType(Banque banque1, Banque banque2) {
        if (banque1.equals(banque2)) {
            return VIRING; // Même banque
        } else if (banque1.getIdPays().equals(banque2.getIdPays())) {
            return VIREST; // Même pays, banques différentes
        } else {
            return VIRTALIN; // Banques et pays différents
        }
    }
}
