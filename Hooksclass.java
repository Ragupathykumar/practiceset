package org.stepdef;



import org.junit.Before;



public class Hooksclass extends Baseclass{
@Before
public   void beforemethod() {
	maximise();
	implicitwait(30);

}
}
