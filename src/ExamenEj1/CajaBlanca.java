/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenEj1;

/**
 *
 * @author ismae
 */

public class CajaBlanca {

  
  
  String Medidor (long cantidad){
     String resultado="pequeño";
     int contador=0;
     while(cantidad >0){
         contador++;
         cantidad=cantidad/10;
     }
     if (contador>5)
         resultado="gigante";
     else
          if (contador>2)
              resultado="grande";
     return resultado;
  }
  
  
String momentoDia(int hora){
String resultado="tarde";

if (hora<6 && hora >19){
     resultado="noche";
} else if (hora <12)
         resultado="mañana";


return resultado;
}

    
}
