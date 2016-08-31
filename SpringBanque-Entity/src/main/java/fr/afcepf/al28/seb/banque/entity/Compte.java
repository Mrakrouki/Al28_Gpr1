package fr.afcepf.al28.seb.banque.entity;

import java.util.*;

/**
 * 
 */
public class Compte {

    /**
     * Default constructor
     */
    public Compte() {
    }

    /**
     * 
     */
    private Integer numero;

    /**
     * 
     */
    private String libelle;

    /**
     * 
     */
    private Client client;

    /**
     * 
     */
    private Set<Operation> operations;

    /**
     * 
     */
    private Set<Debit> virement;

    /**
     * @return
     */
    public double getSolde() {
        // TODO implement here
        return 0.0d;
    }

}