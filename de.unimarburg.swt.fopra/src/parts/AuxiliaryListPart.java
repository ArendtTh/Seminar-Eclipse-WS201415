package parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import fopra.FoPraManagementUtil;
import fopramodel.Auxiliary;
import fopramodel.FoPraManagementSystem;

public class AuxiliaryListPart {
	
	@Inject
	public AuxiliaryListPart() { }

	@PostConstruct
	public void postConstruct(Composite parent, FoPraManagementSystem fopraSystem) {
		
		TableViewer tableViewer = new TableViewer(parent);
		
		EList<Auxiliary> auxiliaryList = FoPraManagementUtil.getAuxiliaries(fopraSystem);
		
		for (Auxiliary auxiliary : auxiliaryList) {
			tableViewer.add(auxiliary.getDescription());
		}
		
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));		
	}
}
