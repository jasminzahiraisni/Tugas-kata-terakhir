/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kataterakhir {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word1 = "";
        String word2 = "";
        String word3 = "";
        String hasil = "";
        
        try {
            System.out.print("Enter word1:");
            word1 = reader.readLine();
            
            System.out.print("Enter word2:");
            word2 = reader.readLine();
            
            System.out.print("Enter word3:");
            word3 = reader.readLine();
          
            hasil = word1 + " " + word2 + " " + word3;
            System.out.println(hasil);
            
        } catch (IOException e) {
            System.out.println("Tidak Bisa!");
        }
    }
} 

