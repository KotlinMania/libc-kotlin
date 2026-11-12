@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdNetbsdlikeOpenbsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pledge(promises: ConstPtr<CChar>, execpromises: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPledge(promises.rawAddress.toString(), execpromises.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unveil(path: ConstPtr<CChar>, permissions: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdUnveil(path.rawAddress.toString(), permissions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdStrtonum(nptr.rawAddress.toString(), minval.toString(), maxval.toString(), errstr.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdDup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdChflags(path.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdFchflags(fd, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUint, atflag: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdChflagsat(fd, path.rawAddress.toString(), flags.toInt(), atflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getthrid(): PidT =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGetthrid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(tid.toLong().toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr<StackT>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(thread.toLong().toString(), sinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdPtrace(request, pid, addr.rawAddress.toString(), data) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(label: ConstPtr<CChar>, addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdUtrace(label.rawAddress.toString(), addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdFreezero(ptr.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocConceal(size: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdMallocConceal(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdCallocConceal(nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48Deterministic(seed: CLong) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48Deterministic(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48Deterministic(p: MutPtr<CUshort>) {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdLsearch(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdLfind(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdHcreate(nelt.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdHdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futex(uaddr: MutPtr<UInt>, op: CInt, value: CInt, timeout: ConstPtr<Timespec>, uaddr2: MutPtr<UInt>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdFutex(uaddr.rawAddress.toString(), op, value, timeout.rawAddress.toString(), uaddr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mimmutable(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdMimmutable(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(mode: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdReboot(mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGetmntinfo(mntbufp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdGetfsstat(buf.rawAddress.toString(), bufsize.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(aux, buf.rawAddress.toString(), buflen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdBacktrace(addrlist.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) (unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    if (unixBsdNetbsdlikeOpenbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeOpenbsdNapiAddon.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(addrlist.rawAddress.toString(), len.toString(), fmt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
