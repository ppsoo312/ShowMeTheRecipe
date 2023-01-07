package com.smtr.division;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class DivisionDAO {

	private SqlSession sqlSession;
	
	public DivisionDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<String> ganreList() {
		return sqlSession.selectList("recipe.ganreTotal");
	}
	public List<String> ingredientList() {
		return sqlSession.selectList("recipe.ingredientTotal");
	}
	public List<String> situationList() {
		return sqlSession.selectList("recipe.situationTotal");
	}
	public List<String> cookeryList() {
		return sqlSession.selectList("recipe.cookeryTotal");
	}
}
