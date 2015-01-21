/**
 * This is just a sample file for development. Please delete this at your personal whim.
 */
 


import java.util.Random;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;


public class UiPlaceholder {
	
	Label lbl;
	@Inject
	public UiPlaceholder() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
		Random rnd = new Random();
		
		parent.setLayout(new GridLayout(1,true));
		lbl = new Label(parent, SWT.SHADOW_OUT);
		lbl.setText("Just a test\n" + rnd.nextInt());
		lbl.setLayoutData(new GridData(GridData.FILL_BOTH));
		lbl.setBackground(new Color(Display.getCurrent(), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

	}
	
	
	
	
}