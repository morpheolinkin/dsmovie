package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePK id = new ScorePK();

    private Double valores;

    public Score() {
    }

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(Usuario usuario) {
        id.setUser(usuario);
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValores() {
        return valores;
    }

    public void setValores(Double value) {
        this.valores = value;
    }
}
