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
public class Mensalidade {
    private int cod_mens, atraso_mens;
    private String mes_ano_mens, data_pag_mens, situacao_mens;
    private double renovacao_mens;

    public int getcod_mens() {
        return cod_mens;
    }

    public void setcod_mens(int cod_mens) {
        this.cod_mens = cod_mens;
    }
    
    public String getmes_ano_mens() {
        return mes_ano_mens;
    }

    public void setmes_ano_mens(String mes_ano_mens) {
        this.mes_ano_mens = mes_ano_mens;
    }

    public String getdata_pag_mens() {
        return data_pag_mens;
    }

    public void setdata_pag_mens(String data_pag_mens) {
        this.data_pag_mens = data_pag_mens;
    }

    public String getsituacao_mens() {
        return situacao_mens;
    }

    public void setsituacao_mens(String situacao_mens) {
        this.situacao_mens = situacao_mens;
    }

    public int getatraso_mens() {
        return atraso_mens;
    }

    public void setatraso_mens(int atraso_mens) {
        this.atraso_mens = atraso_mens;
    }

    public double getrenovacao_mens() {
        return renovacao_mens;
    }

    public void setrenovacao_mens(double renovacao_mens) {
        this.renovacao_mens = renovacao_mens;
    }
    
}
