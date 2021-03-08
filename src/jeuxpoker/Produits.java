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
public class Produits {
       //attributs
    private int noProduit;
    private String nomProduit;
    private int prixProduit;
    private String description;
    
    
    //constructeurs

    public Produits(int noProduit, String nomProduit, int prixProduit, String description) {
        this.noProduit = noProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.description = description;
    }
    
    
    
    //getter-setter

    /**
     * @return the noProduit
     */
    public int getNoProduit() {
        return noProduit;
    }

    /**
     * @param noProduit the noProduit to set
     */
    public void setNoProduit(int noProduit) {
        this.noProduit = noProduit;
    }

    /**
     * @return the nomProduit
     */
    public String getNomProduit() {
        return nomProduit;
    }

    /**
     * @param nomProduit the nomProduit to set
     */
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    /**
     * @return the prixProduit
     */
    public int getPrixProduit() {
        return prixProduit;
    }

    /**
     * @param prixProduit the prixProduit to set
     */
    public void setPrixProduit(int prixProduit) {
        this.prixProduit = prixProduit;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    //méthode
    
    
}
