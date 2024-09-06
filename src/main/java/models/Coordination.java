package models;


/**
 * @author karen_fonseca
 * @version 1.0
 * @created 05-sep.-2024 19:06:49
 */

public class Coordination {

	private int code;
	private String name;

	public Coordination(){

	}

	public Coordination(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param int
	 * @param String
	 */
	public void Coordination(int code, String name){

	}
}//end Coordination