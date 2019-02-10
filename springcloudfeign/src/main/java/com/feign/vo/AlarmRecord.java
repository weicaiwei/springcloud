package com.feign.vo;


public class AlarmRecord {
    private String ip;
    private String isAlarm;
    private String alarmTime;
    private String alarmType;
    
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getIsAlarm() {
        return isAlarm;
    }
    public void setIsAlarm(String isAlarm) {
        this.isAlarm = isAlarm;
    }
    public String getAlarmTime() {
        return alarmTime;
    }
    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }
    public String getAlarmType() {
        return alarmType;
    }
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }
    @Override
    public String toString() {
        return "BJStatus [ip=" + ip + ", isAlarm=" + isAlarm + ", alarmTime=" + alarmTime + ", alarmType=" + alarmType
                + "]";
    }

}
