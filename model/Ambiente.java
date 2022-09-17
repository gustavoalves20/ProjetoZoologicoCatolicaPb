package model;

public class Ambiente {



    public String nomeAmbiente;

    public String ambiente;


    public String getNomeAmbiente() {
        return nomeAmbiente;
    }


    public Ambiente(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }


    public void setNome(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }

    Animal[] listaAnimais;


    public Ambiente(int capacidade){
        listaAnimais = new Animal[capacidade];
    }


    public void getlistaAnimais() {
        for (Animal listaAnimais : this.listaAnimais) {
            System.out.println(listaAnimais);
        }
    }


    public void setListaAnimais(int posicao,String nomeAmbiente,Animal animal) {

        this.nomeAmbiente = nomeAmbiente;
        this.listaAnimais[posicao] = animal;
    }



    @Override
    public String toString(){
        /*"Nome: "+ this.getNomeAmbiente() +"Animal: "+ this.getlistaAnimais();*/
        this.getlistaAnimais();
        return "";
        /*return "{Nome: "+ this.nome +"\nTipo: " + this.tipo + "\nTamanho: " + this.tamanho + "\nQuantidade de animais: " + this.quantidadeDeAnimais +"}"*/
    }


}