package com.example.belajarfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pertanyaan");

        // Button pertama untuk pertanyaan awal
        Button button1 = new Button("Kamu suka sama aku?");
        button1.getStyleClass().add("big-button");
        button1.setOnAction(e -> showSecondStage());

        // Layout
        VBox layout1 = new VBox(10);
        layout1.setPadding(new Insets(20));
        layout1.setStyle("-fx-background-color: #f0f0f0;");
        layout1.getChildren().addAll(button1);

        Scene scene1 = new Scene(layout1, 300, 250);
        scene1.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    // Method untuk menampilkan stage kedua
    private void showSecondStage() {
        Stage secondStage = new Stage();
        secondStage.setTitle("Pilih Jawaban");

        // Button untuk pilihan jawaban
        Button button2 = new Button("Ya");
        Button button3 = new Button("Tidak");

        // Action event untuk button
        button2.setOnAction(e -> {
            LocalDate date = LocalDate.now();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Kita Jadian");
            alert.setHeaderText(null);
            alert.setContentText("Kita jadian di " + date);
            alert.showAndWait();
        });
        button3.setOnAction(e -> secondStage.close());

        // Layout untuk stage kedua
        VBox layout2 = new VBox(10);
        layout2.setPadding(new Insets(20));
        layout2.setStyle("-fx-background-color: #f0f0f0;");
        layout2.getChildren().addAll(button2, button3);

        Scene scene2 = new Scene(layout2, 300, 250);
        scene2.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        secondStage.setScene(scene2);
        secondStage.show();
    }
}
