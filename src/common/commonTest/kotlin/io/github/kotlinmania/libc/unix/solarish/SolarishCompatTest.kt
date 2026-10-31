package io.github.kotlinmania.libc.unix.solarish

import kotlin.test.Test
import kotlin.test.assertEquals

class SolarishCompatTest {
    @Test
    fun testCfmakerawClearsCanonicalFlagsAndSetsMinTime() {
        val initialCc = MutableList<UByte>(NCCS.toInt()) { 9u }
        val termios =
            Termios(
                cIflag = IMAXBEL or IGNBRK or BRKINT or PARMRK or ISTRIP or INLCR or IGNCR or ICRNL or IXON or IXOFF,
                cOflag = OPOST or ONLCR,
                cCflag = CSIZE or PARENB or CREAD,
                cLflag = ECHO or ECHONL or ICANON or ISIG or IEXTEN or TOSTOP,
                cCc = initialCc,
            )

        cfmakeraw(termios)

        assertEquals(IXOFF, termios.cIflag)
        assertEquals(ONLCR, termios.cOflag)
        assertEquals(CREAD or CS8, termios.cCflag)
        assertEquals(TOSTOP, termios.cLflag)
        assertEquals(1u.toUByte(), termios.cCc[VMIN.toInt()])
        assertEquals(0u.toUByte(), termios.cCc[VTIME.toInt()])
    }

    @Test
    fun testCfmakerawNullNoop() {
        cfmakeraw(null)
    }
}
