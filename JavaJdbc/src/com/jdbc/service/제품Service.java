package com.jdbc.service;

import java.util.List;

import com.jdbc.dao.DAO;
import com.jdbc.dao.제품DAO;
import com.jdbc.dto.제품VO;

public class 제품Service implements Service<제품VO>{
	
	private DAO dao = new 제품DAO();
	public void setDAO(DAO dao) {
		this.dao=dao;
	}
	
	@Override
	public List<제품VO> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public 제품VO detail(String id) throws Exception {
		제품VO 제품 = (제품VO) dao.selectById(id);
		return null;
	}
	
	@Override
	public void regist(제품VO e) throws Exception{
		dao.insert(e);
	}
	
	@Override
	public void modify(제품VO e) throws Exception {
		dao.update(e);
	}
	
	@Override
	public void remove(String id)  throws Exception{
		dao.delete(id);
	}

	

}