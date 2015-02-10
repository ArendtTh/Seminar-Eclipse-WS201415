package handler;
/**
 * This is just a sample file for development. Please delete this at your personal whim.
 */
 
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SwitchToPersonManagementPerspectiveCommand {		
	
	  @Execute
	  public void execute(MApplication app, EPartService partService, 
	      EModelService modelService) {
	    MPerspective element = 
	        (MPerspective) modelService.find("de.unimarburg.fx.fopra.perspective.personenverwaltung", app);
	    // now switch perspective
	    partService.switchPerspective(element);
	  }

}

