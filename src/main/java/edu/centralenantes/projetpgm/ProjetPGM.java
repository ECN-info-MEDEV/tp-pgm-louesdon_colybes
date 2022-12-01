/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.centralenantes.projetpgm;

import java.io.FileNotFoundException;

/**
 *
 * @author aulou
 */
public class ProjetPGM {

    public static void main(String[] args) throws FileNotFoundException {
        Image im = new Image();
        im.ReadFile("baboon.pgm");
    }
}
