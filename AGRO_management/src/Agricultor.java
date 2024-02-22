public class Agricultor extends membroCooperativa {
    private double areaCultivada; //cultivatedArea

    public Agricultor(String nome, int idade, long idMembro, double areaCultivada) {
        super(nome, idade, idMembro);
        this.areaCultivada = areaCultivada;
    }

    public double getAreaCultivada() {
        return areaCultivada;
    }

    public void setAreaCultivada(double areaCultivada) {
        this.areaCultivada = areaCultivada;
    }

    public String registrarColheita() { //registerHarvest
        return "Registrando colheita"; //Registering harvest
    }   
}

