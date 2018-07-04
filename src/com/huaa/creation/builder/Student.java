package com.huaa.creation.builder;
/**
 * This class defines students info
 * student instance should be created by the Builder
 * 
 * @author Huaa
 * @date 2018-06-09 23:24
 */
public class Student {
	
	private int id;
	private String name;
	private String password;
	private String gender;
	private String address;
	
	private Student() {
	}
	
	private Student(Student origin) {
		this.id = origin.id;
		this.name = origin.name;
		this.password = origin.password;
		this.gender = origin.gender;
		this.address = origin.address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", gender=" + gender + ", address="
				+ address + "]";
	}

	/**
	 * Student instance 通过Student.Builder使用方法链创建
	 */
	public static class Builder {
		private Student target;
		
		public Builder() {
			target = new Student();
		}
		
		public Builder setId(int id) {
			target.id = id;
			return this;
		}
		public Builder setName(String name) {
			target.name =  name;
			return this;
		}
		public Builder setPassword(String password) {
			target.password = password;
			return this;
		}
		public Builder setGender(String gender) {
			target.gender = gender;
			return this;
		}
		public Builder setAddress(String address) {
			target.address = address;
			return this;
		}
		
		public Student build() {
			return new Student(target);
		}
	}

}
