package exercise0;


public class Persona {

  String nome, cognome;
  int eta;
  // costruttore senza parametri
  public Persona(){
    this.nome = " Aurora ";
    this.cognome = " Carrà ";
    this.eta = 20;
  }
  // costruttore con paramentri
  public Persona(String nome, String cognome, int eta){
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
  }

    public String dettagli(){

      String d = "La Persona si chiama " + this.nome +
       " " + this.cognome+ " e ha " + eta + " anni." ;

        return d;
    }
}
