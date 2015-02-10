package parts;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.emf.common.util.EList;

import fopra.FoPraManagementUtil;
import fopramodel.FoPra;
import fopramodel.FoPraManagementSystem;

public class FoPraListPartController {

	// Das zu betrachtende FoPaSystem
	FoPraManagementSystem fopraSystem;

	EList<FoPra> fopraList;

	@Inject
	private IEventBroker eventBroker;

	@FXML
	private ListView<String> lv_Fopra;

	@FXML
	public void initialize() {
		lv_Fopra.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<String>() {
					public void changed(ObservableValue<? extends String> ov,
							String old_val, String new_val) {
						if (fopraList != null) {
							for (int i = 0; i < fopraList.size(); i++) {
								if (fopraList.get(i).getTitle().equals(new_val)) {
									eventBroker.send("selected_Element", i);
								}
							}
						}

					}
				});
	}

	public void updateUI() {
		fopraList = FoPraManagementUtil.getFoPras(fopraSystem);
		ObservableList<String> oblfopraList = FXCollections
				.observableArrayList();

		for (FoPra fopra : fopraList) {
			// System.out.println(fopra.getTitle());
			oblfopraList.add(fopra.getTitle());
		}
		lv_Fopra.setItems(oblfopraList);
	}

	@Inject
	@Optional
	private void getNotified(
			@UIEventTopic("FoPraListPartData") FoPraManagementSystem fopraSystem) {
		this.fopraSystem = fopraSystem;
		updateUI();
	}

}