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
public class Billet {
    
    //attributs
    private int noBillet;
    private int dateBillet;
    private set<Message> messages= new Hashset(0);
    
    
    //constructeurs

    public Billet(int noBillet, int dateBillet,set<Message> messages) {
        this.noBillet = noBillet;
        this.dateBillet = dateBillet;
        this.messages=messages;
    }
    
     
    
    //getter-setter
    
/**
     * @return the noBillet
     */
    public int getNoBillet() {
        return noBillet;
    }

    /**
     * @param noBillet the noBillet to set
     */
    public void setNoBillet(int noBillet) {
        this.noBillet = noBillet;
    }

    /**
     * @return the dateBillet
     */
    public int getDateBillet() {
        return dateBillet;
    }

    /**
     * @param dateBillet the dateBillet to set
     */
    public void setDateBillet(int dateBillet) {
        this.dateBillet = dateBillet;
    }
//manque get et set de message du à l'erreur
    
    //méthode
   

    

    
}
