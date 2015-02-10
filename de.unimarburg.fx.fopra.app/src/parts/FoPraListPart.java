package parts;

import java.io.IOException;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.fx.ui.di.FXMLBuilder.Data;
import org.eclipse.fx.ui.di.InjectingFXMLLoader;

import fopramodel.FoPraManagementSystem;

public class FoPraListPart {

	private Node focusNode;

	@Inject
	MPart part;

	@Inject
	private IEventBroker eventBroker;

	@Inject
	public FoPraListPart() {
	}

	FoPraListPartController controller;
	FoPraManagementSystem fopraSystem;

	@PostConstruct
	public void postConstruct(BorderPane p, FoPraManagementSystem fopraSystem) {
		Node node = null;
		InjectingFXMLLoader<Object> fxmlLoader = InjectingFXMLLoader.create(
				part.getContext(), getClass(), "FoPraListPart.fxml");

		try {
			Data<Object, Object> data = fxmlLoader.loadWithController();

			node = (Node) data.getNode();

			if (node != null) {
				p.setCenter(node);
				focusNode = node;
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		eventBroker.send("FoPraListPartData", fopraSystem);
	}

	@Focus
	void focus() {
		if (focusNode != null) {
			focusNode.requestFocus();
		}
	}
}