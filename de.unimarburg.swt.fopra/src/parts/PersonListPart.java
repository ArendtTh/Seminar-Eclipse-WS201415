package parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import fopra.FoPraManagementUtil;
import fopramodel.FoPraManagementSystem;
import fopramodel.Person;

public class PersonListPart {
	
	@Inject
	public PersonListPart() { }

	@PostConstruct
	public void postConstruct(Composite parent, FoPraManagementSystem fopraSystem) {
		
		TableViewer tableViewer = new TableViewer(parent);
		
		EList<Person> personList = FoPraManagementUtil.getPersons(fopraSystem);
		
		for (Person person : personList) {
			tableViewer.add(person.getForename() + " " + person.getLastname());
		}
		
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));		
	}
}
