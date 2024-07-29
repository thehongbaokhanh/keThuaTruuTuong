module com.example.featurelogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.featurelogin to javafx.fxml;
    exports com.example.featurelogin;
}