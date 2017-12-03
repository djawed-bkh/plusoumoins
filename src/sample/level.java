package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class level {
    //initialisations
    @FXML
    private Button play;
    private TextField screen;
    private int level;
    //initialisations
    //getters et setters

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //getters et setters


    public void saisniv(ActionEvent event) throws IOException {
        level=Integer.parseInt(screen.getText());

        //debut du jeu
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/game.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("le juste prix");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }



}
