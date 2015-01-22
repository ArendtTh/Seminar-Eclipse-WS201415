package parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import fopra.FoPraManagementUtil;
import fopramodel.FoPra;
import fopramodel.FoPraManagementSystem;

public class FoPraListPart {
	
	@Inject
	public FoPraListPart() { }
	
	@PostConstruct
	public void postConstruct(Composite parent, FoPraManagementSystem fopraSystem) {
		
		TableViewer tableViewer = new TableViewer(parent);
		
		EList<FoPra> fopraList = FoPraManagementUtil.getFoPras(fopraSystem);
		
		for (FoPra fopra : fopraList) {
			tableViewer.add(fopra.getTitle());
		}
		
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));		
	}

}
