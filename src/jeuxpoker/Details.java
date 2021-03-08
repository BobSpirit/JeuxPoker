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
public class Details {
       //attributs
    private int prixAchat;
    private int qutAchat;
    
    
    
    //constructeurs

    public Details(int prixAchat, int qutAchat) {
        this.prixAchat = prixAchat;
        this.qutAchat = qutAchat;
    }
    
    
    
    //getter-setter

    /**
     * @return the prixAchat
     */
    public int getPrixAchat() {
        return prixAchat;
    }

    /**
     * @param prixAchat the prixAchat to set
     */
    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    /**
     * @return the qutAchat
     */
    public int getQutAchat() {
        return qutAchat;
    }

    /**
     * @param qutAchat the qutAchat to set
     */
    public void setQutAchat(int qutAchat) {
        this.qutAchat = qutAchat;
    }
    
    
    
    
    //méthode
    
    
}
