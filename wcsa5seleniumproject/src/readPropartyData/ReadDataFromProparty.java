package readPropartyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ReadDataFromProparty 
{

	public static void main(String[] args) throws IOException
	{
	    // Read the Data from config.proparties file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		//create a obj of properties class 
		Properties pro = new Properties();
		//make a file ready to read
		pro.load(fis);
		//Read the perticular proparties from file
		String data = pro.getProperty("UserName");
		System.out.println(data);
	

	}

}
