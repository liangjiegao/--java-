package ���󹤳�ģʽ.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataAccess3 {
	
	private static String path_file_reader 	= "src/���󹤳�ģʽ/part2"; 
	private static String path_class_load 	= "���󹤳�ģʽ.part2"; 

	public static String getDBType() {
		
		Properties properties = new Properties();
		// ʹ��InPutStream����ȡproperties�ļ�
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader( path_file_reader + "/db.properties"));

//			System.out.println(is);
			properties.load(bufferedReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties.getProperty("db");
	}

	public static IUser createUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String db = getDBType();
		
		IUser user = (IUser) Class.forName( path_class_load + "." + db + "User").newInstance();
		
		return user;
	}
	
	public static IDepartment createDepartment() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String db = getDBType();
		
		IDepartment department = (IDepartment) 	Class.forName(path_class_load + "." + db + "Department").newInstance();
		
		return department;
	}
}
