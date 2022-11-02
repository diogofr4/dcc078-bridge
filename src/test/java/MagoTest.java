import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagoTest {
    @Test
    void deveRetornarDanoFisicoComAnaoAprendiz() {
        Raca raca = new Anao();
        Rank rank = new Aprendiz();
        Profissao profissao = new Mago(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(262.5f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoFisicoComElfoMestre() {
        Raca raca = new Elfo();
        Rank rank = new Mestre();
        Profissao profissao = new Mago(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(468.75f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoFisicoComHumanoAnciao() {
        Raca raca = new Humano();
        Rank rank = new Anciao();
        Profissao profissao = new Mago(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(1093.75f, profissao.ataqueFisico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComAnaoAprendiz() {
        Raca raca = new Anao();
        Rank rank = new Aprendiz();
        Profissao profissao = new Mago(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(236.24f, profissao.ataqueMagico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComElfoMestre() {
        Raca raca = new Elfo();
        Rank rank = new Mestre();
        Profissao profissao = new Mago(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(1125.0f, profissao.ataqueMagico(), 0.01f);
    }

    @Test
    void deveRetornarDanoMagicoComHumanoAnciao() {
        Raca raca = new Humano();
        Rank rank = new Anciao();
        Profissao profissao = new Mago(100f, 100f);
        profissao.setRaca(raca);
        profissao.setRank(rank);
        assertEquals(1875.0f, profissao.ataqueMagico(), 0.01f);
    }
}
