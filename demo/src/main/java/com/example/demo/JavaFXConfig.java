package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.sql.*;
import java.util.Objects;

@SpringBootApplication
public class JavaFXConfig extends javafx.application.Application {

    @Override
    public void init() throws Exception {
        SpringApplicationBuilder builder = new
                SpringApplicationBuilder(JavaFXConfig.class);
        builder.application()
                .setWebApplicationType(WebApplicationType.NONE);

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Airplane Reservation Program");
        Button logInButton = new Button("Log in");
        Button registerButton = new Button("Register");
        Group group = new Group();
        logInButton.setLayoutX(500);
        logInButton.setLayoutY(550);
        logInButton.setMinSize(80, 40);
        registerButton.setLayoutX(500);
        registerButton.setLayoutY(600);
        registerButton.setMinSize(80, 40);
        Image image = new Image("airplane.jpg");
        logInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                Label firstLabel = new Label("Username:");
                TextField firstTextField = new TextField();

                firstLabel.setLabelFor(firstTextField);
                firstLabel.setLayoutX(400);
                firstLabel.setLayoutY(300);
                firstTextField.setLayoutX(500);
                firstTextField.setLayoutY(300);

                Label secondLabel = new Label("Password:");
                TextField secondTextField = new TextField();
                secondLabel.setLabelFor(secondTextField);
                secondLabel.setLayoutX(400);
                secondLabel.setLayoutY(400);
                secondTextField.setLayoutX(500);
                secondTextField.setLayoutY(400);

                Button secondLoginButton = new Button("Log in");
                secondLoginButton.setMinSize(80, 40);
                secondLoginButton.setLayoutX(500);
                secondLoginButton.setLayoutY(500);

                ImageView imageView = new ImageView();
                imageView.setImage(image);
                imageView.setFitHeight(800);
                imageView.setFitWidth(1200);
                imageView.setPreserveRatio(true);

                Group logInGroup = new Group();
                logInGroup.getChildren().addAll(imageView, secondLoginButton, firstLabel, firstTextField,
                        secondLabel, secondTextField);
                Scene logInScene = new Scene(logInGroup, 1000, 700);
                Stage logInStage = new Stage();
                logInStage.setScene(logInScene);
                logInStage.show();
                secondLoginButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent1) {
                        String username = firstTextField.getText();
                        String password = secondTextField.getText();
                        if (JavaFXServices.doesUserExist(username, password)) {
                            logInStage.close();
                            Stage homePage = new Stage();
                            Button userProfile = new Button("Your page");
                            Button myReservations = new Button("Your reservations");
                            Button makeAReservation = new Button("Make a reservation");
                        } else {
                            Stage failedLoginStage = new Stage();
                            TextArea text = new TextArea();
                            text.setText("Invalid password or username. Try again!");
                            text.setFont(new Font(12));
                            text.setEditable(false);
                            text.setMouseTransparent(true);
                            text.setMaxSize(240,50);
                            text.setStyle("-fx-focus-color: transparent;");
                            text.setBorder(null);
                            text.setLayoutX(50);
                            text.setLayoutY(50);
                            Button failedLoginButton = new Button("Ok");
                            failedLoginButton.setLayoutX(150);
                            failedLoginButton.setLayoutY(100);
                            Group failedLoginGroup = new Group();
                            failedLoginGroup.getChildren().addAll(text,failedLoginButton);
                            Scene failedLoginScene = new Scene(failedLoginGroup,300,200);
                            failedLoginStage.setScene(failedLoginScene);
                            failedLoginStage.show();
                            failedLoginButton.setOnAction(new EventHandler<ActionEvent>(){
                                @Override
                                public void handle(ActionEvent actionEvent2){
                                    failedLoginStage.close();
                                }
                            });
                            logInStage.show();
                        }
                    }
                });

            }
        });
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.close();
                Stage registerStage = new Stage();
                Button register = new Button("Register");




                ImageView imageView = new ImageView();
                imageView.setImage(image);
                imageView.setFitHeight(800);
                imageView.setFitWidth(1200);
                imageView.setPreserveRatio(true);
            }
        });
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(800);
        imageView.setFitWidth(1200);
        imageView.setPreserveRatio(true);
        group.getChildren().addAll(imageView, logInButton, registerButton);
        Scene scene = new Scene(group, 1000, 700);
        stage.setScene(scene);
        stage.show();

    }








    static class JavaFXServices {
        private static String username = "postgres";
        private static String password = "Fulger2000";
        private static String url = "jdbc:postgresql://localhost:5432/Proiect-Colectiv";


        public static boolean doesUserExist(String checkUsername,String checkPassword) {
            try (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement statement = connection.prepareStatement("SELECT * from users where username=?");) {
                statement.setString(1, checkUsername);
                try (
                        ResultSet resultSet = statement.executeQuery()) {
                    resultSet.next();
                    String dbUsername = resultSet.getString("username");
                    String dbPassword = resultSet.getString("password");
                    System.out.println(dbPassword);
                    return Objects.equals(dbPassword, checkPassword) && dbUsername != null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
