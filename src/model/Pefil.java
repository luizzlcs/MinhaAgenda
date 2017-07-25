/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author laoslcs
 */
public class Pefil {
    
    private int per_id;
    private char per_nome;

    public Pefil() {
    }

    public Pefil(int per_id, char per_nome) {
        this.per_id = per_id;
        this.per_nome = per_nome;
    }

    public char getPer_nome() {
        return per_nome;
    }

    public void setPer_nome(char per_nome) {
        this.per_nome = per_nome;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pefil other = (Pefil) obj;
        if (this.per_id != other.per_id) {
            return false;
        }
        if (this.per_nome != other.per_nome) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pefil{" + "per_id=" + per_id + ", per_nome=" + per_nome + '}';
    }
    
    
}
