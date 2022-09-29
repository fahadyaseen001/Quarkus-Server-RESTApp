package org.acme;

import javax.enterprise.context.RequestScoped;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;


public class senderDTO {
    
    @RequestScoped
    
    @QueryParam
    String id;
    @QueryParam
    String name;
    @QueryParam
    String reg_no;
    
    @Override
    public String toString() {
        return "senderDTO [id=" + id + ", name=" + name + ", reg_no=" + reg_no + "]";
    }
    public senderDTO(String id, String name, String reg_no) {
        this.id = id;
        this.name = name;
        this.reg_no = reg_no;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getReg_no() {
        return reg_no;
    }
    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }
    
    public senderDTO(){}
}
