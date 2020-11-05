package blockContact;

import org.junit.Test;


import static org.junit.Assert.assertEquals;




public class blockTest {
	
@Test
public void isContactBlocked() {
	//creates test object that will call current blockStatus
	blockContact test = new blockContact();
		
	/**
	 * tests to see if the blockStatus is currently "blocked":
	 * ---if blockStatus is currently set to "blocked" then the test results
	 * in a success test being generated to signify that the contact was successfully
	 * blocked.
	 * 
	 * ---if blockStatus is currently set to "not blocked" then the test results
	 * in a unsuccessful test being generated to signify that the contact was 
	 * not blocked. This equates to the user exiting out of the choice to block
	 * or simply choosing not to block the contact at all.
	 */
	assertEquals("blocked",test.contactStatus());
}


}
