package fopra;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import fopramodel.Auxiliary;
import fopramodel.FoPra;
import fopramodel.FoPraManagementSystem;
import fopramodel.Person;

public class FoPraManagementUtil {

	public static EList<FoPra> getFoPras(FoPraManagementSystem fopraSystem) {
		EList<FoPra> fopraList = new BasicEList<FoPra>();
		TreeIterator<EObject> iter = fopraSystem.eAllContents();
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof FoPra) {
				fopraList.add((FoPra) obj);
			}
		}
		return fopraList;
	}

	public static EList<Person> getPersons(FoPraManagementSystem fopraSystem) {
		EList<Person> personList = new BasicEList<Person>();
		TreeIterator<EObject> iter = fopraSystem.eAllContents();
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof Person) {
				personList.add((Person) obj);
			}
		}
		return personList;
	}

	public static EList<Auxiliary> getAuxiliaries(FoPraManagementSystem fopraSystem) {
		EList<Auxiliary> auxiliaryList = new BasicEList<Auxiliary>();
		TreeIterator<EObject> iter = fopraSystem.eAllContents();
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof Auxiliary) {
				auxiliaryList.add((Auxiliary) obj);
			}
		}
		return auxiliaryList;
	}

}
