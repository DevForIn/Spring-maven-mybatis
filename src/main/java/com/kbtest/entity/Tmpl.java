package com.kbtest.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Tmpl {
	private int tmplNum;
	private String tmplName;
	private String insId;
	private Date insDate;
	private String updId;
	private Date updDate;
}
