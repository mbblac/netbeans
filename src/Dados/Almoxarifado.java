/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author 277841
 */
public class Almoxarifado {
    private int cod_material;
    private String nome_material, est_atual_material, ramo_material, local_material;

    public int getcod_material() {
        return cod_material;
    }

    public void setcod_material(int cod_material) {
        this.cod_material = cod_material;
    }

    public String getnome_material() {
        return nome_material;
    }

    public void setnome_material(String nome_material) {
        this.nome_material = nome_material;
    }

    public String getest_atual_material() {
        return est_atual_material;
    }

    public void setest_atual_material(String est_atual_material) {
        this.est_atual_material = est_atual_material;
    }

    public String getramo_material() {
        return ramo_material;
    }

    public void setramo_material(String ramo_material) {
        this.ramo_material = ramo_material;
    }

    public String getlocal_material() {
        return local_material;
    }

    public void setlocal_material(String local_material) {
        this.local_material = local_material;
    }
    
}
