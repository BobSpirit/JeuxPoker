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
public class ModeDeJeu {
       //attributs
    private int codeMode;
    private String nomMode;
    
    
    //constructeurs

    public ModeDeJeu(int codeMode, String nomMode) {
        this.codeMode = codeMode;
        this.nomMode = nomMode;
    }
    
    
    
    //getter-setter

    /**
     * @return the codeMode
     */
    public int getCodeMode() {
        return codeMode;
    }

    /**
     * @param codeMode the codeMode to set
     */
    public void setCodeMode(int codeMode) {
        this.codeMode = codeMode;
    }

    /**
     * @return the nomMode
     */
    public String getNomMode() {
        return nomMode;
    }

    /**
     * @param nomMode the nomMode to set
     */
    public void setNomMode(String nomMode) {
        this.nomMode = nomMode;
    }
    
    
    
    
    //méthode
    
}
