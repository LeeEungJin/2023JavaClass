package com.jdbc.service;

import java.util.List;

import com.jdbc.dao.DAO;
import com.jdbc.dao.주문DAO;
import com.jdbc.dto.주문VO;

public class 주문Service implements Service<주문VO>{

	private DAO dao = new 주문DAO();
	public void setDAO(DAO dao) {
		this.dao=dao;
	}
	
	@Override
	public List<주문VO> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public 주문VO detail(String id) throws Exception {
		주문VO 주문 = (주문VO) dao.selectById(id);
		return null;
	}
	
	@Override
	public void regist(주문VO e) throws Exception {
		dao.insert(e);
		
	}
	@Override
	public void modify(주문VO e) throws Exception {
		dao.update(e);
		
	}
	@Override
	public void remove(String id) throws Exception {
		dao.delete(id);
	}
	
	
}
