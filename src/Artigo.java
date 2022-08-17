/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Hugo
 */
class Artigo {

    private int codigo;
    private boolean defeito;
    private boolean embalado;

    public Artigo(int codigo, boolean defeito, boolean embalado) {
        this.codigo = codigo;
        this.defeito = defeito;
        this.embalado = embalado;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public boolean isDefeito() {
        return defeito;
    }

    public void setDefeito(boolean defeito) {
        this.defeito = defeito;
    }

    public boolean isEmbalado() {
        return embalado;
    }

    public void setEmbalado(boolean embalado) {
        this.embalado = embalado;
    }
    
    

}
