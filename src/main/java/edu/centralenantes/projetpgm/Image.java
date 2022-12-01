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
    public int xmax ;
    public int ymax;
    public Image(){
        matrice = new int[10][10];
        xmax = 10;
        ymax = 10;
    }
    
    

    public void ShowMatrice(){
        for (int i =0; i< xmax; i++){
            for (int j = 0; j< ymax; j++){
                System.out.println(matrice[i][j]);
            }
        }
    }
    
    public void sizeUp(int fois){
        int[][] img = new int[fois*xmax][fois*ymax];
        for (int i=0 ; i<xmax ; i++){
            for (int j=0 ; j<ymax ; j++){
                for (int p=0 ; p<fois ; p++){
                    for (int q=0 ; q<fois ; q++){
                        img[i*fois+p][j*fois+q] = this.matrice[i][j];
                    }
                }
            }
        }
    }
    
    
    public void ReadFile(String fileName) throws FileNotFoundException{
        
        FileInputStream file = new FileInputStream(fileName); 

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
        this.xmax = xmax;
        ymax = Integer.parseInt(words[1]);
        this.ymax = ymax;
        this.matrice = new int[xmax][ymax];
        x = 0;
        y = 0;
        while(sc.hasNextLine())
        {


            line = sc.nextLine();
            words = line.split("  ");
            for(String w : words){
                w = w.replaceAll("\\s", "");
                if(y < ymax ){
                    this.matrice[x][y] = Integer.parseInt(w);
                }
                
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
