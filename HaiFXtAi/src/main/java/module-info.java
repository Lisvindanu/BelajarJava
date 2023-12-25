module com.example.haifxtai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.haifxtai to javafx.fxml;
    exports com.example.haifxtai;
}