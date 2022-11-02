import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArqueiroTest {
    @Test
    void deveRetornarDanoFisicoComAnaoAprendiz() {
        Raca raca = new Anao();
        Rank rank = new Aprendiz();
        Profissao profissao = new Arqueiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(315.0f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoFisicoComElfoMestre() {
        Raca raca = new Elfo();
        Rank rank = new Mestre();
        Profissao profissao = new Arqueiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(562.5f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoFisicoComHumanoAnciao() {
        Raca raca = new Humano();
        Rank rank = new Anciao();
        Profissao profissao = new Arqueiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(1312.5f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComAnaoAprendiz() {
        Raca raca = new Anao();
        Rank rank = new Aprendiz();
        Profissao profissao = new Arqueiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(157.5f, profissao.ataqueMagico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComElfoMestre() {
        Raca raca = new Elfo();
        Rank rank = new Mestre();
        Profissao profissao = new Arqueiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(750.0f, profissao.ataqueMagico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComHumanoAnciao() {
        Raca raca = new Humano();
        Rank rank = new Anciao();
        Profissao profissao = new Arqueiro(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(1250.0f, profissao.ataqueMagico(), 0.01f);
    }
}
