/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_elziere_dompietrini_cordier;

/**
 *
 * @author odomp
 */
public class joueur {
    
    private String nomJoueur;
    private int kit ;
    private int pointvie;
    
    public joueur(String joueur1){
        nomJoueur= joueur1;
        kit = 0;
        pointvie= 3;
    }
    public void avoirKit(){
        kit= kit+1;
    }
    
    public void utiliserKit(){
        kit = kit-1;
    }
           
    public int nombreVie(){
        return (pointvie);
    }
     
    public int défaite(){
        pointvie= pointvie-1;
        return pointvie;
    }
}
