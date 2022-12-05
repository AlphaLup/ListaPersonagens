package com.breno.listapersonagens;

public class PersoItem {
    public int id, imgPersonagem;
    public String nome, temporada;

    public PersoItem(int id, int imgPersonagem, String nome, String temporada) {
        this.id = id;
        this.imgPersonagem = imgPersonagem;
        this.nome = nome;
        this.temporada = temporada;
    }
}
