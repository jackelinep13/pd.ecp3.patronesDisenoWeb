package models.DAO;

public abstract class DAOFactory {

	private static DAOFactory factory;

	protected DAOFactory() {
	}

	public DAOFactory getFactory() {
		return factory;
	}

	public abstract UserDAO getUserDAO();
	public abstract RoundDAO getRoundDAO();
	
	
	
}
