package models;

import enums.JogoClassificacao;
import enums.JogoGenre;
import java.util.UUID;

public class Jogo {
    private String titulo;
    private String anoLancamento;
    private String desenvolvedor;
    private String publisher;
    private JogoGenre GameGenre;
    private JogoClassificacao ClassificacaoJogo;
    private UUID gameId;

    public Jogo(String titulo, String anoLancamento, JogoGenre GameGenre, String desenvolvedor, String publisher, JogoClassificacao ClassificacaoJogo, UUID gameId) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        GameGenre = GameGenre;
        this.desenvolvedor = desenvolvedor;
        this.publisher = publisher;
        ClassificacaoJogo = ClassificacaoJogo;
        this.gameId = gameId;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public JogoGenre getGameGenre () {
        return GameGenre;
    }

    public void setGameGenre(JogoGenre GameGenre) {
        JogoGenre = GameGenre;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public JogoClassificacao getClassificacaoJogo () {
        return ClassificacaoJogo;
    }

    public void setClassificacaoJogo(JogoClassificacao ClassificacaoJogo) {
        JogoClassificacao = ClassificacaoJogo;
    }

    public UUID getGameId(){
        return gameId;
    }

    public void setGameId(UUID gameId) {
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return "Jogo : {"+"\nTítulo = "+this.titulo+"\nAno de Lançamento = "+this.anoLancamento+"\nGênero = "+GameGenre+"\nDesenvolvedor = "+this.desenvolvedor+"\nPublicadora = "+this.publisher+"\nClassificação = "+ClassificacaoJogo+"\nUUID = "+gameId+"\n}";
    }

}
