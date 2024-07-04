module ru.bai.yatmc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    requires okhttp3;
    requires kotlin.stdlib;
    requires com.fasterxml.jackson.databind;
    requires static lombok;

    opens ru.bai.yatmc to javafx.fxml;
    exports ru.bai.yatmc;
    exports ru.bai.yatmc.controller;
    exports ru.bai.yatmc.model;
    opens ru.bai.yatmc.controller to javafx.fxml;
    opens ru.bai.yatmc.model to javafx.fxml;
}