package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springjdbc.entity.Eproduct;

@Repository
public class EproductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Eproduct> getProduct() {
		
		List<Eproduct> products = jdbcTemplate.query("select * from eproduct", new RowMapper<Eproduct>() {

			@Override
			public Eproduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				Eproduct product = new Eproduct();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				return product;
			}
			
		});
		
		return products;
	}

}
