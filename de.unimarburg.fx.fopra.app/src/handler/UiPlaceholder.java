package handler;
/**
 * This is just a sample file for development. Please delete this at your personal whim.
 */
 
import java.util.Random;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;



public class UiPlaceholder {
	
	private Node focusNode;
	
    @Inject
    MPart part;
	
	@PostConstruct
	public void postConstruct(BorderPane p) {
		
		Random rnd = new Random();		
        Node node = null;
        Label lb = new Label("Dies ist ein Test:"+rnd.nextInt());
        
            node = (Node) lb;

            if(node != null) {
                p.setCenter(node);
                focusNode = node;
            }


	}
	
    @Focus
    void focus() {
        if( focusNode != null ) {    
            focusNode.requestFocus();
        }
    } 
	
	
	
	
}