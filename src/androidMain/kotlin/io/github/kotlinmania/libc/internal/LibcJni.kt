package io.github.kotlinmania.libc.internal
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.AddrinfoRegistry
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Utsname
import java.io.File

internal object LibcJni {
    init {
        var loaded = false
        try {
            System.loadLibrary("libc_jni")
            loaded = true
        } catch (_: UnsatisfiedLinkError) {
            // Library not in java.library.path
        }
        if (!loaded) {
            loadFallback()
        }
    }

    private fun loadFallback() {
        try {
            val osName = (System.getProperty("os.name") ?: "").lowercase()
            val isWindows = osName.contains("win")
            val isMac = osName.contains("mac") || osName.contains("darwin")
            val (libName, osInclude) =
                when {
                    isWindows -> "libc_jni.dll" to "win32"
                    isMac -> "liblibc_jni.dylib" to "darwin"
                    else -> "liblibc_jni.so" to "linux"
                }
            val localBuilt = File("build/natives", libName)
            if (localBuilt.exists()) {
                System.load(localBuilt.absolutePath)
                return
            }
            val tmpDir = File(System.getProperty("java.io.tmpdir") ?: "/tmp", "kotlinmania-libc-jni-0.1.9")
            val outFile = File(tmpDir, libName)
            if (!outFile.exists()) {
                tmpDir.mkdirs()
                val javaHome = System.getProperty("java.home") ?: System.getenv("JAVA_HOME") ?: ""
                val javaInclude = File(javaHome, "include")
                val javaOsInclude = File(javaInclude, osInclude)
                if (javaInclude.exists()) {
                    val cSource =
                        LibcJni::class.java
                            .getResourceAsStream("/io/github/kotlinmania/libc/native/libc_jni.c")
                            ?.bufferedReader()
                            ?.use { it.readText() }
                            ?: FALLBACK_JNI_C_SOURCE
                    val suffix = System.nanoTime()
                    val cFile = File(tmpDir, "libc_jni_$suffix.c")
                    val tmpOut = File(tmpDir, "$libName.$suffix.tmp")
                    cFile.writeText(cSource)
                    val cmd =
                        mutableListOf(
                            "clang",
                            "-shared",
                            "-O2",
                            "-I${javaInclude.absolutePath}",
                            "-I${javaOsInclude.absolutePath}",
                            cFile.absolutePath,
                            "-o",
                            tmpOut.absolutePath,
                        )
                    if (!isWindows) {
                        cmd.add(2, "-fPIC")
                    } else {
                        cmd.add("-lws2_32")
                    }
                    val proc = ProcessBuilder(cmd).redirectErrorStream(true).start()
                    proc.inputStream.bufferedReader().use { it.readText() }
                    val exitCode = proc.waitFor()
                    cFile.delete()
                    if (exitCode == 0 && tmpOut.exists()) {
                        if (!tmpOut.renameTo(outFile)) {
                            tmpOut.copyTo(outFile, overwrite = true)
                            tmpOut.delete()
                        }
                    } else {
                        tmpOut.delete()
                    }
                }
            }
            if (outFile.exists()) {
                System.load(outFile.absolutePath)
            }
        } catch (_: Throwable) {
            // Best-effort dynamic compilation fallback
        }
    }

    // --- Sockets ---

    @JvmStatic
    external fun socket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun bind(fd: Int, addr: ByteArray, addrlen: Int): Int

    @JvmStatic
    external fun connect(fd: Int, addr: ByteArray, addrlen: Int): Int

    @JvmStatic
    external fun listen(fd: Int, backlog: Int): Int

    @JvmStatic
    external fun accept(fd: Int, addr: ByteArray?, addrlen: IntArray?): Int

    @JvmStatic
    external fun getsockopt(fd: Int, level: Int, optname: Int, optval: ByteArray, optlen: IntArray): Int

    @JvmStatic
    external fun setsockopt(fd: Int, level: Int, optname: Int, optval: ByteArray, optlen: Int): Int

    @JvmStatic
    external fun getsockname(fd: Int, addr: ByteArray, addrlen: IntArray): Int

    @JvmStatic
    external fun getpeername(fd: Int, addr: ByteArray, addrlen: IntArray): Int

    @JvmStatic
    external fun send(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int): Long

    @JvmStatic
    external fun recv(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int): Long

    @JvmStatic
    external fun sendto(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int, addr: ByteArray?, addrlen: Int): Long

    @JvmStatic
    external fun recvfrom(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int, addr: ByteArray?, addrlen: IntArray?): Long

    @JvmStatic
    external fun shutdown(fd: Int, how: Int): Int

    @JvmStatic
    external fun socketpair(domain: Int, type: Int, protocol: Int, sv: IntArray): Int

    // --- Polling & Select ---

    @JvmStatic
    external fun poll(fds: IntArray, events: ShortArray, revents: ShortArray, nfds: Int, timeout: Int): Int

    @JvmStatic
    external fun select(nfds: Int, readfds: IntArray?, writefds: IntArray?, exceptfds: IntArray?, timeoutSec: Long, timeoutUsec: Long): Int

    // --- Terminal Control & Window Sizing ---

    @JvmStatic
    external fun ioctl(fd: Int, request: Long, argp: ByteArray?): Int

    @JvmStatic
    external fun ioctlTiocgwinsz(fd: Int, winsize: ShortArray): Int

    @JvmStatic
    external fun tcgetattr(fd: Int, termios: ByteArray): Int

    @JvmStatic
    external fun tcsetattr(fd: Int, optionalActions: Int, termios: ByteArray): Int

    @JvmStatic
    external fun cfmakeraw(termios: ByteArray)

    // --- UDS, Memory Locking & Process Syscalls ---

    @JvmStatic
    external fun getpeereid(sockfd: Int, creds: IntArray): Int

    @JvmStatic
    external fun mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun sysconf(name: Int): Long

    @JvmStatic
    external fun getpid(): Int

    @JvmStatic
    external fun getppid(): Int

    @JvmStatic
    external fun geteuid(): Int

    @JvmStatic
    external fun getegid(): Int

    @JvmStatic
    external fun getuid(): Int

    @JvmStatic
    external fun getgid(): Int

    @JvmStatic
    external fun kill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun sendmsg(fd: Int, name: ByteArray?, iov: ByteArray?, control: ByteArray?, flags: Int): Long

    @JvmStatic
    external fun recvmsg(fd: Int, name: ByteArray?, nameLenOut: IntArray?, iov: ByteArray?, control: ByteArray?, controlLenOut: IntArray?, flagsOut: IntArray?, flags: Int): Long

    @JvmStatic
    external fun syscall(num: Long, a1: Long, a2: Long, a3: Long, a4: Long, a5: Long, a6: Long): Long

    @JvmStatic
    external fun pidfdOpen(pid: Int, flags: Int): Int

    // --- Environment & Terminal ---

    @JvmStatic
    external fun getenv(name: String): String?

    @JvmStatic
    external fun setenv(name: String, value: String, overwrite: Int): Int

    @JvmStatic
    external fun unsetenv(name: String): Int

    @JvmStatic
    external fun putenv(string: String): Int

    @JvmStatic
    external fun putenvS(name: String, value: String): Int

    @JvmStatic
    external fun clearenv(): Int

    @JvmStatic
    external fun isatty(fd: Int): Int

    // --- Errno, Paths, Uname, Passwd & Stdio ---

    @JvmStatic
    external fun getErrno(): Int

    @JvmStatic
    external fun strerror(errnum: Int): String?

    @JvmStatic
    external fun realpath(pathname: String): String?

    @JvmStatic
    external fun access(path: String, mode: Int): Int

    @JvmStatic
    external fun unameFields(): String?

    @JvmStatic
    external fun getpwuidRStr(uid: Int, buflen: Long): String

    @JvmStatic
    external fun getpwnamRStr(name: String, buflen: Long): String

    @JvmStatic
    external fun fopen(path: String, mode: String): Long

    @JvmStatic
    external fun fclose(fp: Long): Int

    @JvmStatic
    external fun fflush(fp: Long): Int

    @JvmStatic
    external fun fgetc(fp: Long): Int

    @JvmStatic
    external fun fputc(c: Int, fp: Long): Int

    @JvmStatic
    external fun fgets(n: Int, fp: Long): String?

    @JvmStatic
    external fun fputs(s: String, fp: Long): Int

    @JvmStatic
    external fun feof(fp: Long): Int

    @JvmStatic
    external fun ferror(fp: Long): Int

    @JvmStatic
    external fun clearerr(fp: Long)

    @JvmStatic
    external fun popen(command: String, mode: String): Long

    @JvmStatic
    external fun pclose(fp: Long): Int

    @JvmStatic
    external fun remove(filename: String): Int

    @JvmStatic
    external fun rename(oldname: String, newname: String): Int

    @JvmStatic
    external fun unlink(path: String): Int

    private fun copyCStringInto(src: String, dst: ByteArray) {
        dst.fill(0)
        val bytes = src.encodeToByteArray()
        val copyLen = minOf(bytes.size, (dst.size - 1).coerceAtLeast(0))
        for (i in 0 until copyLen) {
            dst[i] = bytes[i]
        }
    }

    fun uname(buf: io.github.kotlinmania.libc.unix.linuxlike.Utsname?): Int {
        if (buf == null) return -1
        val raw = unameFields() ?: return -1
        val parts = raw.split('\n')
        if (parts.size < 5) return -1
        copyCStringInto(parts[0], buf.sysname)
        copyCStringInto(parts[1], buf.nodename)
        copyCStringInto(parts[2], buf.release)
        copyCStringInto(parts[3], buf.version)
        copyCStringInto(parts[4], buf.machine)
        return 0
    }

    fun uname(buf: io.github.kotlinmania.libc.unix.bsd.Utsname?): Int {
        if (buf == null) return -1
        val raw = unameFields() ?: return -1
        val parts = raw.split('\n')
        if (parts.size < 5) return -1
        copyCStringInto(parts[0], buf.sysname)
        copyCStringInto(parts[1], buf.nodename)
        copyCStringInto(parts[2], buf.release)
        copyCStringInto(parts[3], buf.version)
        copyCStringInto(parts[4], buf.machine)
        return 0
    }

    fun getpwuid(uid: UInt): io.github.kotlinmania.libc.unix.linuxlike.Passwd? {
        val pwd =
            io.github.kotlinmania.libc.unix.linuxlike
                .Passwd()
        val res =
            io.github.kotlinmania.libc
                .COpaquePointer(0L)
        val rc = getpwuidR(uid, pwd, 4096uL, res)
        return if (rc == 0 && res.value != 0L) pwd else null
    }

    fun getpwnam(name: String?): io.github.kotlinmania.libc.unix.linuxlike.Passwd? {
        if (name == null) return null
        val pwd =
            io.github.kotlinmania.libc.unix.linuxlike
                .Passwd()
        val res =
            io.github.kotlinmania.libc
                .COpaquePointer(0L)
        val rc = getpwnamR(name, pwd, 4096uL, res)
        return if (rc == 0 && res.value != 0L) pwd else null
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.linuxlike.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        val raw = getpwuidRStr(uid.toInt(), buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.linuxlike.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        if (name == null) {
            result?.value = 0L
            return 22
        }
        val raw = getpwnamRStr(name, buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        val raw = getpwuidRStr(uid.toInt(), buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        if (name == null) {
            result?.value = 0L
            return 22
        }
        val raw = getpwnamRStr(name, buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    @JvmStatic
    external fun getaddrinfoStr(
        node: String?,
        service: String?,
        hasHints: Int,
        aiFlags: Int,
        aiFamily: Int,
        aiSocktype: Int,
        aiProtocol: Int,
    ): String

    @JvmStatic
    external fun getnameinfoStr(
        saFamily: Int,
        saDataHex: String,
        salen: Int,
        hostlen: Int,
        servlen: Int,
        flags: Int,
    ): String

    @JvmStatic
    external fun gaiStrerror(errcode: Int): String?

    @JvmStatic
    external fun hstrerror(errcode: Int): String?

    @JvmStatic
    external fun resInit(): Int

    fun getaddrinfo(
        node: String?,
        service: String?,
        hints: Addrinfo?,
        res: COpaquePointer?,
    ): Int {
        val raw =
            getaddrinfoStr(
                node,
                service,
                if (hints != null) 1 else 0,
                hints?.aiFlags ?: 0,
                hints?.aiFamily ?: 0,
                hints?.aiSocktype ?: 0,
                hints?.aiProtocol ?: 0,
            )
        return AddrinfoRegistry.parsePackedResult(raw, hints, res)
    }

    fun freeaddrinfo(res: Addrinfo?) {
        AddrinfoRegistry.freeChain(res)
    }

    fun getnameinfo(
        sa: Sockaddr?,
        salen: UInt,
        host: ByteArray?,
        hostlen: UInt,
        serv: ByteArray?,
        servlen: UInt,
        flags: Int,
    ): Int {
        if (sa == null) return -1
        val hex = AddrinfoRegistry.encodeHex(sa.saData)
        val raw =
            getnameinfoStr(
                sa.saFamily.toInt(),
                hex,
                salen.toInt(),
                if (host != null) hostlen.toInt() else 0,
                if (serv != null) servlen.toInt() else 0,
                flags,
            )
        return AddrinfoRegistry.applyGetnameinfoResult(raw, host, hostlen, serv, servlen)
    }
}

private const val FALLBACK_JNI_C_SOURCE = """
#include <jni.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#ifndef _WIN32
#include <unistd.h>
#include <limits.h>
#include <pwd.h>
#include <sys/types.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netdb.h>
#include <netinet/in.h>
#include <dlfcn.h>
#include <signal.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#include <io.h>
#include <wchar.h>
#endif

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getpid();
#else
    return (jint)GetCurrentProcessId();
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getppid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getppid();
#else
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_geteuid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)geteuid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getegid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getegid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getuid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getuid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getgid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getgid();
#else
    return 0;
#endif
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getenv(
    JNIEnv* env, jclass clazz, jstring name) {
    (void)clazz;
    if (!name) return NULL;
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return NULL;
    const char* val = getenv(cname);
    jstring result = val ? (*env)->NewStringUTF(env, val) : NULL;
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return result;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_setenv(
    JNIEnv* env, jclass clazz, jstring name, jstring value, jint overwrite) {
    (void)clazz;
    if (!name || !value) {
        errno = EINVAL;
        return -1;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return -1;
    const char* cval = (*env)->GetStringUTFChars(env, value, NULL);
    if (!cval) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        return -1;
    }
#ifndef _WIN32
    int res = setenv(cname, cval, (int)overwrite);
#else
    int res = -1;
    if (!*cname || strchr(cname, '=') != NULL) {
        errno = EINVAL;
    } else if (!overwrite && getenv(cname) != NULL) {
        res = 0;
    } else {
        res = _putenv_s(cname, cval) == 0 ? 0 : -1;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, value, cval);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unsetenv(
    JNIEnv* env, jclass clazz, jstring name) {
    (void)clazz;
    if (!name) {
        errno = EINVAL;
        return -1;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return -1;
#ifndef _WIN32
    int res = unsetenv(cname);
#else
    int res = -1;
    if (!*cname || strchr(cname, '=') != NULL) {
        errno = EINVAL;
    } else {
        res = _putenv_s(cname, "") == 0 ? 0 : -1;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_putenv(
    JNIEnv* env, jclass clazz, jstring string) {
    (void)clazz;
    if (!string) {
        errno = EINVAL;
        return -1;
    }
    const char* cstr = (*env)->GetStringUTFChars(env, string, NULL);
    if (!cstr) return -1;
#ifndef _WIN32
    int res = putenv(strdup(cstr));
#else
    int res = _putenv(_strdup(cstr));
#endif
    (*env)->ReleaseStringUTFChars(env, string, cstr);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_putenvS(
    JNIEnv* env, jclass clazz, jstring name, jstring value) {
    (void)clazz;
    if (!name || !value) {
        errno = EINVAL;
        return EINVAL;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return EINVAL;
    const char* cval = (*env)->GetStringUTFChars(env, value, NULL);
    if (!cval) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        return EINVAL;
    }
#ifdef _WIN32
    int res = (int)_putenv_s(cname, cval);
#else
    int res;
    if (cval[0] == '\0') {
        res = unsetenv(cname) == 0 ? 0 : errno;
    } else {
        res = setenv(cname, cval, 1) == 0 ? 0 : errno;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, value, cval);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_clearenv(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#if defined(_WIN32)
    LPWCH envBlock = GetEnvironmentStringsW();
    if (!envBlock) return -1;
    LPWCH p = envBlock;
    while (*p) {
        size_t len = wcslen(p);
        if (p[0] != L'=') {
            wchar_t* eq = wcschr(p, L'=');
            if (eq) {
                size_t namelen = (size_t)(eq - p);
                wchar_t* name = (wchar_t*)malloc((namelen + 1) * sizeof(wchar_t));
                if (name) {
                    memcpy(name, p, namelen * sizeof(wchar_t));
                    name[namelen] = L'\0';
                    _wputenv_s(name, L"");
                    free(name);
                }
            }
        }
        p += len + 1;
    }
    FreeEnvironmentStringsW(envBlock);
    return 0;
#elif defined(__linux__) && !defined(__ANDROID__)
    return clearenv();
#else
    extern char **environ;
    if (!environ) return 0;
    while (environ[0] != NULL) {
        const char* entry = environ[0];
        const char* eq = strchr(entry, '=');
        if (eq != NULL && eq > entry) {
            size_t len = (size_t)(eq - entry);
            char* name = (char*)malloc(len + 1);
            if (!name) return -1;
            memcpy(name, entry, len);
            name[len] = '\0';
            unsetenv(name);
            free(name);
        } else {
            environ[0] = NULL;
            break;
        }
    }
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_isatty(
    JNIEnv* env, jclass clazz, jint fd) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)isatty((int)fd);
#else
    return (jint)_isatty((int)fd);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getErrno(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    return (jint)errno;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_strerror(
    JNIEnv* env, jclass clazz, jint errnum) {
    (void)clazz;
    const char* s = strerror((int)errnum);
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_realpath(
    JNIEnv* env, jclass clazz, jstring pathname) {
    (void)clazz;
    if (!pathname) {
        errno = EINVAL;
        return NULL;
    }
    const char* cpath = (*env)->GetStringUTFChars(env, pathname, NULL);
    if (!cpath) return NULL;
#ifndef _WIN32
    char buf[4096];
    char* res = realpath(cpath, buf);
#else
    char buf[4096];
    char* res = _fullpath(buf, cpath, sizeof(buf));
#endif
    jstring out = res ? (*env)->NewStringUTF(env, res) : NULL;
    (*env)->ReleaseStringUTFChars(env, pathname, cpath);
    return out;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_access(
    JNIEnv* env, jclass clazz, jstring path, jint mode) {
    (void)clazz;
    if (!path) {
        errno = EINVAL;
        return -1;
    }
    const char* cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if (!cpath) return -1;
#ifndef _WIN32
    int res = access(cpath, (int)mode);
#else
    int res = _access(cpath, (int)mode);
#endif
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jint)res;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unameFields(
    JNIEnv* env, jclass clazz) {
    (void)clazz;
    char out[2048];
#ifndef _WIN32
    struct utsname u;
    memset(&u, 0, sizeof(u));
    if (uname(&u) != 0) return NULL;
    snprintf(out, sizeof(out), "%s\n%s\n%s\n%s\n%s",
             u.sysname, u.nodename, u.release, u.version, u.machine);
#else
    char nodename[256] = "localhost";
    DWORD sz = (DWORD)sizeof(nodename);
    GetComputerNameA(nodename, &sz);
    snprintf(out, sizeof(out), "Windows_NT\n%s\n10.0\nWindows\nx86_64", nodename);
#endif
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpwuidRStr(
    JNIEnv* env, jclass clazz, jint uid, jlong buflen) {
    (void)clazz;
    char out[4096];
    if (buflen < 64) {
        snprintf(out, sizeof(out), "%d\n0", ERANGE);
        return (*env)->NewStringUTF(env, out);
    }
#if !defined(_WIN32)
    struct passwd pwd;
    struct passwd* result = NULL;
    size_t blen = (size_t)buflen;
    if (blen > 16384) blen = 16384;
    char* buf = (char*)malloc(blen);
    if (!buf) {
        snprintf(out, sizeof(out), "%d\n0", ENOMEM);
        return (*env)->NewStringUTF(env, out);
    }
    int rc = getpwuid_r((uid_t)uid, &pwd, buf, blen, &result);
    if (rc == 0 && result != NULL) {
        snprintf(out, sizeof(out), "0\n1\n%s\n%s\n%u\n%u\n%s\n%s\n%s",
                 result->pw_name ? result->pw_name : "",
                 result->pw_passwd ? result->pw_passwd : "",
                 (unsigned int)result->pw_uid,
                 (unsigned int)result->pw_gid,
                 result->pw_gecos ? result->pw_gecos : "",
                 result->pw_dir ? result->pw_dir : "",
                 result->pw_shell ? result->pw_shell : "");
    } else {
        snprintf(out, sizeof(out), "%d\n0", rc);
    }
    free(buf);
#else
    (void)uid;
    const char* user = getenv("USERNAME");
    const char* home = getenv("USERPROFILE");
    snprintf(out, sizeof(out), "0\n1\n%s\n\n0\n0\n\n%s\n",
             user ? user : "user", home ? home : "C:\\Users\\Default");
#endif
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpwnamRStr(
    JNIEnv* env, jclass clazz, jstring name, jlong buflen) {
    (void)clazz;
    char out[4096];
    if (!name) {
        snprintf(out, sizeof(out), "%d\n0", EINVAL);
        return (*env)->NewStringUTF(env, out);
    }
    if (buflen < 64) {
        snprintf(out, sizeof(out), "%d\n0", ERANGE);
        return (*env)->NewStringUTF(env, out);
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) {
        snprintf(out, sizeof(out), "%d\n0", ENOMEM);
        return (*env)->NewStringUTF(env, out);
    }
#if !defined(_WIN32)
    struct passwd pwd;
    struct passwd* result = NULL;
    size_t blen = (size_t)buflen;
    if (blen > 16384) blen = 16384;
    char* buf = (char*)malloc(blen);
    if (!buf) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        snprintf(out, sizeof(out), "%d\n0", ENOMEM);
        return (*env)->NewStringUTF(env, out);
    }
    int rc = getpwnam_r(cname, &pwd, buf, blen, &result);
    if (rc == 0 && result != NULL) {
        snprintf(out, sizeof(out), "0\n1\n%s\n%s\n%u\n%u\n%s\n%s\n%s",
                 result->pw_name ? result->pw_name : "",
                 result->pw_passwd ? result->pw_passwd : "",
                 (unsigned int)result->pw_uid,
                 (unsigned int)result->pw_gid,
                 result->pw_gecos ? result->pw_gecos : "",
                 result->pw_dir ? result->pw_dir : "",
                 result->pw_shell ? result->pw_shell : "");
    } else {
        snprintf(out, sizeof(out), "%d\n0", rc);
    }
    free(buf);
#else
    const char* user = getenv("USERNAME");
    const char* home = getenv("USERPROFILE");
    if (user && strcmp(cname, user) == 0) {
        snprintf(out, sizeof(out), "0\n1\n%s\n\n0\n0\n\n%s\n",
                 user, home ? home : "C:\\Users\\Default");
    } else {
        snprintf(out, sizeof(out), "0\n0");
    }
#endif
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fopen(
    JNIEnv* env, jclass clazz, jstring path, jstring mode) {
    (void)clazz;
    if (!path || !mode) return 0;
    const char* cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if (!cpath) return 0;
    const char* cmode = (*env)->GetStringUTFChars(env, mode, NULL);
    if (!cmode) {
        (*env)->ReleaseStringUTFChars(env, path, cpath);
        return 0;
    }
    FILE* fp = fopen(cpath, cmode);
    (*env)->ReleaseStringUTFChars(env, mode, cmode);
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jlong)(uintptr_t)fp;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fclose(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return EOF;
    return (jint)fclose((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fflush(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == -1) return EOF;
    return (jint)fflush((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fgetc(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return EOF;
    return (jint)fgetc((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fputc(
    JNIEnv* env, jclass clazz, jint c, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return EOF;
    return (jint)fputc((int)c, (FILE*)(uintptr_t)fp);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fgets(
    JNIEnv* env, jclass clazz, jint n, jlong fp) {
    (void)clazz;
    if (fp == 0 || fp == -1 || n <= 0) return NULL;
    size_t cap = (size_t)n;
    if (cap > 65536) cap = 65536;
    char* buf = (char*)malloc(cap);
    if (!buf) return NULL;
    char* res = fgets(buf, (int)cap, (FILE*)(uintptr_t)fp);
    jstring out = res ? (*env)->NewStringUTF(env, res) : NULL;
    free(buf);
    return out;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fputs(
    JNIEnv* env, jclass clazz, jstring s, jlong fp) {
    (void)clazz;
    if (!s || fp == 0 || fp == -1) return EOF;
    const char* cs = (*env)->GetStringUTFChars(env, s, NULL);
    if (!cs) return EOF;
    int res = fputs(cs, (FILE*)(uintptr_t)fp);
    (*env)->ReleaseStringUTFChars(env, s, cs);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_feof(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return 1;
    return (jint)feof((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_ferror(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return 1;
    return (jint)ferror((FILE*)(uintptr_t)fp);
}

JNIEXPORT void JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_clearerr(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return;
    clearerr((FILE*)(uintptr_t)fp);
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_popen(
    JNIEnv* env, jclass clazz, jstring command, jstring mode) {
    (void)clazz;
    if (!command || !mode) return 0;
    const char* ccmd = (*env)->GetStringUTFChars(env, command, NULL);
    if (!ccmd) return 0;
    const char* cmode = (*env)->GetStringUTFChars(env, mode, NULL);
    if (!cmode) {
        (*env)->ReleaseStringUTFChars(env, command, ccmd);
        return 0;
    }
#ifndef _WIN32
    FILE* fp = popen(ccmd, cmode);
#else
    FILE* fp = _popen(ccmd, cmode);
#endif
    (*env)->ReleaseStringUTFChars(env, mode, cmode);
    (*env)->ReleaseStringUTFChars(env, command, ccmd);
    return (jlong)(uintptr_t)fp;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_pclose(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return -1;
#ifndef _WIN32
    return (jint)pclose((FILE*)(uintptr_t)fp);
#else
    return (jint)_pclose((FILE*)(uintptr_t)fp);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_remove(
    JNIEnv* env, jclass clazz, jstring filename) {
    (void)clazz;
    if (!filename) return -1;
    const char* cfile = (*env)->GetStringUTFChars(env, filename, NULL);
    if (!cfile) return -1;
    int res = remove(cfile);
    (*env)->ReleaseStringUTFChars(env, filename, cfile);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_rename(
    JNIEnv* env, jclass clazz, jstring oldname, jstring newname) {
    (void)clazz;
    if (!oldname || !newname) return -1;
    const char* cold = (*env)->GetStringUTFChars(env, oldname, NULL);
    if (!cold) return -1;
    const char* cnew = (*env)->GetStringUTFChars(env, newname, NULL);
    if (!cnew) {
        (*env)->ReleaseStringUTFChars(env, oldname, cold);
        return -1;
    }
    int res = rename(cold, cnew);
    (*env)->ReleaseStringUTFChars(env, newname, cnew);
    (*env)->ReleaseStringUTFChars(env, oldname, cold);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unlink(
    JNIEnv* env, jclass clazz, jstring path) {
    (void)clazz;
    if (!path) return -1;
    const char* cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if (!cpath) return -1;
#ifndef _WIN32
    int res = unlink(cpath);
#else
    int res = _unlink(cpath);
#endif
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jint)res;
}

static unsigned int jni_hex_nibble(char c) {
    if (c >= '0' && c <= '9') return (unsigned int)(c - '0');
    if (c >= 'a' && c <= 'f') return (unsigned int)(c - 'a' + 10);
    if (c >= 'A' && c <= 'F') return (unsigned int)(c - 'A' + 10);
    return 0;
}

static void jni_ensure_wsa(void) {
#ifdef _WIN32
    static int inited = 0;
    if (!inited) {
        WSADATA wsa;
        if (WSAStartup(MAKEWORD(2, 2), &wsa) == 0) {
            inited = 1;
        }
    }
#endif
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getaddrinfoStr(
    JNIEnv* env, jclass clazz,
    jstring node, jstring service,
    jint hasHints, jint aiFlags, jint aiFamily, jint aiSocktype, jint aiProtocol) {
    (void)clazz;
    jni_ensure_wsa();
    const char* cnode = node ? (*env)->GetStringUTFChars(env, node, NULL) : NULL;
    const char* cserv = service ? (*env)->GetStringUTFChars(env, service, NULL) : NULL;
    struct addrinfo hints;
    memset(&hints, 0, sizeof(hints));
    if (hasHints) {
        hints.ai_flags = (int)aiFlags;
        int fam = (int)aiFamily;
        if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) {
            fam = AF_INET6;
        }
        hints.ai_family = fam;
        hints.ai_socktype = (int)aiSocktype;
        hints.ai_protocol = (int)aiProtocol;
    }
    struct addrinfo* res = NULL;
    int rc = getaddrinfo(cnode, cserv, hasHints ? &hints : NULL, &res);
    if (cnode) (*env)->ReleaseStringUTFChars(env, node, cnode);
    if (cserv) (*env)->ReleaseStringUTFChars(env, service, cserv);
    char out[16384];
    if (rc != 0) {
        snprintf(out, sizeof(out), "%d\n0", rc);
        return (*env)->NewStringUTF(env, out);
    }
    int count = 0;
    for (struct addrinfo* p = res; p != NULL && count < 64; p = p->ai_next) {
        count++;
    }
    size_t pos = (size_t)snprintf(out, sizeof(out), "0\n%d\n", count);
    static const char hex_digits[] = "0123456789abcdef";
    int idx = 0;
    for (struct addrinfo* p = res; p != NULL && idx < count; p = p->ai_next, idx++) {
        char hex[256];
        size_t hex_pos = 0;
        unsigned int sa_fam = (unsigned int)p->ai_family;
        if (p->ai_addr && p->ai_addrlen >= 2) {
            sa_fam = (unsigned int)p->ai_addr->sa_family;
            const unsigned char* raw = ((const unsigned char*)p->ai_addr) + 2;
            size_t raw_len = (size_t)p->ai_addrlen - 2;
            if (raw_len > 120) raw_len = 120;
            for (size_t b = 0; b < raw_len; b++) {
                hex[hex_pos++] = hex_digits[(raw[b] >> 4) & 0x0F];
                hex[hex_pos++] = hex_digits[raw[b] & 0x0F];
            }
        }
        hex[hex_pos] = '\0';
        const char* canon = p->ai_canonname ? p->ai_canonname : "";
        if (pos < sizeof(out)) {
            int n = snprintf(
                out + pos,
                sizeof(out) - pos,
                "%d\t%d\t%d\t%d\t%u\t%u\t%s\t%s\n",
                p->ai_flags,
                p->ai_family,
                p->ai_socktype,
                p->ai_protocol,
                (unsigned int)p->ai_addrlen,
                sa_fam,
                hex,
                canon
            );
            if (n > 0) pos += (size_t)n;
        }
    }
    freeaddrinfo(res);
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getnameinfoStr(
    JNIEnv* env, jclass clazz,
    jint saFamily, jstring saDataHex, jint salen, jint hostlen, jint servlen, jint flags) {
    (void)clazz;
    char out[2048];
    if (saFamily < 0) {
        snprintf(out, sizeof(out), "%d\n\n", EAI_FAIL);
        return (*env)->NewStringUTF(env, out);
    }
    jni_ensure_wsa();
    const char* chex = saDataHex ? (*env)->GetStringUTFChars(env, saDataHex, NULL) : "";
    struct sockaddr_storage ss;
    memset(&ss, 0, sizeof(ss));
    size_t hex_len = chex ? strlen(chex) : 0;
    size_t data_len = hex_len / 2;
    if (data_len > sizeof(ss) - 2) data_len = sizeof(ss) - 2;
    unsigned char* dst = ((unsigned char*)&ss) + 2;
    for (size_t i = 0; i < data_len; i++) {
        unsigned int hi = jni_hex_nibble(chex[i * 2]);
        unsigned int lo = jni_hex_nibble(chex[i * 2 + 1]);
        dst[i] = (unsigned char)((hi << 4) | lo);
    }
    if (saDataHex && chex) (*env)->ReleaseStringUTFChars(env, saDataHex, chex);
    int fam = (int)saFamily;
    if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) {
        fam = AF_INET6;
    }
    socklen_t total_len = (socklen_t)(2 + data_len);
    if ((socklen_t)salen > total_len && (size_t)salen <= sizeof(ss)) {
        total_len = (socklen_t)salen;
    }
    if (fam == AF_INET && total_len < (socklen_t)sizeof(struct sockaddr_in)) {
        total_len = (socklen_t)sizeof(struct sockaddr_in);
    } else if (fam == AF_INET6 && total_len < (socklen_t)sizeof(struct sockaddr_in6)) {
        total_len = (socklen_t)sizeof(struct sockaddr_in6);
    }
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    ss.ss_len = (uint8_t)total_len;
    ss.ss_family = (sa_family_t)fam;
#else
    ss.ss_family = (unsigned short)fam;
#endif
    char hbuf[1025];
    char sbuf[64];
    memset(hbuf, 0, sizeof(hbuf));
    memset(sbuf, 0, sizeof(sbuf));
    socklen_t hlen = hostlen > 0 ? ((size_t)hostlen < sizeof(hbuf) ? (socklen_t)hostlen : (socklen_t)(sizeof(hbuf) - 1)) : 0;
    socklen_t slen = servlen > 0 ? ((size_t)servlen < sizeof(sbuf) ? (socklen_t)servlen : (socklen_t)(sizeof(sbuf) - 1)) : 0;
    int rc = getnameinfo(
        (const struct sockaddr*)&ss,
        total_len,
        hlen > 0 ? hbuf : NULL,
        hlen,
        slen > 0 ? sbuf : NULL,
        slen,
        (int)flags
    );
    snprintf(out, sizeof(out), "%d\n%s\n%s", rc, rc == 0 ? hbuf : "", rc == 0 ? sbuf : "");
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_gaiStrerror(
    JNIEnv* env, jclass clazz, jint errcode) {
    (void)clazz;
#ifndef _WIN32
    const char* s = gai_strerror((int)errcode);
#else
    const char* s = gai_strerrorA((int)errcode);
#endif
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_hstrerror(
    JNIEnv* env, jclass clazz, jint errcode) {
    (void)clazz;
#if !defined(_WIN32) && !defined(__ANDROID__)
    const char* s = hstrerror((int)errcode);
#else
    const char* s;
    switch ((int)errcode) {
        case 0: s = "Resolver Error 0 (no error)"; break;
        case 1: s = "Unknown host"; break;
        case 2: s = "Host name lookup failure"; break;
        case 3: s = "Unknown server error"; break;
        case 4: s = "No address associated with name"; break;
        default: s = "Unknown resolver error"; break;
    }
#endif
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_resInit(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    typedef int (*res_init_fn)(void);
    res_init_fn fn = (res_init_fn)dlsym(RTLD_DEFAULT, "res_init");
    if (!fn) fn = (res_init_fn)dlsym(RTLD_DEFAULT, "__res_init");
    if (fn) return (jint)fn();
#endif
    return 0;
}
"""
