public class Arqueiro extends Profissao {
    public Arqueiro(float danoFisicoBase, float danoMagicoBase) {
        super(danoFisicoBase, danoMagicoBase);
    }

    @Override
    public float ataqueFisico() {
        return this.danoFisicoBase * 1.5f * raca.bonusDanoFisico() * rank.bonusDanoFisico();
    }

    @Override
    public float ataqueMagico() {
        return this.danoMagicoBase * 2f * raca.bonusDanoMagico() * rank.bonusDanoMagico();
    }
}
