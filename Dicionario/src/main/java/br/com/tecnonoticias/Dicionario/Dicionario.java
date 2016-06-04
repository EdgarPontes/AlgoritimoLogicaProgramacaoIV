package br.com.tecnonoticias.Dicionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dicionario {
    
    public static void main(String[] args) {
        
        File fl = new File("/media/edgar/45D33C19493C7BD8/workspace/AlgoritimoLogicaProgramacaoIV/Dicionario/src/input");
        String line = "";
        String key = "";
        ArrayList<String> arrayString = new ArrayList<>();
        //HashMap<String,  ArrayList<String>> dic = new HashMap<>();
        Hashtable<String,  ArrayList<String>> dic = new Hashtable<String,  ArrayList<String>>();
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(fl));
            
            while (br.ready()) {
                
                line = br.readLine();
                key = line.substring(0, 1);
                if(!dic.containsKey(key)) {
                    
                    arrayString  = new ArrayList<>();
                    arrayString.add(line);
                    dic.put(key, arrayString);
                    
                    
                }  else {
                    
                    arrayString  = new ArrayList<>();
                    arrayString = dic.get(key);
                    arrayString.add(line);
                    dic.put(key, arrayString);
                                       
                }
                               
            }
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Arquivo nao foi localizado");
            Logger.getLogger(Dicionario.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            
            System.out.println("Erro na leitura da linha");
            Logger.getLogger(Dicionario.class.getName()).log(Level.SEVERE, null, ex);
            
            
        } 
        
        
        if (dic.isEmpty()) {
            
            System.out.println("Dicionario vazio");
            System.exit(0);
            
        }
        
        printValue(dic, args);
        System.exit(0);
        
    }
    
    public static void printValue( Hashtable<String,  ArrayList<String>> dic, String[] args) {
        
        Set<String> setKey;
        int numKey = 0;
        ArrayList<String> arrayStringOutPut = new ArrayList<>();
        
        setKey = dic.keySet();
        numKey = setKey.size();
        String strArray[] = setKey.toArray(args);
        
        for (int i = 0; i < numKey; i++) {
            
           System.out.println("chave " + strArray[i]);
           
           arrayStringOutPut = dic.get(strArray[i]);
           
            for (int j = 0; j < arrayStringOutPut.size(); j++) {
                
                System.out.println(arrayStringOutPut.get(j));
                
            }
            
        }      
           
    }
    
}