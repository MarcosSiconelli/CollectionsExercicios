package Map.Exercicio3;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map <Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarproduto(Long cod, String nome, int quantidade, double preco ){
        produtoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(produtoMap);
    }

    public double calculaValorTotal(){
        Double valortotal =0.0 ;
        if (!produtoMap.isEmpty()) {
            //pega somente os valors dos produtos a sigla value
            for(Produto p:produtoMap.values()){
                // += quer dizer que soma e iguala
                valortotal += p.getQuantidade()*p.getPreco() ;
            }
       } 
       return valortotal;
    }
    
    public Produto obterProdutoMaisCaro(){
        Produto produtomaiscaro= null;
        double maiorpreco = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()) {
        for(Produto p: produtoMap.values()){
            if (p.getPreco() > maiorpreco) {
                produtomaiscaro=p;   
            }
        }
    }
    return produtomaiscaro;
}

    public static void main(String[] args) {
        EstoqueProdutos estoque= new EstoqueProdutos();

        estoque.adicionarproduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarproduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarproduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("valor total do estoque é "+ estoque.calculaValorTotal());
        System.out.println("produto mais caro é: " + estoque.obterProdutoMaisCaro());
    }

}