package model;

public class Animal {
    String habitat;
    String nome;
    String especie;
    String sexo;


    public Animal(String habitat, String nome, String especie, String sexo) {
        this.habitat = habitat;
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {

        return sexo;
    }

    public void setSexo(String genero) {
        this.sexo = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
