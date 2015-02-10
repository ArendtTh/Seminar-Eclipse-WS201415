package parts;

import java.io.IOException;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.fx.ui.di.FXMLBuilder.Data;
import org.eclipse.fx.ui.di.InjectingFXMLLoader;

import fopramodel.FoPraManagementSystem;

public class FoPraBasis {
	@Inject
	MPart part;

	private Node focusNode;

	FoPraBasisController controller;
	FoPraManagementSystem fopraSystem;

	@PostConstruct
	void init(BorderPane p, FoPraManagementSystem fopraSystem) {
		InjectingFXMLLoader<Object> fxmlLoader = InjectingFXMLLoader.create(
				part.getContext(), getClass(), "FoPraBasis.fxml");

		Node node = null;
		this.fopraSystem = fopraSystem;

		try {
			Data<Object, Object> data = fxmlLoader.loadWithController();

			node = (Node) data.getNode();
			controller = (FoPraBasisController) data.getController();
			controller.myfopra = fopraSystem.getFopras().get(0);
			controller.updateUI();

			if (node != null) {
				p.setCenter(node);
				focusNode = node;
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	@Focus
	void focus() {
		if (focusNode != null) {
			focusNode.requestFocus();
		}
	}

	@Inject
	@Optional
	private void getNotified(@UIEventTopic("selected_Element") int i) {
		controller.myfopra = fopraSystem.getFopras().get(i);
		controller.updateUI();
	}

}
