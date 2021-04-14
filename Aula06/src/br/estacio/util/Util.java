package br.estacio.util;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class Util {
    
    public static Date converterToDate(String stringData){
        DateFormat df;
        Date data = new Date();
        
        try{            
            df = new SimpleDateFormat("dd/MM/yyyy");
            data = df.parse(stringData);
            
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
        return data;
    }  
    
    public static String converterToString(Date data){
        DateFormat df;
        String dataString = null;
        
        try{        
            df = new SimpleDateFormat("dd/MM/yyyy");
            dataString = df.format(data);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
        return dataString;
    }
    
    
    
}
