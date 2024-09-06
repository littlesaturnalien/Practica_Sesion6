package models;


/**
 * @author karen_fonseca
 * @version 1.0
 * @created 05-sep.-2024 19:06:53
 */
public class Teacher {

	private String lastNames;
	private String id;
	private String names;
	private String title;
	public Coordination m_Coordination;

	public Teacher(){

	}

	public Teacher(String lastNames, String id, String names, String title, Coordination m_Coordination) {
		this.lastNames = lastNames;
		this.id = id;
		this.names = names;
		this.title = title;
		this.m_Coordination = m_Coordination;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Coordination getM_Coordination() {
		return m_Coordination;
	}

	public void setM_Coordination(Coordination m_Coordination) {
		this.m_Coordination = m_Coordination;
	}

	public Coordination getCoordination(){
		return null;
	}

	/**
	 * 
	 * @param Coordination
	 */
	public void setCoordination(Coordination Coordination){

	}
}//end Teacher