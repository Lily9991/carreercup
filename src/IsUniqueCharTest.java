import static org.junit.Assert.*;

import org.junit.Test;


public class IsUniqueCharTest {

	@Test
	public void isUniqueGeneraltest() {
		
		String s1 = "";
		String s2 = "a";
		String s3 = "aaa";
		String s4 = "aba";
		String s5 = "a a";
		String s6 = "&%$";
		
		assertEquals(IsUniqueChar.isUniqueGeneral(s1),false);
		assertEquals(IsUniqueChar.isUniqueGeneral(null),false);
		assertEquals(IsUniqueChar.isUniqueGeneral(s2),true);
		assertEquals(IsUniqueChar.isUniqueGeneral(s3),false);
		assertEquals(IsUniqueChar.isUniqueGeneral(s4),false);
		assertEquals(IsUniqueChar.isUniqueGeneral(s5),false);
		assertEquals(IsUniqueChar.isUniqueGeneral(s6),true);
	}

	@Test
	public void isUniqueASCIITest(){
		
		String s1 = "";
		String s2 = "a";
		String s3 = "aaa";
		String s4 = "aba";
		String s5 = "a a";
		String s6 = "&%$";
		
		assertEquals(IsUniqueChar.isUniqueASCIIChars(s1),false);
		assertEquals(IsUniqueChar.isUniqueASCIIChars(null),false);
		assertEquals(IsUniqueChar.isUniqueASCIIChars(s2),true);
		assertEquals(IsUniqueChar.isUniqueASCIIChars(s3),false);
		assertEquals(IsUniqueChar.isUniqueASCIIChars(s4),false);
		assertEquals(IsUniqueChar.isUniqueASCIIChars(s5),false);
		assertEquals(IsUniqueChar.isUniqueASCIIChars(s6),true);
		
		
	}
}
