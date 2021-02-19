package exercise3;

public class SolidMain {
    public static void main(String[] args) {

      Solido solido1 = new Solido(15, 20, 5);
      Solido solido2 = new Solido(25, 30, 10);
			Solido solido3 = new Solido(15, 10, 2);
    
      System.out.println(
				(solido1.dettagli()).equals(solido2.dettagli()));	

			System.out.println("Volume solido 1: " + solido1.calcVolume() + "cm3");
			System.out.println("Volume solido 2: " + solido2.calcVolume() + "cm3");
			System.out.println("Volume solido 3: " + solido3.calcVolume() + "cm3");

			System.out.println(solido1.dettagli()); 
			System.out.println(solido2.dettagli()); 
			System.out.println(solido3.dettagli()); 
    }
}