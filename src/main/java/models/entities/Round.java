package models.entities;

public class Round {

	private int id;
	private String nameRound;
	private int points;
	private User user;
	
	public Round(int id, String nameRound, int points, User user) {
		super();
		this.id = id;
		this.nameRound = nameRound;
		this.points = points;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameRound() {
		return nameRound;
	}

	public void setNameRound(String nameRound) {
		this.nameRound = nameRound;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
