package com.ap.kl.jobs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.ap.kl.common.FileUtil;
import com.baomidou.framework.mail.MailHelper;
import com.baomidou.framework.quartz.QuartzJobSupport;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * Quartz GetFileJob
 * </p>
 * <p>
 * 继承 QuartzJobSupport
 * </p>
 */
public class GetFileJob extends QuartzJobSupport {

	@Autowired
	protected MailHelper mailHelper;

	private static final Log LOGGER = LogFactory.getLog(GetFileJob.class);

	@Override
	public void innerIter(JobExecutionContext context) {
		// TODO Auto-generated method stub
		LOGGER.debug("------------- GetFileJob START -------------");
		String strPath = null;
		String strPathName = null;
		String path = null;
		String extension = null;
		strPath = "D://201604092302/A.P/File/";
		strPathName = "sys20110915.mdb";
		path = strPath + strPathName;
		LOGGER.debug(path);
		extension = FileUtil.getExtension(strPathName);
		if (extension.equals("mdb")) {
			readFile(path);
		} else if (extension.equals("xml")) {

		} else if (extension.equals("txt")) {

		}
		LOGGER.debug("------------- GetFileJob END -------------");
//		Map<String, Object> obj = new HashMap<String, Object>();
//		obj.put("email","905384774@qq.com");
//		obj.put("loginName", "AP_Admin");
//		boolean rlt = mailHelper.sendMail("905384774@qq.com","AP_KL 测试邮件！", "/mail/tplSend.html", obj);
//		if(rlt){
//			LOGGER.debug("------------- 发送邮件成功发送至【"+ "905384774@qq.com" +"】-------------");
//		}else{
//			LOGGER.debug("------------- 发送邮件 失败-------------");
//		}
	}

	public static void readFile(String path) {
		List<Map> list = readFileACCESS(path);
		for (int i = 0; i < list.size(); i++) {
			Map map = list.get(i);
			Set set = map.keySet();
			Iterator it = set.iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				String value = (String) map.get(key);
				System.out.println(key + ":" + value);
				LOGGER.debug(i + ": " + key + ":" + value);
			}
		}
	}

	/**
	 * TODO : 读取文件access
	 * 
	 * @param filePath
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static List<Map> readFileACCESS(String filePath) {
		List<Map> maplist = new ArrayList();
		Properties prop = new Properties();
		prop.put("charSet", "gb2312"); // 这里是解决中文乱码
		prop.put("user", "");
		prop.put("password", "");
		String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="
				+ filePath; // 文件地址
		PreparedStatement ps = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(url, prop);
			stmt = (Statement) conn.createStatement();

			rs = stmt.executeQuery("select * from DATA_COUNTER");
			ResultSetMetaData data = rs.getMetaData();

			while (rs.next()) {
				Map map = new HashMap();
				for (int i = 1; i <= data.getColumnCount(); i++) {
					String columnName = data.getColumnName(i); // 列名
					String columnValue = rs.getString(i);
					map.put(columnName, columnValue);
				}
				maplist.add(map);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maplist;
	}

	/**
	 * TODO 获取根目录
	 * 
	 * @return
	 * @author <a href="mailto:pheh.lin@gmail.com">PHeH</a><br>
	 *         Created On 2007-5-10 15:16:21
	 */
	public static String getRootPath() {
		// 因为类名为"Application"，因此" Application.class"一定能找到
		String result = GetFileJob.class.getResource("GetFileJob.class")
				.toString();
		int index = result.indexOf("WEB-INF");
		if (index == -1) {
			index = result.indexOf("bin");
		}
		result = result.substring(0, index);
		if (result.startsWith("jar")) {
			// 当class文件在jar文件中时，返回"jar:file:/F:/ ..."样的路径
			result = result.substring(10);
		} else if (result.startsWith("file")) {
			// 当class文件在class文件中时，返回"file:/F:/ ..."样的路径
			result = result.substring(6);
		}
		if (result.endsWith("/"))
			result = result.substring(0, result.length() - 1);// 不包含最后的"/"
		return result;
	}
}