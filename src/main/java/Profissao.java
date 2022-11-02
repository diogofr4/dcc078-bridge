public abstract class Profissao {
    protected Raca raca;
    protected Rank rank;
    protected float danoFisicoBase;
    protected float danoMagicoBase;

    public Profissao(float danoFisicoBase, float danoMagicoBase) {
        this.danoFisicoBase = danoFisicoBase;
        this.danoMagicoBase = danoMagicoBase;
    }

    public abstract float ataqueFisico();
    public abstract float ataqueMagico();

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public float getDanoFisicoBase() {
        return danoFisicoBase;
    }

    public void setDanoFisicoBase(float danoFisicoBase) {
        this.danoFisicoBase = danoFisicoBase;
    }

    public float getDanoMagicoBase() {
        return danoMagicoBase;
    }

    public void setDanoMagicoBase(float danoMagicoBase) {
        this.danoMagicoBase = danoMagicoBase;
    }
}
