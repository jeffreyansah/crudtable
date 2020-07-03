package test;

import java.sql.Connection;

import org.junit.Test;

import cruddao.DataSourceFactory;

public class DatabaseTest {
 Connection conn = null;

 @Test
 public void testConnection() {
	conn=DataSourceFactory.getInstance().getOracleDBConnection();
	if(conn != null)
		assert(conn)!=null;
 }
 
	
}
