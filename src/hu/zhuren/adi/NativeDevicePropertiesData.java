/**
 * 
 */
package hu.zhuren.adi;

/**
 * @author bobhu
 * 
 */
public class NativeDevicePropertiesData {
	private String configKey;
	private String value;
	private String label;

	public NativeDevicePropertiesData(String configKey, String label) {
		this.configKey = configKey;
		this.label = label;
	}

	public String getConfigKey() {
		return configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
