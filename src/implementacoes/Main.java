package implementacoes;

public class Main {
    public static void main(String[] args) {

        RepositorioDeAlunos repoAlunos = new RepositorioDeAlunos();
        repoAlunos.salvar("Alice");
        repoAlunos.salvar("Bruno");
        repoAlunos.salvar("Carlos");

        RepositorioDeProdutos repoProdutos = new RepositorioDeProdutos();
        repoProdutos.salvar(new Produto("Notebook", 3500.0));
        repoProdutos.salvar(new Produto("Mouse", 150.0));
        repoProdutos.salvar(new Produto("Teclado", 250.0));

        System.out.println("Alunos salvos: " + repoAlunos.getAlunos());
        System.out.println("Produtos salvos: " + repoProdutos.getProdutos());
    }
}
