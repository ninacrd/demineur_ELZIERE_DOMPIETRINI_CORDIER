/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_elziere_dompietrini_cordier;

/**
 *
 * @author odomp
 */
public class grille {
    /*creation d'une nouvelle classe*/

    private boolean presence_bombe;
    private boolean presence_Kit;
    private boolean drapeau;
    public int nombre_bombes;
    
    public grille(){ /*initialisation des attributs*/
        presence_bombe = false; 
        presence_Kit = false;
        drapeau = false;
        nombre_bombes = 0;
    }
    
    public boolean presence_bombre(){ /*méthode qui permettra de vérifier la présence ou non d'une bombe dans la case et retourne un booléen*/
        if (presence_bombe == true){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean presence_Kit(){ /*on vérifie la présence d'un Kit*/
        if (presence_Kit == true){
            return true;
        } else {
            return false; 
        }
    }
    
    public void placer_bombe(){ /*permet de placer une bombe*/
        presence_bombe = true; /*renvoie vrai car on a une bombe*/
    }
    
    public void placer_Kit(){
        presence_Kit = true;
    }
    
    public void placer_drapeau(){ /*permet de placer un drapeau à l'endroit où le joueur pense qu'il y a une bombe*/
        drapeau = true;
    }
    
    public void supprimer_drapeau(){
        drapeau = false;
    }
    
    public int nombre_bombes(){
        return nombre_bombes;
    }
    
}
