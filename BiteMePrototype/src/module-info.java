module BiteMePrototype {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    exports src.ocsf.server;
    exports src.ocsf.client;
    exports BMgui;
    opens BMgui to javafx.fxml;
    exports BMclient;
    exports BMserver;
    exports BMlogic;
}