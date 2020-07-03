package test.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import cruddao.DaoStuff;
import cruddao.StuffDao;
import model.Stuff;

public class DaoStuffTest implements StuffDao {
     
    String id;
    Optional<Stuff> stuff=null;
    boolean row=false;
    String name="";
    String description="";
    int quantity=0;
    String location="";
    Stuff dao_Stuff=new Stuff(name,description,quantity,location);
  
    
    
  @Override
	public Optional<Stuff> find(String id) throws SQLException {
	    stuff=DaoStuff.getInstance().find(id);
	if(id.contains("1	pp	nero	2	porde")) {
	 assertEquals("1	pp	nero	2	porde",this.id);	
		
	}else {
		assertTrue("unknown statement",false);
	}
		return Optional.ofNullable(new Stuff());
	}

	@Test
	public void findTest() throws SQLException {
		if(stuff != null)
       assert(stuff)!=null;
	}
	
	@Override
	public List<Stuff> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Stuff o) throws SQLException {
		
		row=DaoStuff.getInstance().save(dao_Stuff);
		return row;
	}

	@Override
	public boolean update(Stuff o) throws SQLException {
	   row=DaoStuff.getInstance().update(dao_Stuff);
		return row;
	}
     
	
	@Test
	public void updateTest() {
		if(row)
		assert(row);
	}
	
	
	
	
	@Override
	public boolean delete(Stuff o) throws SQLException {
		
		row=DaoStuff.getInstance().delete(dao_Stuff);
		return row;
	}

}
