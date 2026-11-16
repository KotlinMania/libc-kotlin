@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixSolarishNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAcct(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(bbuf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetrandom(bbuf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetifaddrs(ifap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stackGetbounds(sp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishStackGetbounds(sp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishInitgroups(name.rawAddress.toString(), basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSetgroups(ngroups, ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishErrno() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (unixSolarishNapiAddon != null) ConstPtr((unixSolarishNapiAddon.libcUnixSolarishGetprogname() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(name: ConstPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSetprogname(name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetloadavg(loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpriority(which, who) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSetpriority(which, who, prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSethostname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(tid: PthreadT, name: MutPtr, len: SizeT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadGetnameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadSetnameNp(tid.toLong().toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishWaitid(idtype.toInt(), id, infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsInit(fileActions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsDestroy(fileActions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr, fildes: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAddopen(fileActions.rawAddress.toString(), fildes, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr, fildes: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAddclose(fileActions.rawAddress.toString(), fildes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr, fildes: CInt, newfildes: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAdddup2(fileActions.rawAddress.toString(), fildes, newfildes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr, lowfiledes: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAddclosefromNp(fileActions.rawAddress.toString(), lowfiledes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdir(fileActions: MutPtr, path: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAddchdir(fileActions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr, path: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAddchdirNp(fileActions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr, fd: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnFileActionsAddfchdir(fileActions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, pgroup: PidT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetpgroup(attr.rawAddress.toString(), pgroup) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, pgroup: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetpgroup(attr.rawAddress.toString(), pgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, sigdefault: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, sigdefault: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigignoreNp(attr: MutPtr, sigignore: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetsigignoreNp(attr.rawAddress.toString(), sigignore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigignoreNp(attr: ConstPtr, sigignore: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetsigignoreNp(attr.rawAddress.toString(), sigignore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, sigmask: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrSetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, sigmask: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPosixSpawnattrGetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishShmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishFutimesat(fd, path.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(dirfd: CInt, times: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishFutimens(dirfd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSendmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishRecvmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, address: MutPtr, addressLen: MutPtr, flags: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAccept4(fd, address.rawAddress.toString(), addressLen.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqClose(mqd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqReceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqTimedreceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqSend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqTimedsend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqGetattr(mqd.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMqSetattr(mqd.rawAddress.toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portCreate(): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortCreate() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortAssociate(port, source, obj.toString(), events, user.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortDissociate(port, source, obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portGet(port: CInt, pe: MutPtr, timeout: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortGet(port, pe.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portGetn(port: CInt, peList: MutPtr, max: CUint, nget: MutPtr, timeout: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortGetn(port, peList.rawAddress.toString(), max.toInt(), nget.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portSend(port: CInt, events: CInt, user: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortSend(port, events, user.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portSendn(portList: MutPtr, errorList: MutPtr, nent: CUint, events: CInt, user: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPortSendn(portList.rawAddress.toString(), errorList.rawAddress.toString(), nent.toInt(), events, user.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(): ThreadT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishThrSelf() as String).toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nativeGetpwentR(pwd: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishNativeGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nativeGetgrentR(grp: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishNativeGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishDup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeutx(ux: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishMakeutx(ux.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modutx(ux: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishModutx(ux.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr, ut: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishUpdwtmpx(file.rawAddress.toString(), ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishPututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishEndutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetutent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutid(u: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetutid(u.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutline(u: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishGetutline(u.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututline(u: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishPututline(u.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSetutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpname(file: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUtmpname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutmp(ux: ConstPtr, u: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishGetutmp(ux.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutmpx(u: ConstPtr, ux: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishGetutmpx(u.rawAddress.toString(), ux.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updwtmp(file: ConstPtr, u: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishUpdwtmp(file.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishNtpAdjtime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishNtpGettime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishTimerCreate(clockId, evp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishTimerDelete(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishTimerGetoverrun(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishTimerGettime(timerid.toLong().toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishTimerSettime(timerid.toLong().toString(), flags, value.rawAddress.toString(), ovalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGet(pid: PidT): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishUcredGet(pid) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeerucred(fd: CInt, ucred: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpeerucred(fd, ucred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredFree(ucred: MutPtr) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishUcredFree(ucred.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucredGeteuid(ucred: ConstPtr): UidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGeteuid(ucred.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetruid(ucred: ConstPtr): UidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetruid(ucred.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetsuid(ucred: ConstPtr): UidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetsuid(ucred.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetegid(ucred: ConstPtr): GidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetegid(ucred.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetrgid(ucred: ConstPtr): GidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetrgid(ucred.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetsgid(ucred: ConstPtr): GidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetsgid(ucred.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetgroups(ucred: ConstPtr, groups: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetgroups(ucred.rawAddress.toString(), groups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetpid(ucred: ConstPtr): PidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetpid(ucred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetprojid(ucred: ConstPtr): ProjidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetprojid(ucred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetzoneid(ucred: ConstPtr): ZoneidT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetzoneid(ucred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetpflags(ucred: ConstPtr, flags: CUint): CUint =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredGetpflags(ucred.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredSize(): SizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishUcredSize() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetCreate(newpset: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetCreate(newpset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetDestroy(pset: PsetidT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetDestroy(pset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetAssign(pset, cpu, opset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetInfo(pset: PsetidT, tpe: MutPtr, numcpus: MutPtr, cpulist: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetInfo(pset, tpe.rawAddress.toString(), numcpus.rawAddress.toString(), cpulist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetBind(pset, idtype.toInt(), id, opset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetList(pset: MutPtr, numpsets: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetList(pset.rawAddress.toString(), numpsets.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetSetattr(pset, attr.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetGetattr(pset: PsetidT, attr: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPsetGetattr(pset, attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishProcessorBind(idtype.toInt(), id, newBinding, oldBinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishPOnline(processorid, flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processorInfo(processorid: ProcessoridT, infop: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishProcessorInfo(processorid, infop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getexecname(): ConstPtr =
    if (unixSolarishNapiAddon != null) ConstPtr((unixSolarishNapiAddon.libcUnixSolarishGetexecname() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpflags(flags: CUint): CUint =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpflags(flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSetpflags(flags.toInt(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(command: CInt, buf: MutPtr, count: CLong): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSysinfo(command, buf.rawAddress.toString(), count.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(fd: CInt, path: ConstPtr, amode: CInt, flag: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishFaccessat(fd, path.rawAddress.toString(), amode, flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetpagesizes(pagesize.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr, elements: MutPtr, arg: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMmapobj(fd, flags.toInt(), storage.rawAddress.toString(), elements.rawAddress.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun meminfo(inaddr: ConstPtr, addrCount: CInt, infoReq: ConstPtr, infoCount: CInt, outdata: MutPtr, validity: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMeminfo(inaddr.rawAddress.toString(), addrCount, infoReq.rawAddress.toString(), infoCount, outdata.rawAddress.toString(), validity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr, delim: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishStrsep(string.rawAddress.toString(), delim.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getisax(array: MutPtr, n: CUint): CUint =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetisax(array.rawAddress.toString(), n.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buffer: MutPtr, size: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishBacktrace(buffer.rawAddress.toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: ConstPtr, size: CInt): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishBacktraceSymbols(buffer.rawAddress.toString(), size) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: ConstPtr, size: CInt, fd: CInt) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishBacktraceSymbolsFd(buffer.rawAddress.toString(), size, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitn(aiocbList: MutPtr, nent: CUint, nwait: MutPtr, timeout: ConstPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioWaitn(aiocbList.rawAddress.toString(), nent.toInt(), nwait.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun major(version: CInt, devnum: DevT): MajorT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMajor(version, devnum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMinor(version, devnum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishMakedev(version, majdev.toInt(), mindev.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, nbytes: SizeT) {
    if (unixSolarishNapiAddon != null) {
        unixSolarishNapiAddon.libcUnixSolarishArc4randomBuf(buf.rawAddress.toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishArc4randomUniform(upperBound.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secureGetenv(name: ConstPtr): MutPtr =
    if (unixSolarishNapiAddon != null) MutPtr((unixSolarishNapiAddon.libcUnixSolarishSecureGetenv(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishStrftime(s.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr, loc: LocaleT): SizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishStrftimeL(s.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString(), loc.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr, len: SizeT): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSendfile(outFd, inFd, off.rawAddress.toString(), len.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfilev(fildes: CInt, vec: ConstPtr, sfvcnt: CInt, xferred: MutPtr): SsizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishSendfilev(fildes, vec.rawAddress.toString(), sfvcnt, xferred.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpInit(view.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpFini(cookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpAffinityGet(idtype.toInt(), id, lgrp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpAffinitySet(idtype.toInt(), id, lgrp, aff) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr, count: CUint, content: LgrpContentT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpCpus(cookie.toString(), lgrp, cpuids.rawAddress.toString(), count.toInt(), content.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpMemSize(cookie.toString(), lgrp, tpe.toInt(), content.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpNlgrps(cookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpView(cookie.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpHome(idtype.toInt(), id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpVersion(version: CInt): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpVersion(version) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr, count: CUint, tpe: LgrpRsrcT): CInt =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpResources(cookie.toString(), lgrp, lgrps.rawAddress.toString(), count.toInt(), tpe) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    if (unixSolarishNapiAddon != null) (unixSolarishNapiAddon.libcUnixSolarishLgrpRoot(cookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
