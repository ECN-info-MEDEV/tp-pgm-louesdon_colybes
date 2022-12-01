/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.projetpgm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aulou
 */
public class Image {
    public int[][] matrice;
    public Image(){
        matrice = new int[10][10];
    }
    
    
    public void ShowMatrice(){
        System.out.println(matrice);
    }
    
    
    public void ReadFile(String fileName) throws FileNotFoundException{
        FileInputStream file = new FileInputStream("C:/Users/aulou/Desktop/Projet/baboon.pgm");
        
            Scanner sc = new Scanner(file);
            String line;
            String dim;
            String[] words;
            int xmax ;
            int ymax;
            int x = 0;
            int y = 0;
            
            // Lecture des premières lignes :
            line = sc.nextLine();
            line = sc.nextLine();
            dim = sc.nextLine();
            System.out.println(dim);
            words = dim.split("  ");

            
            xmax = Integer.parseInt(words[0]);
            ymax = Integer.parseInt(words[1]);
            this.matrice = new int[xmax][ymax];
            x = 0;
            y = 0;
            while(sc.hasNextLine())
            {
                
                line = sc.nextLine();
                System.out.println(line);
                words = line.split("  ");
                for(String w : words){
                    w = w.replaceAll("\\s", "");
                    System.out.println(w);
                    this.matrice[x][y] = Integer.parseInt(w);
                    x += 1;
                    if(x >= xmax){
                        x = 0;
                        y += 1;
                    }
                }
            }
                
            sc.close(); 
            
    }
}
