/**
 * @Project: jpa
 * @Title: Person.java
 * @Package com.bean
 * @author yongzhian
 * @date 2014-10-30 下午2:20:23
 * @Copyright: 2014 www.yineng.com.cn Inc. All rights reserved.
 * @version V1.0
 */
package jpa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Person
 * @Description 模块描述
 * @author yongzhian
 * @Date 2014-10-30
 */
@Entity
@Table(name="user_baseinfo")
public class Person {

	@Id
	@Column(name = "info_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "info_name")
	private String name;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id 要设置的 id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
