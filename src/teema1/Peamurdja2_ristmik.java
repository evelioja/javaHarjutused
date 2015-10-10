package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        roheliseks(foor1);
        roheliseks(foor2);
        roheliseks(foor3);
        roheliseks(foor4);
    }

    public void roheliseks(Foor foor) {
        foor.vahetaPunast();
        foor.paus(5.0);
        foor.vahetaKollast();
        foor.paus(2.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
    }
}
