package com.smtr.recipe;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.smtr.ganre.GanreVO;

public class RecipeDAO {

	private SqlSession sqlSession;
	
	public RecipeDAO(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	
	public List<String> ganreList() {
		return sqlSession.selectList("recipe.ganreTotal");
	}
}
