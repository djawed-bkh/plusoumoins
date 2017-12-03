package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class game {
    //initialisations
    level l=new level(); //creation d'instance level
    //initialisations
    @FXML
    private Button rejouer;
    @FXML
    private Button valide;
    @FXML
    private TextField screen;
    @FXML
    private TextField screen1;
   private int min=0;
   private int max;
   private int level;
   private int nbrinc;
   private int essaies=0;

//pour definir les niveaux
public void definelevel(){
    level=l.getLevel();
switch (level){
    case 1: max=10;break;
    case 2: max=100;break;
    case 3: max=1000;break;
} }

//donne un nombre alleatoire
public int nbrmystere() {
    definelevel();
    return nbrinc = (int) (Math.random() * (max - min)) + min;
}
//jeu
public void valider(ActionEvent event){
    nbrmystere();
    int val=Integer.parseInt(screen1.getText());
    essaies++;
    if (val>nbrinc) {
        screen.setText("c'est moins réessayez !!");
    }else if (val<nbrinc){
        screen.setText("c'est plus réessayez !!");
    }else if(val==nbrinc)  {
        screen.setText("BRAVO !!! vous avez trouvé en"+essaies+"essaies");
    }

}
public void rejouer(ActionEvent event) throws IOException {
    essaies=0;
    ((Node) (event.getSource())).getScene().getWindow().hide();
    Parent root = FXMLLoader.load(getClass().getResource("/sample/level.fxml"));
    Stage primaryStage = new Stage();
    primaryStage.setTitle("le juste prix");
    primaryStage.setScene(new Scene(root));
    primaryStage.setResizable(false);
    primaryStage.show();
}


}
