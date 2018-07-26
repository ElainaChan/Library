package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.actionForm.BookTypeForm;
import com.actionForm.ManagerForm;

public class ManagerFormTest {

	@Test
	public void test() {
		try{
			ManagerForm book3 = new ManagerForm();
		    book3.setId((Integer)1);
		    book3.setPwd("123");;
		    book3.setName("From Java");;
		    book3.setBookset(20);
			assertEquals((Integer)1, book3.getId());
			assertEquals("123", book3.getPwd());
			assertEquals("From Java", book3.getName());
			assertEquals(20,book3.getBookset());
	    }catch(Exception ex){
	    	fail("Not yet implemented");
	    }
	}

}
