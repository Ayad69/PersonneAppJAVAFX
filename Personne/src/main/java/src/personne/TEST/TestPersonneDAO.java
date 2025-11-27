package src.personne.TEST;


import src.personne.DAO.PersonneDAO;
import src.personne.DTO.Personne;

public class TestPersonneDAO {
    public void createPDAO(Personne p){
        PersonneDAO personneDAO = new PersonneDAO();
        personneDAO.create(p);
    }
}
