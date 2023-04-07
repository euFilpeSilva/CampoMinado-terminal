package test;

import jogocampominado.CampoMinado;
import org.junit.Before;


public class CampoMinadoTest {

    private CampoMinado jogo;

    @Before
    public void setUp() {
        jogo = new CampoMinado(10, 10, 10);
    }

//    @Test
//    public void testMostrarTabuleiro() {
//        jogo.mostrarTabuleiro(false);
//        // Verificar se não houve exceção
//        assertTrue(true);
//    }
//
//    @Test
//    public void testRevelar() {
//        jogo.revelar(0, 0);
//        // Verificar se não houve exceção
//        assertTrue(true);
//    }
//


//    @Test
//    public void testGerarTabuleiroQuantidadeMinas() {
//        CampoMinado jogo = new CampoMinado(10, 10, 10);
//        boolean[][] tabuleiro = jogo.mostrarTabuleiro();
//        int numMinas = 0;
//        for (int i = 0; i < tabuleiro.length; i++) {
//            for (int j = 0; j < tabuleiro[0].length; j++) {
//                if (tabuleiro[i][j]) {
//                    numMinas++;
//                }
//            }
//        }
//        assertEquals(10, numMinas);
//    }
//
//    @Test
//    public void testGerarTabuleiroPosicoesInvalidas() {
//        CampoMinado jogo = new CampoMinado(10, 10, 10);
//        boolean[][] tabuleiro = jogo.mostrarTabuleiro();
//        for (int i = 0; i < tabuleiro.length; i++) {
//            for (int j = 0; j < tabuleiro[0].length; j++) {
//                assertTrue(tabuleiro[i][j] || !tabuleiro[i][j]);
//            }
//        }
//    }

}


