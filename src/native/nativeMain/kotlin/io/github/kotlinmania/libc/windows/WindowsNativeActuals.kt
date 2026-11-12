@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAbort
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAbs
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAccept
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAccess
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAlignedFree
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAlignedMalloc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAlignedRealloc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAtexit
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAtof
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAtoi
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAtol
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsAtoll
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsBind
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsCalloc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsChdir
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsChmod
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsClock
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsClose
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsCommit
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsConnect
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsCreat
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsCtime
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsDifftime
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsDup
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsDup2
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExecl
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExecle
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExeclp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExeclpe
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExecv
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExecve
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExecvp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExecvpe
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsExit
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFclose
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFdopen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFeof
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFerror
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFflush
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFgetc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFgetpos
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFgets
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFileno
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFopen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFprintf
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFputc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFputs
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFread
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFree
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFreopen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFseek
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFsetpos
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFstat
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFtell
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsFwrite
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetDaylight
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetDstbias
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetOsfhandle
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetTimezone
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetTzname
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetchar
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetcwd
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetenv
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetpeername
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetpid
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetsockname
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGetsockopt
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsGmtimeS
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsalnum
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsalpha
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsatty
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsblank
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIscntrl
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsdigit
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsgraph
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIslower
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsprint
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIspunct
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsspace
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsupper
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsIsxdigit
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsLabs
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsListen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsLocaltimeS
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsLseek
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsLseek64
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMalloc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMemchr
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMemcmp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMemcpy
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMemmove
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMemset
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMkdir
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsMsize
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsOpen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsOpenOsfhandle
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPclose
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPerror
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPipe
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPopen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPrintf
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPutchar
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPutenv
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPutenvS
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsPuts
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsQsort
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsQsortS
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRaise
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRand
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRead
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRealloc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRecvfrom
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRemove
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRename
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRewind
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsRmdir
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSendto
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSetbuf
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSetlocale
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSetsockopt
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSetvbuf
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSignal
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSocket
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSrand
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStat
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrcat
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrchr
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrcmp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrcoll
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrcpy
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrcspn
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrdup
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrerror
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrlen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrncat
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrncmp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrncpy
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrnlen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrpbrk
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrrchr
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrspn
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrstr
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtod
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtof
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtok
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtol
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtoll
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtoul
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrtoull
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsStrxfrm
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsSystem
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsTime
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsTmpfile
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsTolower
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsToupper
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsTzset
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsUngetc
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsUnlink
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWchmod
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWcslen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWcsnlen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWcstombs
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexecl
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexecle
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexeclp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexeclpe
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexecv
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexecve
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexecvp
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWexecvpe
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWopen
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWputenv
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWputenvS
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWrite
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWrmdir
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWsetlocale
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWstat
import io.github.kotlinmania.libc.windows.cinterop.libcWindowsWutime
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWindowsPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWindowsFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun isalnum(c: CInt): CInt =
    libcWindowsIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcWindowsIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcWindowsIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcWindowsIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcWindowsIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcWindowsIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcWindowsIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcWindowsIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcWindowsIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcWindowsIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcWindowsIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libcWindowsIsblank(c)

public actual fun tolower(c: CInt): CInt =
    libcWindowsTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcWindowsToupper(c)

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    libcWindowsQsort(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())
}

public actual fun qsortS(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr<CVoid>) {
    libcWindowsQsortS(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcWindowsFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcWindowsFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fflush(file: MutPtr<FILE>): CInt =
    libcWindowsFflush(file.rawAddress.toCPointer<ByteVar>())

public actual fun fclose(file: MutPtr<FILE>): CInt =
    libcWindowsFclose(file.rawAddress.toCPointer<ByteVar>())

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    libcWindowsRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    libcWindowsRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(libcWindowsTmpfile()?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    libcWindowsSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    libcWindowsSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libcWindowsGetchar()

public actual fun putchar(c: CInt): CInt =
    libcWindowsPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    libcWindowsFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcWindowsFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcWindowsFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    libcWindowsFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun puts(s: ConstPtr<CChar>): CInt =
    libcWindowsPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcWindowsUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcWindowsFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcWindowsFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    libcWindowsFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    libcWindowsFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr<FILE>) {
    libcWindowsRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    libcWindowsFgetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    libcWindowsFsetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun feof(stream: MutPtr<FILE>): CInt =
    libcWindowsFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    libcWindowsFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun perror(s: ConstPtr<CChar>) {
    libcWindowsPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    libcWindowsAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    libcWindowsAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr<CChar>): CLong =
    libcWindowsAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    libcWindowsAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    libcWindowsStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    libcWindowsStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcWindowsStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    libcWindowsStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcWindowsStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    libcWindowsStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsMalloc(size)?.toLong() ?: 0L)

public actual fun msize(p: MutPtr<CVoid>): SizeT =
    libcWindowsMsize(p.rawAddress.toCPointer<ByteVar>())

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr<CVoid>) {
    libcWindowsFree(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libcWindowsAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libcWindowsExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    libcWindowsAtexit(0L.toCPointer<ByteVar>())

public actual fun system(s: ConstPtr<CChar>): CInt =
    libcWindowsSystem(s.rawAddress.toCPointer<ByteVar>())

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcWindowsStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcWindowsStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcWindowsStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    libcWindowsStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcWindowsStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcWindowsStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcWindowsStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcWindowsStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcWindowsStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcWindowsStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    libcWindowsStrnlen(cs.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(libcWindowsStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    libcWindowsStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    libcWindowsWcslen(buf.rawAddress.toCPointer<ByteVar>())

public actual fun wcsnlen(str: ConstPtr<WcharT>, numberOfElements: SizeT): SizeT =
    libcWindowsWcsnlen(str.rawAddress.toCPointer<ByteVar>(), numberOfElements)

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    libcWindowsWcstombs(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    libcWindowsMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun abs(i: CInt): CInt =
    libcWindowsAbs(i)

public actual fun labs(i: CLong): CLong =
    libcWindowsLabs(i)

public actual fun rand(): CInt =
    libcWindowsRand()

public actual fun srand(seed: CUint) {
    libcWindowsSrand(seed)
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libcWindowsSignal(signum, handler)

public actual fun raise(signum: CInt): CInt =
    libcWindowsRaise(signum)

public actual fun clock(): ClockT =
    libcWindowsClock()

public actual fun ctime(sourceTime: ConstPtr<TimeT>): MutPtr<CChar> =
    MutPtr(libcWindowsCtime(sourceTime.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    libcWindowsDifftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: MutPtr<Tm>, srcTime: ConstPtr<TimeT>): CInt =
    libcWindowsGmtimeS(destTime.rawAddress.toCPointer<ByteVar>(), srcTime.rawAddress.toCPointer<ByteVar>())

public actual fun getDaylight(hours: MutPtr<CInt>): ErrnoT =
    libcWindowsGetDaylight(hours.rawAddress.toCPointer<ByteVar>())

public actual fun getDstbias(seconds: MutPtr<CLong>): ErrnoT =
    libcWindowsGetDstbias(seconds.rawAddress.toCPointer<ByteVar>())

public actual fun getTimezone(seconds: MutPtr<CLong>): ErrnoT =
    libcWindowsGetTimezone(seconds.rawAddress.toCPointer<ByteVar>())

public actual fun getTzname(pReturnValue: MutPtr<SizeT>, timeZoneName: MutPtr<CChar>, sizeInBytes: SizeT, index: CInt): ErrnoT =
    libcWindowsGetTzname(pReturnValue.rawAddress.toCPointer<ByteVar>(), timeZoneName.rawAddress.toCPointer<ByteVar>(), sizeInBytes, index)

public actual fun localtimeS(tmDest: MutPtr<Tm>, sourceTime: ConstPtr<TimeT>): ErrnoT =
    libcWindowsLocaltimeS(tmDest.rawAddress.toCPointer<ByteVar>(), sourceTime.rawAddress.toCPointer<ByteVar>())

public actual fun time(destTime: MutPtr<TimeT>): TimeT =
    libcWindowsTime(destTime.rawAddress.toCPointer<ByteVar>())

public actual fun tzset() {
    libcWindowsTzset()
}

public actual fun chmod(path: ConstPtr<CChar>, mode: CInt): CInt =
    libcWindowsChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun wchmod(path: ConstPtr<WcharT>, mode: CInt): CInt =
    libcWindowsWchmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mkdir(path: ConstPtr<CChar>): CInt =
    libcWindowsMkdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun wrmdir(path: ConstPtr<WcharT>): CInt =
    libcWindowsWrmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    libcWindowsFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcWindowsStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun wstat(path: ConstPtr<WcharT>, buf: MutPtr<Stat>): CInt =
    libcWindowsWstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun wutime(file: ConstPtr<WcharT>, buf: MutPtr<Utimbuf>): CInt =
    libcWindowsWutime(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcWindowsPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    libcWindowsPclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcWindowsFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    libcWindowsFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcWindowsOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wopen(path: ConstPtr<WcharT>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcWindowsWopen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: CInt): CInt =
    libcWindowsCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    libcWindowsAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    libcWindowsChdir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun close(fd: CInt): CInt =
    libcWindowsClose(fd)

public actual fun dup(fd: CInt): CInt =
    libcWindowsDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libcWindowsDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    libcWindowsExecl(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexecl(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    libcWindowsWexecl(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    libcWindowsExecle(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexecle(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    libcWindowsWexecle(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    libcWindowsExeclp(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexeclp(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    libcWindowsWexeclp(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlpe(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    libcWindowsExeclpe(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexeclpe(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    libcWindowsWexeclpe(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): IntptrT =
    libcWindowsExecv(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcWindowsExecve(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    libcWindowsExecvp(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun execvpe(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcWindowsExecvpe(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun wexecv(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    libcWindowsWexecv(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun wexecve(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    libcWindowsWexecve(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun wexecvp(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    libcWindowsWexecvp(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun wexecvpe(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    libcWindowsWexecvpe(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun getcwd(buf: MutPtr<CChar>, size: CInt): MutPtr<CChar> =
    MutPtr(libcWindowsGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun getpid(): CInt =
    libcWindowsGetpid()

public actual fun isatty(fd: CInt): CInt =
    libcWindowsIsatty(fd)

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    libcWindowsLseek(fd, offset, origin)

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    libcWindowsLseek64(fd, offset, origin)

public actual fun pipe(fds: MutPtr<CInt>, psize: CUint, textmode: CInt): CInt =
    libcWindowsPipe(fds.rawAddress.toCPointer<ByteVar>(), psize, textmode)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: CUint): CInt =
    libcWindowsRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    libcWindowsRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    libcWindowsUnlink(c.rawAddress.toCPointer<ByteVar>())

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: CUint): CInt =
    libcWindowsWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun commit(fd: CInt): CInt =
    libcWindowsCommit(fd)

public actual fun getOsfhandle(fd: CInt): IntptrT =
    libcWindowsGetOsfhandle(fd)

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    libcWindowsOpenOsfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWindowsSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wsetlocale(category: CInt, locale: ConstPtr<WcharT>): MutPtr<WcharT> =
    MutPtr(libcWindowsWsetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsAlignedMalloc(size, alignment)?.toLong() ?: 0L)

public actual fun alignedFree(ptr: MutPtr<CVoid>) {
    libcWindowsAlignedFree(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun alignedRealloc(memblock: MutPtr<CVoid>, size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    MutPtr(libcWindowsAlignedRealloc(memblock.rawAddress.toCPointer<ByteVar>(), size, alignment)?.toLong() ?: 0L)

public actual fun putenv(envstring: ConstPtr<CChar>): CInt =
    libcWindowsPutenv(envstring.rawAddress.toCPointer<ByteVar>())

public actual fun wputenv(envstring: ConstPtr<WcharT>): CInt =
    libcWindowsWputenv(envstring.rawAddress.toCPointer<ByteVar>())

public actual fun putenvS(envstring: ConstPtr<CChar>, valueString: ConstPtr<CChar>): ErrnoT =
    libcWindowsPutenvS(envstring.rawAddress.toCPointer<ByteVar>(), valueString.rawAddress.toCPointer<ByteVar>())

public actual fun wputenvS(envstring: ConstPtr<WcharT>, valueString: ConstPtr<WcharT>): ErrnoT =
    libcWindowsWputenvS(envstring.rawAddress.toCPointer<ByteVar>(), valueString.rawAddress.toCPointer<ByteVar>())

public actual fun listen(s: Socket, backlog: CInt): CInt =
    libcWindowsListen(s, backlog)

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<CInt>): Socket =
    libcWindowsAccept(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    libcWindowsBind(s, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    libcWindowsConnect(s, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    libcWindowsGetpeername(s, name.rawAddress.toCPointer<ByteVar>(), nameln.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    libcWindowsGetsockname(s, name.rawAddress.toCPointer<ByteVar>(), nameln.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr<CChar>, optlen: MutPtr<CInt>): CInt =
    libcWindowsGetsockopt(s, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun recvfrom(s: Socket, buf: MutPtr<CChar>, len: CInt, flags: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<CInt>): CInt =
    libcWindowsRecvfrom(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags, from.rawAddress.toCPointer<ByteVar>(), fromlen.rawAddress.toCPointer<ByteVar>())

public actual fun sendto(s: Socket, buf: ConstPtr<CChar>, len: CInt, flags: CInt, to: ConstPtr<Sockaddr>, tolen: CInt): CInt =
    libcWindowsSendto(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags, to.rawAddress.toCPointer<ByteVar>(), tolen)

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr<CChar>, optlen: CInt): CInt =
    libcWindowsSetsockopt(s, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen)

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    libcWindowsSocket(af, socketType, protocol)
