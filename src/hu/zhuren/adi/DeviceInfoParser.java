/**
 * 
 */
package hu.zhuren.adi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import android.util.Log;

/**
 * @author bobhu
 * 
 */
public class DeviceInfoParser {
	private static final String PROP_FILE_ON_DEVICE = "/system/build.prop";
	private boolean DEBUG = true;
	public void parse() {
		File file = new File(PROP_FILE_ON_DEVICE);
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader inputreader = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(inputreader);
			String line;
			while ((line = reader.readLine()) != null) {
				if (line != "") { // empty line
					if (!line.contains("#")) {
						for (int j = 0; j < DeviceProperties.DEVICE_PROPERTIES.size(); j++) {
							if (line.contains(DeviceProperties.DEVICE_PROPERTIES.get(j).getConfigKey())) {
								String[] values = line.split("=");
								DeviceProperties.DEVICE_PROPERTIES.get(j).setValue(values.length>1?values[1]:"");
								if(DEBUG){
									Log.d("hu.zhuren.adi","label="+ DeviceProperties.DEVICE_PROPERTIES.get(j).getLabel() +" value=" +DeviceProperties.DEVICE_PROPERTIES.get(j).getLabel());
								}
								break;
							}
						}
					}
				}
			}
			reader.close();
			inputreader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setDebug(boolean b){
		DEBUG = b;
	}
	
	public boolean getDebug(){
		return DEBUG;
	}
}
