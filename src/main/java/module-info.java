module com.example.tabdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabdemo to javafx.fxml;
    exports com.example.tabdemo;
}