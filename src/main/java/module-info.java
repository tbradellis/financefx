module com.bellis.finance {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bellis.finance to javafx.fxml;
    exports com.bellis.finance;
}