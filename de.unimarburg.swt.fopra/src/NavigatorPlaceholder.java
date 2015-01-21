 
/**
 * This is just a sample file for development. Please delete this at your personal whim.
 */

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


public class NavigatorPlaceholder {
	
	Label lbl;
	@Inject
	public NavigatorPlaceholder() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
		Random rnd = new Random();
		
		TableViewer tableViewer = new TableViewer(parent);

		for (int i = 0; i < 40; i++) {
			tableViewer.add("Navigation " + i);
		}
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		
	}
	
	
	
	
}