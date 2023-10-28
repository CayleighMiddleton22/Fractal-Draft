module com.example.newfractaldraft {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newfractaldraft to javafx.fxml;
    exports com.example.newfractaldraft;
}