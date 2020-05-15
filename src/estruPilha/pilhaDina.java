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
    

    public pilhaDina() {
        super();
        this.fim = null;
        this.ini = null;
    }

   
    public void push(int v) throws Exception {
        peca objetoAdd = new peca(null, v);
        if (this.vazia()) {
            this.ini = objetoAdd;
            this.fim = objetoAdd;

        } else {
            this.fim.setProx(objetoAdd);
            this.fim = objetoAdd;
        }
        this.n++;
    }
    
    @Override
    public int pop() throws Exception {
        int valorObj = fim.getInfo();
        peca eleGener = this.ini;

        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            if (this.n != 1) {
                while (eleGener.getProx().getProx() != null) {
                    eleGener = eleGener.getProx();
                }
                eleGener.setProx(null);
                this.fim.setProx(eleGener);
                this.fim = eleGener;
                this.n--;
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

    @Override
    public void libera(){
        this.fim = null;
        this.ini = null;
        this.n = 0;
    }

    public String toString() {
        String vetor = "";
        peca eleGener = this.ini;
        for (int i = 0; i < 5; i++) {
            if (eleGener != null) {
                vetor = vetor + " " + eleGener.getInfo();
                eleGener = eleGener.getProx();
            } else {
                vetor = vetor + " | ";
            }

        }
        return vetor;
    }

}
