package model;

public class Galinha extends Animal{


    public Galinha(String habitat, String nome, String especie, String sexo) {
        super(habitat, nome, especie, sexo);
    }


    @Override
    public String getHabitat() {return habitat;}

    @Override
    public void setHabitat(String habitat) {this.habitat = habitat;}
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }


    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String genero) {
        this.sexo = sexo;
    }


    @Override
    public String toString(){
        return "{Habitat: " + this.habitat + " ,Nome: "+ this.nome + " ,Especie: "+  this.especie + " ,Sexo: "+ this.sexo+ "}";

    }
}