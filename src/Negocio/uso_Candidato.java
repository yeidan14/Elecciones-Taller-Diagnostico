/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Negocio.Candidato;

/**
 *
 * @author Daniel
 */
public class uso_Candidato {

    
    public static int totalv;
    public static int totalvmujer;
    public static int totalvhombre;
    public static int totalvjoven;
    public static int totalvadulto;
    public static int totalvabuelo;

    public uso_Candidato() {
    }
    

    public static void main(String[] args) {
        Candidato c1 = new Candidato("Adan", 27, "ufps", 0, 0, 0,0,0,0,0,0);
        Candidato c2 = new Candidato("Eva", 27, "ufps", 0, 0, 0,0,0,0,0,0);
        Candidato c3 = new Candidato("Samael", 27, "ufps",0, 0, 0,0,0,0,0,0);
        uso_Candidato c = new uso_Candidato();
     

        c.CalcularP(c1);
        c.CalcularP(c2);
        c.CalcularP(c3);

        System.out.println("costo" + c1.getCampana() + ", Votos:" + c1.getCvotos() + "  Porcentaje:" + c1.getPvotos() + "%" + "  totalv" + totalv);

        System.err.println("Porcentaje:" + c2.getPvotos());
        System.err.println("Porcentaje:" + c3.getPvotos());

    }

    public void CalcularP(Candidato c) {
     double t=totalv;
     double votos=c.getCvotos();
        c.setPvotos(votos/t*100);
      
    }
    
    public double CalularpMujer(Candidato c){
        double t=totalvmujer;
        double v=c.getVotosmujer();
        double resultado=(v/t*100);
        return resultado;
        
        
    }
    
    public double CalularpHombre(Candidato c){
        double t=totalvhombre;
        double v=c.getVotoshombre();
        double resultado=(v/t*100);
        return resultado;     
    }
    
     public double CalularpJoven(Candidato c){
        double t=totalvjoven;
        double v=c.getVotosjoven();
        double resultado=(v/t*100);
        return resultado;     
    }
     
      public double CalularpAdulto(Candidato c){
        double t=totalvadulto;
        double v=c.getVotosadulto();
        double resultado=(v/t*100);
        return resultado;     
    }
      
       public double CalularpAbuelo(Candidato c){
        double t=totalvabuelo;
        double v=c.getVotosabuelo();
        double resultado=(v/t*100);
        return resultado;     
    }

    public void votar(int vf, Candidato c,int edad,int genero) {
        
        c.setCvotos(c.getCvotos() + 1);
        totalv++;
        if(edad==1){
            c.setVotosjoven(c.getVotosjoven()+1);
            totalvjoven++;
            
        }if(edad==2){
            c.setVotosadulto(c.getVotosadulto()+1);
            totalvadulto++;
        }if(edad==3){
            c.setVotosabuelo(c.getVotosabuelo()+1);
            totalvabuelo++;
        }        
        if(genero==1){
            c.setVotosmujer(c.getVotosmujer()+1);
            totalvmujer++;
        }if(genero==2){
            c.setVotoshombre(c.getVotoshombre()+1);
            totalvhombre++;
        }
        
        if (vf == 1) {
            c.setCampana(c.getCampana() + 1000);

        }if (vf == 2) {
            c.setCampana(c.getCampana() + 500);

        }if (vf == 3) {
            c.setCampana(c.getCampana() + 100);

        }

    }

    public static int getTotalv() {
        return totalv;
    }

    public static void setTotalv(int totalv) {
        uso_Candidato.totalv = totalv;
    }

    public static int getTotalvmujer() {
        return totalvmujer;
    }

    public static void setTotalvmujer(int totalvmujer) {
        uso_Candidato.totalvmujer = totalvmujer;
    }

    public static int getTotalvhombre() {
        return totalvhombre;
    }

    public static void setTotalvhombre(int totalvhombre) {
        uso_Candidato.totalvhombre = totalvhombre;
    }

    public static int getTotalvjoven() {
        return totalvjoven;
    }

    public static void setTotalvjoven(int totalvjoven) {
        uso_Candidato.totalvjoven = totalvjoven;
    }

    public static int getTotalvadulto() {
        return totalvadulto;
    }

    public static void setTotalvadulto(int totalvadulto) {
        uso_Candidato.totalvadulto = totalvadulto;
    }

    public static int getTotalvabuelo() {
        return totalvabuelo;
    }

    public static void setTotalvabuelo(int totalvabuelo) {
        uso_Candidato.totalvabuelo = totalvabuelo;
    }

    
    
}
