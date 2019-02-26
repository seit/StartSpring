package com.uent192837465.startapp.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * BookResourceと対になるPOJO
 * @author seit
 *
 */
@Getter
@Setter
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
    private String bookID;
    private String name;
    private java.time.LocalDate publishDate;

}
