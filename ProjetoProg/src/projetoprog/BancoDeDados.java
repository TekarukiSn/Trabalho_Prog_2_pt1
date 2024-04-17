package projetoprog;

import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    
    public void addVeiculo(Veiculo veiculo){
        listaVeiculos.add(veiculo);
    }
    
    public ArrayList<Veiculo> getListaVeiculos(){
        return listaVeiculos;
    }
}
