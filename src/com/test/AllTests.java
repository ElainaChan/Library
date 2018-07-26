package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookCaseFormTest.class, BookTypeFormTest.class, ManagerFormTest.class })
public class AllTests {

}
