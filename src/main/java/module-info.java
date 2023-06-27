module com.epam.learn.learnbasicjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.epam.learn.main to javafx.fxml;
    exports com.epam.learn.main;
}