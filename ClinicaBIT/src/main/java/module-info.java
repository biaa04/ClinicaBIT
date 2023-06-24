module com.poo.clinicabit {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.poo.clinicabit to javafx.fxml;
    exports com.poo.clinicabit;
    exports com.poo.clinicabit.Controllers;
    exports com.poo.clinicabit.Models;
    exports com.poo.clinicabit.Views;
}