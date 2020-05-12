package estruPilha;

/**
 *
 * @author bruno
 */
public class pilhaCon extends pilha {

    private final int tam;
    private final int vet[];

    public pilhaCon() {
        super();
        this.vet = new int[5];
        this.tam = 5;
    }

    @Override
    public void push(int v) throws Exception {
        this.vet[n] = v;
        this.n++;
    }

    @Override
    public int pop() throws Exception {
        int objAnte = 0;
        if (this.vazia()) {
            throw new UnsupportedOperationException("Pino vazio");
        } else {
            objAnte = this.top();
            vet[n -1] = 0;
            this.n--;
        }

        return objAnte;
    }

    @Override
    public int top() throws Exception {
        int objAnte;
        if (this.vazia()) {
            throw new UnsupportedOperationException("Pino vazio");
        } else {
            objAnte = this.vet[n - 1];
        }
        return objAnte;
    }

    public String toString() {
        String vetor = "";
        for (int i = 0; i < 5; i++) {
            if (this.vet[i] == 0) {
                vetor = vetor + "| ";
            } else {
                vetor = vetor + this.vet[i];
            }
            
        }
        return vetor;
    }
    
}
