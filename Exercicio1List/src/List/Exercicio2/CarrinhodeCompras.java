package List.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {

    private List <Item> itemList;

    public CarrinhodeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem (String nome, Double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
            for(Item r: itemList){
                if (r.getNome().equals(nome)) {
                    itemParaRemover.add(r);
                }
            }
            itemList.removeAll(itemParaRemover);
    }

    public double valorTotal(){
        double valor = 0;
        if (!itemList.isEmpty()) {    
        for(Item i: itemList){
            double valorItem= i.getPreco()*i.getQuantidade();
            valor += valorItem;
        }
        return valor;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

        public void exibirItens(){
            System.out.println(itemList);
        }

        public static void main(String[] args) {
            CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();

            carrinhodeCompras.adicionarItem("leite", 5.5, 2);
            carrinhodeCompras.adicionarItem("OVO", 2.5, 1);
            carrinhodeCompras.adicionarItem("pao", 3.5, 2);
            carrinhodeCompras.exibirItens();
            carrinhodeCompras.removerItem("OVO");
            carrinhodeCompras.exibirItens();
            System.out.println("O valor total é =" + carrinhodeCompras.valorTotal());

        }


    }
