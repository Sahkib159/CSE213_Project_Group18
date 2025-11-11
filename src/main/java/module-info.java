module com.group18.cse213_project_group18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group18.cse213_project_group18 to javafx.fxml;
    exports com.group18.cse213_project_group18;
}