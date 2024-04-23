package com.example.jwt.payloads.responses;

public class Response {
    private Integer status;
    private String message;
    private Object data;

    // Constructor
    public Response() {
    }

    public Response(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getter and Setter
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}