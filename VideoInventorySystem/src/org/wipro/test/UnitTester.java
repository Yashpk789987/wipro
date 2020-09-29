package org.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.wipro.model.Video;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	VideoTest.class,
	VideoStoreTest.class
})

public class UnitTester {
	
	public class AllTests {
		
	}
}