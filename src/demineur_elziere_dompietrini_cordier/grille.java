/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_elziere_dompietrini_cordier;

/**
 *
 * @author odomp
 */
public class grille { /*équivalent à cellule de grille du puissance 4*/
    /*creation d'une nouvelle classe*/

    public boolean presence_bombe; 
    public boolean bombe_activee; /*sera utilisée si le joueur touche une bombe*/
    public boolean presence_Kit;
    public boolean kit_active;
    public boolean drapeau;
    public boolean nb_vie;
    public int nb_bombes = 99;

    public int getNb_bombes() {
        return nb_bombes;
    }
    
    
    public grille(){ /*initialisation des attributs*/
        presence_bombe = false; 
        bombe_activee = false;
        presence_Kit = false;
        kit_active = false;
        drapeau = false;
        nb_vie = true; /*car le joueur débute avec 3 vies*/
    }
    
    public boolean presence_bombe(){ /*méthode qui permettra de vérifier la présence ou non d'une bombe dans la case et retourne un booléen*/
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
    
    public boolean presence_vie(){ /*permet de vérifier si le joueur n'a pas utilisé ses 3 vies*/
        if (nb_vie == true){
            return true;
        } else {
            return false;
        }
    }
    
    public void placer_bombe(){ /*permet de placer une bombe*/
        presence_bombe = true; /*renvoie vrai car on a une bombe*/
    }
    
    public void placer_Kit(){
        presence_Kit = true; /*il y a bien un kit dans la cellule*/
    }
    
    public void placer_drapeau(){ /*permet de placer un drapeau à l'endroit où le joueur pense qu'il y a une bombe*/
        drapeau = true;
    }
    
    public void supprimer_drapeau(){
        drapeau = false;
    }
    
    public void supprimer_Kit(){
        presence_Kit = false; /*il n'y en aura plus dans la cellule*/
    }
    
    public void activer_Kit(){
        supprimer_Kit(); /*si on active un kit alors on le supprimer*/
    }
    
    public void utilisation_Kit(){ /*on utilisera cette méthode pour afficher la bonne image si le joueur utilise un kit*/
        kit_active = true;
    }
    
    public void explosion(){ /*méthode qu'on utilisera pour afficher la bonne image*/
        bombe_activee = true;
    }
    
}
