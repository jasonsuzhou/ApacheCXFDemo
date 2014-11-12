package com.mh.cxf.day1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "IntegerUserMap")
@XmlType(name = "IntegerUserMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntegerUserMap {
	@XmlElement(nillable = false, name = "entry")
	List<IntegerUserEntry> entries = new ArrayList<IntegerUserEntry>();

	public List<IntegerUserEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<IntegerUserEntry> entries) {
		this.entries = entries;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "IdentifiedUser")
	static class IntegerUserEntry {
		@XmlElement(required = true, nillable = false)
		Integer id;

		User user;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

	}

}
