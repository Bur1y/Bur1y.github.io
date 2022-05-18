module com.buriy.statement.statement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.buriy.statement.statement to javafx.fxml;
    exports com.buriy.statement.statement;
}