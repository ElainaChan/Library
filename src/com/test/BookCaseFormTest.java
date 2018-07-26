package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.actionForm.BookCaseForm;

public class BookCaseFormTest {

	@Test
	public void test() {
		 try{
			    BookCaseForm book = new BookCaseForm();
			    book.setId((Integer)1);
			    book.setName("java");
				assertEquals((Integer)1, book.getId());
				assertEquals("java", book.getName());
		    }catch(Exception ex){
		    	fail("Not yet implemented");
		    }
		
	}

}
