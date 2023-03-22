package PharmacityWeb.Entity;

public class Categorys {
	private int id;
	private String name;
	private String description;
	private int id_menu;
	
	public Categorys() {
		super();
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getId_menu() {
		return id_menu;
	}

	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	
}
