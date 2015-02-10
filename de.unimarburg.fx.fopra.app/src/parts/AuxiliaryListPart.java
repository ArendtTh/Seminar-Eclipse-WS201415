package parts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.util.EList;

import fopra.FoPraManagementUtil;
import fopramodel.Auxiliary;
import fopramodel.FoPraManagementSystem;

public class AuxiliaryListPart {

	private Node focusNode;

	@Inject
	MPart part;

	@Inject
	public AuxiliaryListPart() {
	}

	@PostConstruct
	public void postConstruct(BorderPane p, FoPraManagementSystem fopraSystem) {
		Node node = null;
		EList<Auxiliary> auxiliaryList = FoPraManagementUtil
				.getAuxiliaries(fopraSystem);

		ObservableList<String> obxiliaryList = FXCollections
				.observableList(null);

		for (Auxiliary auxiliary : auxiliaryList) {
			obxiliaryList.add(auxiliary.getDescription());
		}

		ListView<String> ListView = new ListView<String>(obxiliaryList);

		node = (Node) ListView;

		if (node != null) {
			p.setCenter(node);
			focusNode = node;
		}
	}

	@Focus
	void focus() {
		if (focusNode != null) {
			focusNode.requestFocus();
		}
	}
}
