package fi.utu.tech.ooj.exercise2;

import fi.utu.tech.ooj.exercise2.tehtava3.Kurssi;
import fi.utu.tech.ooj.exercise2.tehtava4.Pora;
import fi.utu.tech.ooj.exercise2.tehtava4.Työkalu;
import fi.utu.tech.ooj.exercise2.tehtava4.TyökaluVarasto;
import fi.utu.tech.ooj.exercise2.tehtava5.Piirturi;
import javafx.application.Application;

import java.nio.file.OpenOption;
import java.util.ArrayList;

public class Main {
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Harjoitustyön pohja toimii");
        Pora op = new Pora();
        ArrayList<Työkalu> uusi = new ArrayList<>();
        uusi.add(op);
        TyökaluVarasto varasto = new TyökaluVarasto(uusi);
        // avataan piirturi
        // käynnistä: mvn javafx:run
        Application.launch(Piirturi.class);
    }
}

