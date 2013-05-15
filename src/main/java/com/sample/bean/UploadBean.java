package com.sample.bean;

import org.primefaces.event.FileUploadEvent;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SessionScoped
@ManagedBean(name = "upload")
public class UploadBean {

    public void handleFileUpload(FileUploadEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("File " + event.getFile().getFileName() + " updloaded."));
    }
}
