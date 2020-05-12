/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruPilha;

/**
 *
 * @author bruno
 */
public class peca {

    private int info;
    private peca prox;

    public peca(peca prox, int info) {
        this.prox = prox;
        this.info = info;
    }

    peca getProx() {
        return prox;
    }

    void setProx(peca prox) {
        this.prox = prox;
    }

    int getInfo() {
        return info;
    }

    void setInfo(int info) {
        this.info = info;
    }
}
