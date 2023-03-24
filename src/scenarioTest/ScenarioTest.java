package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.*;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Sanglier>[] marche = new IEtal[3];
		IEtal<Sanglier> etalSanglier = new Etal<>();
		marche[0] = etalSanglier;
	}
	//essai2: On ne peut pas creer un marche qui vend plusieur produit.
}