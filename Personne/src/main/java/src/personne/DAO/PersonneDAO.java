package src.personne.DAO;


import src.personne.DTO.Personne;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonneDAO extends DAO<Personne>{


    @Override
    public boolean create(Personne obj) {
        String sql = "INSERT INTO personne (nom,prenom,age) VALUES (?,?,?)";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNom());
            pstmt.setString(2, obj.getPrenom());
            pstmt.setInt(3, obj.getAge());

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Personne ajoutee avec succes !");
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de l’ajout de la personne : " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(Personne obj) {
        return false;
    }

    @Override
    public boolean update(Personne obj) {
        return false;
    }

    @Override
    public Personne find(int id) {
        return null;
    }

    @Override
    public ArrayList<Personne> findAll() {
        return null;
    }
}
