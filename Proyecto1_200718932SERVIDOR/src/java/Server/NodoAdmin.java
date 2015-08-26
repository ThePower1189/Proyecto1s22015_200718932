/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Jonathan
 */
public class NodoAdmin {
    
    
    private NodoAdmin izquierdo;
    private NodoAdmin derecho;
    String email;
    String pass;
    
    public NodoAdmin(String ema, String pas){
        
        email = ema;
        pass = pas;
        
        izquierdo = derecho = null;

    }

    public NodoAdmin getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoAdmin izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoAdmin getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoAdmin derecho) {
        this.derecho = derecho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
