public class Guerreiro extends Profissao{
    public Guerreiro(float danoFisicoBase, float danoMagicoBase) {
        super(danoFisicoBase, danoMagicoBase);
    }

    @Override
    public float ataqueFisico() {
        return this.danoFisicoBase * 2f * raca.bonusDanoFisico() * rank.bonusDanoFisico();
    }

    @Override
    public float ataqueMagico() {
        return this.danoMagicoBase * 1.5f * raca.bonusDanoMagico() * rank.bonusDanoMagico();
    }
}
