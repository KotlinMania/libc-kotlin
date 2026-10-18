@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc
import io.github.kotlinmania.libc.teeos.CpuSetT
import io.github.kotlinmania.libc.teeos.cpuCount
import io.github.kotlinmania.libc.teeos.cpuCountS
import io.github.kotlinmania.libc.unix.*
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.apple.AF_INET
import io.github.kotlinmania.libc.unix.bsd.apple.uname
import io.github.kotlinmania.libc.unix.bsd.getpwnamR
import io.github.kotlinmania.libc.unix.bsd.getpwuidR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.io
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ioR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ioW
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ioWR
import io.github.kotlinmania.libc.unix.bsd.popen
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.windows.putenvS
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ParityRuntimeTest {
    @Test
    fun countsOnlyCompleteMasksWithinSize() {
        val bits = ULongArray(16)
        bits[0] = 0x8000000000000001uL
        bits[1] = ULong.MAX_VALUE
        bits[15] = 0x100uL
        val set = CpuSetT(bits)
        assertEquals(0, cpuCountS(0uL, set))
        assertEquals(0, cpuCountS(7uL, set))
        assertEquals(2, cpuCountS(8uL, set))
        assertEquals(2, cpuCountS(15uL, set))
        assertEquals(66, cpuCountS(16uL, set))
        assertEquals(67, cpuCount(set))
        assertFailsWith<IllegalArgumentException> { cpuCountS(136uL, set) }
    }

    @Test
    fun encodesDirectionAndCParameterSize() {
        assertEquals(0x20006601uL, io(0x66uL, 1uL))
        assertEquals(0x40046601uL, ioR(0x66uL, 1uL, 4uL))
        assertEquals(0x80086601uL, ioW(0x66uL, 1uL, 8uL))
        assertEquals(0xc0106601uL, ioWR(0x66uL, 1uL, 16uL))
        assertEquals(0x40016601uL, ioR(0x66uL, 1uL, 0x2001uL))
    }

    @Test
    fun environmentAndIsattyBindingsWork() {
        val key = "KOTLINMANIA_LIBC_TEST_VAR"
        assertEquals(0, setenv(key, "alpha", 1))
        assertEquals("alpha", getenv(key))

        assertEquals(0, setenv(key, "beta", 0))
        assertEquals("alpha", getenv(key))

        assertEquals(0, putenvS(key, "gamma"))
        assertEquals("gamma", getenv(key))

        assertEquals(0, putenv("$key=delta"))
        assertEquals("delta", getenv(key))

        assertEquals(0, unsetenv(key))
        assertEquals(null, getenv(key))

        assertEquals(0, isatty(-1))
    }

    @Test
    fun unameAndPasswdBindingsWork() {
        val uts = Utsname()
        val ures =
            io.github.kotlinmania.libc.unix.bsd.apple
                .uname(uts)
        assertEquals(0, ures)
        val sysname = uts.sysname.decodeToString().substringBefore('\u0000')
        assertTrue(sysname.isNotEmpty(), "Expected non-empty sysname from uname")

        val rawUid = getuid()
        val uid = if (getpwuid(rawUid) != null) rawUid else 0u
        val pwd = getpwuid(uid)
        assertNotNull(pwd, "Expected non-null Passwd from getpwuid($uid)")
        assertTrue(!pwd.pwName.isNullOrEmpty(), "Expected non-empty pwName")

        val pwdOut =
            io.github.kotlinmania.libc.unix.bsd
                .Passwd()
        val resPtr = COpaquePointer(0L)
        val rcUid = getpwuidR(uid, pwdOut, null, 1024uL, resPtr)
        assertEquals(0, rcUid)
        assertEquals(1L, resPtr.value)
        assertEquals(pwd.pwName, pwdOut.pwName)
        assertEquals(pwd.pwDir, pwdOut.pwDir)

        val pwdByName =
            io.github.kotlinmania.libc.unix.bsd
                .Passwd()
        val resNamePtr = COpaquePointer(0L)
        val rcNam = getpwnamR(pwd.pwName, pwdByName, null, 1024uL, resNamePtr)
        assertEquals(0, rcNam)
        assertEquals(1L, resNamePtr.value)
        assertEquals(pwd.pwUid, pwdByName.pwUid)
    }

    @Test
    fun stdioPopenRealpathAndStrerrorBindingsWork() {
        val errMsg = strerror(2)
        assertNotNull(errMsg)
        assertTrue(errMsg.isNotEmpty())

        val resolved = realpath(".", null)
        assertNotNull(resolved)
        assertTrue(resolved.isNotEmpty())
        assertEquals(0, access(".", 0))

        val pid = getpid()
        val rand =
            kotlin.random.Random
                .nextLong()
                .toULong()
        val tmpDir =
            getenv("TMPDIR")?.takeIf { it.isNotEmpty() }?.trimEnd('/', '\\')
                ?: getenv("TEMP")?.takeIf { it.isNotEmpty() }?.trimEnd('/', '\\')
                ?: "/tmp"
        val tmpPath1 = "$tmpDir/km_libc_test_${pid}_${rand}_1.txt"
        val tmpPath2 = "$tmpDir/km_libc_test_${pid}_${rand}_2.txt"
        val wf = fopen(tmpPath1, "w")
        assertNotNull(wf)
        assertTrue(fputs("hello\nworld", wf) >= 0)
        assertEquals('\n'.code, fputc('\n'.code, wf))
        assertEquals(0, fflush(wf))
        assertEquals(0, fclose(wf))

        assertEquals(0, rename(tmpPath1, tmpPath2))

        val rf = fopen(tmpPath2, "r")
        assertNotNull(rf)
        assertEquals("hello\n", fgets(null, 64, rf))
        assertEquals('w'.code, fgetc(rf))
        assertEquals("orld\n", fgets(null, 64, rf))
        assertEquals(null, fgets(null, 64, rf))
        assertTrue(feof(rf) != 0)
        assertEquals(0, ferror(rf))
        clearerr(rf)
        assertEquals(0, feof(rf))
        assertEquals(0, fclose(rf))
        assertEquals(0, remove(tmpPath2))

        val pf = popen("echo libc_popen_ok", "r")
        assertNotNull(pf)
        val pOut = fgets(null, 128, pf)
        assertNotNull(pOut)
        assertEquals("libc_popen_ok", pOut.trim())
        assertEquals(0, pclose(pf))
    }

    @Test
    fun addrinfoAndNameinfoBindingsWork() {
        assertEquals(0, resInit())
        val gaiMsg = gaiStrerror(0)
        assertNotNull(gaiMsg)
        assertTrue(gaiMsg.isNotEmpty())

        val hMsg = hstrerror(0)
        assertNotNull(hMsg)
        assertTrue(hMsg.isNotEmpty())

        val hints = Addrinfo(aiFamily = AF_INET, aiSocktype = 1)
        val resPtr = COpaquePointer(0L)
        val rc = getaddrinfo("127.0.0.1", "80", hints, resPtr)
        assertEquals(0, rc)
        assertTrue(resPtr.value != 0L)

        val info = resPtr.toAddrinfo()
        assertNotNull(info)
        assertEquals(AF_INET, info.aiFamily)

        val sa = info.aiSockaddr ?: info.aiAddr.toSockaddr()
        assertNotNull(sa)

        val uts = Utsname()
        uname(uts)
        val sysname = uts.sysname.decodeToString().substringBefore('\u0000')
        val numericFlags = if (sysname.equals("Linux", ignoreCase = true)) (1 or 2) else (2 or 8)

        val hostBuf = ByteArray(128)
        val servBuf = ByteArray(32)
        val niRc =
            getnameinfo(
                sa,
                info.aiAddrlen,
                hostBuf,
                hostBuf.size.toUInt(),
                servBuf,
                servBuf.size.toUInt(),
                numericFlags,
            )
        assertEquals(0, niRc)
        assertEquals("127.0.0.1", hostBuf.decodeToString().substringBefore('\u0000'))
        assertEquals("80", servBuf.decodeToString().substringBefore('\u0000'))

        freeaddrinfo(info)
    }
}
