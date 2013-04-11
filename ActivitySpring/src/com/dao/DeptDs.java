package com.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class DeptDs {
	
	@Autowired
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

}
