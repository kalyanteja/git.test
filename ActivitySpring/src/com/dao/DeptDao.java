package com.dao;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Dept;
public class DeptDao {
	
	public void insertRecord(Dept obj,DataSource ds) throws SQLException
	{
		JdbcTemplate t = new JdbcTemplate(ds);
		t.execute("insert into dept values("+obj.getDeptNo()+",'"+obj.getDeptName()+"','"+obj.getLoc()+"')");
	}
}