module com.example.morsecodefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morsecodefx to javafx.fxml;
    exports com.example.morsecodefx;
}