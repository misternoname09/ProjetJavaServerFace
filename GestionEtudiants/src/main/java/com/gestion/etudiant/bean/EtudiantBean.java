/**
 * 
 */
package com.gestion.etudiant.bean;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author 
 *
 */
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
* @author 
*
*/
@RequestScoped
@Named
public class EtudiantBean {

	//private Etudiant etudiant = new Etudiant();
	private Etudiant etudiant;
	private List<Etudiant> listeEtudiant ;
	
	/**
	 * constructeur sans arguments
	 */
	
	public EtudiantBean() {
		// on va intancier notre classe etudiant
		etudiant = new Etudiant();
	}
	/**
	 * la metode qui permet de supprimer un étudiant
	 * @param id
	 * @return
	 */
	public String deleteEtudiant(int id) {
		System.out.println("suppression de l'etudiant: "+id);
	
	
		try{
			//on choisi le driver
			Class.forName("com.sql.jdbc.Driver");
			
			//on se connecr à la base de données
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiant","root","");
			
			//on ecrit la requete
			String req = "delete from etudiant where id= ?";
			//prepare la requete
			PreparedStatement ps = con.prepareStatement(req);
			// on met la valeur du parametre
			ps.setInt(1, id);
			
			//execute de la requete
			ps.execute();
			
			return "liste";
			
		}catch (ClassNotFoundException e) {
			 
			e.printStackTrace();
			return "";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "";
			}
	}
	
	public void updateEtudiant(int id) {
		System.out.println("mise à jour de l'etudiant: "+id);
	}
	
	
	
	/**
	 * la metode qui permet d'ajouter un étudiant
	 * @param e
	 * @return
	 */
	
	public String AddEtudiant (Etudiant e) {
		
		try {
			//on coisi notre driver
			Class.forName("com.sql.jdbc.Driver");
			
			//connection à la base de données
			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiant","root","");
			//defifnir la req
				String  req = "insert into etudiant (nom,prenom,datenaiss) value (?,?,?)";
				
			//preparation de la requete
				PreparedStatement ps = con.prepareStatement(req);
				//On va renseiner nos parametres de la raquete
				ps.setString(1, e.getNom());
				ps.setString(2, e.getPrenom());
				ps.setDate(3, (Date) e.getDatenaiss());
				//ps.setDate(3, e.getDatenaiss());
				
				//on execute la requete
                ps.executeQuery();
                
                return "liste";

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "";
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "";
			}
	}
	/**
	 * la méthode qui permet de récupérer la liste des étudiants
	 */
	public void chargerListeEtudiant() {
		listeEtudiant = new ArrayList<Etudiant>();
		
		try {
			//Choisir notre sql
			Class.forName("com.sql.jdbc.Driver");
			
			//on va se connecter à la base de données
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiant","root","");
			//con = DriverManager("jdbc:mysql://localhost:3306/dbetudiant","root","");
			
			// on va preparer notre requete
			PreparedStatement ps = con.prepareStatement("select * from etudiant");
			
			//execution de la requete
			ResultSet rs = ps.executeQuery();
			
			//on recupere le requete et on le stock dans la listeEtudiant
			while(rs.next()) {
				//on crée un instance d'étudiant
				Etudiant e = new Etudiant();
				e.setId(rs.getInt("id"));
				e.setNom(rs.getString("nom"));
				e.setPrenom(rs.getString("prenom"));
				e.setDatenaiss(rs.getDate("datenaiss"));
				
				//ajoute de l'étudiant dans la liste (arraylist)
				listeEtudiant.add(e);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * @return the etudiant
	 */
	public Etudiant getEtudiant(){
		return etudiant;
	}

	/**
	 * @param etudiant the etudiant to set
	 */
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	/**
	 * @return the listeEtudiant
	 */
	public List<Etudiant> getListeEtudiant() {
		return listeEtudiant;
	}

	/**
	 * @param listeEtudiant the listeEtudiant to set
	 */
	public void setListeEtudiant(List<Etudiant> listeEtudiant) {
		this.listeEtudiant = listeEtudiant;
	}
	
	/**
	 * @param listeEtudiant the listeEtudiant to set
	 *
	public String ajoutEtudiant() {
		etudiant.create(etudiant);
		listeEtudiant = etudiant;
		return "list.xhtml"; */
	
	
}
