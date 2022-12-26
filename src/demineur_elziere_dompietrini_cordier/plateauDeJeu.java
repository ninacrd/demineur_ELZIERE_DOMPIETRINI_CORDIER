/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_elziere_dompietrini_cordier;

import java.util.Random;

/**
 *
 * @author odomp
 */
public class plateauDeJeu {
    grille [][] Grille = new grille [16][30]; /*on crée la grille avec 16 lignes et 30 colonnes*/
    
    public plateauDeJeu(){
        for (int i = 0; i < 16; i++){ /*on parcourt les lignes de 0 à 15*/
            for (int j = 0; j < 30 ; j++){ /*on parcourt les colonnes de 0 à 29*/
                Grille[i][j] = new grille();
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
        for (int i = 0; i < 16 ; i++){
            for (int j = 0; j < 30 ; j++){
                System.out.print(Grille[i][j]);
            }
        }
    }
    
    public boolean presence_bombe(int i, int j){ /*mêmes méthodes que dans le plateauDeJeu du puissance 4*/
        boolean m = Grille[i][j].presence_bombe; /*on regarde si on a une bombe dans la case choisie*/
        return m;
    }
    
    public void placer_bombe(int i, int j){ /*on place les bombes dans les cases*/
        Grille[i][j].placer_bombe();
    }
    
    public boolean presence_Kit(int i, int j){
        boolean n = Grille[i][j].presence_Kit; /*on regarde si on a un kit*/
        return n;
    }
        
    public void placer_Kit(int i, int j){ /*on place les kit*/
        Grille[i][j].placer_Kit();
    }
    
    public boolean presence_drapeau(int i, int j){
        boolean p = Grille[i][j].presence_Kit; /*on regarde si on a un kit*/
        return p;
    }
    
    public void placer_drapeau(int i, int j){ /*permet au joueur de placer des drapeaux s'il pense qu'il y a une bombe*/
        Grille[i][j].placer_drapeau();
    }    
    
    public void supprimer_drapeau(int i, int j){
        Grille[i][j].supprimer_drapeau();
    }
    
    /*on va maintenant créer la méthode permettant de savoir s'il y a des bombes dans les cases voisines*/
    
    public int bombes_voisines(int i, int j){
        boolean haut = false; /*on va vérifier s'il y a des bombes au dessus de la case*/
        if (i+1 < 16 && Grille[i+1][j].presence_bombe == true){ /*ligne au dessus de notre case, toujours dans la meme colonne*/
            haut = true;
        }
        
        boolean diag_haut = false; /*on vérifie la présence de bombes dans les diagonales en haut a droite et en haut a gauche */
        if (i+1 < 16 && j+1 < 30 && Grille[i+1][j+1].presence_bombe == true){
            diag_haut = true;
        }
        if (i+1 < 16 && j-1 >= 0 && Grille[i+1][j-1].presence_bombe == true){
            diag_haut = true;
        }
        
        boolean bas = false; /*on vérifie la présence en dessous de la case*/
        if (i-1>= 0 && Grille[i-1][j].presence_bombe == true){
            bas = true;
        }
       
        boolean diag_bas = false; /*on vérifie la présence de bombes dans les diagonales en bas a droite et en bas a gauche*/
        if (i-1>=0 && j+1 < 30 && Grille[i-1][j+1].presence_bombe == true){
            diag_bas = true;
        }
        if (i-1>=0 && j-1>=0 && Grille[i-1][j-1].presence_bombe == true){
            diag_bas = true;
        }
        
        boolean droite = false; /*on vérifie la présence à droite de la cellule*/
        if (j+1<30 && Grille[i][j+1].presence_bombe==true){
            droite = true;
        }
        
        boolean gauche = false; /*on vérifie la présence à gauche de la cellule*/
        if (j-1>=0 && Grille[i][j-1].presence_bombe == true){
            gauche = true;
        }
        return 0;
        
        
    }
    
    
}
