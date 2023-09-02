package com.unifacisa.JsoupTitle;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ExtrairTitulo {
    public static void main(String[] args) {
        String url = "https://www.unifacisa.edu.br";
        
        try {
         
            Document doc = Jsoup.connect(url).get();
            
      
            String titulo = doc.title();
            
         
            System.out.println("Título da página: " + titulo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
