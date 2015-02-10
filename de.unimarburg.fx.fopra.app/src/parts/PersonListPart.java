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
import fopramodel.FoPraManagementSystem;
import fopramodel.Person;

public class PersonListPart {

	private Node focusNode;

	@Inject
	MPart part;

	@Inject
	public PersonListPart() {
	}

	@PostConstruct
	public void postConstruct(BorderPane p, FoPraManagementSystem fopraSystem) {
		Node node = null;

		EList<Person> personList = FoPraManagementUtil.getPersons(fopraSystem);

		ObservableList<String> obPersonList = FXCollections
				.observableList(null);

		for (Person person : personList) {
			obPersonList.add(person.getForename() + " " + person.getLastname());
		}

		ListView<String> ListView = new ListView<String>(obPersonList);

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
