package fi.utu.tech.ooj.exercise2.tehtava4;

public class Sähkösaha extends TyökaluBase implements Sahaava, Sähköinen{
    private boolean virta = false;
    private long tehoAsetus;
    private int xKoordinaatti;

    public Sähkösaha() {
        merkki = "kawdfdssdjla";
        tyyppi = "kasjsdfggdkjasd";
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