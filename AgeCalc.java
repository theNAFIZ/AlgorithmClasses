import java.time.LocalDate;
import java.time.Period;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AgeCalc extends Application {
    LocalDate bday;
    @Override
    public void start(Stage primaryStage) {
        Text title = new Text("Enter Birth Date\n(MM/DD/YYYY)");
        Text msg = new Text("");
        DatePicker dp = new DatePicker();
        Button btn = new Button();
        Button reset = new Button();
        btn.setText("Calculate Age");
        reset.setText("Reset");
        btn.setOnAction((ActionEvent event) -> {
            LocalDate today = LocalDate.now();
            bday= dp.getValue();
            Period p = Period.between(bday, today);
            msg.setText("Your current age is "+Integer.toString(p.getYears())+" Years, "
                    +Integer.toString(p.getMonths())+" months and "+Integer.toString(p.getDays())+" days.");
            
        });
        reset.setOnAction((ActionEvent event) -> {
            dp.getEditor().clear();
            msg.setText("");
        });
        VBox root = new VBox(4,title,dp,btn,msg,reset);
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Age Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
