package org.carrot2.labs.simplesprites;

import java.util.List;

import org.carrot2.labs.simplesprites.message.*;
import org.junit.Before;

/**
 * @author Stanislaw Osinski
 */
public class TestWithMemoryMessageSink
{
    protected MessageLog messageLog;
    protected List<Message> messages;

    @Before
    public void setUpMessageLogWithMemoryMessageSink()
    {
        final MemoryMessageSink messageSink = new MemoryMessageSink();

        messageLog = new MessageLog(messageSink);
        messages = messageSink.messages;
    }
}
