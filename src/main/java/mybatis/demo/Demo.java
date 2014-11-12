package mybatis.demo;

import mybatis.weibo.dao.WeiboMapper;
import mybatis.weibosina.Weibo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Demo {

	private static SqlSessionFactory getSessionFactory() {
		SqlSessionFactory sqlSessionFactory = null;
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("mybatis-weibo-config.xml"));
		return sqlSessionFactory;
	}

	public static void main(String[] args) {

		SqlSession sqlSession = getSessionFactory().openSession();
		try {
			WeiboMapper weiboMapper = sqlSession.getMapper(WeiboMapper.class);
			Weibo weibo = new Weibo("weibo", "112", 56, 74, 5, " text", 34, "14", 4, false, "http:");
			weiboMapper.insertWeiboData(weibo);
			System.out.println("insert succeed!");
			System.out.println(weiboMapper.getCount());
			
		} finally {
			sqlSession.close();
		}
	}

}
