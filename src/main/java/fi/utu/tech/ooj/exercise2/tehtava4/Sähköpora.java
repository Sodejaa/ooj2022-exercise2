package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.HashMap;

public class Sähköpora extends TyökaluBase implements Poraava, Sähköinen{
    private boolean virta = false;
    private int koko;
    private long tehoAsetus;
    HashMap<Integer, Integer> koordinaatti = new HashMap<>();
    /**
     * @.pre merkki != null && tyyppi != null
     * @post RESULT == (Työkalu – Pora on luotu)
     */
    public Sähköpora() {
        merkki = "kasdjlaxcvxc";
        tyyppi = "kasjxcvxdkjasd";
        System.out.println("Luotu " + this);
    }

    /**
     * @.pre koko != null & koko > 0
     * @post RESULT == koko.eguals(koko)
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
    /**
     * @.pre virta i= null
     * @post RESULT == virta.equals(true)
     */
    public void kytkeVirta(){
        virta = true;
        System.out.println(this.toString());
    }
    /**
     * @.pre virta i= null
     * @post EXIST == virta.equals(true) || EXIST == virta.equals(false)
     */
    public boolean onkoKytketty() {
        if (virta == true) {
            return true;
        }
        System.out.println(this.toString());
        return false;
    }
    /**
     * @.pre virta.equals(true)
     * @post RESULT == virta.equals(false)
     */
    public void sammuta(){
        virta = false;
        System.out.println(this.toString());
    }
    /**
     * @.pre tehoAsetus != null & tehoAsetus > 0
     * @post RESULT == tehoAsetus.eguals(tehoAsetus)
     */
    public void säädäTeho(long tehoAsetus){
        this.tehoAsetus = tehoAsetus;
        System.out.println(this.toString());
    }
}