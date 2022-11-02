public class Mago extends Profissao{
    public Mago(float danoFisicoBase, float danoMagicoBase) {
        super(danoFisicoBase, danoMagicoBase);
    }

    @Override
    public float ataqueFisico() {
        return this.danoFisicoBase * 1.25f * raca.bonusDanoFisico() * rank.bonusDanoFisico();
    }

    @Override
    public float ataqueMagico() {
        return this.danoMagicoBase * 3f * raca.bonusDanoMagico() * rank.bonusDanoMagico();
    }
}
