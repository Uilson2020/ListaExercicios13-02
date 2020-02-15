package Exercicio01;

public class RD extends Exercicio01 {
    protected String RAIA;
    protected String DROGASIL;
    protected String ONOFRE;

    public void venderEmLoja (){
        System.out.println("A Droga Raia e a Drogasil são as maiores no setor farmacêutico do Brasil e da America latina!");
    }

    public void venderOnline (){
        System.out.println("A Onofre é campeã em vendas online!");
    }

    public RD(String RAIA, String DROGASIL, String ONOFRE) {
        this.RAIA = RAIA;
        this.DROGASIL = DROGASIL;
        this.ONOFRE = ONOFRE;
    }

    public String getRAIA() {
        return RAIA;
    }

    public void setRAIA(String RAIA) {
        this.RAIA = RAIA;
    }

    public String getDROGASIL() {
        return DROGASIL;
    }

    public void setDROGASIL(String DROGASIL) {
        this.DROGASIL = DROGASIL;
    }

    public String getONOFRE() {
        return ONOFRE;
    }

    public void setONOFRE(String ONOFRE) {
        this.ONOFRE = ONOFRE;
    }
}
