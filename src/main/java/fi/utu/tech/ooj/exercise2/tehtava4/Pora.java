package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.HashMap;

public class Pora extends TyökaluBase implements Poraava {
    private int koko;
    HashMap<Integer, Integer> koordinaatti = new HashMap<>();
    /**
     * @.pre merkki != null && tyyppi != null
     * @post RESULT == (Työkalu – Pora on luotu)
     */
    public Pora() {
        merkki = "kasdjla";
        tyyppi = "kasjdkjasd";
        System.out.println("Luotu " + this);
    }
    /**
     * @.pre koko != null & koko > 0
     * @post RESULT == koko.equals(koko)
     */
    public void vaihdaTerä(int koko){
        this.koko = koko;
        System.out.println(this.toString());
    }
    /**
     * @.pre xkoordinaatti != null & ykoordinaatti i= null
     * @post RESULT == true
     */
    public void poraa(int xKoordinaatti, int yKoordinaatti){
        koordinaatti.put(xKoordinaatti, yKoordinaatti);
        System.out.println(this.toString());
    }
}