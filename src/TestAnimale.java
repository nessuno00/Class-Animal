
 class Animale {
    public void faiIlVerso() {
        System.out.println("Verso generico che fa BRRRRR");

    }
}

public class TestAnimale {

    public static void main(String[] args) {
        Animale animaleGenerico = new Animale();
        Gatto mioGatto = new Gatto();
        Cavallo cavallo = new Cavallo();


        System.out.println("Verso dell'animale  generico :");
        animaleGenerico.faiIlVerso();

        System.out.println("\nVerso del gatto :");
        mioGatto.faiIlVerso();

        System.out.println("\nVerso del cavallo :");
        cavallo.faiIlVerso();

    }
}