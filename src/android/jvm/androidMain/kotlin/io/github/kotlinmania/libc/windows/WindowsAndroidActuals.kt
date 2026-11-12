@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcWindowsPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWindowsFprintf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWindowsIsalnum(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsalpha(c: Int): Int

    @JvmStatic
    external fun libcWindowsIscntrl(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsdigit(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsgraph(c: Int): Int

    @JvmStatic
    external fun libcWindowsIslower(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsprint(c: Int): Int

    @JvmStatic
    external fun libcWindowsIspunct(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsspace(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsupper(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcWindowsIsblank(c: Int): Int

    @JvmStatic
    external fun libcWindowsTolower(c: Int): Int

    @JvmStatic
    external fun libcWindowsToupper(c: Int): Int

    @JvmStatic
    external fun libcWindowsQsort(base: Long, num: Long, size: Long, compar: Long)

    @JvmStatic
    external fun libcWindowsQsortS(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcWindowsFopen(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcWindowsFreopen(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcWindowsFflush(file: Long): Int

    @JvmStatic
    external fun libcWindowsFclose(file: Long): Int

    @JvmStatic
    external fun libcWindowsRemove(filename: Long): Int

    @JvmStatic
    external fun libcWindowsRename(oldname: Long, newname: Long): Int

    @JvmStatic
    external fun libcWindowsTmpfile(): Long

    @JvmStatic
    external fun libcWindowsSetvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libcWindowsSetbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libcWindowsGetchar(): Int

    @JvmStatic
    external fun libcWindowsPutchar(c: Int): Int

    @JvmStatic
    external fun libcWindowsFgetc(stream: Long): Int

    @JvmStatic
    external fun libcWindowsFgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libcWindowsFputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcWindowsFputs(s: Long, stream: Long): Int

    @JvmStatic
    external fun libcWindowsPuts(s: Long): Int

    @JvmStatic
    external fun libcWindowsUngetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcWindowsFread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcWindowsFwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcWindowsFseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcWindowsFtell(stream: Long): Long

    @JvmStatic
    external fun libcWindowsRewind(stream: Long)

    @JvmStatic
    external fun libcWindowsFgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcWindowsFsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcWindowsFeof(stream: Long): Int

    @JvmStatic
    external fun libcWindowsFerror(stream: Long): Int

    @JvmStatic
    external fun libcWindowsPerror(s: Long)

    @JvmStatic
    external fun libcWindowsAtof(s: Long): Double

    @JvmStatic
    external fun libcWindowsAtoi(s: Long): Int

    @JvmStatic
    external fun libcWindowsAtol(s: Long): Long

    @JvmStatic
    external fun libcWindowsAtoll(s: Long): Long

    @JvmStatic
    external fun libcWindowsStrtod(s: Long, endp: Long): Double

    @JvmStatic
    external fun libcWindowsStrtof(s: Long, endp: Long): Float

    @JvmStatic
    external fun libcWindowsStrtol(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWindowsStrtoll(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWindowsStrtoul(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWindowsStrtoull(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWindowsCalloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libcWindowsMalloc(size: Long): Long

    @JvmStatic
    external fun libcWindowsMsize(p: Long): Long

    @JvmStatic
    external fun libcWindowsRealloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libcWindowsFree(p: Long)

    @JvmStatic
    external fun libcWindowsAbort()

    @JvmStatic
    external fun libcWindowsExit(status: Int)

    @JvmStatic
    external fun libcWindowsAtexit(cb: Long): Int

    @JvmStatic
    external fun libcWindowsSystem(s: Long): Int

    @JvmStatic
    external fun libcWindowsGetenv(s: Long): Long

    @JvmStatic
    external fun libcWindowsStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcWindowsStrncpy(dst: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWindowsStrcat(s: Long, ct: Long): Long

    @JvmStatic
    external fun libcWindowsStrncat(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcWindowsStrcmp(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcWindowsStrncmp(cs: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcWindowsStrcoll(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcWindowsStrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcWindowsStrrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcWindowsStrspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWindowsStrcspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWindowsStrdup(cs: Long): Long

    @JvmStatic
    external fun libcWindowsStrpbrk(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWindowsStrstr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWindowsStrlen(cs: Long): Long

    @JvmStatic
    external fun libcWindowsStrnlen(cs: Long, maxlen: Long): Long

    @JvmStatic
    external fun libcWindowsStrerror(n: Int): Long

    @JvmStatic
    external fun libcWindowsStrtok(s: Long, t: Long): Long

    @JvmStatic
    external fun libcWindowsStrxfrm(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcWindowsWcslen(buf: Long): Long

    @JvmStatic
    external fun libcWindowsWcsnlen(str: Long, numberOfElements: Long): Long

    @JvmStatic
    external fun libcWindowsWcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWindowsMemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcWindowsMemcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcWindowsMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWindowsMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWindowsMemset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcWindowsAbs(i: Int): Int

    @JvmStatic
    external fun libcWindowsLabs(i: Long): Long

    @JvmStatic
    external fun libcWindowsRand(): Int

    @JvmStatic
    external fun libcWindowsSrand(seed: Int)

    @JvmStatic
    external fun libcWindowsSignal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libcWindowsRaise(signum: Int): Int

    @JvmStatic
    external fun libcWindowsClock(): Int

    @JvmStatic
    external fun libcWindowsCtime(sourceTime: Long): Long

    @JvmStatic
    external fun libcWindowsDifftime(timeEnd: Long, timeStart: Long): Double

    @JvmStatic
    external fun libcWindowsGmtimeS(destTime: Long, srcTime: Long): Int

    @JvmStatic
    external fun libcWindowsGetDaylight(hours: Long): Int

    @JvmStatic
    external fun libcWindowsGetDstbias(seconds: Long): Int

    @JvmStatic
    external fun libcWindowsGetTimezone(seconds: Long): Int

    @JvmStatic
    external fun libcWindowsGetTzname(pReturnValue: Long, timeZoneName: Long, sizeInBytes: Long, index: Int): Int

    @JvmStatic
    external fun libcWindowsLocaltimeS(tmDest: Long, sourceTime: Long): Int

    @JvmStatic
    external fun libcWindowsTime(destTime: Long): Long

    @JvmStatic
    external fun libcWindowsTzset()

    @JvmStatic
    external fun libcWindowsChmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcWindowsWchmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcWindowsMkdir(path: Long): Int

    @JvmStatic
    external fun libcWindowsWrmdir(path: Long): Int

    @JvmStatic
    external fun libcWindowsFstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcWindowsStat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcWindowsWstat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcWindowsWutime(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcWindowsPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcWindowsPclose(stream: Long): Int

    @JvmStatic
    external fun libcWindowsFdopen(fd: Int, mode: Long): Long

    @JvmStatic
    external fun libcWindowsFileno(stream: Long): Int

    @JvmStatic
    external fun libcWindowsOpen(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWindowsWopen(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWindowsCreat(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcWindowsAccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcWindowsChdir(dir: Long): Int

    @JvmStatic
    external fun libcWindowsClose(fd: Int): Int

    @JvmStatic
    external fun libcWindowsDup(fd: Int): Int

    @JvmStatic
    external fun libcWindowsDup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libcWindowsExecl(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsWexecl(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsExecle(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsWexecle(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsExeclp(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsWexeclp(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsExeclpe(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsWexeclpe(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcWindowsExecv(prog: Long, argv: Long): Long

    @JvmStatic
    external fun libcWindowsExecve(prog: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcWindowsExecvp(c: Long, argv: Long): Int

    @JvmStatic
    external fun libcWindowsExecvpe(c: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcWindowsWexecv(prog: Long, argv: Long): Long

    @JvmStatic
    external fun libcWindowsWexecve(prog: Long, argv: Long, envp: Long): Long

    @JvmStatic
    external fun libcWindowsWexecvp(c: Long, argv: Long): Long

    @JvmStatic
    external fun libcWindowsWexecvpe(c: Long, argv: Long, envp: Long): Long

    @JvmStatic
    external fun libcWindowsGetcwd(buf: Long, size: Int): Long

    @JvmStatic
    external fun libcWindowsGetpid(): Int

    @JvmStatic
    external fun libcWindowsIsatty(fd: Int): Int

    @JvmStatic
    external fun libcWindowsLseek(fd: Int, offset: Long, origin: Int): Long

    @JvmStatic
    external fun libcWindowsLseek64(fd: Int, offset: Long, origin: Int): Long

    @JvmStatic
    external fun libcWindowsPipe(fds: Long, psize: Int, textmode: Int): Int

    @JvmStatic
    external fun libcWindowsRead(fd: Int, buf: Long, count: Int): Int

    @JvmStatic
    external fun libcWindowsRmdir(path: Long): Int

    @JvmStatic
    external fun libcWindowsUnlink(c: Long): Int

    @JvmStatic
    external fun libcWindowsWrite(fd: Int, buf: Long, count: Int): Int

    @JvmStatic
    external fun libcWindowsCommit(fd: Int): Int

    @JvmStatic
    external fun libcWindowsGetOsfhandle(fd: Int): Long

    @JvmStatic
    external fun libcWindowsOpenOsfhandle(osfhandle: Long, flags: Int): Int

    @JvmStatic
    external fun libcWindowsSetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libcWindowsWsetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libcWindowsAlignedMalloc(size: Long, alignment: Long): Long

    @JvmStatic
    external fun libcWindowsAlignedFree(ptr: Long)

    @JvmStatic
    external fun libcWindowsAlignedRealloc(memblock: Long, size: Long, alignment: Long): Long

    @JvmStatic
    external fun libcWindowsPutenv(envstring: Long): Int

    @JvmStatic
    external fun libcWindowsWputenv(envstring: Long): Int

    @JvmStatic
    external fun libcWindowsPutenvS(envstring: Long, valueString: Long): Int

    @JvmStatic
    external fun libcWindowsWputenvS(envstring: Long, valueString: Long): Int

    @JvmStatic
    external fun libcWindowsListen(s: Long, backlog: Int): Int

    @JvmStatic
    external fun libcWindowsAccept(s: Long, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcWindowsBind(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun libcWindowsConnect(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun libcWindowsGetpeername(s: Long, name: Long, nameln: Long): Int

    @JvmStatic
    external fun libcWindowsGetsockname(s: Long, name: Long, nameln: Long): Int

    @JvmStatic
    external fun libcWindowsGetsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libcWindowsRecvfrom(s: Long, buf: Long, len: Int, flags: Int, from: Long, fromlen: Long): Int

    @JvmStatic
    external fun libcWindowsSendto(s: Long, buf: Long, len: Int, flags: Int, to: Long, tolen: Int): Int

    @JvmStatic
    external fun libcWindowsSetsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun libcWindowsSocket(af: Int, socketType: Int, protocol: Int): Long
}

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WindowsJniBridge.libcWindowsPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WindowsJniBridge.libcWindowsFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun isalnum(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsgraph(c)

public actual fun islower(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIslower(c)

public actual fun isprint(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIspunct(c)

public actual fun isspace(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsspace(c)

public actual fun isupper(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    WindowsJniBridge.libcWindowsIsblank(c)

public actual fun tolower(c: CInt): CInt =
    WindowsJniBridge.libcWindowsTolower(c)

public actual fun toupper(c: CInt): CInt =
    WindowsJniBridge.libcWindowsToupper(c)

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    WindowsJniBridge.libcWindowsQsort(base.rawAddress, num.toLong(), size.toLong(), 0L)
}

public actual fun qsortS(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr<CVoid>) {
    WindowsJniBridge.libcWindowsQsortS(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(WindowsJniBridge.libcWindowsFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(WindowsJniBridge.libcWindowsFreopen(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fflush(file: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFflush(file.rawAddress)

public actual fun fclose(file: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFclose(file.rawAddress)

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsRemove(filename.rawAddress)

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsRename(oldname.rawAddress, newname.rawAddress)

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(WindowsJniBridge.libcWindowsTmpfile())

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    WindowsJniBridge.libcWindowsSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    WindowsJniBridge.libcWindowsSetbuf(stream.rawAddress, buf.rawAddress)
}

public actual fun getchar(): CInt =
    WindowsJniBridge.libcWindowsGetchar()

public actual fun putchar(c: CInt): CInt =
    WindowsJniBridge.libcWindowsPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFgetc(stream.rawAddress)

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsFgets(buf.rawAddress, n, stream.rawAddress))

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFputc(c, stream.rawAddress)

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFputs(s.rawAddress, stream.rawAddress)

public actual fun puts(s: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsPuts(s.rawAddress)

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsUngetc(c, stream.rawAddress)

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    WindowsJniBridge.libcWindowsFread(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    WindowsJniBridge.libcWindowsFwrite(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    WindowsJniBridge.libcWindowsFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    WindowsJniBridge.libcWindowsFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr<FILE>) {
    WindowsJniBridge.libcWindowsRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    WindowsJniBridge.libcWindowsFgetpos(stream.rawAddress, ptr.rawAddress)

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    WindowsJniBridge.libcWindowsFsetpos(stream.rawAddress, ptr.rawAddress)

public actual fun feof(stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFerror(stream.rawAddress)

public actual fun perror(s: ConstPtr<CChar>) {
    WindowsJniBridge.libcWindowsPerror(s.rawAddress)
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    WindowsJniBridge.libcWindowsAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr<CChar>): CLong =
    WindowsJniBridge.libcWindowsAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    WindowsJniBridge.libcWindowsAtoll(s.rawAddress)

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    WindowsJniBridge.libcWindowsStrtod(s.rawAddress, endp.rawAddress)

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    WindowsJniBridge.libcWindowsStrtof(s.rawAddress, endp.rawAddress)

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    WindowsJniBridge.libcWindowsStrtol(s.rawAddress, endp.rawAddress, base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    WindowsJniBridge.libcWindowsStrtoll(s.rawAddress, endp.rawAddress, base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    WindowsJniBridge.libcWindowsStrtoul(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    WindowsJniBridge.libcWindowsStrtoull(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsMalloc(size.toLong()))

public actual fun msize(p: MutPtr<CVoid>): SizeT =
    WindowsJniBridge.libcWindowsMsize(p.rawAddress).toULong()

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsRealloc(p.rawAddress, size.toLong()))

public actual fun free(p: MutPtr<CVoid>) {
    WindowsJniBridge.libcWindowsFree(p.rawAddress)
}

public actual fun abort(): Nothing {
    WindowsJniBridge.libcWindowsAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    WindowsJniBridge.libcWindowsExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    WindowsJniBridge.libcWindowsAtexit(0L)

public actual fun system(s: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsSystem(s.rawAddress)

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsGetenv(s.rawAddress))

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrcpy(dst.rawAddress, src.rawAddress))

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrcat(s.rawAddress, ct.rawAddress))

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrncat(s.rawAddress, ct.rawAddress, n.toLong()))

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsStrcmp(cs.rawAddress, ct.rawAddress)

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    WindowsJniBridge.libcWindowsStrncmp(cs.rawAddress, ct.rawAddress, n.toLong())

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsStrcoll(cs.rawAddress, ct.rawAddress)

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrchr(cs.rawAddress, c))

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrrchr(cs.rawAddress, c))

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    WindowsJniBridge.libcWindowsStrspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    WindowsJniBridge.libcWindowsStrcspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrdup(cs.rawAddress))

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrpbrk(cs.rawAddress, ct.rawAddress))

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrstr(cs.rawAddress, ct.rawAddress))

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    WindowsJniBridge.libcWindowsStrlen(cs.rawAddress).toULong()

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    WindowsJniBridge.libcWindowsStrnlen(cs.rawAddress, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrerror(n))

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsStrtok(s.rawAddress, t.rawAddress))

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    WindowsJniBridge.libcWindowsStrxfrm(s.rawAddress, ct.rawAddress, n.toLong()).toULong()

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    WindowsJniBridge.libcWindowsWcslen(buf.rawAddress).toULong()

public actual fun wcsnlen(str: ConstPtr<WcharT>, numberOfElements: SizeT): SizeT =
    WindowsJniBridge.libcWindowsWcsnlen(str.rawAddress, numberOfElements.toLong()).toULong()

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    WindowsJniBridge.libcWindowsWcstombs(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsMemchr(cx.rawAddress, c, n.toLong()))

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    WindowsJniBridge.libcWindowsMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsMemset(dest.rawAddress, c, n.toLong()))

public actual fun abs(i: CInt): CInt =
    WindowsJniBridge.libcWindowsAbs(i)

public actual fun labs(i: CLong): CLong =
    WindowsJniBridge.libcWindowsLabs(i)

public actual fun rand(): CInt =
    WindowsJniBridge.libcWindowsRand()

public actual fun srand(seed: CUint) {
    WindowsJniBridge.libcWindowsSrand(seed.toInt())
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    WindowsJniBridge.libcWindowsSignal(signum, handler.toLong()).toULong()

public actual fun raise(signum: CInt): CInt =
    WindowsJniBridge.libcWindowsRaise(signum)

public actual fun clock(): ClockT =
    WindowsJniBridge.libcWindowsClock()

public actual fun ctime(sourceTime: ConstPtr<TimeT>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsCtime(sourceTime.rawAddress))

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    WindowsJniBridge.libcWindowsDifftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: MutPtr<Tm>, srcTime: ConstPtr<TimeT>): CInt =
    WindowsJniBridge.libcWindowsGmtimeS(destTime.rawAddress, srcTime.rawAddress)

public actual fun getDaylight(hours: MutPtr<CInt>): ErrnoT =
    WindowsJniBridge.libcWindowsGetDaylight(hours.rawAddress)

public actual fun getDstbias(seconds: MutPtr<CLong>): ErrnoT =
    WindowsJniBridge.libcWindowsGetDstbias(seconds.rawAddress)

public actual fun getTimezone(seconds: MutPtr<CLong>): ErrnoT =
    WindowsJniBridge.libcWindowsGetTimezone(seconds.rawAddress)

public actual fun getTzname(pReturnValue: MutPtr<SizeT>, timeZoneName: MutPtr<CChar>, sizeInBytes: SizeT, index: CInt): ErrnoT =
    WindowsJniBridge.libcWindowsGetTzname(pReturnValue.rawAddress, timeZoneName.rawAddress, sizeInBytes.toLong(), index)

public actual fun localtimeS(tmDest: MutPtr<Tm>, sourceTime: ConstPtr<TimeT>): ErrnoT =
    WindowsJniBridge.libcWindowsLocaltimeS(tmDest.rawAddress, sourceTime.rawAddress)

public actual fun time(destTime: MutPtr<TimeT>): TimeT =
    WindowsJniBridge.libcWindowsTime(destTime.rawAddress)

public actual fun tzset() {
    WindowsJniBridge.libcWindowsTzset()
}

public actual fun chmod(path: ConstPtr<CChar>, mode: CInt): CInt =
    WindowsJniBridge.libcWindowsChmod(path.rawAddress, mode)

public actual fun wchmod(path: ConstPtr<WcharT>, mode: CInt): CInt =
    WindowsJniBridge.libcWindowsWchmod(path.rawAddress, mode)

public actual fun mkdir(path: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsMkdir(path.rawAddress)

public actual fun wrmdir(path: ConstPtr<WcharT>): CInt =
    WindowsJniBridge.libcWindowsWrmdir(path.rawAddress)

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    WindowsJniBridge.libcWindowsFstat(fildes, buf.rawAddress)

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    WindowsJniBridge.libcWindowsStat(path.rawAddress, buf.rawAddress)

public actual fun wstat(path: ConstPtr<WcharT>, buf: MutPtr<Stat>): CInt =
    WindowsJniBridge.libcWindowsWstat(path.rawAddress, buf.rawAddress)

public actual fun wutime(file: ConstPtr<WcharT>, buf: MutPtr<Utimbuf>): CInt =
    WindowsJniBridge.libcWindowsWutime(file.rawAddress, buf.rawAddress)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(WindowsJniBridge.libcWindowsPopen(command.rawAddress, mode.rawAddress))

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsPclose(stream.rawAddress)

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(WindowsJniBridge.libcWindowsFdopen(fd, mode.rawAddress))

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    WindowsJniBridge.libcWindowsFileno(stream.rawAddress)

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    WindowsJniBridge.libcWindowsOpen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wopen(path: ConstPtr<WcharT>, oflag: CInt, vararg variadicArgs: Long): CInt =
    WindowsJniBridge.libcWindowsWopen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: CInt): CInt =
    WindowsJniBridge.libcWindowsCreat(path.rawAddress, mode)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    WindowsJniBridge.libcWindowsAccess(path.rawAddress, amode)

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsChdir(dir.rawAddress)

public actual fun close(fd: CInt): CInt =
    WindowsJniBridge.libcWindowsClose(fd)

public actual fun dup(fd: CInt): CInt =
    WindowsJniBridge.libcWindowsDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    WindowsJniBridge.libcWindowsDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsExecl(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexecl(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsWexecl(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsExecle(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexecle(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsWexecle(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsExeclp(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexeclp(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsWexeclp(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlpe(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsExeclpe(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexeclpe(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    WindowsJniBridge.libcWindowsWexeclpe(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): IntptrT =
    WindowsJniBridge.libcWindowsExecv(prog.rawAddress, argv.rawAddress)

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    WindowsJniBridge.libcWindowsExecve(prog.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    WindowsJniBridge.libcWindowsExecvp(c.rawAddress, argv.rawAddress)

public actual fun execvpe(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    WindowsJniBridge.libcWindowsExecvpe(c.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun wexecv(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    WindowsJniBridge.libcWindowsWexecv(prog.rawAddress, argv.rawAddress)

public actual fun wexecve(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    WindowsJniBridge.libcWindowsWexecve(prog.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun wexecvp(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    WindowsJniBridge.libcWindowsWexecvp(c.rawAddress, argv.rawAddress)

public actual fun wexecvpe(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    WindowsJniBridge.libcWindowsWexecvpe(c.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun getcwd(buf: MutPtr<CChar>, size: CInt): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsGetcwd(buf.rawAddress, size))

public actual fun getpid(): CInt =
    WindowsJniBridge.libcWindowsGetpid()

public actual fun isatty(fd: CInt): CInt =
    WindowsJniBridge.libcWindowsIsatty(fd)

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    WindowsJniBridge.libcWindowsLseek(fd, offset, origin)

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    WindowsJniBridge.libcWindowsLseek64(fd, offset, origin)

public actual fun pipe(fds: MutPtr<CInt>, psize: CUint, textmode: CInt): CInt =
    WindowsJniBridge.libcWindowsPipe(fds.rawAddress, psize.toInt(), textmode)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: CUint): CInt =
    WindowsJniBridge.libcWindowsRead(fd, buf.rawAddress, count.toInt())

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsRmdir(path.rawAddress)

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsUnlink(c.rawAddress)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: CUint): CInt =
    WindowsJniBridge.libcWindowsWrite(fd, buf.rawAddress, count.toInt())

public actual fun commit(fd: CInt): CInt =
    WindowsJniBridge.libcWindowsCommit(fd)

public actual fun getOsfhandle(fd: CInt): IntptrT =
    WindowsJniBridge.libcWindowsGetOsfhandle(fd)

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    WindowsJniBridge.libcWindowsOpenOsfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WindowsJniBridge.libcWindowsSetlocale(category, locale.rawAddress))

public actual fun wsetlocale(category: CInt, locale: ConstPtr<WcharT>): MutPtr<WcharT> =
    MutPtr(WindowsJniBridge.libcWindowsWsetlocale(category, locale.rawAddress))

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsAlignedMalloc(size.toLong(), alignment.toLong()))

public actual fun alignedFree(ptr: MutPtr<CVoid>) {
    WindowsJniBridge.libcWindowsAlignedFree(ptr.rawAddress)
}

public actual fun alignedRealloc(memblock: MutPtr<CVoid>, size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    MutPtr(WindowsJniBridge.libcWindowsAlignedRealloc(memblock.rawAddress, size.toLong(), alignment.toLong()))

public actual fun putenv(envstring: ConstPtr<CChar>): CInt =
    WindowsJniBridge.libcWindowsPutenv(envstring.rawAddress)

public actual fun wputenv(envstring: ConstPtr<WcharT>): CInt =
    WindowsJniBridge.libcWindowsWputenv(envstring.rawAddress)

public actual fun putenvS(envstring: ConstPtr<CChar>, valueString: ConstPtr<CChar>): ErrnoT =
    WindowsJniBridge.libcWindowsPutenvS(envstring.rawAddress, valueString.rawAddress)

public actual fun wputenvS(envstring: ConstPtr<WcharT>, valueString: ConstPtr<WcharT>): ErrnoT =
    WindowsJniBridge.libcWindowsWputenvS(envstring.rawAddress, valueString.rawAddress)

public actual fun listen(s: Socket, backlog: CInt): CInt =
    WindowsJniBridge.libcWindowsListen(s.toLong(), backlog)

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<CInt>): Socket =
    WindowsJniBridge.libcWindowsAccept(s.toLong(), addr.rawAddress, addrlen.rawAddress).toULong()

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    WindowsJniBridge.libcWindowsBind(s.toLong(), name.rawAddress, namelen)

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    WindowsJniBridge.libcWindowsConnect(s.toLong(), name.rawAddress, namelen)

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    WindowsJniBridge.libcWindowsGetpeername(s.toLong(), name.rawAddress, nameln.rawAddress)

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    WindowsJniBridge.libcWindowsGetsockname(s.toLong(), name.rawAddress, nameln.rawAddress)

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr<CChar>, optlen: MutPtr<CInt>): CInt =
    WindowsJniBridge.libcWindowsGetsockopt(s.toLong(), level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun recvfrom(s: Socket, buf: MutPtr<CChar>, len: CInt, flags: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<CInt>): CInt =
    WindowsJniBridge.libcWindowsRecvfrom(s.toLong(), buf.rawAddress, len, flags, from.rawAddress, fromlen.rawAddress)

public actual fun sendto(s: Socket, buf: ConstPtr<CChar>, len: CInt, flags: CInt, to: ConstPtr<Sockaddr>, tolen: CInt): CInt =
    WindowsJniBridge.libcWindowsSendto(s.toLong(), buf.rawAddress, len, flags, to.rawAddress, tolen)

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr<CChar>, optlen: CInt): CInt =
    WindowsJniBridge.libcWindowsSetsockopt(s.toLong(), level, optname, optval.rawAddress, optlen)

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    WindowsJniBridge.libcWindowsSocket(af, socketType, protocol).toULong()
