module com.example.calculatorxx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorxx to javafx.fxml;
    exports com.example.calculatorxx;
}