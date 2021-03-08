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
public class Partie {
       //attributs
    private int noPartie;
    private int datePartie;
    
    
    //constructeurs

    public Partie(int noPartie, int datePartie) {
        this.noPartie = noPartie;
        this.datePartie = datePartie;
    }
    
    
    
    //getter-setter

    /**
     * @return the noPartie
     */
    public int getNoPartie() {
        return noPartie;
    }

    /**
     * @param noPartie the noPartie to set
     */
    public void setNoPartie(int noPartie) {
        this.noPartie = noPartie;
    }

    /**
     * @return the datePartie
     */
    public int getDatePartie() {
        return datePartie;
    }

    /**
     * @param datePartie the datePartie to set
     */
    public void setDatePartie(int datePartie) {
        this.datePartie = datePartie;
    }
    
    
    //méthode
    
    
    
    
}
