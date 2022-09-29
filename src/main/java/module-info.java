module com.example.minigolfsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.minigolfsystem to javafx.fxml;
    exports com.example.minigolfsystem;
}