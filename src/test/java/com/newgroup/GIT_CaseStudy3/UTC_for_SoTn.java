package com.newgroup.GIT_CaseStudy3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class UTC_for_SoTn {
	@Test
	public void test(){
		SoTn s = new SoTn();
		assertEquals(2,s.Sum(1,1));
	}

}
