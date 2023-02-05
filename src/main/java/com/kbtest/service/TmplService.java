package com.kbtest.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kbtest.dao.TmplDao;


@Service("TmplService")
public class TmplService {

	
	@Resource(name="TmplDao")
	private TmplDao tmplDao;
	
	public List<Map<String, Object>> getTmpl(int tmplNum) {
		return tmplDao.getTmpl(tmplNum);
	}

}
