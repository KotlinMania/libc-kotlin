@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.fuchsia.aarch64.Stat
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object FuchsiaJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = FuchsiaJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcFuchsiaIsalnum(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsalpha(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIscntrl(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsdigit(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsgraph(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIslower(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsprint(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIspunct(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsspace(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsupper(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaIsblank(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaTolower(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaToupper(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaFopen(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcFuchsiaFreopen(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcFuchsiaFflush(file: Long): Int

    @JvmStatic
    external fun libcFuchsiaFclose(file: Long): Int

    @JvmStatic
    external fun libcFuchsiaRemove(filename: Long): Int

    @JvmStatic
    external fun libcFuchsiaRename(oldname: Long, newname: Long): Int

    @JvmStatic
    external fun libcFuchsiaTmpfile(): Long

    @JvmStatic
    external fun libcFuchsiaSetvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libcFuchsiaSetbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libcFuchsiaGetchar(): Int

    @JvmStatic
    external fun libcFuchsiaPutchar(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaFgetc(stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaFgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libcFuchsiaFputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaFputs(s: Long, stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaPuts(s: Long): Int

    @JvmStatic
    external fun libcFuchsiaUngetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaFread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcFuchsiaFwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcFuchsiaFseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcFuchsiaFtell(stream: Long): Long

    @JvmStatic
    external fun libcFuchsiaRewind(stream: Long)

    @JvmStatic
    external fun libcFuchsiaFgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcFuchsiaFsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcFuchsiaFeof(stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaFerror(stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaPerror(s: Long)

    @JvmStatic
    external fun libcFuchsiaAtof(s: Long): Double

    @JvmStatic
    external fun libcFuchsiaAtoi(s: Long): Int

    @JvmStatic
    external fun libcFuchsiaAtol(s: Long): Long

    @JvmStatic
    external fun libcFuchsiaAtoll(s: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrtod(s: Long, endp: Long): Double

    @JvmStatic
    external fun libcFuchsiaStrtof(s: Long, endp: Long): Float

    @JvmStatic
    external fun libcFuchsiaStrtol(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcFuchsiaStrtoll(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcFuchsiaStrtoul(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcFuchsiaStrtoull(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcFuchsiaCalloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libcFuchsiaMalloc(size: Long): Long

    @JvmStatic
    external fun libcFuchsiaRealloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libcFuchsiaFree(p: Long)

    @JvmStatic
    external fun libcFuchsiaAbort()

    @JvmStatic
    external fun libcFuchsiaExit(status: Int)

    @JvmStatic
    external fun libcFuchsiaAtexit(cb: Long): Int

    @JvmStatic
    external fun libcFuchsiaSystem(s: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetenv(s: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrncpy(dst: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrcat(s: Long, ct: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrncat(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrcmp(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcFuchsiaStrncmp(cs: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcFuchsiaStrcoll(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcFuchsiaStrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcFuchsiaStrrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcFuchsiaStrspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrcspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrdup(cs: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrpbrk(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrstr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrlen(cs: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrnlen(cs: Long, maxlen: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrerror(n: Int): Long

    @JvmStatic
    external fun libcFuchsiaStrtok(s: Long, t: Long): Long

    @JvmStatic
    external fun libcFuchsiaStrxfrm(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaWcslen(buf: Long): Long

    @JvmStatic
    external fun libcFuchsiaWcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaMemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaWmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaMemcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcFuchsiaMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaMemset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaAbs(i: Int): Int

    @JvmStatic
    external fun libcFuchsiaLabs(i: Long): Long

    @JvmStatic
    external fun libcFuchsiaRand(): Int

    @JvmStatic
    external fun libcFuchsiaSrand(seed: Int)

    @JvmStatic
    external fun libcFuchsiaGetpwnam(name: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetpwuid(uid: Int): Long

    @JvmStatic
    external fun libcFuchsiaFprintf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaSnprintf(s: Long, n: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaSprintf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaFscanf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaScanf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaSscanf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetcharUnlocked(): Int

    @JvmStatic
    external fun libcFuchsiaPutcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libcFuchsiaSocket(domain: Int, ty: Int, protocol: Int): Int

    @JvmStatic
    external fun libcFuchsiaConnect(socket: Int, address: Long, len: Int): Int

    @JvmStatic
    external fun libcFuchsiaListen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libcFuchsiaAccept(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetpeername(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetsockname(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcFuchsiaSetsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int

    @JvmStatic
    external fun libcFuchsiaSocketpair(domain: Int, type: Int, protocol: Int, socketVector: Long): Int

    @JvmStatic
    external fun libcFuchsiaSendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libcFuchsiaShutdown(socket: Int, how: Int): Int

    @JvmStatic
    external fun libcFuchsiaChmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaFchmod(fd: Int, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaFstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaMkdir(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaStat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaPclose(stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaFdopen(fd: Int, mode: Long): Long

    @JvmStatic
    external fun libcFuchsiaFileno(stream: Long): Int

    @JvmStatic
    external fun libcFuchsiaOpen(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaCreat(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaFcntl(fd: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaOpendir(dirname: Long): Long

    @JvmStatic
    external fun libcFuchsiaReaddir(dirp: Long): Long

    @JvmStatic
    external fun libcFuchsiaReaddirR(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libcFuchsiaClosedir(dirp: Long): Int

    @JvmStatic
    external fun libcFuchsiaRewinddir(dirp: Long)

    @JvmStatic
    external fun libcFuchsiaOpenat(dirfd: Int, pathname: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaFchmodat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaFchown(fd: Int, owner: Int, group: Int): Int

    @JvmStatic
    external fun libcFuchsiaFchownat(dirfd: Int, pathname: Long, owner: Int, group: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaFstatat(dirfd: Int, pathname: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaLinkat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaMkdirat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaReadlinkat(dirfd: Int, pathname: Long, buf: Long, bufsiz: Long): Long

    @JvmStatic
    external fun libcFuchsiaRenameat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long): Int

    @JvmStatic
    external fun libcFuchsiaSymlinkat(target: Long, newdirfd: Int, linkpath: Long): Int

    @JvmStatic
    external fun libcFuchsiaUnlinkat(dirfd: Int, pathname: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaAccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcFuchsiaAlarm(seconds: Int): Int

    @JvmStatic
    external fun libcFuchsiaChdir(dir: Long): Int

    @JvmStatic
    external fun libcFuchsiaChown(path: Long, uid: Int, gid: Int): Int

    @JvmStatic
    external fun libcFuchsiaLchown(path: Long, uid: Int, gid: Int): Int

    @JvmStatic
    external fun libcFuchsiaClose(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaDup(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaDup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libcFuchsiaExecl(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaExecle(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaExeclp(file: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaExecv(prog: Long, argv: Long): Int

    @JvmStatic
    external fun libcFuchsiaExecve(prog: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcFuchsiaExecvp(c: Long, argv: Long): Int

    @JvmStatic
    external fun libcFuchsiaFork(): Int

    @JvmStatic
    external fun libcFuchsiaFpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libcFuchsiaGetcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetegid(): Int

    @JvmStatic
    external fun libcFuchsiaGeteuid(): Int

    @JvmStatic
    external fun libcFuchsiaGetgid(): Int

    @JvmStatic
    external fun libcFuchsiaGetgroups(ngroupsMax: Int, groups: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetlogin(): Long

    @JvmStatic
    external fun libcFuchsiaGetopt(argc: Int, argv: Long, optstr: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetpgid(pid: Int): Int

    @JvmStatic
    external fun libcFuchsiaGetpgrp(): Int

    @JvmStatic
    external fun libcFuchsiaGetpid(): Int

    @JvmStatic
    external fun libcFuchsiaGetppid(): Int

    @JvmStatic
    external fun libcFuchsiaGetuid(): Int

    @JvmStatic
    external fun libcFuchsiaIsatty(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaLink(src: Long, dst: Long): Int

    @JvmStatic
    external fun libcFuchsiaLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcFuchsiaPathconf(path: Long, name: Int): Long

    @JvmStatic
    external fun libcFuchsiaPause(): Int

    @JvmStatic
    external fun libcFuchsiaPipe(fds: Long): Int

    @JvmStatic
    external fun libcFuchsiaPosixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libcFuchsiaRead(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcFuchsiaRmdir(path: Long): Int

    @JvmStatic
    external fun libcFuchsiaSeteuid(uid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetegid(gid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetgid(gid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetpgid(pid: Int, pgid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetsid(): Int

    @JvmStatic
    external fun libcFuchsiaSetuid(uid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSleep(secs: Int): Int

    @JvmStatic
    external fun libcFuchsiaNanosleep(rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcFuchsiaTcgetpgrp(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaTcsetpgrp(fd: Int, pgrp: Int): Int

    @JvmStatic
    external fun libcFuchsiaTtyname(fd: Int): Long

    @JvmStatic
    external fun libcFuchsiaUnlink(c: Long): Int

    @JvmStatic
    external fun libcFuchsiaWait(status: Long): Int

    @JvmStatic
    external fun libcFuchsiaWaitpid(pid: Int, status: Long, options: Int): Int

    @JvmStatic
    external fun libcFuchsiaWrite(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcFuchsiaPread(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcFuchsiaPwrite(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcFuchsiaUmask(mask: Int): Int

    @JvmStatic
    external fun libcFuchsiaUtime(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaKill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libcFuchsiaMlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaMunlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaMlockall(flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaMunlockall(): Int

    @JvmStatic
    external fun libcFuchsiaMmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcFuchsiaMunmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaIfNametoindex(ifname: Long): Int

    @JvmStatic
    external fun libcFuchsiaIfIndextoname(ifindex: Int, ifname: Long): Long

    @JvmStatic
    external fun libcFuchsiaLstat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaFsync(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetenv(name: Long, value: Long, overwrite: Int): Int

    @JvmStatic
    external fun libcFuchsiaUnsetenv(name: Long): Int

    @JvmStatic
    external fun libcFuchsiaSymlink(path1: Long, path2: Long): Int

    @JvmStatic
    external fun libcFuchsiaFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcFuchsiaSignal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libcFuchsiaRealpath(pathname: Long, resolved: Long): Long

    @JvmStatic
    external fun libcFuchsiaFlock(fd: Int, operation: Int): Int

    @JvmStatic
    external fun libcFuchsiaGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcFuchsiaTimes(buf: Long): Long

    @JvmStatic
    external fun libcFuchsiaPthreadSelf(): Long

    @JvmStatic
    external fun libcFuchsiaPthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadExit(value: Long)

    @JvmStatic
    external fun libcFuchsiaPthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libcFuchsiaPthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedYield(): Int

    @JvmStatic
    external fun libcFuchsiaPthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libcFuchsiaPthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libcFuchsiaPthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockDestroy(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockRdlock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockTryrdlock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockWrlock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockTrywrlock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockUnlock(lock: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadRwlockattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadSetnameNp(thread: Long, name: Long): Int

    @JvmStatic
    external fun libcFuchsiaStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libcFuchsiaRaise(signum: Int): Int

    @JvmStatic
    external fun libcFuchsiaSigaction(signum: Int, act: Long, oldact: Long): Int

    @JvmStatic
    external fun libcFuchsiaUtimes(filename: Long, times: Long): Int

    @JvmStatic
    external fun libcFuchsiaDlopen(filename: Long, flag: Int): Long

    @JvmStatic
    external fun libcFuchsiaDlerror(): Long

    @JvmStatic
    external fun libcFuchsiaDlsym(handle: Long, symbol: Long): Long

    @JvmStatic
    external fun libcFuchsiaDlclose(handle: Long): Int

    @JvmStatic
    external fun libcFuchsiaDladdr(addr: Long, info: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetaddrinfo(node: Long, service: Long, hints: Long, res: Long): Int

    @JvmStatic
    external fun libcFuchsiaFreeaddrinfo(res: Long)

    @JvmStatic
    external fun libcFuchsiaGaiStrerror(errcode: Int): Long

    @JvmStatic
    external fun libcFuchsiaResInit(): Int

    @JvmStatic
    external fun libcFuchsiaGmtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libcFuchsiaLocaltimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libcFuchsiaMktime(tm: Long): Long

    @JvmStatic
    external fun libcFuchsiaTime(time: Long): Long

    @JvmStatic
    external fun libcFuchsiaGmtime(timeP: Long): Long

    @JvmStatic
    external fun libcFuchsiaLocaltime(timeP: Long): Long

    @JvmStatic
    external fun libcFuchsiaMknod(pathname: Long, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libcFuchsiaUname(buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaGethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetservbyname(name: Long, proto: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetprotobyname(name: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetprotobynumber(proto: Int): Long

    @JvmStatic
    external fun libcFuchsiaUsleep(secs: Int): Int

    @JvmStatic
    external fun libcFuchsiaSend(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaRecv(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaPutenv(string: Long): Int

    @JvmStatic
    external fun libcFuchsiaPoll(fds: Long, nfds: Long, timeout: Int): Int

    @JvmStatic
    external fun libcFuchsiaSelect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int

    @JvmStatic
    external fun libcFuchsiaSetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libcFuchsiaLocaleconv(): Long

    @JvmStatic
    external fun libcFuchsiaSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemWait(sem: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemTrywait(sem: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemPost(sem: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcFuchsiaStatvfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaFstatvfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaReadlink(path: Long, buf: Long, bufsz: Long): Long

    @JvmStatic
    external fun libcFuchsiaSigemptyset(set: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcFuchsiaSigfillset(set: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcFuchsiaSigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcFuchsiaSigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigpending(set: Long): Int

    @JvmStatic
    external fun libcFuchsiaTimegm(tm: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetsid(pid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSysconf(name: Int): Long

    @JvmStatic
    external fun libcFuchsiaMkfifo(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaPselect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcFuchsiaFseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcFuchsiaFtello(stream: Long): Long

    @JvmStatic
    external fun libcFuchsiaTcdrain(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaCfgetispeed(termios: Long): Int

    @JvmStatic
    external fun libcFuchsiaCfgetospeed(termios: Long): Int

    @JvmStatic
    external fun libcFuchsiaCfmakeraw(termios: Long)

    @JvmStatic
    external fun libcFuchsiaCfsetispeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcFuchsiaCfsetospeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcFuchsiaCfsetspeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcFuchsiaTcgetattr(fd: Int, termios: Long): Int

    @JvmStatic
    external fun libcFuchsiaTcsetattr(fd: Int, optionalActions: Int, termios: Long): Int

    @JvmStatic
    external fun libcFuchsiaTcflow(fd: Int, action: Int): Int

    @JvmStatic
    external fun libcFuchsiaTcflush(fd: Int, action: Int): Int

    @JvmStatic
    external fun libcFuchsiaTcgetsid(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaTcsendbreak(fd: Int, duration: Int): Int

    @JvmStatic
    external fun libcFuchsiaMkstemp(template: Long): Int

    @JvmStatic
    external fun libcFuchsiaMkdtemp(template: Long): Long

    @JvmStatic
    external fun libcFuchsiaTmpnam(ptr: Long): Long

    @JvmStatic
    external fun libcFuchsiaOpenlog(ident: Long, logopt: Int, facility: Int)

    @JvmStatic
    external fun libcFuchsiaCloselog()

    @JvmStatic
    external fun libcFuchsiaSetlogmask(maskpri: Int): Int

    @JvmStatic
    external fun libcFuchsiaSyslog(priority: Int, message: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcFuchsiaGrantpt(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaPosixOpenpt(flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaPtsname(fd: Int): Long

    @JvmStatic
    external fun libcFuchsiaUnlockpt(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcFuchsiaClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcFuchsiaClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcFuchsiaClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcFuchsiaDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcFuchsiaMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcFuchsiaSetgroups(ngroups: Long, ptr: Long): Int

    @JvmStatic
    external fun libcFuchsiaPipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcFuchsiaPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcFuchsiaFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcFuchsiaUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcFuchsiaDuplocale(base: Long): Long

    @JvmStatic
    external fun libcFuchsiaFreelocale(loc: Long)

    @JvmStatic
    external fun libcFuchsiaNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcFuchsiaUselocale(loc: Long): Long

    @JvmStatic
    external fun libcFuchsiaFdopendir(fd: Int): Long

    @JvmStatic
    external fun libcFuchsiaMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcFuchsiaAccept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libcFuchsiaPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcFuchsiaClearenv(): Int

    @JvmStatic
    external fun libcFuchsiaWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetreuid(ruid: Int, euid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetregid(rgid: Int, egid: Int): Int

    @JvmStatic
    external fun libcFuchsiaGetresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libcFuchsiaAcct(filename: Long): Int

    @JvmStatic
    external fun libcFuchsiaBrk(addr: Long): Int

    @JvmStatic
    external fun libcFuchsiaSetresgid(rgid: Int, egid: Int, sgid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetresuid(ruid: Int, euid: Int, suid: Int): Int

    @JvmStatic
    external fun libcFuchsiaOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcFuchsiaExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcFuchsiaFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcFuchsiaIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcFuchsiaSetpwent()

    @JvmStatic
    external fun libcFuchsiaEndpwent()

    @JvmStatic
    external fun libcFuchsiaGetpwent(): Long

    @JvmStatic
    external fun libcFuchsiaShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaShmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcFuchsiaShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcFuchsiaShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcFuchsiaShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaFtok(pathname: Long, projId: Int): Int

    @JvmStatic
    external fun libcFuchsiaSemget(key: Int, nsems: Int, semflag: Int): Int

    @JvmStatic
    external fun libcFuchsiaSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaMsgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcFuchsiaMsgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libcFuchsiaMsgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcFuchsiaMsgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcFuchsiaMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcFuchsiaErrnoLocation(): Long

    @JvmStatic
    external fun libcFuchsiaFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaReadahead(fd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcFuchsiaSignalfd(fd: Int, mask: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcFuchsiaTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcFuchsiaPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcFuchsiaPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcFuchsiaQuotactl(cmd: Int, special: Long, id: Int, data: Long): Int

    @JvmStatic
    external fun libcFuchsiaDup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcFuchsiaNlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaReboot(howTo: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetfsgid(gid: Int): Int

    @JvmStatic
    external fun libcFuchsiaSetfsuid(uid: Int): Int

    @JvmStatic
    external fun libcFuchsiaMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcFuchsiaIfNameindex(): Long

    @JvmStatic
    external fun libcFuchsiaIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcFuchsiaSyncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcFuchsiaFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcFuchsiaGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcFuchsiaGlobfree(pglob: Long)

    @JvmStatic
    external fun libcFuchsiaPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcFuchsiaShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcFuchsiaSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcFuchsiaTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcFuchsiaMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcFuchsiaMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcFuchsiaMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcFuchsiaFutimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcFuchsiaNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcFuchsiaBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcFuchsiaWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcFuchsiaReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcFuchsiaSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaSetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaVhangup(): Int

    @JvmStatic
    external fun libcFuchsiaSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcFuchsiaSync()

    @JvmStatic
    external fun libcFuchsiaSyscall(num: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcFuchsiaSchedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcFuchsiaUmount(target: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcFuchsiaTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcFuchsiaSplice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaEventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaSchedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcFuchsiaSwapoff(puath: Long): Int

    @JvmStatic
    external fun libcFuchsiaVmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long

    @JvmStatic
    external fun libcFuchsiaMount(src: Long, target: Long, fstype: Long, flags: Long, data: Long): Int

    @JvmStatic
    external fun libcFuchsiaPersonality(persona: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcFuchsiaPpoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcFuchsiaClone(cb: Long, childStack: Long, flags: Int, arg: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcFuchsiaClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcFuchsiaSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcFuchsiaSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcFuchsiaUmount2(target: Long, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaSwapon(path: Long, swapflags: Int): Int

    @JvmStatic
    external fun libcFuchsiaSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemClose(sem: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetdtablesize(): Int

    @JvmStatic
    external fun libcFuchsiaGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcFuchsiaInitgroups(user: Long, group: Int): Int

    @JvmStatic
    external fun libcFuchsiaPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcFuchsiaSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcFuchsiaGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcFuchsiaPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcFuchsiaSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcFuchsiaDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcFuchsiaGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcFuchsiaSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcFuchsiaPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcFuchsiaGetgrgid(gid: Int): Long

    @JvmStatic
    external fun libcFuchsiaSetgrent()

    @JvmStatic
    external fun libcFuchsiaEndgrent()

    @JvmStatic
    external fun libcFuchsiaGetgrent(): Long

    @JvmStatic
    external fun libcFuchsiaGetgrouplist(user: Long, group: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcFuchsiaPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcFuchsiaFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcFuchsiaPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcFuchsiaDlIteratePhdr(callback: Long, data: Long): Int
}

public actual fun isalnum(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsgraph(c)

public actual fun islower(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIslower(c)

public actual fun isprint(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIspunct(c)

public actual fun isspace(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsspace(c)

public actual fun isupper(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsblank(c)

public actual fun tolower(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaTolower(c)

public actual fun toupper(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaToupper(c)

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaFreopen(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fflush(file: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFflush(file.rawAddress)

public actual fun fclose(file: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFclose(file.rawAddress)

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaRemove(filename.rawAddress)

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaRename(oldname.rawAddress, newname.rawAddress)

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaTmpfile())

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    FuchsiaJniBridge.libcFuchsiaSetbuf(stream.rawAddress, buf.rawAddress)
}

public actual fun getchar(): CInt =
    FuchsiaJniBridge.libcFuchsiaGetchar()

public actual fun putchar(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFgetc(stream.rawAddress)

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaFgets(buf.rawAddress, n, stream.rawAddress))

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFputc(c, stream.rawAddress)

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFputs(s.rawAddress, stream.rawAddress)

public actual fun puts(s: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaPuts(s.rawAddress)

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaUngetc(c, stream.rawAddress)

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    FuchsiaJniBridge.libcFuchsiaFread(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    FuchsiaJniBridge.libcFuchsiaFwrite(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    FuchsiaJniBridge.libcFuchsiaFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr<FILE>) {
    FuchsiaJniBridge.libcFuchsiaRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    FuchsiaJniBridge.libcFuchsiaFgetpos(stream.rawAddress, ptr.rawAddress)

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    FuchsiaJniBridge.libcFuchsiaFsetpos(stream.rawAddress, ptr.rawAddress)

public actual fun feof(stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFerror(stream.rawAddress)

public actual fun perror(s: ConstPtr<CChar>) {
    FuchsiaJniBridge.libcFuchsiaPerror(s.rawAddress)
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    FuchsiaJniBridge.libcFuchsiaAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr<CChar>): CLong =
    FuchsiaJniBridge.libcFuchsiaAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    FuchsiaJniBridge.libcFuchsiaAtoll(s.rawAddress)

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    FuchsiaJniBridge.libcFuchsiaStrtod(s.rawAddress, endp.rawAddress)

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    FuchsiaJniBridge.libcFuchsiaStrtof(s.rawAddress, endp.rawAddress)

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    FuchsiaJniBridge.libcFuchsiaStrtol(s.rawAddress, endp.rawAddress, base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    FuchsiaJniBridge.libcFuchsiaStrtoll(s.rawAddress, endp.rawAddress, base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    FuchsiaJniBridge.libcFuchsiaStrtoul(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    FuchsiaJniBridge.libcFuchsiaStrtoull(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMalloc(size.toLong()))

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaRealloc(p.rawAddress, size.toLong()))

public actual fun free(p: MutPtr<CVoid>) {
    FuchsiaJniBridge.libcFuchsiaFree(p.rawAddress)
}

public actual fun abort(): Nothing {
    FuchsiaJniBridge.libcFuchsiaAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    FuchsiaJniBridge.libcFuchsiaExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    FuchsiaJniBridge.libcFuchsiaAtexit(0L)

public actual fun system(s: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaSystem(s.rawAddress)

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetenv(s.rawAddress))

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrcpy(dst.rawAddress, src.rawAddress))

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrcat(s.rawAddress, ct.rawAddress))

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrncat(s.rawAddress, ct.rawAddress, n.toLong()))

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaStrcmp(cs.rawAddress, ct.rawAddress)

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaStrncmp(cs.rawAddress, ct.rawAddress, n.toLong())

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaStrcoll(cs.rawAddress, ct.rawAddress)

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrchr(cs.rawAddress, c))

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrrchr(cs.rawAddress, c))

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    FuchsiaJniBridge.libcFuchsiaStrspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    FuchsiaJniBridge.libcFuchsiaStrcspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrdup(cs.rawAddress))

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrpbrk(cs.rawAddress, ct.rawAddress))

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrstr(cs.rawAddress, ct.rawAddress))

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    FuchsiaJniBridge.libcFuchsiaStrlen(cs.rawAddress).toULong()

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    FuchsiaJniBridge.libcFuchsiaStrnlen(cs.rawAddress, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrerror(n))

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaStrtok(s.rawAddress, t.rawAddress))

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    FuchsiaJniBridge.libcFuchsiaStrxfrm(s.rawAddress, ct.rawAddress, n.toLong()).toULong()

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    FuchsiaJniBridge.libcFuchsiaWcslen(buf.rawAddress).toULong()

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    FuchsiaJniBridge.libcFuchsiaWcstombs(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMemchr(cx.rawAddress, c, n.toLong()))

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaWmemchr(cx.rawAddress, c.toInt(), n.toLong()))

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMemset(dest.rawAddress, c, n.toLong()))

public actual fun abs(i: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaAbs(i)

public actual fun labs(i: CLong): CLong =
    FuchsiaJniBridge.libcFuchsiaLabs(i)

public actual fun rand(): CInt =
    FuchsiaJniBridge.libcFuchsiaRand()

public actual fun srand(seed: CUint) {
    FuchsiaJniBridge.libcFuchsiaSrand(seed.toInt())
}

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetpwnam(name.rawAddress))

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetpwuid(uid.toInt()))

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    FuchsiaJniBridge.libcFuchsiaGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPutcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    FuchsiaJniBridge.libcFuchsiaConnect(socket, address.rawAddress, len.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    FuchsiaJniBridge.libcFuchsiaAccept(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetpeername(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetsockname(socket, address.rawAddress, addressLen.rawAddress)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetsockopt(socket, level, name, value.rawAddress, optionLen.toInt())

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    FuchsiaJniBridge.libcFuchsiaSocketpair(domain, type, protocol, socketVector.rawAddress)

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaSendto(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.toInt())

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaShutdown(socket, how)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaChmod(path.rawAddress, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaFchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    FuchsiaJniBridge.libcFuchsiaFstat(fildes, buf.rawAddress)

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMkdir(path.rawAddress, mode.toInt())

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    FuchsiaJniBridge.libcFuchsiaStat(path.rawAddress, buf.rawAddress)

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaPclose(stream.rawAddress)

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaFdopen(fd, mode.rawAddress))

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    FuchsiaJniBridge.libcFuchsiaFileno(stream.rawAddress)

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaOpen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaCreat(path.rawAddress, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaOpendir(dirname.rawAddress))

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaReaddir(dirp.rawAddress))

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    FuchsiaJniBridge.libcFuchsiaReaddirR(dirp.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    FuchsiaJniBridge.libcFuchsiaClosedir(dirp.rawAddress)

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    FuchsiaJniBridge.libcFuchsiaRewinddir(dirp.rawAddress)
}

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaOpenat(dirfd, pathname.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFchmodat(dirfd, pathname.rawAddress, mode.toInt(), flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaFchown(fd, owner.toInt(), group.toInt())

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFchownat(dirfd, pathname.rawAddress, owner.toInt(), group.toInt(), flags)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFstatat(dirfd, pathname.rawAddress, buf.rawAddress, flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaLinkat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMkdirat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaReadlinkat(dirfd, pathname.rawAddress, buf.rawAddress, bufsiz.toLong())

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaRenameat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress)

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaSymlinkat(target.rawAddress, newdirfd, linkpath.rawAddress)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaUnlinkat(dirfd, pathname.rawAddress, flags)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaAccess(path.rawAddress, amode)

public actual fun alarm(seconds: CUint): CUint =
    FuchsiaJniBridge.libcFuchsiaAlarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaChdir(dir.rawAddress)

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaChown(path.rawAddress, uid.toInt(), gid.toInt())

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaLchown(path.rawAddress, uid.toInt(), gid.toInt())

public actual fun close(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaClose(fd)

public actual fun dup(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaExecl(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaExecle(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaExeclp(file.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    FuchsiaJniBridge.libcFuchsiaExecv(prog.rawAddress, argv.rawAddress)

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    FuchsiaJniBridge.libcFuchsiaExecve(prog.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    FuchsiaJniBridge.libcFuchsiaExecvp(c.rawAddress, argv.rawAddress)

public actual fun fork(): PidT =
    FuchsiaJniBridge.libcFuchsiaFork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    FuchsiaJniBridge.libcFuchsiaFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetcwd(buf.rawAddress, size.toLong()))

public actual fun getegid(): GidT =
    FuchsiaJniBridge.libcFuchsiaGetegid().toUInt()

public actual fun geteuid(): UidT =
    FuchsiaJniBridge.libcFuchsiaGeteuid().toUInt()

public actual fun getgid(): GidT =
    FuchsiaJniBridge.libcFuchsiaGetgid().toUInt()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetgroups(ngroupsMax, groups.rawAddress)

public actual fun getlogin(): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetlogin())

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetopt(argc, argv.rawAddress, optstr.rawAddress)

public actual fun getpgid(pid: PidT): PidT =
    FuchsiaJniBridge.libcFuchsiaGetpgid(pid)

public actual fun getpgrp(): PidT =
    FuchsiaJniBridge.libcFuchsiaGetpgrp()

public actual fun getpid(): PidT =
    FuchsiaJniBridge.libcFuchsiaGetpid()

public actual fun getppid(): PidT =
    FuchsiaJniBridge.libcFuchsiaGetppid()

public actual fun getuid(): UidT =
    FuchsiaJniBridge.libcFuchsiaGetuid().toUInt()

public actual fun isatty(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaLink(src.rawAddress, dst.rawAddress)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    FuchsiaJniBridge.libcFuchsiaLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    FuchsiaJniBridge.libcFuchsiaPathconf(path.rawAddress, name)

public actual fun pause(): CInt =
    FuchsiaJniBridge.libcFuchsiaPause()

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    FuchsiaJniBridge.libcFuchsiaPipe(fds.rawAddress)

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaPosixMemalign(memptr.rawAddress, align.toLong(), size.toLong())

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaRead(fd, buf.rawAddress, count.toLong())

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaRmdir(path.rawAddress)

public actual fun seteuid(uid: UidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSeteuid(uid.toInt())

public actual fun setegid(gid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetegid(gid.toInt())

public actual fun setgid(gid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetgid(gid.toInt())

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetpgid(pid, pgid)

public actual fun setsid(): PidT =
    FuchsiaJniBridge.libcFuchsiaSetsid()

public actual fun setuid(uid: UidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetuid(uid.toInt())

public actual fun sleep(secs: CUint): CUint =
    FuchsiaJniBridge.libcFuchsiaSleep(secs.toInt()).toUInt()

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaNanosleep(rqtp.rawAddress, rmtp.rawAddress)

public actual fun tcgetpgrp(fd: CInt): PidT =
    FuchsiaJniBridge.libcFuchsiaTcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    FuchsiaJniBridge.libcFuchsiaTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaTtyname(fd))

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaUnlink(c.rawAddress)

public actual fun wait(status: MutPtr<CInt>): PidT =
    FuchsiaJniBridge.libcFuchsiaWait(status.rawAddress)

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    FuchsiaJniBridge.libcFuchsiaWaitpid(pid, status.rawAddress, options)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaWrite(fd, buf.rawAddress, count.toLong())

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaPread(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaPwrite(fd, buf.rawAddress, count.toLong(), offset)

public actual fun umask(mask: ModeT): ModeT =
    FuchsiaJniBridge.libcFuchsiaUmask(mask.toInt()).toUInt()

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    FuchsiaJniBridge.libcFuchsiaUtime(file.rawAddress, buf.rawAddress)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaKill(pid, sig)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMlock(addr.rawAddress, len.toLong())

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMunlock(addr.rawAddress, len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMlockall(flags)

public actual fun munlockall(): CInt =
    FuchsiaJniBridge.libcFuchsiaMunlockall()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMunmap(addr.rawAddress, len.toLong())

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    FuchsiaJniBridge.libcFuchsiaIfNametoindex(ifname.rawAddress).toUInt()

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaIfIndextoname(ifindex.toInt(), ifname.rawAddress))

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    FuchsiaJniBridge.libcFuchsiaLstat(path.rawAddress, buf.rawAddress)

public actual fun fsync(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFsync(fd)

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSetenv(name.rawAddress, value.rawAddress, overwrite)

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaUnsetenv(name.rawAddress)

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaSymlink(path1.rawAddress, path2.rawAddress)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    FuchsiaJniBridge.libcFuchsiaFtruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    FuchsiaJniBridge.libcFuchsiaSignal(signum, handler.toLong()).toULong()

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaRealpath(pathname.rawAddress, resolved.rawAddress))

public actual fun flock(fd: CInt, operation: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFlock(fd, operation)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun times(buf: MutPtr<Tms>): ClockT =
    FuchsiaJniBridge.libcFuchsiaTimes(buf.rawAddress)

public actual fun pthreadSelf(): PthreadT =
    FuchsiaJniBridge.libcFuchsiaPthreadSelf().toULong()

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadJoin(native.toLong(), value.rawAddress)

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    FuchsiaJniBridge.libcFuchsiaPthreadExit(value.rawAddress)
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrInit(attr.rawAddress)

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrDestroy(attr.rawAddress)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrGetstacksize(attr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrSetstacksize(attr.rawAddress, stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrSetdetachstate(attr.rawAddress, state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadDetach(thread.toLong())

public actual fun schedYield(): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaPthreadGetspecific(key.toInt()))

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadSetspecific(key.toInt(), value.rawAddress)

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexDestroy(lock.rawAddress)

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexLock(lock.rawAddress)

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexTrylock(lock.rawAddress)

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexUnlock(lock.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexattrSettype(attr.rawAddress, type)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondWait(cond.rawAddress, lock.rawAddress)

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondTimedwait(cond.rawAddress, lock.rawAddress, abstime.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondattrInit(attr.rawAddress)

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondattrDestroy(attr.rawAddress)

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockDestroy(lock.rawAddress)

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockRdlock(lock.rawAddress)

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockTryrdlock(lock.rawAddress)

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockWrlock(lock.rawAddress)

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockTrywrlock(lock.rawAddress)

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockUnlock(lock.rawAddress)

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockattrInit(attr.rawAddress)

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadRwlockattrDestroy(attr.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadGetnameNp(thread.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadSetnameNp(thread.toLong(), name.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetsockopt(sockfd, level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun raise(signum: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaRaise(signum)

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigaction(signum, act.rawAddress, oldact.rawAddress)

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    FuchsiaJniBridge.libcFuchsiaUtimes(filename.rawAddress, times.rawAddress)

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaDlopen(filename.rawAddress, flag))

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaDlerror())

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaDlsym(handle.rawAddress, symbol.rawAddress))

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaDlclose(handle.rawAddress)

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    FuchsiaJniBridge.libcFuchsiaDladdr(addr.rawAddress, info.rawAddress)

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetaddrinfo(node.rawAddress, service.rawAddress, hints.rawAddress, res.rawAddress)

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    FuchsiaJniBridge.libcFuchsiaFreeaddrinfo(res.rawAddress)
}

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    ConstPtr(FuchsiaJniBridge.libcFuchsiaGaiStrerror(errcode))

public actual fun resInit(): CInt =
    FuchsiaJniBridge.libcFuchsiaResInit()

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGmtimeR(timeP.rawAddress, result.rawAddress))

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaLocaltimeR(timeP.rawAddress, result.rawAddress))

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    FuchsiaJniBridge.libcFuchsiaMktime(tm.rawAddress)

public actual fun time(time: MutPtr<TimeT>): TimeT =
    FuchsiaJniBridge.libcFuchsiaTime(time.rawAddress)

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGmtime(timeP.rawAddress))

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaLocaltime(timeP.rawAddress))

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    FuchsiaJniBridge.libcFuchsiaMknod(pathname.rawAddress, mode.toInt(), dev.toLong())

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    FuchsiaJniBridge.libcFuchsiaUname(buf.rawAddress)

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaGethostname(name.rawAddress, len.toLong())

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetservbyname(name.rawAddress, proto.rawAddress))

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetprotobyname(name.rawAddress))

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetprotobynumber(proto))

public actual fun usleep(secs: CUint): CInt =
    FuchsiaJniBridge.libcFuchsiaUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaSend(socket, buf.rawAddress, len.toLong(), flags)

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaRecv(socket, buf.rawAddress, len.toLong(), flags)

public actual fun putenv(string: MutPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaPutenv(string.rawAddress)

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPoll(fds.rawAddress, nfds.toLong(), timeout)

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    FuchsiaJniBridge.libcFuchsiaSelect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaSetlocale(category, locale.rawAddress))

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaLocaleconv())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemDestroy(sem.rawAddress)

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemWait(sem.rawAddress)

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemTrywait(sem.rawAddress)

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemPost(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    FuchsiaJniBridge.libcFuchsiaSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    FuchsiaJniBridge.libcFuchsiaStatvfs(path.rawAddress, buf.rawAddress)

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    FuchsiaJniBridge.libcFuchsiaFstatvfs(fd, buf.rawAddress)

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaReadlink(path.rawAddress, buf.rawAddress, bufsz.toLong())

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigemptyset(set.rawAddress)

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSigaddset(set.rawAddress, signum)

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigfillset(set.rawAddress)

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSigdelset(set.rawAddress, signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSigismember(set.rawAddress, signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigprocmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigpending(set.rawAddress)

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    FuchsiaJniBridge.libcFuchsiaTimegm(tm.rawAddress)

public actual fun getsid(pid: PidT): PidT =
    FuchsiaJniBridge.libcFuchsiaGetsid(pid)

public actual fun sysconf(name: CInt): CLong =
    FuchsiaJniBridge.libcFuchsiaSysconf(name)

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMkfifo(path.rawAddress, mode.toInt())

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPselect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress, sigmask.rawAddress)

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFseeko(stream.rawAddress, offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    FuchsiaJniBridge.libcFuchsiaFtello(stream.rawAddress)

public actual fun tcdrain(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    FuchsiaJniBridge.libcFuchsiaCfgetispeed(termios.rawAddress).toUInt()

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    FuchsiaJniBridge.libcFuchsiaCfgetospeed(termios.rawAddress).toUInt()

public actual fun cfmakeraw(termios: MutPtr<Termios>) {
    FuchsiaJniBridge.libcFuchsiaCfmakeraw(termios.rawAddress)
}

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    FuchsiaJniBridge.libcFuchsiaCfsetispeed(termios.rawAddress, speed.toInt())

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    FuchsiaJniBridge.libcFuchsiaCfsetospeed(termios.rawAddress, speed.toInt())

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    FuchsiaJniBridge.libcFuchsiaCfsetspeed(termios.rawAddress, speed.toInt())

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    FuchsiaJniBridge.libcFuchsiaTcgetattr(fd, termios.rawAddress)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    FuchsiaJniBridge.libcFuchsiaTcsetattr(fd, optionalActions, termios.rawAddress)

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaTcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaTcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    FuchsiaJniBridge.libcFuchsiaTcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaMkstemp(template.rawAddress)

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMkdtemp(template.rawAddress))

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaTmpnam(ptr.rawAddress))

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    FuchsiaJniBridge.libcFuchsiaOpenlog(ident.rawAddress, logopt, facility)
}

public actual fun closelog() {
    FuchsiaJniBridge.libcFuchsiaCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    FuchsiaJniBridge.libcFuchsiaSyslog(priority, message.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun grantpt(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaGrantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaPtsname(fd))

public actual fun unlockpt(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaUnlockpt(fd)

public actual fun fdatasync(fd: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFdatasync(fd)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaClockSettime(clkId, tp.rawAddress)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    FuchsiaJniBridge.libcFuchsiaDirfd(dirp.rawAddress)

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadGetattrNp(native.toLong(), attr.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMemalign(align.toLong(), size.toLong()))

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSetgroups(ngroups.toLong(), ptr.rawAddress)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPipe2(fds.rawAddress, flags)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    FuchsiaJniBridge.libcFuchsiaStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    FuchsiaJniBridge.libcFuchsiaFstatfs(fd, buf.rawAddress)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(FuchsiaJniBridge.libcFuchsiaDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    FuchsiaJniBridge.libcFuchsiaFreelocale(loc.rawAddress)
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(FuchsiaJniBridge.libcFuchsiaNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(FuchsiaJniBridge.libcFuchsiaUselocale(loc.rawAddress))

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaFdopendir(fd))

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    FuchsiaJniBridge.libcFuchsiaMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev.toLong())

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaAccept4(fd, addr.rawAddress, len.rawAddress, flg)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun clearenv(): CInt =
    FuchsiaJniBridge.libcFuchsiaClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaWaitid(idtype.toInt(), id.toInt(), infop.rawAddress, options)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetreuid(ruid.toInt(), euid.toInt())

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetregid(rgid.toInt(), egid.toInt())

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetresuid(ruid.rawAddress, euid.rawAddress, suid.rawAddress)

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetresgid(rgid.rawAddress, egid.rawAddress, sgid.rawAddress)

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaAcct(filename.rawAddress)

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaBrk(addr.rawAddress)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    FuchsiaJniBridge.libcFuchsiaOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    FuchsiaJniBridge.libcFuchsiaExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    FuchsiaJniBridge.libcFuchsiaFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    FuchsiaJniBridge.libcFuchsiaLutimes(file.rawAddress, times.rawAddress)

public actual fun setpwent() {
    FuchsiaJniBridge.libcFuchsiaSetpwent()
}

public actual fun endpwent() {
    FuchsiaJniBridge.libcFuchsiaEndpwent()
}

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetpwent())

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    FuchsiaJniBridge.libcFuchsiaShmctl(shmid, cmd, buf.rawAddress)

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    FuchsiaJniBridge.libcFuchsiaFtok(pathname.rawAddress, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    FuchsiaJniBridge.libcFuchsiaMsgctl(msqid, cmd, buf.rawAddress)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaMsgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMsgsnd(msqid, msgp.rawAddress, msgsz.toLong(), msgflg)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaErrnoLocation())

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    FuchsiaJniBridge.libcFuchsiaFallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    FuchsiaJniBridge.libcFuchsiaPosixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaReadahead(fd, offset, count.toLong())

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSignalfd(fd, mask.rawAddress, flags)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    FuchsiaJniBridge.libcFuchsiaTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    FuchsiaJniBridge.libcFuchsiaTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    FuchsiaJniBridge.libcFuchsiaPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaQuotactl(cmd, special.rawAddress, id, data.rawAddress)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaDup3(oldfd, newfd, flags)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMkostemps(template.rawAddress, suffixlen, flags)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaNlLanginfoL(item, locale.rawAddress))

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun reboot(howTo: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaReboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetfsgid(gid.toInt())

public actual fun setfsuid(uid: UidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetfsuid(uid.toInt())

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    FuchsiaJniBridge.libcFuchsiaMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    FuchsiaJniBridge.libcFuchsiaIfFreenameindex(ptr.rawAddress)
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    FuchsiaJniBridge.libcFuchsiaSyncFileRange(fd, offset, nbytes, flags.toInt())

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    FuchsiaJniBridge.libcFuchsiaFreeifaddrs(ifa.rawAddress)
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    FuchsiaJniBridge.libcFuchsiaGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr<GlobT>) {
    FuchsiaJniBridge.libcFuchsiaGlobfree(pglob.rawAddress)
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaShmUnlink(name.rawAddress)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    FuchsiaJniBridge.libcFuchsiaSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    FuchsiaJniBridge.libcFuchsiaTelldir(dirp.rawAddress)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMsync(addr.rawAddress, len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    FuchsiaJniBridge.libcFuchsiaRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaMkstemps(template.rawAddress, suffixlen)

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    FuchsiaJniBridge.libcFuchsiaFutimes(fd, times.rawAddress)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaNlLanginfo(item))

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    FuchsiaJniBridge.libcFuchsiaBind(socket, address.rawAddress, addressLen.toInt())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaSendmsg(fd, msg.rawAddress, flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    FuchsiaJniBridge.libcFuchsiaRecvmsg(fd, msg.rawAddress, flags)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaGetdomainname(name.rawAddress, len.toLong())

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaSetdomainname(name.rawAddress, len.toLong())

public actual fun vhangup(): CInt =
    FuchsiaJniBridge.libcFuchsiaVhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun sync() {
    FuchsiaJniBridge.libcFuchsiaSync()
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    FuchsiaJniBridge.libcFuchsiaSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedGetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedSetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun umount(target: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaUmount(target.rawAddress)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    FuchsiaJniBridge.libcFuchsiaTee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    FuchsiaJniBridge.libcFuchsiaSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    FuchsiaJniBridge.libcFuchsiaSplice(fdIn, offIn.rawAddress, fdOut, offOut.rawAddress, len.toLong(), flags.toInt())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaEventfd(initval.toInt(), flags)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedRrGetInterval(pid, tp.rawAddress)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedSetparam(pid, param.rawAddress)

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaSwapoff(puath.rawAddress)

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    FuchsiaJniBridge.libcFuchsiaVmsplice(fd, iov.rawAddress, nrSegs.toLong(), flags.toInt())

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaMount(src.rawAddress, target.rawAddress, fstype.rawAddress, flags.toLong(), data.rawAddress)

public actual fun personality(persona: CUlong): CInt =
    FuchsiaJniBridge.libcFuchsiaPersonality(persona.toLong())

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedGetparam(pid, param.rawAddress)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPpoll(fds.rawAddress, nfds.toLong(), timeout.rawAddress, sigmask.rawAddress)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    FuchsiaJniBridge.libcFuchsiaClone(0L, childStack.rawAddress, flags, arg.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    FuchsiaJniBridge.libcFuchsiaClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    FuchsiaJniBridge.libcFuchsiaSethostname(name.rawAddress, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedGetPriorityMin(policy)

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaUmount2(target.rawAddress, flags)

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaSwapon(path.rawAddress, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    FuchsiaJniBridge.libcFuchsiaSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigsuspend(mask.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetgrgidR(gid.toInt(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    FuchsiaJniBridge.libcFuchsiaGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    FuchsiaJniBridge.libcFuchsiaInitgroups(user.rawAddress, group.toInt())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetgrnam(name.rawAddress))

public actual fun pthreadCancel(thread: PthreadT): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCancel(thread.toLong())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    FuchsiaJniBridge.libcFuchsiaSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetpwuidR(uid.toInt(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    FuchsiaJniBridge.libcFuchsiaSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetgrgid(gid.toInt()))

public actual fun setgrent() {
    FuchsiaJniBridge.libcFuchsiaSetgrent()
}

public actual fun endgrent() {
    FuchsiaJniBridge.libcFuchsiaEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaGetgrent())

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    FuchsiaJniBridge.libcFuchsiaGetgrouplist(user.rawAddress, group.toInt(), groups.rawAddress, ngroups.rawAddress)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(FuchsiaJniBridge.libcFuchsiaPopen(command.rawAddress, mode.rawAddress))

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libcFuchsiaFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    FuchsiaJniBridge.libcFuchsiaDlIteratePhdr(0L, data.rawAddress)
