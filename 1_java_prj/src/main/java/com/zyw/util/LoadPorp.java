package com.zyw.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPorp {

	public String getProperty(String key){
		try {
			//文件流
			//this.getClass().getResourceAsStream("/msg.properties");
			InputStream inStream = 
					this.getClass().getClassLoader().getResourceAsStream("msg.properties");
			
			//读取配置文件工具类
			Properties prop = new Properties();
			//加载配置文件
			prop.load(inStream);
			//关闭
			inStream.close();
			//根据key获得value
			return prop.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}
}
