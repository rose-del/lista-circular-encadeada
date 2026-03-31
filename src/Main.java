public class Main {
    public static void main(String[] args) {
        ListaCircularEncadeada lista = new ListaCircularEncadeada();

        lista.addElemento(10);
        lista.addElemento(20);
        lista.addElemento(30);
        System.out.println("Tamanho: " + lista.size() + "\n");

        lista.add(0, 5);
        lista.add(1, 15);
        System.out.println("Tamanho após adds: " + lista.size());

        lista.remove(0);
        System.out.println("\nTamanho após removes: " + lista.size());
    }
}