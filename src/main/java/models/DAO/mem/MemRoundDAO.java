package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements RoundDAO{

	@Override
	public void create(Round entity) {
		// TODO Auto-generated method stub
		super.create(entity);
	}

	@Override
	public Round read(Integer id) {
		// TODO Auto-generated method stub
		return super.read(id);
	}

	@Override
	public void update(Round entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void delete(Round entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public void deleteByID(Integer id) {
		// TODO Auto-generated method stub
		super.deleteByID(id);
	}

	
}
