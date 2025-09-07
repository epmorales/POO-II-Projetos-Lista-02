package implementacoes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeProdutos implements Repositorio<Produto> {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
