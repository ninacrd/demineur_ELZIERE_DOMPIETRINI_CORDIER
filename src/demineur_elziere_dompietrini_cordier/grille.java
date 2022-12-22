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

    public boolean presence_bombe; 
    public boolean bombe_activee; /*sera utilisée si le joueur touche une bombe*/
    public boolean presence_Kit;
    public boolean kit_active;
    public boolean drapeau;
    public boolean nb_vie;
    public int nb_bombes;
    public boolean bombe0; /*représente le nombre de bombes a proximité qui s'affichera lorsqu'on touche une case vide*/
    public boolean bombe1;
    public boolean bombe2;
    public boolean bombe3;
    public boolean bombe4;
    
    
    public grille(){ /*initialisation des attributs*/
        bombe0 = false;
        bombe1 = false;
        bombe2 = false;
        bombe3 = false;
        bombe4 = false;
        presence_bombe = false; 
        bombe_activee = false;
        presence_Kit = false;
        kit_active = false;
        drapeau = false;
        nb_vie = true; /*car le joueur débute avec 3 vies*/
    }
    
    /*on passe tous les attributs bombe0, bombe1 ... à true ce qui permettra d'afficher le bon nombre en fonction du nombre de bombe à côté de la case jouée*/
    public void bombe0(){
        bombe0 = true;
    }
    
    public void bombe1(){
        bombe1 = true;
    }
    
    public void bombe2(){
        bombe2 = true;
    }
    
    public void bombe3(){
        bombe3 = true;
    }
    
    public void bombe4(){
        bombe4 = true;
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
        presence_Kit = true;
    }
    
    public void placer_drapeau(){ /*permet de placer un drapeau à l'endroit où le joueur pense qu'il y a une bombe*/
        drapeau = true;
    }
    
    public void supprimer_drapeau(){
        drapeau = false;
    }
    
    public int nombre_bombes(){
        return nb_bombes;
    }
    
}
