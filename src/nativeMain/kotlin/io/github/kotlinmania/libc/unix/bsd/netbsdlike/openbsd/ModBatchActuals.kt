// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_memmem
import libc.cinterop.libc_sysctl
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? {
    if (cmsg == null) return null
    return memScoped {
        val cPtr = alloc<platform.posix.cmsghdr>()
        cPtr.cmsg_len = cmsg.cmsgLen.toULong()
        cPtr.cmsg_level = cmsg.cmsgLevel
        cPtr.cmsg_type = cmsg.cmsgType
        val result = libc_cmsg_data(cPtr.ptr)
        if (result == null) null else COpaquePointer(result.toLong())
    }
}

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (mhdr == null) return null
    return memScoped {
        val mhdrPtr = alloc<platform.posix.msghdr>()
        mhdrPtr.msg_name = mhdr.msgName?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_namelen = mhdr.msgNamelen.toUInt()
        mhdrPtr.msg_iovlen = mhdr.msgIovlen.toULong()
        mhdrPtr.msg_control = mhdr.msgControl?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_controllen = mhdr.msgControllen.toULong()
        mhdrPtr.msg_flags = mhdr.msgFlags
        if (cmsg == null) {
            val result = libc_cmsg_firsthdr(mhdrPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        } else {
            val cmsgPtr = alloc<platform.posix.cmsghdr>()
            cmsgPtr.cmsg_len = cmsg.cmsgLen.toULong()
            cmsgPtr.cmsg_level = cmsg.cmsgLevel
            cmsgPtr.cmsg_type = cmsg.cmsgType
            val result = libc_cmsg_nxthdr(mhdrPtr.ptr, cmsgPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        }
    }
}

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_settimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    throw UnsupportedOperationException("pledge requires manual FFI bridge — not yet implemented")

public actual fun unveil(path: String?, permissions: String?): CInt =
    throw UnsupportedOperationException("unveil requires manual FFI bridge — not yet implemented")

public actual fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum requires manual FFI bridge — type mismatch")
public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: CUInt): CInt =
    libc.cinterop.libc_chflags(path, flags)
public actual fun fchflags(fd: CInt, flags: CUInt): CInt =
    libc.cinterop.libc_fchflags(fd, flags)
public actual fun chflagsat(fd: CInt, path: String?, flags: CUInt, atflag: CInt): CInt =
    throw UnsupportedOperationException("chflagsat requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): CInt =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun getthrid(): PidT =
    throw UnsupportedOperationException("getthrid requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetNameNp(tid: PthreadT, name: String?, len: ULong) {
    throw UnsupportedOperationException("pthreadGetNameNp requires manual FFI bridge — not yet implemented")
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    throw UnsupportedOperationException("pthreadSetNameNp requires manual FFI bridge — not yet implemented")
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt =
    throw UnsupportedOperationException("pthreadStacksegNp requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt {
    val oldPtr: CPointer<ByteVar>? = oldp?.value?.toCPointer()
    val newPtr: CPointer<ByteVar>? = newp?.value?.toCPointer()
    return libc.cinterop.libc_sysctl(name, namelen, oldPtr, oldlenp, newPtr, newlen)
}

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("utrace requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? {
    val hPtr: CPointer<ByteVar>? = haystack?.value?.toCPointer()
    val nPtr: CPointer<ByteVar>? = needle?.value?.toCPointer()
    if (hPtr == null || nPtr == null) return null
    val result = libc.cinterop.libc_memmem(hPtr, haystacklen, nPtr, needlelen)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    libc.cinterop.libc_newlocale(mask, locale, base?.value?.toCPointer<kotlinx.cinterop.ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(base: LocaleT): LocaleT =
    libc.cinterop.libc_duplocale(base?.value?.toCPointer<kotlinx.cinterop.ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")
}

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")
}

public actual fun freezero(ptr: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("freezero requires manual FFI bridge — not yet implemented")
}

public actual fun mallocConceal(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocConceal requires manual FFI bridge — not yet implemented")

public actual fun callocConceal(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("callocConceal requires manual FFI bridge — not yet implemented")

public actual fun srand48Deterministic(seed: CLong) {
    throw UnsupportedOperationException("srand48Deterministic requires manual FFI bridge — not yet implemented")
}

public actual fun seed48Deterministic(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48Deterministic requires manual FFI bridge — not yet implemented")

public actual fun lcong48Deterministic(p: CUShort?) {
    throw UnsupportedOperationException("lcong48Deterministic requires manual FFI bridge — not yet implemented")
}

public actual fun hcreate(nelt: ULong): CInt =
    throw UnsupportedOperationException("hcreate requires manual FFI bridge — not yet implemented")

public actual fun hdestroy() {
    throw UnsupportedOperationException("hdestroy requires manual FFI bridge — not yet implemented")
}

public actual fun hsearch(entry: ENTRY, action: ACTION): ENTRY? =
    throw UnsupportedOperationException("hsearch requires manual FFI bridge — not yet implemented")

public actual fun futex(uaddr: UInt?, op: CInt, `val`: CInt, timeout: Timespec?, uaddr2: UInt?): CInt =
    throw UnsupportedOperationException("futex requires manual FFI bridge — not yet implemented")

public actual fun mimmutable(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mimmutable requires manual FFI bridge — not yet implemented")

public actual fun reboot(mode: CInt): CInt =
    libc.cinterop.libc_reboot(mode)
public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getfsstat(buf: Statfs?, bufsize: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getfsstat requires manual FFI bridge — not yet implemented")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    throw UnsupportedOperationException("elfAuxInfo requires manual FFI bridge — not yet implemented")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch requires manual FFI bridge — not yet implemented")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind requires manual FFI bridge — not yet implemented")
