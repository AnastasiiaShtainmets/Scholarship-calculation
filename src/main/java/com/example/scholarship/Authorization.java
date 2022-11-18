package com.example.scholarship;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Authorization {

    @FXML
    private Button button1;

    @FXML
    private TextField login;

    @FXML
    private TextField pass;

    @FXML
    void initialize() {
            button1.setOnAction(click -> {
                button1.setText("Добро пожаловать");
                System.out.println("Логин:" + login.getText());
                System.out.println("Пароль:" + pass.getText());
                button1.getScene().getWindow().hide();
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\student1.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                //loader.setLocation(getClass().getResource("Student.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\studentP1.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Student.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        } else {try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("Error.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                            System.out.println("Данные введены некорректно");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\student2.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                //loader.setLocation(getClass().getResource("Student2.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\studentP2.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Student2.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\student3.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                //loader.setLocation(getClass().getResource("Student3.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\studentP3.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Student3.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\student4.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                //loader.setLocation(getClass().getResource("Student4.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\studentP4.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Student4.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\student5.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                               //loader.setLocation(getClass().getResource("Student5.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\studentP5.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Student5.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\accountant.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                //loader.setLocation(getClass().getResource("Groups.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Scholarship\\src\\main\\resources\\com\\example\\scholarship\\accountantP.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Groups.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });

        }

    }


