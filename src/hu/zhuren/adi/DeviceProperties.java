/**
 * 
 */
package hu.zhuren.adi;

import java.util.ArrayList;

/**
 * @author bobhu
 *
 */
public class DeviceProperties {
	public static NativeDevicePropertiesData OS_NAME 			= new NativeDevicePropertiesData("net.bt.name", "OS_NAME");
	public static NativeDevicePropertiesData OS_VERSION 		= new NativeDevicePropertiesData("ro.build.version.release", "OS_VERSION");
	public static NativeDevicePropertiesData OS_BUILD 		= new NativeDevicePropertiesData("ro.build.display.id", "OS_BUILD");
	public static NativeDevicePropertiesData OS_SDK_VERSION 		= new NativeDevicePropertiesData("ro.build.version.sdk", "OS_SDK_VERSION");
	public static NativeDevicePropertiesData OS_SDK_DESCRIPTION 	= new NativeDevicePropertiesData("ro.build.description", "OS_SDK_DESCRIPTION");
	public static NativeDevicePropertiesData PRODUCT_MODEL 		= new NativeDevicePropertiesData("ro.product.model", "PRODUCT_MODEL");
	public static NativeDevicePropertiesData PRODUCT_BRAND 		= new NativeDevicePropertiesData("ro.product.brand", "PRODUCT_BRAND");
	public static NativeDevicePropertiesData PRODUCT_NAME 		= new NativeDevicePropertiesData("ro.product.name", "PRODUCT_NAME");
	public static NativeDevicePropertiesData PRODUCT_VERSION 		= new NativeDevicePropertiesData("ro.product.version", "PRODUCT_VERSION");
	public static NativeDevicePropertiesData PRODUCT_BOARD 		= new NativeDevicePropertiesData("ro.product.board", "PRODUCT_BOARD");
	public static NativeDevicePropertiesData PRODUCT_CPU 		= new NativeDevicePropertiesData("ro.product.cpu.abi", "PRODUCT_CPU");
	public static NativeDevicePropertiesData PRODUCT_MANUFACTURER 	= new NativeDevicePropertiesData("ro.product.manufacturer", "PRODUCT_MANUFACTURER");
	public static NativeDevicePropertiesData OPENGLES_VERSION 	= new NativeDevicePropertiesData("ro.opengles.version", "OPENGLES_VERSION");
	public static NativeDevicePropertiesData LCD_DENSITY 		= new NativeDevicePropertiesData("ro.sf.lcd_density", "LCD_DENSITY");
	public static NativeDevicePropertiesData DALVIK_HEAPSIZE 		= new NativeDevicePropertiesData("dalvik.vm.heapsize", "DALVIK_HEAPSIZE");
	
//	public static HashMap<String, NativeDevicePropertiesData> DEVICE_PROPERTIES = new HashMap<String, NativeDevicePropertiesData>();
	public static ArrayList<NativeDevicePropertiesData> DEVICE_PROPERTIES = new ArrayList<NativeDevicePropertiesData>();
	static{
//		DEVICE_PROPERTIES.put("OS_NAME", OS_NAME);
//		DEVICE_PROPERTIES.put("OS_VERSION", OS_VERSION);
//		DEVICE_PROPERTIES.put("OS_BUILD", OS_BUILD);
//		DEVICE_PROPERTIES.put("OS_SDK_VERSION", OS_SDK_VERSION);
//		DEVICE_PROPERTIES.put("OS_SDK_DESCRIPTION", OS_SDK_DESCRIPTION);
//		DEVICE_PROPERTIES.put("PRODUCT_MODEL", PRODUCT_MODEL);
//		DEVICE_PROPERTIES.put("PRODUCT_BRAND", PRODUCT_BRAND);
//		DEVICE_PROPERTIES.put("PRODUCT_NAME", PRODUCT_NAME);
//		DEVICE_PROPERTIES.put("PRODUCT_VERSION", PRODUCT_VERSION);
//		DEVICE_PROPERTIES.put("PRODUCT_BOARD", PRODUCT_BOARD);
//		DEVICE_PROPERTIES.put("PRODUCT_CPU", PRODUCT_CPU);
//		DEVICE_PROPERTIES.put("PRODUCT_MANUFACTURER", PRODUCT_MANUFACTURER);
//		DEVICE_PROPERTIES.put("LCD_DENSITY", LCD_DENSITY);
//		DEVICE_PROPERTIES.put("OPENGLES_VERSION", OPENGLES_VERSION);
//		DEVICE_PROPERTIES.put("DALVIK_HEAPSIZE", DALVIK_HEAPSIZE);
		//
		DEVICE_PROPERTIES.add(OS_NAME);
		DEVICE_PROPERTIES.add(OS_VERSION);
		DEVICE_PROPERTIES.add(OS_BUILD);
		DEVICE_PROPERTIES.add(OS_SDK_VERSION);
		DEVICE_PROPERTIES.add(OS_SDK_DESCRIPTION);
		DEVICE_PROPERTIES.add(PRODUCT_MODEL);
		DEVICE_PROPERTIES.add(PRODUCT_BRAND);
		DEVICE_PROPERTIES.add(PRODUCT_NAME);
		DEVICE_PROPERTIES.add(PRODUCT_VERSION);
		DEVICE_PROPERTIES.add(PRODUCT_BOARD);
		DEVICE_PROPERTIES.add(PRODUCT_CPU);
		DEVICE_PROPERTIES.add(PRODUCT_MANUFACTURER);
		DEVICE_PROPERTIES.add(LCD_DENSITY);
		DEVICE_PROPERTIES.add(OPENGLES_VERSION);
		DEVICE_PROPERTIES.add(DALVIK_HEAPSIZE);
	}
}
