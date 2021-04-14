/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.base64;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Base64;

/**
 *
 * @author DIEGO
 */
public class Codificador_Decodficador {
    public static void main(String[] args)throws Exception {
        
        // variables para codificar
       
        String fileName="C:\\Users\\DIEGO\\Documents\\3 CICLO\\HERRAMIENTAS INFORMATICAS\\TIPOS DE ARQUITECTURAS.pdf";
        String savePath= "C:\\Users\\DIEGO\\Documents\\3 CICLO\\HERRAMIENTAS INFORMATICAS\\TIPOS DE ARQUITECTURAS.docx";
       // codificarPDF(fileName,savePath);
        //System.out.println("codificacion exitosa ");

        //variables para decoficar
        String txtPath="C:\\Users\\DIEGO\\Documents\\3 CICLO\\HERRAMIENTAS INFORMATICAS\\TIPOS DE ARQUITECTURAS.txt";
        String savePath2= "C:\\Users\\DIEGO\\Documents\\3 CICLO\\HERRAMIENTAS INFORMATICAS\\NuevoArchivo.pdf";
        
        decodificarPDF(txtPath, savePath2);
        System.out.println("Decoficicacion exitosa");
    }
//

    public static String codificarPDF(String fileName, String savePath) throws Exception{
         FileInputStream pdf = new FileInputStream (fileName);
        byte[] data= pdf.readAllBytes();
         String pdfString = Base64.getEncoder().encodeToString(data);
    
         FileWriter filewriter = new FileWriter(savePath);
        filewriter.write(pdfString);
        
        filewriter.close();
        pdf.close();
    
        return pdfString;
    


}
    public static void decodificarPDF(String txtPath, String savePath) throws Exception{

        FileInputStream pdf = new FileInputStream (txtPath);
    
        byte[] data= Base64.getDecoder().decode(new String(pdf.readAllBytes()));

        FileOutputStream fileOutput = new FileOutputStream(savePath);
        fileOutput.write(data);
        fileOutput.close();
        pdf.close();

    


    }
}
