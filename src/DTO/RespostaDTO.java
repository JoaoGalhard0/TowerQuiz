/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author JOAO PEDRO GALHARDO
 */
public class RespostaDTO {
    private int idResposta;
    private int idPergunta;
    private String Resposta;
    private boolean Correta;

    /**
     * @return the idResposta
     */
    public int getIdResposta() {
        return idResposta;
    }

    /**
     * @param idResposta the idResposta to set
     */
    public void setIdResposta(int idResposta) {
        this.idResposta = idResposta;
    }

    /**
     * @return the idPergunta
     */
    public int getIdPergunta() {
        return idPergunta;
    }

    /**
     * @param idPergunta the idPergunta to set
     */
    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    /**
     * @return the Resposta
     */
    public String getResposta() {
        return Resposta;
    }

    /**
     * @param Resposta the Resposta to set
     */
    public void setResposta(String Resposta) {
        this.Resposta = Resposta;
    }

    /**
     * @return the Correta
     */
    public boolean isCorreta() {
        return Correta;
    }

    /**
     * @param Correta the Correta to set
     */
    public void setCorreta(boolean Correta) {
        this.Correta = Correta;
    }
    
}
