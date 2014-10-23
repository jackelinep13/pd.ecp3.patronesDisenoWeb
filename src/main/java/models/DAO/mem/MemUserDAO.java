package models.DAO.mem;

import models.DAO.UserDAO;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO{

	@Override
	public void create(User entity) {
		// TODO Auto-generated method stub
		super.create(entity);
	}

	@Override
	public User read(Integer id) {
		// TODO Auto-generated method stub
		return super.read(id);
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public void deleteByID(Integer id) {
		// TODO Auto-generated method stub
		super.deleteByID(id);
	}

	
}
