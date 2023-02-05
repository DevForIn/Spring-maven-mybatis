package com.kbtest.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class TmplHist {
	private int tmplHistNum;
	private int tmplNum;
	private String insId;
	private Date insDate;
	private String updId;
	private Date updDate;
}
