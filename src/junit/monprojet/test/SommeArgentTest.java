/**
 * 
 */
package junit.monprojet.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

import org.junit.Test;

/**
 * @author admit
 *
 */
/*public class SommeArgentTest {



	@Test
	public void testeLAddition() {
	 SommeArgent m12CHF= new SommeArgent(12, "CHF"); // (1)
	 SommeArgent m14CHF= new SommeArgent(14, "CHF");
	 SommeArgent expected = new SommeArgent(26, "CHF");
	 SommeArgent result = m12CHF.add(m14CHF); // (2)
	 Assert.assertTrue(expected.equals(result)); // (3)
	 }


	@Test
	public void testeEquivalence() {
		SommeArgent m12CHF= new SommeArgent(12, "CHF");
		 SommeArgent m14CHF= new SommeArgent(14, "CHF");
		 SommeArgent m14USD= new SommeArgent(14, "USD");
		 Assert.assertTrue(!m12CHF.equals(null));
		 Assert.assertEquals(m12CHF, m12CHF);
		 Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		 Assert.assertTrue(!m12CHF.equals(m14CHF));
		 Assert.assertTrue(!m14USD.equals(m14CHF)); //Cette ligne sert à vérifier que $USD14 (14 dollars américains) est différent de 14 francs suisses 

	}
}*/

public class SommeArgentTest {
private SommeArgent m12CHF;
private SommeArgent m14CHF;
private SommeArgent m14USD;
private static int nbPasseDansInit = 0;
private static int nbPasseDansAfter = 0;
 @Before
public void mesInitialisations() {
 m12CHF= new SommeArgent(12, "CHF"); // (1)
 m14CHF= new SommeArgent(14, "CHF");
 m14USD= new SommeArgent(14, "USD");
 System.out.println(++nbPasseDansInit + "ime passage avant exécution d'une méthode de test");
 }
 @After
 public void apresExecMethTest() {
 System.out.println(++nbPasseDansAfter + "ime passage APRES exécution d'une méthode de test"); 
 }
 @Test
public void testeLAddition() throws UniteDistincteException {
 SommeArgent expected = new SommeArgent(26, "CHF");
 SommeArgent result = m12CHF.add(m14CHF); // (2)
 Assert.assertTrue(expected.equals(result)); // (3)
 }
 @Test
	public void testeEquivalence() {
 Assert.assertTrue(!m12CHF.equals(null));
 Assert.assertEquals(m12CHF, m12CHF);
 Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
 Assert.assertTrue(!m12CHF.equals(m14CHF));
 Assert.assertTrue(!m14USD.equals(m14CHF));
 }


  @Test(expected = UniteDistincteException.class)
 public void leveExceptionPourAddition() throws
 UniteDistincteException {
  SommeArgent autreSomme = new SommeArgent(12, "USD");
  m12CHF.add(autreSomme);
  }

}


