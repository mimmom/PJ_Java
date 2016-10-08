/**
 * 
 */
package chapter04_advancedclassdesign.testExam;

/**
 * @author mimmo
 *
 */
abstract class Shape {
	public double area() { // implementazione di default, cattiva soluzione sebbene il compilatore non dia errore di compilazione 
		return 3;
	}

	public abstract int meth() ; 	// non esiste alcuna implementazione nel corpo del metodo 
	
	// una classe astratta forza tutte le sue sottoclassi a fornire una implementazione dei suoi metodi astratti
	
}
