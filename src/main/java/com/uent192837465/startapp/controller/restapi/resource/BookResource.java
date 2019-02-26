package com.uent192837465.startapp.controller.restapi.resource;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResource implements Serializable {
	private static final long serialVersionUID = 1L;
    private String bookID;
    private String name;
    private java.time.LocalDate publishDate;

}