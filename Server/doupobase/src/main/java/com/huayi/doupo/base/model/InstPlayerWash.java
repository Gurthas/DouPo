package com.huayi.doupo.base.model;

import java.io.*;

/**
	玩家装备洗练存储实例表
*/
@SuppressWarnings("serial")
public class InstPlayerWash implements Serializable
{
	private int index;
	public String result = "";
	/**
		编号
	*/
	private int id;
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
		index = 1;
		result += index + "*int*" + id + "#";
	}

	public void setId(int id, int bs) {
		this.id = id;
	}

	/**
		玩家实例Id
	*/
	private int instPlayerId;
	public int getInstPlayerId(){
		return instPlayerId;
	}
	public void setInstPlayerId(int instPlayerId) {
		this.instPlayerId = instPlayerId;
		index = 2;
		result += index + "*int*" + instPlayerId + "#";
	}

	public void setInstPlayerId(int instPlayerId, int bs) {
		this.instPlayerId = instPlayerId;
	}

	/**
		装备实例Id
	*/
	private int instPlayerEquipId;
	public int getInstPlayerEquipId(){
		return instPlayerEquipId;
	}
	public void setInstPlayerEquipId(int instPlayerEquipId) {
		this.instPlayerEquipId = instPlayerEquipId;
		index = 3;
		result += index + "*int*" + instPlayerEquipId + "#";
	}

	public void setInstPlayerEquipId(int instPlayerEquipId, int bs) {
		this.instPlayerEquipId = instPlayerEquipId;
	}

	/**
		战斗属性Id
	*/
	private int fightPropId;
	public int getFightPropId(){
		return fightPropId;
	}
	public void setFightPropId(int fightPropId) {
		this.fightPropId = fightPropId;
		index = 4;
		result += index + "*int*" + fightPropId + "#";
	}

	public void setFightPropId(int fightPropId, int bs) {
		this.fightPropId = fightPropId;
	}

	/**
		洗练字典Id
	*/
	private int equipWashId;
	public int getEquipWashId(){
		return equipWashId;
	}
	public void setEquipWashId(int equipWashId) {
		this.equipWashId = equipWashId;
		index = 5;
		result += index + "*int*" + equipWashId + "#";
	}

	public void setEquipWashId(int equipWashId, int bs) {
		this.equipWashId = equipWashId;
	}

	/**
		版本号
	*/
	private int version;
	public int getVersion(){
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
		index = 6;
		result += index + "*int*" + version + "#";
	}

	public void setVersion(int version, int bs) {
		this.version = version;
	}

	/**
		添加时间
	*/
	private String insertTime;
	public String getInsertTime(){
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
		index = 7;
		result += index + "*String*" + insertTime + "#";
	}

	public void setInsertTime(String insertTime, int bs) {
		this.insertTime = insertTime;
	}

	/**
		更新时间
	*/
	private String updateTime;
	public String getUpdateTime(){
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
		index = 8;
		result += index + "*String*" + updateTime + "#";
	}

	public void setUpdateTime(String updateTime, int bs) {
		this.updateTime = updateTime;
	}

	public String getResult(){
		return result;
	}

	public InstPlayerWash clone(){
		InstPlayerWash extend=new InstPlayerWash();
		extend.setId(this.id);
		extend.setInstPlayerId(this.instPlayerId);
		extend.setInstPlayerEquipId(this.instPlayerEquipId);
		extend.setFightPropId(this.fightPropId);
		extend.setEquipWashId(this.equipWashId);
		extend.setVersion(this.version);
		extend.setInsertTime(this.insertTime);
		extend.setUpdateTime(this.updateTime);
		return extend;
	}
}
