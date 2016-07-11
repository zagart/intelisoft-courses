package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane main = new VBox();
        Pane parent = new Pane();

        View view1 = new HelloView();
        View view2 = new MainView();

        Pane pane1 = view1.getPane();
        Pane pane2 = view2.getPane();

        View panel = new Panel(parent,pane1,pane2);

        main.getChildren().addAll(panel.getPane(), parent);
        Scene scene = new Scene(main,500,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
