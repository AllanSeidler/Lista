import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private Lista lista;
    private int numeroDoThread;

    public TarefaAdicionarElemento(Lista lista, int numero) {
        this.lista = lista;
        this.numeroDoThread = numero;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lista.adicionaElementos("Thread " + numeroDoThread + " - " + i);
        }
    }
}