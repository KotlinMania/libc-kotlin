package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CMSG_FIRSTHDR
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.IOCPARM_MASK
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.aarch64.ALIGNBYTES

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

// sys/ioccom.h
public fun iocparmLen(x: UInt): UInt {
    return (x shr 16) and IOCPARM_MASK
}

public fun iocbasecmd(x: UInt): UInt {
    return x and ((IOCPARM_MASK shl 16).inv())
}

public fun iocgroup(x: UInt): UInt {
    return (x shr 8) and 0xffu
}

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong {
    return (inout) or (((len) and IOCPARM_MASK.toULong()) shl 16) or ((group) shl 8) or (num)
}

public fun align(p: Int): Int {
    return (p + ALIGNBYTES) and ALIGNBYTES.inv()
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (ALIGN(sizeOf<Cmsghdr>()).toInt()).toLong()) }
}

public fun cmsgLen(length: CUint): CUint {
    return ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return CMSG_FIRSTHDR(mhdr)
    }
    val next = ((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + ALIGN((cmsg!!.cmsgLen).toInt()) + ALIGN(sizeOf<Cmsghdr>())
    val max = (mhdr!!.msgControl).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next > max) {
        nullMut<Cmsghdr>()
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return (ALIGN(sizeOf<Cmsghdr>()) + ALIGN(length.toInt())).toUInt()
}

public fun wstopsig(status: CInt): CInt {
    return status shr 8
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 127
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 65535) == 65535
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toInt()
    val minor1 = minor.toInt()
    var dev = 0
    dev = dev or ((major1 and 0xff) shl 8)
    dev = dev or (minor1 and 0xff)
    dev = dev or ((minor1 and 0xffff00) shl 8)
    return dev
}

public fun major(dev: DevT): CUint {
    return ((dev.toUInt()) shr 8) and 0xffu
}

public fun minor(dev: DevT): CUint {
    val dev1 = dev.toUInt()
    var res = 0
    res = res or ((dev1) and 0xffu)
    res = res or (((dev1) and 0xffff0000u) shr 8)
    return res
}

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun pledge(promises: String?, execpromises: String?): CInt

public expect fun unveil(path: String?, permissions: String?): CInt

public expect fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun chflags(path: String?, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt

public expect fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt

public expect fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt

public expect fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun getthrid(): PidT

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: String?)

public expect fun pthreadStacksegNp(thread: PthreadT, sinfo: COpaquePointer?): CInt

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

public expect fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt

public expect fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun duplocale(base: LocaleT): LocaleT

// Added in `OpenBSD` 5.5
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

public expect fun setproctitle(fmt: String?, vararg variadicArgs: Long)

public expect fun freezero(ptr: COpaquePointer?, size: SizeT)

public expect fun mallocConceal(size: SizeT): COpaquePointer?

public expect fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun srand48Deterministic(seed: CLong)

public expect fun seed48Deterministic(xseed: COpaquePointer?): COpaquePointer?

public expect fun lcong48Deterministic(p: COpaquePointer?)

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): COpaquePointer?

// futex.h
public expect fun futex(uaddr: COpaquePointer?, op: CInt, value: CInt, timeout: COpaquePointer?, uaddr2: COpaquePointer?): CInt

public expect fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt

public expect fun reboot(mode: CInt): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt

public expect fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer?

public expect fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer?
