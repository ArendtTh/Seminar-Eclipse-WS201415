package fopra;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;

import fopramodel.FoPraManagementSystem;

@SuppressWarnings("restriction")
public class LifeCycle {
	
	@PostContextCreate
	public void postContextCreate(IEclipseContext context) { 
		Bundle bundle = Platform.getBundle("de.unimarburg.swt.fopra.model");
		URL fileURL = bundle.getEntry("model/init.fopramodel");
		ResourceSet resourceSet = new ResourceSetImpl();
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		    Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		    FoPraManagementSystem fopraSystem = (FoPraManagementSystem) resource.getContents().get(0);
		    context.set(FoPraManagementSystem.class, fopraSystem);
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
	}

}
