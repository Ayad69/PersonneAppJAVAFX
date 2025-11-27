package src.personne;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import src.personne.DTO.Personne;
import src.personne.DAO.PersonneDAO;

public class PersonneController {
    @FXML
    private Label label;

    @FXML
    private TextField namee;
    @FXML
    private TextField surname;
    @FXML
    private TextField agee;

    @FXML
    protected void onHelloButtonClick() {
  try {
      String nom =  namee.getText();
      String prenom = surname.getText();
      int age = Integer.parseInt(agee.getText());
      Personne p = new Personne(nom,prenom,age);
      System.out.println(p);
      PersonneDAO dao = new PersonneDAO();
      dao.create(p);
  }catch (Exception e){
      System.out.println(e);
  }
    }
}