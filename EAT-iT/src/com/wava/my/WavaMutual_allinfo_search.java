package com.wava.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB_DAO.DAO;
import DB_VO.MutualVO;

public class WavaMutual_allinfo_search implements WavaIpml {

	@Override
	public void wava(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		DAO mudao3 = null;
		mudao3 = new DAO();
		
		ArrayList<MutualVO> alist3 = null;
		String str = request.getParameter("search");
		alist3 = mudao3.Mutual_allinfo_search(str);
		
		request.setAttribute("alist3", alist3);
	}

	
}
