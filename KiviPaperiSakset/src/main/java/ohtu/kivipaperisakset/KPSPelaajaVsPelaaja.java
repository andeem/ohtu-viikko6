package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    public KPSPelaajaVsPelaaja(Scanner scanner) {
        super(scanner);
    }


    @Override
    protected boolean kysy() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = scanner.nextLine();
        return onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto);
    }


}
