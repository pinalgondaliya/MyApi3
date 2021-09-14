package com.oscar.career.myapi3.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class loginMainResponse {
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("data")
    @Expose
    private loginResponse data;
    @SerializedName("hasErrors")
    @Expose
    private Boolean hasErrors;

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public loginResponse getData() {
        return data;
    }

    public void setData(loginResponse data) {
        this.data = data;
    }

    public Boolean getHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

}
