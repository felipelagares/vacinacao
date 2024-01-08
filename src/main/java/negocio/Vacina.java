package negocio;

public class Vacina {
    private int doses;

    /* periodicidade só tem sentido se doses > 1
       1 -> dias
       2 -> semanas
       3 -> meses
       4 -> anos
     */
    private int periodicidade;

    /* intervalo entre as doses depende da periodicidade ex: periodicidade 2 e intervalo 3
       representa de 3 em 3 semanas
    */
    private int intervalo;

    public int getDoses() {
        return doses;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public int getPeriodicidade() {
        return periodicidade;
    }

    public void setDoses(int doses) {
        this.doses = doses;
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }
}
