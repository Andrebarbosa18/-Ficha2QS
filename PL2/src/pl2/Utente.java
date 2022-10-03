package pl2;

public class Utente {
    String nome;
    String genero;
    int idade;
    float altura;
    int peso;
    float IMC;

    public Utente(String nome, String genero, int idade, float altura, int peso){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
       
    }

  

    public String getNome(){
        return nome;
    }
    
    public String toString(){
        return nome + " | " + genero + " | " + idade + " | " + altura + " | " + peso + " | " + IMC;
    }
}
