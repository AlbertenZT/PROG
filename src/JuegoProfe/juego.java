package JuegoProfe;

import java.util.*;

public class juego {

    public static void main(String[] args) {
        ArrayList<EnemigoBase> ListaEnemigosBase = new ArrayList();

        int numEnemigos = 0;
        while (numEnemigos != 10) {
            int numRandom = (int) ((Math.random() * 99) + 1);
            if (numRandom <= 34) {
                EnemigoBase Enemigo = new EnemigoBase();
                ListaEnemigosBase.add(Enemigo);
            }
            if (numRandom <= 67 && numRandom <= 35) {
                EnemigoBase EnemigoEsq = new Esqueleto();
                ListaEnemigosBase.add(EnemigoEsq);
            }
            if (numRandom >= 68) {
                EnemigoBase EnemigoOgro = new Ogro();
                ListaEnemigosBase.add(EnemigoOgro);
            }
            numEnemigos++;
        }
        int sumatorio = 0;
        for (EnemigoBase e : ListaEnemigosBase) {
            e.estado();
            sumatorio += e.getVida();
        }
        int media = sumatorio / ListaEnemigosBase.size();
        System.out.println("La media es: " + media);

    }

}
