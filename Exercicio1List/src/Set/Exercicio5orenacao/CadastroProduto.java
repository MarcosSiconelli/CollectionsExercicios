package Set.Exercicio5orenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoset;

    public CadastroProduto() {
        this.produtoset = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoset.add(new Produto(nome, codigo, preco, quantidade));
    }
// hashset deixa desorganizado, por isso usaremos o TreeSet
    public Set<Produto> exibirProdutorPorNome(){
      Set<Produto> produtospornome = new TreeSet<>(produtoset);
        return produtospornome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosporpreco= new TreeSet<>(new ComparatorPorPreco());
        produtosporpreco.addAll(produtoset);

        return produtosporpreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1111111, "feijao", 3.75, 5);
        cadastroProduto.adicionarProduto(2L, "produto 3", 4.5, 10);
        cadastroProduto.adicionarProduto(35684, "produto 2", 15.8, 2);
        cadastroProduto.adicionarProduto(45L, "produto 5", 2.5, 2);

        System.out.println(cadastroProduto.produtoset);

        System.out.println(cadastroProduto.exibirProdutorPorNome());

        System.out.println(cadastroProduto.exibirPorPreco());
       
    }
    

}
