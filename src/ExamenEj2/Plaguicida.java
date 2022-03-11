
package ExamenEj2;
import java.util.*;
public class Plaguicida {
    
    int [][] campo = new int[4][4];
    
    Plaguicida(){
        for(int i=0;i<4;i++){
            for(int j = 0;j<4;j++){
                int num = (int)((Math.random()*9)+1);
                campo[i][j]=num;
            }
        }
    }
    
    public void Glifosato(){
        int potencia = (int)((Math.random()*3)+1);
        int x = (int)((Math.random()*4)+1);
        int y = (int)((Math.random()*4)+1);
        
        if(potencia ==3){
            campo[x][y] -= 3;
            
            
            campo[x-1][y-1] -= 2;
            campo[x-1][y] -= 2;
            campo[x-1][y+1] -= 2;
            
            campo[x][y-1] -= 2;
            campo[x][y+1] -= 2;
            
            campo[x+1][y-1] -= 2;
            campo[x+1][y] -= 2;
            campo[x+1][y+1] -= 2;
            
            
            campo[x+2][y-2] -= 1;
            campo[x+2][y-1] -= 1;
            campo[x+2][y] -= 1;
            campo[x+2][y+1] -= 1;
            campo[x+2][y+2] -= 1;
            
            campo[x+1][y-2] -= 1;
            campo[x+1][y+2] -= 1;
            
            campo[x][y-2] -= 1;
            campo[x][y+2] -= 1;
            
            campo[x-1][y+2] -= 1;
            campo[x-1][y-2] -= 1;
            
            campo[x-2][y-2] -= 1;
            campo[x-2][y-1] -= 1;
            campo[x-2][y] -= 1;
            campo[x-2][y+1] -= 1;
            campo[x-2][y+2] -= 1;
        }
        if(potencia ==2){
            campo[x][y] -= 2;
            
            
            campo[x-1][y-1] -= 1;
            campo[x-1][y] -= 1;
            campo[x-1][y+1] -= 1;
            
            campo[x][y-1] -= 1;
            campo[x][y+1] -= 1;
            
            campo[x+1][y-1] -= 1;
            campo[x+1][y] -= 1;
            campo[x+1][y+1] -= 1;
        }
        if(potencia ==1){
            campo[x][y] -= 1;
            
        }
        
        
        
        //Si alguno es menor a 0 lo pone a valor 0 ya que no se puede menor
        for(int k = 0;k<4;k++){
            for(int h = 0;h<4;h++){
                if(this.campo[k][h]<0){
                    campo[k][h] =0;
                }
            }
            
            
        }
        
        
        
        
        
        
        
    }
    public void mostrarCampo(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print(this.campo[i][j]);//Muestra por pantalla
            }
            System.out.println();
            
        }
    }
    public boolean eliminado(){
        int cont=0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(this.campo[i][j]==0){
                    cont++;
                }
            }
        }
        
        
        
        if(cont ==16)
            return true;
        else 
            return false;
    }
    
    
    public static void main(String[] args){
        Plaguicida campo = new Plaguicida();
        
        
        do{
        campo.mostrarCampo();
        System.out.println("-------------------");
        campo.Glifosato();
        System.out.println("-------------------");
        }while(!campo.eliminado());
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
