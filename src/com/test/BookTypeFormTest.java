package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.actionForm.BookCaseForm;
import com.actionForm.BookTypeForm;

public class BookTypeFormTest {

	@Test
	public void test() {
		try{
			BookTypeForm book2 = new BookTypeForm();
		    book2.setId((Integer)1);
		    book2.setDays(10);
		    book2.setTypeName("C++");
			assertEquals((Integer)1, book2.getId());
			assertEquals(10, book2.getDays());
			assertEquals("C++", book2.getTypeName());
	    }catch(Exception ex){
	    	fail("Not yet implemented");
	    }
	}

}
