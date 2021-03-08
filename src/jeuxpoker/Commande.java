/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxpoker;

/**
 *
 * @author thomas
 */
public class Commande {
       //attributs
    
    private int noCommande;
    private int dateCommande;
    
    //constructeurs

    public Commande(int noCommande, int dateCommande) {
        this.noCommande = noCommande;
        this.dateCommande = dateCommande;
    }
    
    
    //getter-setter

    /**
     * @return the noCommande
     */
    public int getNoCommande() {
        return noCommande;
    }

    /**
     * @param noCommande the noCommande to set
     */
    public void setNoCommande(int noCommande) {
        this.noCommande = noCommande;
    }

    /**
     * @return the dateCommande
     */
    public int getDateCommande() {
        return dateCommande;
    }

    /**
     * @param dateCommande the dateCommande to set
     */
    public void setDateCommande(int dateCommande) {
        this.dateCommande = dateCommande;
    }
    
    
    
    //méthode
    
    
    
    
}
