package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Device implements Serializable{
	
	private static final long serialVersionUID = -1371570123738624280L;
	
	private String id;
	
	private String name;
	
	private int device_no;
	
	private Set<Port> ports =new HashSet<Port>(); 
	
	public Device() {
	
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDevice_no() {
		return device_no;
	}

	public void setDevice_no(int device_no) {
		this.device_no = device_no;
	}

	public Set<Port> getPorts() {
		return ports;
	}

	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
