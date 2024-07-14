module BiteMePrototype {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    exports src.ocsf.client;
    exports src.ocsf.server;

    exports BMgui;
    opens BMgui to javafx.fxml;
    exports BMclient;
    exports BMserver;
    exports BMlogic;
}