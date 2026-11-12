@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.solarish.CaddrT
import io.github.kotlinmania.libc.unix.solarish.IdT
import io.github.kotlinmania.libc.unix.solarish.Itimerspec
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.solarish.PsetidT
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixSolarishIllumosNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosEventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosEpollPwait(epfd, events.rawAddress.toString(), maxevents, timeout, sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosEpollCreate(size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosEpollCreate1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosEpollCtl(epfd, op, fd, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: MutPtr<PsetidT>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPsetBindLwp(pset, id, pid, opset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetGetloadavg(pset: PsetidT, load: MutPtr<CDouble>, num: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPsetGetloadavg(pset, load.rawAddress.toString(), num) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPthreadAttrGetNp(thread.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPthreadAttrGetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPthreadAttrSetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPosixFadvise(fd, offset.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes2(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosGetpagesizes2(pagesize.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(fileActions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fildes: CInt, name: MutPtr<CChar>, namelen: SizeT): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosPtsnameR(fildes, name.rawAddress.toString(), namelen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncfs(fd: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosSyncfs(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosStrcasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), loc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosStrncasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString(), loc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosTimerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosTimerfdGettime(fd, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixSolarishIllumosNapiAddon != null) (unixSolarishIllumosNapiAddon.libcUnixSolarishIllumosTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
