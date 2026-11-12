@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
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
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Timezone
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdBacktrace
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdCallocConceal
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdChflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdChflagsat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdDirfd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdDup3
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdDuplocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdExplicitBzero
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdFchflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdForkpty
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdFreelocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdFreezero
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdFstatfs
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdFutex
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGetfsstat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGetmntinfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGetnameinfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGetresgid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGetresuid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGetthrid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdGettimeofday
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdHcreate
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdHdestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdKevent
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdLfind
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdLsearch
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdMallocConceal
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdMemmem
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdMimmutable
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdMprotect
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdNewlocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdOpenpty
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPledge
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdPtrace
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdReboot
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSetproctitle
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSetresgid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSetresuid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSettimeofday
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdStatfs
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdStrtonum
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdSysctl
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdUnveil
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdUselocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libcUnixBsdNetbsdlikeOpenbsdUtrace
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdSettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun pledge(promises: ConstPtr<CChar>, execpromises: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPledge(promises.rawAddress.toCPointer<ByteVar>(), execpromises.rawAddress.toCPointer<ByteVar>())

public actual fun unveil(path: ConstPtr<CChar>, permissions: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdUnveil(path.rawAddress.toCPointer<ByteVar>(), permissions.rawAddress.toCPointer<ByteVar>())

public actual fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong =
    libcUnixBsdNetbsdlikeOpenbsdStrtonum(nptr.rawAddress.toCPointer<ByteVar>(), minval, maxval, errstr.rawAddress.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdDup3(src, dst, flags)

public actual fun chflags(path: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixBsdNetbsdlikeOpenbsdChflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    libcUnixBsdNetbsdlikeOpenbsdFchflags(fd, flags)

public actual fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUint, atflag: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdChflagsat(fd, path.rawAddress.toCPointer<ByteVar>(), flags, atflag)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdKevent(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun getthrid(): PidT =
    libcUnixBsdNetbsdlikeOpenbsdGetthrid()

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMainNp(): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT) {
    libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(tid.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>) {
    libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(tid.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr<StackT>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(thread.toLong().toCPointer<ByteVar>(), sinfo.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    libcUnixBsdNetbsdlikeOpenbsdForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdSysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid, euid, suid)

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdPtrace(request, pid, addr.rawAddress.toCPointer<ByteVar>(), data)

public actual fun utrace(label: ConstPtr<CChar>, addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdUtrace(label.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdNetbsdlikeOpenbsdFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    libcUnixBsdNetbsdlikeOpenbsdExplicitBzero(s.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcUnixBsdNetbsdlikeOpenbsdSetproctitle(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT) {
    libcUnixBsdNetbsdlikeOpenbsdFreezero(ptr.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun mallocConceal(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdMallocConceal(size)?.toLong() ?: 0L)

public actual fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdCallocConceal(nmemb, size)?.toLong() ?: 0L)

public actual fun srand48Deterministic(seed: CLong) {
    libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed)
}

public actual fun seed48Deterministic(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lcong48Deterministic(p: MutPtr<CUshort>) {
    libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdLsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nelp.rawAddress.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdLfind(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nelp.rawAddress.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcreate(nelt: SizeT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdHcreate(nelt)

public actual fun hdestroy() {
    libcUnixBsdNetbsdlikeOpenbsdHdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    MutPtr(0L)

public actual fun futex(uaddr: MutPtr<UInt>, op: CInt, value: CInt, timeout: ConstPtr<Timespec>, uaddr2: MutPtr<UInt>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdFutex(uaddr.rawAddress.toCPointer<ByteVar>(), op, value, timeout.rawAddress.toCPointer<ByteVar>(), uaddr2.rawAddress.toCPointer<ByteVar>())

public actual fun mimmutable(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeOpenbsdMimmutable(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun reboot(mode: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdReboot(mode)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdNetbsdlikeOpenbsdFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: SizeT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdGetfsstat(buf.rawAddress.toCPointer<ByteVar>(), bufsize, flags)

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(aux, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeOpenbsdBacktrace(addrlist.rawAddress.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(addrlist.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(addrlist.rawAddress.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(addrlist.rawAddress.toCPointer<ByteVar>(), len, fmt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
