import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void test1() {assertTrue("Length 0   ",!(c.compute())); }

  @Test
  public void test2() {assertTrue("Length 1   ",!(c.compute(1))); }

  @Test
  public void test3() {assertTrue("Length 2   ",!(c.compute(1,2))); }

  @Test
  public void test4() {
    try {
      c.compute(1, 2, 0);
    }catch(RuntimeException e){
      assertTrue(e.getClass().equals(RuntimeException.class));
    }
  }

  @Test
  public void test5() {assertTrue("Length 3 without 0   ",c.compute(1,2,3)); }
  @Test
  public void test6() {assertTrue("Length 3 without 0, false   ",!c.compute(2,2,3));}}

