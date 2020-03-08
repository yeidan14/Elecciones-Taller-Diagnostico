/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Daniel
 */
public class Candidato {
    
    public String nombre;
    public int edad;
    public String partido;
    public int cvotos;    
    public double pvotos;
    public double campana;
    public int votosmujer;
    public int votoshombre;
    public int votosjoven;
    public int votosadulto;
    public int votosabuelo;
    

    public Candidato(String nombre, int edad, String partido, int cvotos, double pvotos, double campana, int votosmujer, int votoshombre, int votosjoven, int votosadulto, int votosabuelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.partido = partido;
        this.cvotos = cvotos;
        this.pvotos = pvotos;
        this.campana = campana;
        this.votosmujer = votosmujer;
        this.votoshombre = votoshombre;
        this.votosjoven = votosjoven;
        this.votosadulto = votosadulto;
        this.votosabuelo = votosabuelo;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getCvotos() {
        return cvotos;
    }

    public void setCvotos(int cvotos) {
        this.cvotos = cvotos;
    }

    public double getPvotos() {
        return pvotos;
    }

    public void setPvotos(double pvotos) {
        this.pvotos = pvotos;
    }

    public double getCampana() {
        return campana;
    }

    public void setCampana(double campana) {
        this.campana = campana;
    }

    public int getVotosmujer() {
        return votosmujer;
    }

    public void setVotosmujer(int votosmujer) {
        this.votosmujer = votosmujer;
    }

    public int getVotoshombre() {
        return votoshombre;
    }

    public void setVotoshombre(int votoshombre) {
        this.votoshombre = votoshombre;
    }

    public int getVotosjoven() {
        return votosjoven;
    }

    public void setVotosjoven(int votosjoven) {
        this.votosjoven = votosjoven;
    }

    public int getVotosadulto() {
        return votosadulto;
    }

    public void setVotosadulto(int votosadulto) {
        this.votosadulto = votosadulto;
    }

    public int getVotosabuelo() {
        return votosabuelo;
    }

    public void setVotosabuelo(int votosabuelo) {
        this.votosabuelo = votosabuelo;
    }

   
    
}
