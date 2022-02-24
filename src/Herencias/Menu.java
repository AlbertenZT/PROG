package Herencias;
/**
 *
 * @author Alberto
 */
public class Menu {

    private final double iva = 0.21;
    private double descuento;
    private String principal;
    private int bebida;
    private int postre;

    public Menu() {

        principal = "";
        bebida = 0;
        postre = 0;
    }

    public Menu(String principal, int bebida, int postre) {

        this.principal = principal;
        this.bebida = bebida;
        this.postre = postre;

    }

    public double getIva() {
        return iva;
    }
    
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public int getPostre() {
        return postre;
    }

    public void setPostre(int postre) {
        this.postre = postre;
    }

    public double importe() {
        double importe = 0;

        switch (principal) {
            case "Entrecot":
                importe += 15;
                break;
            case "Pez Espada":
                importe += 13;
                break;
            case "Carrillada":
                importe += 10;
                break;
            case "Dorada":
                importe += 20;
                break;
            default:
                importe += 13;
                break;
        }
        switch (bebida) {
            case 1:
                importe += 1;
                break;
            case 2:
                importe += 1.5;
                break;

            default:
                importe += 2;
                break;
        }
        switch (postre) {
            case 1:
                importe += 2;
                break;
            case 2:
                importe += 3;
                break;

            default:
                importe += 4;
                break;
        }

        return importe;
    }

    public void mostrar() {
        System.out.println("PLATO: "+principal);
        System.out.print("Postre: ");
        switch(postre){
            case 1:
                System.out.println("Fruta");
            break;
            case 2:
                System.out.println("Helado");
            break;    
            default:
                System.out.println("Otros");
        }
        
        System.out.print("Bebida: ");
        switch(bebida){
            case 1:
                System.out.println("Refresco");
            break;
            case 2:
                System.out.println("Vino");
            break;    
            default:
                System.out.println("Otros");
        }
        
        
        System.out.println("-----------------------------------");
        System.out.println("IMPORTE: "+importe());

    }

}

