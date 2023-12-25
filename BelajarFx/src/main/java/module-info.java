module com.example.belajarfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.belajarfx to javafx.fxml;
    exports com.example.belajarfx;
}