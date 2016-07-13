package main;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class JavaFX extends Application {

    private ObservableList<Person> personData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {

    }

    public static void main(String[] args) {}

    public JavaFX() {

            personData.add(new Person("Hans", "Muster"));
            personData.add(new Person("Ruth", "Mueller"));
            personData.add(new Person("Heinz", "Kurz"));
            personData.add(new Person("Cornelia", "Meier"));
            personData.add(new Person("Werner", "Meyer"));
            personData.add(new Person("Lydia", "Kunz"));
            personData.add(new Person("Anna", "Best"));
            personData.add(new Person("Stefan", "Meier"));
            personData.add(new Person("Martin", "Mueller"));
        }

        /**
         * Возвращает данные в виде наблюдаемого списка адресатов.
         * @return
         */
        public ObservableList<Person> getPersonData() {
            return personData;
        }

    public void showPersonOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(JavaFX.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
//            rootLayout.setCenter(personOverview);

            // Даём контроллеру доступ к главному приложению.
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
