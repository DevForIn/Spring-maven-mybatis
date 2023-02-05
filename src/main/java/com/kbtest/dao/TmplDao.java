package com.kbtest.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("TmplDao")
public class TmplDao {

	@Resource(name="Session")
	private SqlSession session;
	
	public List<Map<String, Object>> getTmpl(int tmplNum) {
		return session.selectList("tmplService.getTmpl", tmplNum);
	}

	public List<Map<String,Object>> getSpchList() {
		return session.selectList("tmplService.getSpchList", null);
	}
}
