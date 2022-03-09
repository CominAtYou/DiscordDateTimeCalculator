package com.cominatyou;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testMessageEpochConversion() {
        assertEquals("Sep 13, 2021 at 12:23 AM", App.getSnowflakeDateString(886844622167494706L));
        assertEquals("Jun 25, 2021 at 11:27 AM", App.getSnowflakeDateString(858020617844293642L));
        assertEquals("Mar 23, 2020 at 10:57 PM", App.getSnowflakeDateString(691858102072639528L));
    }
    @Test
    public void testGuildEpochConversion() {
        assertEquals("Sep 21, 2018 at 12:46 AM", App.getSnowflakeDateString(492572315138392064L));
        assertEquals("Aug 31, 2016 at 5:14 PM", App.getSnowflakeDateString(220667551364022272L));
        assertEquals("Jun 28, 2017 at 4:07 PM", App.getSnowflakeDateString(329729477930123265L));
    }
    @Test
    public void testBotUserEpochConversion() {
        assertEquals("Mar 19, 2019 at 1:15 PM", App.getSnowflakeDateString(557628352828014614L));
        assertEquals("Sep 11, 2017 at 2:07 PM", App.getSnowflakeDateString(356878329602768897L));
        assertEquals("Jul 18, 2019 at 4:32 PM", App.getSnowflakeDateString(601526796558532619L));
    }
}
