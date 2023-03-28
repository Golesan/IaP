module com.example.ejercicio_3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio_3 to javafx.fxml;
    exports com.example.ejercicio_3;
}