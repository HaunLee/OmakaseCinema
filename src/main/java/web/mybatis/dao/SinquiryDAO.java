package web.mybatis.dao;

import java.io.PrintWriter;
import java.util.HashMap;


import org.apache.ibatis.session.SqlSession;
import javax.servlet.http.HttpServletResponse; 

import web.mybatis.service.FactoryService;

public class SinquiryDAO {
	
	public static int add(int u_code,
			String iq_title,String iq_content) {
		
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("u_code",u_code);
		map.put("iq_title",iq_title);
		map.put("iq_content",iq_content);
		
		SqlSession ss = FactoryService.getFactory().openSession();

		int cnt = ss.insert("inquiry.add", map);
		if(cnt > 0)
			ss.commit();
		else
			ss.rollback();
		
		ss.close();
		return cnt;
	}

}
