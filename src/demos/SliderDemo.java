package demos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import customui.components.C3DSlider;

public class SliderDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			C3DSlider c3dSlider = new C3DSlider();
			c3dSlider.setMinWidth(700);
			//c3dSlider.setMinHeight(500);
			//c3dSlider.setOrientation(Orientation.VERTICAL);

			Slider slider = new Slider();

			HBox hbox = new HBox();
			VBox vbox = new VBox();
			vbox.getChildren().add(c3dSlider);
			vbox.getChildren().add(slider);
			vbox.setSpacing(100);
			hbox.getChildren().add(vbox);
			hbox.setSpacing(50);
			hbox.setPadding(new Insets(250, 10, 10, 100));

			Scene scene = new Scene(new Group());
			((Group) scene.getRoot()).getChildren().add(hbox);
			primaryStage.setScene(scene);
			primaryStage.setWidth(900);
			primaryStage.setHeight(700);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
