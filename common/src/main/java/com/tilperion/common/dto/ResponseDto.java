package com.tilperion.common.dto;

public class ResponseDto {

    private String result;
    private String time;


    public ResponseDto() {
    }

    public ResponseDto(String result, String time) {
        this.result = result;
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
