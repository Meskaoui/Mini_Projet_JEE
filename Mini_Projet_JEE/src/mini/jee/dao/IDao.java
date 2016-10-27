package mini.jee.dao;

import java.sql.SQLException;
import java.util.Collection;

import mini.jee.entities.Group;
import mini.jee.entities.Person;

public interface IDao {
	
	   // r�cup�rer les groupes
	   Collection<Group> findAllGroups() throws SQLException;
	   
	   // r�cup�rer un groupe
	   Group findGroup(int idGroup) throws SQLException;

	   // r�cup�rer les personnes d'un groupe
	   Collection<Person> findAllPersons(int idGroup);
	   
	   // r�cup�rer les personnes 
	   Collection<Person> findAllPersons();

	   // lire une personne
	   Person findPerson(int idPerson);

	   // ajout d'une nouvelle personne
	   Person savePerson(Person p);

	   // ajout d'un nouveau groupe
	   Group saveGroup(Group g);
	   
	   // modification d'une personne
	   Person updatePerson(Person p);

	   // modification d'un groupe
	   Group updateGroup(Group g);
	   
	   // ajout d'une personne
	   Person deletePerson(Person p);

	   // suppression d'un groupe
	   Group deleteGroup(Group g);

}