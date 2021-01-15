package com.bitm.SeleniumOnlineProject3.DTO;

public class AssignLeaveDTO {

	private String name;
	private String comments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "AssignLeaveDTO [name=" + name + ", comments=" + comments + "]";
	}
}