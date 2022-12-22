/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_elziere_dompietrini_cordier;

/**
 *
 * @author odomp
 */
public class plateauDeJeu {
    grille [][] Grille = new grille [16][30]; /*on crée la grille avce 16 lignes et 30 colonnes*/
    
    public plateauDeJeu(){
        for (int i = 0; i < 16; i++){ /*on parcourt les lignes de 0 à 15*/
            for (int j = 0; j < 30 ; j++){ /*on parcourt les colonnes de 0 à 29*/
                Grille[i][j] = new grille();
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
        for (int i = 0; i < 16 ; i++){
            for (int j = 0; j < 30 ; i++){
                System.out.print(Grille[i][j]);
            }
            System.out.println();
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
    
    public int nombre_bombes_voisines(int i, int j){
        int p = Grille[i][j].nombre_bombes();
        return p;
    }
}
