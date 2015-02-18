package parts;

import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import fopra.FoPraManagementUtil;
import fopramodel.FoPra;
import fopramodel.FoPraManagementSystem;

public class FoPraListPart {
	
	@Inject
	ESelectionService selectionService;
	
	@Inject
	public FoPraListPart() { }
	
	@PostConstruct
	public void postConstruct(Composite parent, FoPraManagementSystem fopraSystem) {
		
		final TableViewer tableViewer = new TableViewer(parent);
		
		EList<FoPra> fopraList = FoPraManagementUtil.getFoPras(fopraSystem);
		final HashMap<String, FoPra> map = new HashMap<String, FoPra>();
		
		for (FoPra fopra : fopraList) {
			tableViewer.add(fopra.getTitle());
			map.put(fopra.getTitle(), fopra);
		}
		
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
				selectionService.setSelection(map.get(selection.getFirstElement()));
			}
			
		});
	}

}
