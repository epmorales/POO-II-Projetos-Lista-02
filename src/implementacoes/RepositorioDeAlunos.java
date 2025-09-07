package implementacoes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunos implements Repositorio<String> {
    private List<String> alunos = new ArrayList<>();

    @Override
    public void salvar(String aluno) {
        alunos.add(aluno);
    }

    public List<String> getAlunos() {
        return alunos;
    }
}