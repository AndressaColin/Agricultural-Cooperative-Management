public class Distribuidor extends MembroCooperativa {
    private String areaAtendida; //servedArea

    public Distribuidor(String nome, int idade, long idMembro, String areaAtendida) {
        super(nome, idade, idMembro);
        this.areaAtendida = areaAtendida;
    }

    public String getAreaAtendida() {
        return areaAtendida;
    }

    public void setAreaAtendida(String areaAtendida) {
        this.areaAtendida = areaAtendida;
    }

    public String realizandoEntrega { //performingDelivery
        return "Realizando entrega"; //Performing delivery
    }
}
