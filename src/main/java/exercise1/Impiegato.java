package exercise1;


public class Impiegato {

    String nome, cognome;
    int salario;

    public Impiegato (String nome, String cognome, int salario){
    this.nome = nome;
    this.cognome = cognome;
    this.salario = salario;
  }

    public String dettagli(){
        //qui il corpo
        String d = "L'impiegato' si chiama " + this.nome + " " + this.cognome + " e ha un salario di  " + salario + " euro." ;

        return d;
    }

    public void aumentaSalario(int percentuale){
      this.salario = this.salario + (this.salario/100 * percentuale);
    }

}
