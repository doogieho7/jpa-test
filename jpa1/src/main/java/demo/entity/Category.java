package demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	private String name;	
	private String shotName;
	
	public Category() {}	

	public Category(String name, String shotName) {
		this.name = name;
		this.shotName = shotName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShotName() {
		return shotName;
	}

	public void setShotName(String shotName) {
		this.shotName = shotName;
	}

	@Override
	public String toString() {
		return "[" + id + "] name = " + name + ", shortName = " + shotName;
	}
}
