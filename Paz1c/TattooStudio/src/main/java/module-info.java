module com.studio.tattoostudio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;


    opens com.studio.tattoostudio to javafx.fxml;
    exports com.studio.tattoostudio;
    exports com.studio.tattoostudio.Controllers;
    opens com.studio.tattoostudio.Controllers to javafx.fxml;
}