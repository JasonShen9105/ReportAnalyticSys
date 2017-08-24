package com.ap.kl.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.framework.common.util.DateUtil;
import com.baomidou.framework.upload.UploadFile;
import com.baomidou.framework.upload.UploadMsg;
import com.baomidou.framework.upload.UploadMultipartRequest;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Permission;
import com.sun.org.apache.xerces.internal.util.URI;
//import com.sun.tools.javac.code.Attribute.Constant;

/**
 * <p>
 * 上传服务
 * </p>
 * <p>
 * 头像上传控件：<br>
 * http://www.fullavatareditor.com/index.html
 * </p>
 * 
 * @author hubin
 * @Date 2016-04-13
 */
@Controller
@RequestMapping("/sys/upload")
public class UploadController extends BaseController {

	/* 限制最大上传 3M */
	private final static int MAX_POST_SIZE = 3 * 1024 * 1024;


	/**
	 * <p>
	 * 上传文件<br>  该演示 demo 上传后的文件保存在当前项目的根目录下
	 * </p>
	 */
	@ResponseBody
	@Permission(action = Action.Skip)
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	public String file(HttpServletRequest request,
			HttpServletResponse response) {
		UploadMsg msg = new UploadMsg();
		try {
			String path = request.getContextPath();
			//String absPath=new java.io.File(application.getRealPath(request.getRequestURI())).getParent();
			
			UploadMultipartRequest umr = new UploadMultipartRequest(request, getSaveDir(), MAX_POST_SIZE);
			umr.setFileHeaderExts("ffd8ff.jpg");
			umr.upload();
			Enumeration<?> files = umr.getFileNames();
			while ( files.hasMoreElements() ) {
				String name = (String) files.nextElement();
				UploadFile cf = umr.getUploadFile(name);
				if ( cf != null ) {
					/**
					 * 上传成功
					 */
					if ( cf.isSuccess() ) {
						msg.setSuccess(true);
						msg.setUrl(cf.getFileUrl());
						msg.setSize(cf.getSize());
						System.err.println("上传文件地址：" + msg.getUrl());
					}
					msg.setMsg(cf.getUploadCode().desc());
				}
			}
		} catch ( IOException e ) {
			logger.error("uploadFile error. ", e);
		}
		return toJson(msg);
	}

	/**
	 * <p>
	 * 上传文件存放目录
	 * </p>
	 */
	private static String getSaveDir() {
		/*java.home :C:\Program Files (x86)\Java\jdk1.6.0_39\jre
		java.class.version :50.0
		java.class.path: D:\WorkFile\Third\Soft\apache-tomcat-7.0.67-windows-x86\apache-tomcat-7.0.67\bin\bootstrap.jar;D:\WorkFile\Third\Soft\apache-tomcat-7.0.67-windows-x86\apache-tomcat-7.0.67\bin\tomcat-juli.jar;C:\Program Files (x86)\Java\jdk1.6.0_39\lib\tools.jar
		java.library.path :C:\Program Files (x86)\Java\jdk1.6.0_39\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Program Files (x86)/Java/jdk1.6.0_39/bin/../jre/bin/client;C:/Program Files (x86)/Java/jdk1.6.0_39/bin/../jre/bin;C:/Program Files (x86)/Java/jdk1.6.0_39/bin/../jre/lib/i386;D:\Program Files (x86)\Git\cmd;D:\Program Files (x86)\Git\bin;D:\Program Files (x86)\GitExtensions\;C:\Program Files\TortoiseSVN\bin;C:\Program Files (x86)\VisualSVN\bin;C:\Program Files (x86)\Java\jdk1.6.0_39\bin;C:\Program Files (x86)\Java\jdk1.6.0_39\jre\bin;C:\Users\Jason\AppData\Roaming\npm;D:\WorkFile\20151108\soft\eclipse-jee-luna-SR2-win32\eclipse;;.
		java.io.tmpdir :C:\Users\Jason\AppData\Local\Temp\
		java.compiler :null
		java.ext.dirs :C:\Program Files (x86)\Java\jdk1.6.0_39\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
		user.name : Jason
		user.home :C:\Users\Jason
		user.dir :D:\WorkFile\20151108\soft\eclipse-jee-luna-SR2-win32\eclipse*/
		/*System.out.println("java.home :"+System.getProperty("java.home"));
        System.out.println("java.class.version :"+System.getProperty("java.class.version"));
         System.out.println("java.class.path: "+System.getProperty("java.class.path"));
        System.out.println("java.library.path :"+System.getProperty("java.library.path"));
        System.out.println("java.io.tmpdir :"+System.getProperty("java.io.tmpdir"));
        System.out.println("java.compiler :"+System.getProperty("java.compiler"));
        System.out.println("java.ext.dirs :"+System.getProperty("java.ext.dirs"));
        System.out.println("user.name : "+System.getProperty("user.name"));
        System.out.println("user.home :"+System.getProperty("user.home"));
        System.out.println("user.dir :"+System.getProperty("user.dir"));
        System.out.println("===================");

        System.out.println("=========================");*/
     
		StringBuffer filePath = new StringBuffer(System.getProperty("user.dir"));
		filePath.append(File.separator);
		filePath.append(DateUtil.format(new Date(), "yyyyMMdd"));
		filePath.append(File.separator);
		File file = new File(filePath.toString());
		if ( !file.exists() ) {
			file.mkdirs();
		}
		return file.getPath();
	}

}
