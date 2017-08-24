package com.ap.kl.common;

import com.baomidou.kisso.common.util.EnvUtil;
import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;

/**
 * 
 * 自动生成映射工具类
 * 
 * @author hubin
 *
 */
public class AutoGeneratorHelper {

	/**
	 * 
	 * 测试 run 执行
	 * 
	 * <p>
	 * 配置方法查看 {@link ConfigGenerator}
	 * </p>
	 * 
	 */
	public static void main( String[] args ) {
		ConfigGenerator cg = new ConfigGenerator();
		cg.setEntityPackage("com.ap.kl.entity");
		cg.setMapperPackage("com.ap.kl.mapper");
		cg.setServicePackage("com.ap.kl.service");
		cg.setSuperServiceImpl("com.ap.kl.service.support.BaseServiceImpl");
		cg.setIdType(IdType.ID_WORKER);
		if (EnvUtil.isLinux()) {
			cg.setSaveDir("/Users/hubin/springwind/");
		} else {
			cg.setSaveDir("D:/ap_KL/");
		}
		cg.setDbDriverName("com.mysql.jdbc.Driver");
		cg.setDbUser("admin");
		cg.setDbPassword("ap.com");
		cg.setDbUrl("jdbc:mysql://apkl-jasonshen0515.tenxapp.com:21663/sendData?useUnicode=true&characterEncoding=utf8");
		cg.setDbPrefix(false);
		AutoGenerator.run(cg);
	}
	
}
