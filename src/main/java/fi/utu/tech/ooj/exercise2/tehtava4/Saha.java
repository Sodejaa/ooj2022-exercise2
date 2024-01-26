package fi.utu.tech.ooj.exercise2.tehtava4;

public class Saha extends TyökaluBase {
    private int xKoordinaatti;
    public Saha() {
        merkki = "kasdxcvxcjla";
        tyyppi = "kasjdkzvczjasd";
        System.out.println("Luotu " + this);
    }
    /**
     * @.pre xKoordinaatti != null & koko > 0
     * @post RESULT == xKoordinaatti.equals(xKoordinaatti)
     */
    public void sahaa(int xKoordinaatti){
        this.xKoordinaatti = xKoordinaatti;
        System.out.println(this.toString());
    }
}