package sample.Main3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

/* Opening screen for game */

public class OpeningController
{
	private RootController rootController;

	/**
	 * Listeners, for when the user clicks a button
	 * @throws Exception when file not found
	 */
	@FXML
    public void startPress(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
		Pane pane = loader.load();
		SignUpController signUpController = loader.getController();
		signUpController.setRootController(rootController);
		rootController.setScreen(pane);
    }


	public void rulePress(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Rule.fxml"));
		Pane pane = loader.load();
		RuleController ruleController = loader.getController();
		ruleController.setRootController(rootController);
		rootController.setScreen(pane);
	}

	public void quitPress(ActionEvent event) throws IOException {
		System.exit(0);
	}

	public void setRootController(RootController rootController) {
		this.rootController = rootController;
	}


}