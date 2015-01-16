/**
 * This is just a sample file for development. Please delete this at your personal whim.
 */
 
/**
 * From: http://www.vogella.com/tutorials/Eclipse4Services/article.html#selectedservices_partservice4
 */
import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class SwitchToHilfsmittelverwaltungPerspectiveCommand {		
	
	  @Execute
	  public void execute(MApplication app, EPartService partService, 
	      EModelService modelService) {
	    MPerspective element = 
	        (MPerspective) modelService.find("de.unimarburg.swt.fopra.perspective.hilfsmittelverwaltung", app);
	    // now switch perspective
	    partService.switchPerspective(element);
	  }

}

