/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.*;

/**
 *
 * @author Paladi Alexandru
 * main class JavaIo
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        
        System.out.print("Insert input:");
        try{
        file.createNewFile();
        String s = takeInput();
        putInputToFile(file,s);
        } catch(IOException e){
            System.out.printf("Problem"+ e);
        }
        
    }
    public static String takeInput()throws IOException{
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        return s;
    }
    
    public static void putInputToFile(File file, String input)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.append(input);
        writer.flush();
        
    }
}
