package com.example.scholarship;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Gradebook{

    @FXML
    private VBox box;

    @FXML
    private Button Remove;

    @FXML
    private Button Save;

    @FXML
    private TextField estimatesB;

    @FXML
    private TableColumn<Accountant, String> estimatesT;

    @FXML
    private TextField nameB;

    @FXML
    private TableColumn<Accountant, String> nameT;

    @FXML
    private TextField scholarshipB;

    @FXML
    private TableColumn<Accountant, Integer> scholarshipT;

    @FXML
    private TableView<Accountant> tableView;

    ObservableList<Accountant> accountants = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        Save.setOnAction(click -> {
            try {
                String line = ("ФИО: " + nameB.getText()+" ");
                String line2= ("Оценки: " + estimatesB.getText()+" ");
                String line3= ("Стипендия: " + scholarshipB.getText()+" ");
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\data.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                buffer=line2.getBytes();
                fileOutputStream.write(buffer);
                buffer=line3.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Удачно сохранено");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        nameT.setCellValueFactory(new PropertyValueFactory<Accountant, String>("ФИО"));
        estimatesT.setCellValueFactory(new PropertyValueFactory<Accountant, String>("оценки"));
        scholarshipT.setCellValueFactory(new PropertyValueFactory<Accountant, Integer>("стипендия"));

        Save.setOnAction(click -> {
            Accountant accountant = new Accountant(nameB.getText(),
                    (estimatesB.getText()),
                    Integer.parseInt(scholarshipB.getText()));
            accountants.add(accountant);
            tableView.setItems(accountants);


            Remove.setOnAction(clck -> {
                int selectedID = tableView.getSelectionModel().getSelectedIndex();
                tableView.getItems().remove(selectedID);
            });
        });
    }
}

