package fi.utu.tech.ooj.exercise2.tehtava3;
import java.util.ArrayList;

public class Kurssi {
    private String nimi;
    private int opintopisteet;
    private String luennoitsija;
    private int arvosana;
    private ArrayList<Opiskelija> osallistujalista;

// --- Muodostimet ---

    /**
     * @.pre nimi != null & opintopisteet != null & luennoitsija != null & osallistujalista != null &
     * @.post getNimi().equals(nimi) & getOpintopisteet().equals(opintopisteet) &
     * getLuennoitsija().equals(luennoitsija) & getNimi().equals(nimi) &
     * getOsallistujalista().equals(osallistujalista)
     */
    public Kurssi(String nimi, int opintopisteet, String luennoitsija, ArrayList<Opiskelija> osallistujalista) {
        this.nimi = nimi;
        this.opintopisteet = opintopisteet;
        this.luennoitsija = luennoitsija;
        this.osallistujalista = osallistujalista;
    }
// --- Havainnointioperaattorit ---
        /** @.pre true
         * @.post RESULT == (nimi) */
        public String getNimi () {
            return nimi;
        }
// --- Muutosoperaattorit ---
        /** @.pre nimi !=null
         * @.post getNimi().equals(nimi) */
        public void setNimi (String nimi){
            this.nimi = nimi;
            /**
             * @.classInvariantPrivate
             *     (nimi on tallennettu jäsenmuuttujaan nimi) == Todetaan, että nimi on tallennettu muuttujaan
             * @.abstractFunction nimi == (kurssin nimi) == Kuvaa yhteyden, että muuttuja nimi sisältää abstraktin konseptin määrittelystä.
             */
        }


// --- Havainnointioperaattorit ---
        /** @.pre true
         * @.post RESULT == (opintopisteet) */
        public int getOpintopisteet () {
            return opintopisteet;
        }
// --- Muutosoperaattorit ---
        /** @.pre Opintopisteet != null && 0 <= opintopisteet <= 100
         * @.post getNimi().equals(nimi) */
        public void setOpintopisteet ( int opintopisteet){
        /*
        Rutiini testaa onko opintopistemäärä väliltä 0-100 ja hyväksyy sen,
        jos ei oleniin ilmoittaa viheellisestä syötteestä
         */
            try {
                if (opintopisteet >= 0 && opintopisteet <= 100) {
                    this.opintopisteet = opintopisteet;
                }
            } catch (Exception e) {
                System.out.println("Syöte ei ollut 0 ja 100 väliltä");
            }
            /**
             * @.classInvariant getOpintopisteet() 0 <= opintopisteet <= 100
             */
        }

        public String getLuennoitsija () {
            return luennoitsija;
        }

        public void setLuennoitsija (String luennoitsija){
            this.luennoitsija = luennoitsija;
        }

        public int getArvosana () {
            return arvosana;
        }

        public void setArvosana ( int arvosana){
            this.arvosana = arvosana;
        }

        public ArrayList<Opiskelija> getOsallistujalista () {
            return osallistujalista;
        }

        public void setOsallistujalista (ArrayList < Opiskelija > osallistujalista) {
            this.osallistujalista = osallistujalista;
        }


        public void LisaaOpiskelija (Opiskelija opiskelija) throws Exception {
        /*
        Rutiini tarkastaa onko opiskelija jo listalla.
        Jos opiskelija on listalla rutiini tekee poikkeusen ja ilmoittaa, että opiskelija on jo listalla, eikä listaan
         */
        }
        public void ListaaOpiskelijat (ArrayList < Opiskelija > osallistujalista) {
        /*
        Rutiini listaa opiskelijat
         */
        }
        public void Arvostelu (Opiskelija opiskelija){
        /*
        Rutiini lisää opiskelijalle arvosanan
         */
        }
        public void Raportti (Kurssi kurssi){
        /*
        Rutiini palauttaa kurssin nimen, osallistujamäärän ja arvosanojen keskiarvon
         */

        }
    }
