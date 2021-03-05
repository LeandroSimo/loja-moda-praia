package ufpb.poo.projetoFinal;

import ufpb.poo.projetoFinal.Produto;
import ufpb.poo.projetoFinal.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Sistema  {
	private List<Produto>listaCompra;
	private List<Usuario>listFuncionario;
	private List<Produto>produtosDisponiveis;
        private List<String> Lquantidade = new ArrayList();
	
	
	public Sistema() {
		this.listaCompra = new  ArrayList <Produto>();
		this.listFuncionario = new ArrayList <Usuario>();
		this.produtosDisponiveis = new ArrayList<Produto>();
	}
        
        public void ADDQUANT (String x){
            this.Lquantidade.add(x);
        }
	public void adicionarAoCarrinho (Produto maisUm) {
            this.listaCompra.add(maisUm);
	}
	public void cadastrarProdutos(Produto novoProduto) {
            this.produtosDisponiveis.add(novoProduto);
	}
        public void cadastrarFuncionario(Usuario novo) {
            this.listFuncionario.add(novo);
	}
        public String pesquisarProduto(String nome){
            for(int k = 0; k < getProdutosDisponiveis().size(); k++){
                if(nome.equals(getProdutosDisponiveis().get(k).getNomeProduto())){
                    return getProdutosDisponiveis().get(k).toString();
                }
            }   
            return "PRODUTO NÃO CADASTRADO";
           
        }
   
        
        public List<String> getLquantidade(){
            return Lquantidade;
        }
        public void setLquantidade (List<String> x){
            this.Lquantidade = x;
        }
        
    public List<Produto> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(List<Produto> listaCompra) {
        this.listaCompra = listaCompra;
    }

    public List<Usuario> getListFuncionario() {
        return listFuncionario;
    }

    public void setListFuncionario(List<Usuario> listFuncionario) {
        this.listFuncionario = listFuncionario;
    }

    public List<Produto> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

   
    public void setProdutosDisponiveis(List<Produto> produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis;
    }

    boolean soma(double soma, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	

}

