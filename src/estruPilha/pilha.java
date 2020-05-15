package estruPilha;

import interfac.Ipilha;

/**
 *
 * @author bruno
 */
public class pilha implements Ipilha{

    protected int n;

    //throw new UnsupportedOperationException("Not supported yet.");
    public pilha() {
        this.n = 0;
    }

     @Override
    public void push(int v) throws Exception {
    }
    
    @Override
    public int pop() throws Exception {
        
        return n;
    }

    @Override
    public int top() throws Exception {
        return n;
    }

    @Override
    public boolean vazia() throws Exception {
        return this.n == 0;
    }
    
    public boolean cheia(){
        return this.n == 5;
    }

    @Override
    public void libera() {
        this.n = 0;
    }


}
