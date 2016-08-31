package fr.afcepf.al28.seb.banque.entity;

import java.util.*;

/**
 * 
 */
public class Client extends Utilisateur {

    /**
     * Default constructor
     */
    public Client() {
    }

    /**
     * 
     */
    private Boolean isFirstConnexion;

    /**
     * 
     */
    private Set<Compte> comptes;

}