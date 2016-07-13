package by.grodno.zagart.java.intelisoft;
/**
 * Created by intelisoft on 11.07.2016.
 */

import by.grodno.zagart.java.intelisoft.DAO.Impl.EmployeeDaoImpl;
import by.grodno.zagart.java.intelisoft.Entities.Employee;
import by.grodno.zagart.java.intelisoft.Service.Impl.UserServiceImpl;
import by.grodno.zagart.java.intelisoft.Service.UserService;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.util.List;

public class FXMain extends Application {

    private static Session session;
    private static final ObservableList<Employee> data = FXCollections.observableArrayList();
    private static UserService service = new UserServiceImpl(new EmployeeDaoImpl());

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new VBox();
        Scene scene = new Scene(pane);
        TableView table = new TableView();

        MenuBar bar = new MenuBar();
        Menu database = new Menu("Data");

        MenuItem item = new MenuItem("Load");
        item.setOnAction(event -> data.setAll(service.getUsers()));
        database.getItems().add(item);

        bar.getMenus().add(database);
        pane.getChildren().add(bar);

        TableColumn id = new TableColumn("Id");
        TableColumn name = new TableColumn("First name");

        Button del = new Button("delete");
        del.setOnAction(event -> service.deleteLast(data));

        Button button = new Button();
        button.setText("Load");
        button.setOnAction(event -> data.setAll(service.getUsers()));

        RadioMenuItem radio1 = new RadioMenuItem("Radio1");
        RadioMenuItem radio2 = new RadioMenuItem("Radio2");
        ToggleGroup group = new ToggleGroup();
        radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);


        SeparatorMenuItem sepp = new SeparatorMenuItem();
        database.getItems().addAll(radio1, radio2);
        bar.getMenus().add(database);
        pane.getChildren().add(bar);

        TextField field = new TextField();
        Button filter = new Button("Filter");
        field.setOnAction(event -> {
            List<Employee> list = service.filterByName(data, field.getText());
            data.setAll(list);
        });

        HBox hBoh = new HBox();
        hBoh.getChildren().addAll(field,filter);

        name.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        name.setCellFactory(TextFieldTableCell.forTableColumn());

        table.getColumns().addAll(name);
        table.setItems(data);

        pane.getChildren().add(table);
        pane.getChildren().addAll(button,del);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
