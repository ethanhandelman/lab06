module com.csc308.lab06.lab06 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.csc308.lab06.lab06 to javafx.fxml;
    exports com.csc308.lab06.lab06;
}