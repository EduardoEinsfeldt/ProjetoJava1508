//Eduardo Augusto Pelegrino Einsfeldt
//RM - 556460

package models;

public class JogoResumo {
        private String titulo;
        private int anoLancamento;
        private String gameId;

        public JogoResumo(String titulo, int anoLancamento, String gameId) {
            this.titulo = titulo;
            this.anoLancamento = anoLancamento;
            this.gameId = gameId;
        }

        public String getTitulo() {
            return titulo;
        }

        public int getAnoLancamento() {
            return anoLancamento;
        }

        public String getGameId() {
            return gameId;
        }

        @Override
        public String toString() {
            return titulo + "/" + anoLancamento + "/" + gameId;
        }

}
