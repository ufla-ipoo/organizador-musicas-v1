import java.util.ArrayList;

/**
 * Uma classe que guarda detalhes de arquivos de música
 * 
 * Traduzido por Julio César Alves. 2023.10.01
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class OrganizadorDeMusicas
{
    // Um ArrayList para guardar oos nomes dos arquivos de músicas.
    private ArrayList<String> arquivos;
        
    /**
     * Cria um OrganizadorMusicas
     */
    public OrganizadorDeMusicas()
    {
        arquivos = new ArrayList<>();
    }
    
    /**
     * Adiciona um arquivo à coleção.
     * @param nomeDoArquivo O nome do arquivo a ser adicionado.
     */
    public void adicionarArquivo(String nomeDoArquivo)
    {
        arquivos.add(nomeDoArquivo);
    }
    
    /**
     * Retorna a quantidade de arquivos na coleção.
     * @return A quantidade de arquivos na coleção.
     */
    public int obterQuantidadeDeArquivos()
    {
        return arquivos.size();
    }
    
    /**
     * Lista (exibe) um arquivo da coleção.
     * @param indice O índice (posição) do arquivo a ser listado.
     */
    public void listarArquivo(int indice)
    {
        if(indice >= 0 && indice < arquivos.size()) {
            String nomeDoArquivo = arquivos.get(indice);
            System.out.println(nomeDoArquivo);
        }
    }
    
    /**
     * Remove um arquivo da coleção.
     * @param indice O índice (posição) do arquivo a ser removido.
     */
    public void removerArquivo(int indice)
    {
        if(indice >= 0 && indice < arquivos.size()) {
            arquivos.remove(indice);
        }
    }
}
