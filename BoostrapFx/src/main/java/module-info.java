module com.example.boostrapfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.boostrapfx to javafx.fxml;
    exports com.example.boostrapfx;
}