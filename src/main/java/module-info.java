module ru.gozhan.equalizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gozhan.equalizer.controller to javafx.fxml;
    exports ru.gozhan.equalizer;
    opens ru.gozhan.equalizer.example to javafx.fxml;
    exports ru.gozhan.equalizer.example;
}