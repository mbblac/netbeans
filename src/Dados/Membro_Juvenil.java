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
public class Membro_Juvenil {
    private int reg_membro;
    private String nome_membro, ramo_membro;

    public int getreg_membro() {
        return reg_membro;
    }

    public void setreg_membro(int reg_membro) {
        this.reg_membro = reg_membro;
    }

    public String getnome_membro() {
        return nome_membro;
    }

    public void setnome_membro(String nome_membro) {
        this.nome_membro = nome_membro;
    }

    public String getramo_membro() {
        return ramo_membro;
    }

    public void setramo_membro(String ramo_membro) {
        this.ramo_membro = ramo_membro;
    }
}
