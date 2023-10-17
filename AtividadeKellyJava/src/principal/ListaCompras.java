package principal;
import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
    private List<ItemCompra> listaDeCompras;

   
    public ListaCompras() {
        listaDeCompras = new ArrayList<>();
    }

    //Aqui eu adiciono um item à lista de compras
    public void adicionarItem(String nome, double preco, int quantidade) {
        ItemCompra item = new ItemCompra(nome, preco, quantidade);
        listaDeCompras.add(item);
        System.out.println("Item adicionado à lista: " + item);
    }

    //Vou remover um item da lista de compras
    public void removerItem(String nome) {
        for (ItemCompra item : listaDeCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaDeCompras.remove(item);
                System.out.println("Item removido da lista: " + item);
                return;
            }
        }
        System.out.println("Item não encontrado na lista: " + nome);
    }

    //Vou listar os itens na lista de compras
    public void listarItens() {
        System.out.println("Lista de Compras:");
        for (ItemCompra item : listaDeCompras) {
            System.out.println(item);
        }
    }

    //De certa forma irei ccalcular o custo total da lista de compras
    public double calcularCustoTotal() {
        double custoTotal = 0.0;
        for (ItemCompra item : listaDeCompras) {
            custoTotal += item.getPrecoTotal();
        }
        return custoTotal;
    }

    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();

        lista.adicionarItem("Maçã", 2.5, 3);
        lista.adicionarItem("Leite", 1.0, 2);
        lista.adicionarItem("Pão", 3.0, 1);

        lista.listarItens();

        lista.removerItem("Leite");

        lista.listarItens();

        double custoTotal = lista.calcularCustoTotal();
        System.out.println("Custo Total da Compra: R$" + custoTotal);
    }
}

class ItemCompra {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemCompra(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + " x " + quantidade + " unidades)";
    }
}
