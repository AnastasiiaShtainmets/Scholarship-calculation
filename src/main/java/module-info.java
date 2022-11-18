module com.example.scholarship {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scholarship to javafx.fxml;
    exports com.example.scholarship;
}