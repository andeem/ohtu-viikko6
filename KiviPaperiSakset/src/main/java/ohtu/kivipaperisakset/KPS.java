package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {

    protected Scanner scanner;
    protected Tuomari tuomari;
    protected String ekanSiirto;
    protected String tokanSiirto;

    public KPS(Scanner scanner) {
        this.tuomari = new Tuomari();
        this.scanner = scanner;
    }

    public void pelaa() {
        while (kysy()) {
            kirjaaSiirto();
        }
    }

    protected boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    abstract protected boolean kysy();

    protected void kirjaaSiirto() {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }

    public static KPS luoKaksinpeli(Scanner scanneri) {
        return new KPSPelaajaVsPelaaja(scanneri);
    }

    public static KPS luoYksinpeli(Scanner scanneri) {
        return new KPSTekoaly(scanneri, new Tekoaly());
    }

    public static KPS luoVaikeaYksinpeli(Scanner scanneri) {
        return new KPSTekoaly(scanneri, new TekoalyParannettu(10));
    }
}
