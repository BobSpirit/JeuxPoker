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
public class Admin extends Personne {
       //attributs
    private int noAdmin;
    private set<Message> messages=new Hashset(0);
    
    
    //constructeurs
     public Admin(String nom, String prenom,int noAdmin,set<Message> messages) {
         super(nom, prenom);
        this.noAdmin = noAdmin;
        this.messages=messages;
    }
    
    
    //getter-setter
    
   
    /**
     * @return the noAdmin
     */
    public int getNoAdmin() {
        return noAdmin;
    }

    /**
     * @param noAdmin the noAdmin to set
     */
    public void setNoAdmin(int noAdmin) {
        this.noAdmin = noAdmin;
    }
//manque get et set de messages
    //méthode
    
    
}
