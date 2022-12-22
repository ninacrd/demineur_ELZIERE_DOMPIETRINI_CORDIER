/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_elziere_dompietrini_cordier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author odomp
 */
public class partie {
    private plateauDeJeu plateau;
    private joueur joueurCourant;
    
    public partie(joueur J1){
        joueurCourant = J1; /*on initialise le joueur courant (il n'y en a qu'un*/
    }
    
    public void placerBombe(int nb){ /*nombre de bombe que le joueur veut placer*/
        Random generateurAleat = new Random ();
        
        int b = 0; /*nombre de bombe entré initialement*/
        while (b < nb){
            int i = generateurAleat.nextInt(); /*permettra de placer les bombes dans une ligne aléatoire*/
            int j = generateurAleat.nextInt(); /*génère une colonne aléatoirement*/
            if (plateau.presence_bombe(i, j)==false){
                plateau.placer_bombe(i, j); /*s'il n'y a pas de bombe sur la case choisie aléatoirement on en place une*/
                b += 1;
            } 
        } 
    }
    
    public void initialiserPartie(){ /*méthode qui permet d'initialiser la partie*/
        Scanner saisie_joueur = new Scanner(System.in); /*permet au joueur de rentrer une donnée*/
        
        System.out.println("Quel est le nom du joueur ? ");
        String nom_joueur = saisie_joueur.nextLine(); /*on lui demande de rentrer son nom*/
        joueur joueur = new joueur(nom_joueur);
        
        System.out.println("Combien de bombe voulez vous placer ? ");
        int nb_bombe = saisie_joueur.nextInt(); /*on lui demande combien de bombre il veut placer*/
        placerBombe(nb_bombe);
    }
    
    public void lancerPartie(){ /*méthode qui permet de lancer la partie*/
        int choix_joueur;
        Scanner saisie_joueur = new Scanner(System.in);
        
        boolean fin = false; /*tant que le joueur n'a pas gagné il continue sauf s'il n'a plus de point de vie et dans ce cas on aura fin = true*/
        while (fin == false){
            /* création d'un menu avec plusieurs choix possible*/
            System.out.println(joueurCourant.nom + ", que voulez vous faire?");
            System.out.println("1 - Déminer");
            System.out.println("2 - Placer ou supprimer un drapeau"); /*s'il pense avoir trouvé une bombe*/
            System.out.println("3 - Utiliser un kit");
            System.out.println("Veuillez entrer le chiffre correspondant à l'action voulue :");
            choix_joueur = saisie_joueur.nextInt();
            
            while (choix_joueur <= 0 || choix_joueur > 3) {
                /* si l'utilisateur se trompe et ne met pas un nombre entre 1 et 3*/
                System.out.println("veuillez entrer un chiffre compris entre 1 - 3 correspondant a l'action voulue");
                choix_joueur = saisie_joueur.nextInt();
            }
            
            if (choix_joueur == 1) {
                /*s'il choisi 1 il veut cliquer sur une case et la déminer*/
                System.out.println("Dans quelle colonne souhaitez vous jouer ?");
                int colonne = saisie_joueur.nextInt();
                System.out.println("Dans quelle ligne souhaitez vous jouer ?");
                int ligne = saisie_joueur.nextInt();
            }
            
            if (choix_joueur == 2){
                System.out.println("Dans quelle colonne souhaitez vous jouer ?");
                int colonne = saisie_joueur.nextInt();
                System.out.println("Dans quelle ligne souhaitez vous jouer ?");
                int ligne = saisie_joueur.nextInt();
                
                boolean presence = plateau.presence_drapeau(ligne, colonne); /*on regarde s'il y a déjà un drapeau*/
                if (presence == true){
                    plateau.supprimer_drapeau(ligne,colonne);
                } else {
                    plateau.placer_drapeau(ligne, colonne);
                }
            }
            
            if (choix_joueur == 3){
                System.out.println("Dans quelle colonne souhaitez vous jouer ?");
                int colonne = saisie_joueur.nextInt();
                System.out.println("Dans quelle ligne souhaitez vous jouer ?");
                int ligne = saisie_joueur.nextInt();
                
                
            }
        }
    }
}
