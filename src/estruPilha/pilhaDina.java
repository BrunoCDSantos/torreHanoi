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
public class pilhaDina extends pilha {

    private peca fim, ini;
    private int size;

    public void pilhaDina() {
        this.fim = null;
        this.ini = null;
        this.size = 0;
    }

    @Override
    public void push(int v) throws Exception {
        peca objetoAdd = new peca(null, v);
        if (this.vazia()) {
            this.ini = objetoAdd;
            this.fim = objetoAdd;

        } else {
            this.fim.setProx(objetoAdd);
            this.fim = objetoAdd;
        }
        size++;
    }

    @Override
    public int pop() throws Exception {
        int valorObj = fim.getInfo();
        peca eleGener = this.ini;

        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            if (this.size != 1) {
                while (eleGener.getProx().getProx() != null) {
                    eleGener = eleGener.getProx();
                }
                eleGener.setProx(null);
                this.fim.setProx(eleGener);
                this.fim = eleGener;
                this.size--;
            } else {
                this.libera();
            }

        }
        return valorObj;
    }

    @Override
    public int top() throws Exception {
        return this.fim.getInfo();
    }

    protected void libera() throws Exception {
        this.fim = null;
        this.ini = null;
        this.size = 0;
    }

    public String toString() {
        String eleLista = "";
        peca eleGener = this.ini;
        while (eleGener != null) {
            eleLista = eleLista + "/" + eleGener.getInfo();
            eleGener = eleGener.getProx();
        }
        return eleLista;
    }

}
