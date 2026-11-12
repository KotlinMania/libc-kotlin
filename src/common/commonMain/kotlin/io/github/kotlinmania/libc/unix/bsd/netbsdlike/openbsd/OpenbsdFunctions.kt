package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.IOCPARM_MASK
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: ULong, data: MutPtr): CInt
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr): CInt
}

// sys/ioccom.h
public fun iocparmLen(x: UInt): UInt = (x shr 16) and IOCPARM_MASK

public fun iocbasecmd(x: UInt): UInt = x and ((IOCPARM_MASK shl 16).inv())

public fun iocgroup(x: UInt): UInt = (x shr 8) and 0xffu

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong = (inout) or (((len) and IOCPARM_MASK.toULong()) shl 16) or ((group) shl 8) or (num)

public fun align(p: Int): Int = (p + ALIGNBYTES) and ALIGNBYTES.inv()

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + align(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr(0L)
    } else {
        MutPtr((cmsg.rawAddress.toInt() + align(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = (align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + align(length.toInt())).toUInt()

public fun wstopsig(status: CInt): CInt = status shr 8

public fun wifsignaled(status: CInt): Boolean = (status and 127) != 127 && (status and 127) != 0

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 127

public fun wifcontinued(status: CInt): Boolean = (status and 65535) == 65535

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toInt()
    val minor1 = minor.toInt()
    var dev = 0
    dev = dev or ((major1 and 0xff) shl 8)
    dev = dev or (minor1 and 0xff)
    dev = dev or ((minor1 and 0xffff00) shl 8)
    return dev
}

public fun major(dev: DevT): CUint = ((dev.toUInt()) shr 8) and 0xffu

public fun minor(dev: DevT): CUint {
    val dev1 = dev.toUInt()
    var res = 0u
    res = res or ((dev1) and 0xffu)
    res = res or (((dev1) and 0xffff0000u) shr 8)
    return res
}

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt

public expect fun pledge(promises: ConstPtr, execpromises: ConstPtr): CInt

public expect fun unveil(path: ConstPtr, permissions: ConstPtr): CInt

public expect fun strtonum(nptr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstr: MutPtr): CLonglong

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun chflags(path: ConstPtr, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun chflagsat(fd: CInt, path: ConstPtr, flags: CUint, atflag: CInt): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt

public expect fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt

public expect fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun getthrid(): PidT

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr)

public expect fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT

public expect fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt

public expect fun utrace(label: ConstPtr, addr: ConstPtr, len: SizeT): CInt

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun duplocale(base: LocaleT): LocaleT

// Added in `OpenBSD` 5.5
public expect fun explicitBzero(s: MutPtr, len: SizeT)

public expect fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long)

public expect fun freezero(ptr: MutPtr, size: SizeT)

public expect fun mallocConceal(size: SizeT): MutPtr

public expect fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr

public expect fun srand48Deterministic(seed: CLong)

public expect fun seed48Deterministic(xseed: MutPtr): MutPtr

public expect fun lcong48Deterministic(p: MutPtr)

public expect fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr

public expect fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): MutPtr

// futex.h
public expect fun futex(uaddr: MutPtr, op: CInt, value: CInt, timeout: ConstPtr, uaddr2: MutPtr): CInt

public expect fun mimmutable(addr: MutPtr, len: SizeT): CInt

public expect fun reboot(mode: CInt): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt

public expect fun getfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt

public expect fun backtrace(addrlist: MutPtr, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr

public expect fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr
