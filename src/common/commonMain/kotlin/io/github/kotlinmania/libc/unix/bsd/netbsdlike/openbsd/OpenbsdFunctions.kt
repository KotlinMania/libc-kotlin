package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.IOCPARM_MASK
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Timezone
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: ULong, data: MutPtr<CVoid>): CInt
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>): CInt
}

// sys/ioccom.h
public fun iocparmLen(x: UInt): UInt = (x shr 16) and IOCPARM_MASK

public fun iocbasecmd(x: UInt): UInt = x and ((IOCPARM_MASK shl 16).inv())

public fun iocgroup(x: UInt): UInt = (x shr 8) and 0xffu

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong = (inout) or (((len) and IOCPARM_MASK.toULong()) shl 16) or ((group) shl 8) or (num)

public fun align(p: Int): Int = (p + ALIGNBYTES) and ALIGNBYTES.inv()

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

public fun cmsgLen(length: CUint): CUint = align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + align(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))
    val max = ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + align(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = (align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())) + align(length.toInt())).toUInt()

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

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt

public expect fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun pledge(promises: ConstPtr<CChar>, execpromises: ConstPtr<CChar>): CInt

public expect fun unveil(path: ConstPtr<CChar>, permissions: ConstPtr<CChar>): CInt

public expect fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun chflags(path: ConstPtr<CChar>, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUint, atflag: CInt): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt

public expect fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt

public expect fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun getthrid(): PidT

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>)

public expect fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr<StackT>): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT

public expect fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt

public expect fun utrace(label: ConstPtr<CChar>, addr: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun duplocale(base: LocaleT): LocaleT

// Added in `OpenBSD` 5.5
public expect fun explicitBzero(s: MutPtr<CVoid>, len: SizeT)

public expect fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun freezero(ptr: MutPtr<CVoid>, size: SizeT)

public expect fun mallocConceal(size: SizeT): MutPtr<CVoid>

public expect fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun srand48Deterministic(seed: CLong)

public expect fun seed48Deterministic(xseed: MutPtr<CUshort>): MutPtr<CUshort>

public expect fun lcong48Deterministic(p: MutPtr<CUshort>)

public expect fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid>

public expect fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid>

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): MutPtr<Entry>

// futex.h
public expect fun futex(uaddr: MutPtr<UInt>, op: CInt, value: CInt, timeout: ConstPtr<Timespec>, uaddr2: MutPtr<UInt>): CInt

public expect fun mimmutable(addr: MutPtr<CVoid>, len: SizeT): CInt

public expect fun reboot(mode: CInt): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt

public expect fun getfsstat(buf: MutPtr<Statfs>, bufsize: SizeT, flags: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt

public expect fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>>
