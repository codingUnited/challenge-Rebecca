module com.example.challenge3jsonparser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.challenge3jsonparser to javafx.fxml;
    exports com.example.challenge3jsonparser;
}