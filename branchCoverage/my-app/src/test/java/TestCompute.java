import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void test1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    assertTrue("Sent text is : a and mq's size is 0",c.countNumberOfOccurrences("a") == -1);
  }

  @Test
  public void test2() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(12);
    when(mq.contains("a")).thenReturn(false);
    assertTrue("Sent text is : 'a' and mq does not contain 'a'",c.countNumberOfOccurrences("a") == 0);
  }

  @Test
  public void test3() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);

    when(mq.size()).thenReturn(3);
    when(mq.contains("a")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("a");
    when(mq.getAt(1)).thenReturn("a");
    when(mq.getAt(2)).thenReturn("a");

    assertTrue("Sent text is : a and mq contains a 3 times",c.countNumberOfOccurrences("a") == 3);
  }
}