package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPS {

    private final TekoalyInterface tekoaly;

    public KPSTekoaly(Scanner scanner, TekoalyInterface tkoaly) {
        super(scanner);
        this.tekoaly = tkoaly;
    }

    @Override
    protected boolean kysy() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto);
    }
}
