package br.com.alura.forum.controller.dto;

public class ErroDeFormDto {

    private String campo;
    private String erro;

    public  ErroDeFormDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    /**
     * @return the campo
     */
    public String getCampo() {
        return campo;
    }

    /**
     * @return the erro
     */
    public String getErro() {
        return erro;
    }

}
