module com.cal.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.cal.demo2 to javafx.fxml;
    exports com.cal.demo2;
}