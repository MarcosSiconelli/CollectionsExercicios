package List.Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrolist;

    public CatalogoLivros() {
        this.livrolist = new ArrayList<>();
    }

public void adicionarLivro (String titulo, String autor, int anoPublicacao){
    livrolist.add(new Livro(titulo, autor, anoPublicacao));
}


public List<Livro> pesquisarporautor(String autor){
    List<Livro> livroporautor = new ArrayList<>();
    if (!livrolist.isEmpty()) {
        for(Livro l: livrolist){
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livroporautor.add(l);  
            }
        }
    }
    return livroporautor;
}

    public List <Livro> pesquisaporano (int anoinicial, int anofinal){
        List<Livro> livroporintervalo = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l: livrolist){
                if (l.getAnoPublicacao() >= anoinicial && l.getAnoPublicacao() <= anofinal) {
                    livroporintervalo.add(l);
                }
            }
        }
        return livroporintervalo;

    }

    public Livro pesquisaTitulo(String titulo){
        Livro livroportitulo = null;
        if (!livrolist.isEmpty()) {
            for(Livro l:livrolist){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroportitulo= l;
                    break;
                }
            }
        }
        return livroportitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarporautor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaporano(2020,2021));
        System.out.println(catalogoLivros.pesquisaTitulo("livro 1"));


    }

}
