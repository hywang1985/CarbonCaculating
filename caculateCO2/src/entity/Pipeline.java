package entity;

import java.io.Serializable;

public class Pipeline implements Serializable{
	
	private static final long serialVersionUID = -6887435836160605321L;

	private double loss_m;//loss quantity of materials;
	
	private double loss_q;//loss quatity of heat;
	
	private Port source; //source port of the pipeline
	
	private Port target; //target port of the pipeline

	public Pipeline() {
		
	}

	public Port getSource() {
		return source;
	}

	public void setSource(Port source) {
		this.source = source;
	}

	public Port getTarget() {
		return target;
	}

	public void setTarget(Port target) {
		this.target = target;
	}


	
	public double getLoss_m() {
		return loss_m;
	}

	public void setLoss_m(double loss_m) {
		this.loss_m = loss_m;
	}

	public double getLoss_q() {
		return loss_q;
	}

	public void setLoss_q(double loss_q) {
		this.loss_q = loss_q;
	}
}
