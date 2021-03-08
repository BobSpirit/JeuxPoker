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
public class Membre extends Personne{
    
    //attributs
    private int noMembre;
    private String avatar;
    private String surnom;
    private String email;
    private int nbCredit;
    private Hashset<Message> messages= new Hashset(0);

    //constructeurs
    public Membre(int noMembre, String nom, String prenom){
       super(nom,prenom);
        this.noMembre = noMembre;
    }
    
    public Membre(String nom, String prenom, int noMembre, String avatar, String surnom, String email, int nbCredit,Set<Message> messages) {
        super(nom,prenom);
        this.noMembre = noMembre;
        this.avatar = avatar;
        this.surnom = surnom;
        this.email = email;
        this.nbCredit = nbCredit;
        this.messages = messages;
    }

    

    public Membre(int noMembre, String surnom, String email) {
        this.noMembre = noMembre;
        this.surnom = surnom;
        this.email = email;
    }
    
    //getter-setter

    /**
     * @return the noMembre
     */
    public int getNoMembre() {
        return noMembre;
    }

    /**
     * @param noMembre the noMembre to set
     */
    public void setNoMembre(int noMembre) {
        this.noMembre = noMembre;
    }

    /**
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return the surnom
     */
    public String getSurnom() {
        return surnom;
    }

    /**
     * @param surnom the surnom to set
     */
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nbCredit
     */
    public int getNbCredit() {
        return nbCredit;
    }

    /**
     * @param nbCredit the nbCredit to set
     */
    public void setNbCredit(int nbCredit) {
        this.nbCredit = nbCredit;
    }
    
    //get-set de message manquant
    
    //méthodes
    
    public void afficherDetail(){
        System.out.println(this.nom, this.prenom,this.noMembre + "-"+ this.avatar + "-"+this.surnom + "-"+ this.email+ "-"+ this.nbCredit+"-"+this.messages);
    }
    
}
