/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author a94092
 */
public class Contatos {
    private int id;
    private String contatos;
    private String whatsapp;
    private String twitter;
    private String facebook;
    private int pes_id;

    public Contatos() {
    }

    public Contatos(int id, String contatos, String whatsapp, String twitter, String facebook, int pes_id) {
        this.id = id;
        this.contatos = contatos;
        this.whatsapp = whatsapp;
        this.twitter = twitter;
        this.facebook = facebook;
        this.pes_id = pes_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContatos() {
        return contatos;
    }

    public void setContatos(String contatos) {
        this.contatos = contatos;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public int getPes_id() {
        return pes_id;
    }

    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
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
        final Contatos other = (Contatos) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.pes_id != other.pes_id) {
            return false;
        }
        if (!Objects.equals(this.contatos, other.contatos)) {
            return false;
        }
        if (!Objects.equals(this.whatsapp, other.whatsapp)) {
            return false;
        }
        if (!Objects.equals(this.twitter, other.twitter)) {
            return false;
        }
        if (!Objects.equals(this.facebook, other.facebook)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contatos{" + "id=" + id + ", contatos=" + contatos + ", whatsapp=" + whatsapp + ", twitter=" + twitter + ", facebook=" + facebook + ", pes_id=" + pes_id + '}';
    }
    
    
    
    
}
