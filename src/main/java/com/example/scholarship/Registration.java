package com.example.scholarship;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Registration {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private TextField login;

    @FXML
    private TextField pass;

    @FXML
    void initialize() {
        button1.setOnAction(click -> {
            System.out.println("Логин:" + login.getText());
            System.out.println("Пароль:" + pass.getText());
            button1.getScene().getWindow().hide();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\login.txt"))) {
                writer.write(login.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Groups.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\pass.txt"))) {
                writer.write(pass.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Groups.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });


        button2.setOnAction(click -> {
            System.out.println("Логин:" + login.getText());
            System.out.println("Пароль:" + pass.getText());
            button1.getScene().getWindow().hide();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\login.txt"))) {
                writer.write(login.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("com/example/scholarship/Student.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\pass.txt"))) {
                writer.write(pass.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("com/example/scholarship/Student.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });

    }
}
