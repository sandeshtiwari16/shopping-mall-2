package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Items {
    private Integer id;
    private String item_name;
    private String price_;
    private String mdate_;
    private String edate_;
    private String category_;
    
    
    public Items() {}


	public Items(Integer id, String item_name, String price_, String mdate_, String edate_, String category_) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.price_ = price_;
		this.mdate_ = mdate_;
		this.edate_ = edate_;
		this.category_ = category_;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getPrice_() {
		return price_;
	}


	public void setPrice_(String price_) {
		this.price_ = price_;
	}


	public String getMdate_() {
		return mdate_;
	}


	public void setMdate_(String mdate_) {
		this.mdate_ = mdate_;
	}


	public String getEdate_() {
		return edate_;
	}


	public void setEdate_(String edate_) {
		this.edate_ = edate_;
	}


	public String getCategory_() {
		return category_;
	}


	public void setCategory_(String category_) {
		this.category_ = category_;
	}


	@Override
	public String toString() {
		return "Items [id=" + id + ", item_name=" + item_name + ", price_=" + price_ + ", mdate_=" + mdate_
				+ ", edate_=" + edate_ + ", category_=" + category_ + "]";
	}
    
	
	

}