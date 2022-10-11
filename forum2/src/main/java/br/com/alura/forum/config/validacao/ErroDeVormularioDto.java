package br.com.alura.forum.config.validacao;

public class ErroDeVormularioDto {
    private final String campo;
    private final String erro;

    public ErroDeVormularioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getErro() {
        return erro;
    }

    public String getCampo() {
        return campo;
    }
}
