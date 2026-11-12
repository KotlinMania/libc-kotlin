@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.libc.unix.newlib.generic.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNewlibNapiAddon(): Boolean

private val unixNewlibNapiAvailable: Boolean = initUnixNewlibNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibGetrlimit(p0, p1)")
private external fun wasmLibcUnixNewlibGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibSetrlimit(p0, p1)")
private external fun wasmLibcUnixNewlibSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixNewlibStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibSemDestroy(p0)")
private external fun wasmLibcUnixNewlibSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibSemInit(p0, p1, p2)")
private external fun wasmLibcUnixNewlibSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibAbs(p0)")
private external fun wasmLibcUnixNewlibAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibLabs(p0)")
private external fun wasmLibcUnixNewlibLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNewlibRand()")
private external fun wasmLibcUnixNewlibRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibSrand(p0)")
private external fun wasmLibcUnixNewlibSrand(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibBind(p0, p1, p2)")
private external fun wasmLibcUnixNewlibBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibClockSettime(p0, p1)")
private external fun wasmLibcUnixNewlibClockSettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibClockGettime(p0, p1)")
private external fun wasmLibcUnixNewlibClockGettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibClockGetres(p0, p1)")
private external fun wasmLibcUnixNewlibClockGetres(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibClosesocket(p0)")
private external fun wasmLibcUnixNewlibClosesocket(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNewlibIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNewlibIoctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNewlibRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNewlibRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNewlibGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNewlibGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibMemalign(p0, p1)")
private external fun wasmLibcUnixNewlibMemalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibFexecve(p0, p1, p2)")
private external fun wasmLibcUnixNewlibFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibGettimeofday(p0, p1)")
private external fun wasmLibcUnixNewlibGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNewlibGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNewlibGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibSigaltstack(p0, p1)")
private external fun wasmLibcUnixNewlibSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibSemClose(p0)")
private external fun wasmLibcUnixNewlibSemClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNewlibGetdtablesize()")
private external fun wasmLibcUnixNewlibGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNewlibGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNewlibGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixNewlibPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNewlibSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNewlibSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibGetgrnam(p0)")
private external fun wasmLibcUnixNewlibGetgrnam(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibPthreadKill(p0, p1)")
private external fun wasmLibcUnixNewlibPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibSemUnlink(p0)")
private external fun wasmLibcUnixNewlibSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibDaemon(p0, p1)")
private external fun wasmLibcUnixNewlibDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNewlibGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNewlibGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNewlibGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNewlibGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibSigwait(p0, p1)")
private external fun wasmLibcUnixNewlibSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixNewlibPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibGetgrgid(p0)")
private external fun wasmLibcUnixNewlibGetgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibPopen(p0, p1)")
private external fun wasmLibcUnixNewlibPopen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNewlibUname(p0)")
private external fun wasmLibcUnixNewlibUname(p0: String): Int

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixNewlibNapiAvailable) {
        wasmLibcUnixNewlibSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibBind(fd, addr.rawAddress.toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibClockSettime(clockId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibClockGettime(clockId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibClockGetres(clockId.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closesocket(sockfd: CInt): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibClosesocket(sockfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(fd: CInt, buf: MutPtr<CVoid>, n: ULong, flags: CInt, addr: MutPtr<Sockaddr>, addrLen: MutPtr<SocklenT>): Long =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibRecvfrom(fd, buf.rawAddress.toString(), n.toString(), flags, addr.rawAddress.toString(), addrLen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixNewlibNapiAvailable) MutPtr(wasmLibcUnixNewlibMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixNewlibNapiAvailable) MutPtr(wasmLibcUnixNewlibSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixNewlibNapiAvailable) MutPtr(wasmLibcUnixNewlibGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixNewlibNapiAvailable) MutPtr(wasmLibcUnixNewlibGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixNewlibNapiAvailable) MutPtr(wasmLibcUnixNewlibPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixNewlibNapiAvailable) wasmLibcUnixNewlibUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
