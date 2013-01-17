package entity;

import java.util.List;


/**
 * 
 * This entity can be used as the root model of the edit part
 *
 */
public class Refinery {
  
	private List<Pipeline> pipelines;
	
	private List<Device> devices;

	public List<Pipeline> getPipelines() {
		return pipelines;
	}

	public void setPipelines(List<Pipeline> pipelines) {
		this.pipelines = pipelines;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
}
