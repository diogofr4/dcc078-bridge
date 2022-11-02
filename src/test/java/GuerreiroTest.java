import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuerreiroTest {
    @Test
    void deveRetornarDanoFisicoComAnaoAprendiz() {
        Raca raca = new Anao();
        Rank rank = new Aprendiz();
        Profissao profissao = new Guerreiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(419.99f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoFisicoComElfoMestre() {
        Raca raca = new Elfo();
        Rank rank = new Mestre();
        Profissao profissao = new Guerreiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(750.0f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoFisicoComHumanoAnciao() {
        Raca raca = new Humano();
        Rank rank = new Anciao();
        Profissao profissao = new Guerreiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(1750.0f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComAnaoAprendiz() {
        Raca raca = new Anao();
        Rank rank = new Aprendiz();
        Profissao profissao = new Guerreiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(118.12f, profissao.ataqueMagico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComElfoMestre() {
        Raca raca = new Elfo();
        Rank rank = new Mestre();
        Profissao profissao = new Guerreiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(562.5f, profissao.ataqueMagico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComHumanoAnciao() {
        Raca raca = new Humano();
        Rank rank = new Anciao();
        Profissao profissao = new Guerreiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(937.5f, profissao.ataqueMagico(), 0.01f);
    }
}
