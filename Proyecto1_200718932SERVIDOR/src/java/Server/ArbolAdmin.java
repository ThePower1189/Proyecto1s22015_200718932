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
public class ArbolAdmin {
    
    
    private NodoAdmin raiz;
    
    public ArbolAdmin (){
        
        raiz = null;
    }
    

    
    public NodoAdmin insertar (NodoAdmin noa, String ema, String pas){
        
         if(noa!=null){
          if(dato<r.DatoNodo()){
              NodoABin iz=insertar(r.subArbolIz(),dato);
              r.ponerHijoIz(iz);
          }else if(dato>r.DatoNodo()){
              NodoABin der=insertar(r.subArbolDer(),dato);
              r.ponerHijoDer(der);
          }else{
              System.out.println("Dato repetido");
          }
      }else{
          r=new NodoABin(dato);
      }
      return r;
        
    }
    
    
}
