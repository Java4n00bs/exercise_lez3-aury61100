package exercise3;

public class Solido {

  int altezza, larghezza, profondità;

  public Solido (int altezza, int larghezza, int profondità){

    this.altezza = altezza;
    this.larghezza = larghezza;
    this.profondità = profondità;
  }

  public String dettagli(){

    String d = "Il solido ha " + altezza + " di altezza " + larghezza + " di larghezza e " + profondità + " di profondità";

  	return d;
  }

	public boolean equals(Solido other){
		this.altezza = altezza;
    this.larghezza = larghezza;
    this.profondità = profondità;
		return this.altezza == other.altezza && this.larghezza == other.larghezza && this.profondità == other.profondità;
	}

	public int calcVolume(){
    int volume = (this.altezza) * (this.larghezza) * (this.profondità);
    return volume;
  }
}