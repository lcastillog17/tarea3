module org.openjfx.segundoparcialbuenoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens org.openjfx.segundoparcialbuenoo to javafx.fxml;
    exports org.openjfx.segundoparcialbuenoo;
    opens modelo to javafx.fxml;
    exports modelo;


}
