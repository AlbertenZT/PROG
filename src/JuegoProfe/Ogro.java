package JuegoProfe;

public class Ogro extends EnemigoBase {

    public Ogro() {
        super.vida = 50;
    }

    public Ogro(int vida) {
        super.vida = vida;
    }

    public void estado() {
        System.out.println("Soy ogro con vida " + vida);
    }
}
