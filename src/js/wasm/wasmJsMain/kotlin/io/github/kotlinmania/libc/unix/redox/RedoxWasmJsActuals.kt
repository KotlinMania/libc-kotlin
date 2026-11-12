@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixRedoxNapiAddon(): Boolean

private val unixRedoxNapiAvailable: Boolean = initUnixRedoxNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxErrnoLocation()")
private external fun wasmLibcUnixRedoxErrnoLocation(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixRedoxStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxDirfd(p0)")
private external fun wasmLibcUnixRedoxDirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxPipe2(p0, p1)")
private external fun wasmLibcUnixRedoxPipe2(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxGetdtablesize()")
private external fun wasmLibcUnixRedoxGetdtablesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxGetresgid(p0, p1, p2)")
private external fun wasmLibcUnixRedoxGetresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxGetresuid(p0, p1, p2)")
private external fun wasmLibcUnixRedoxGetresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxSetresgid(p0, p1, p2)")
private external fun wasmLibcUnixRedoxSetresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxSetresuid(p0, p1, p2)")
private external fun wasmLibcUnixRedoxSetresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxGetgrent()")
private external fun wasmLibcUnixRedoxGetgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxSetgrent()")
private external fun wasmLibcUnixRedoxSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxEndgrent()")
private external fun wasmLibcUnixRedoxEndgrent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxGetgrgid(p0)")
private external fun wasmLibcUnixRedoxGetgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixRedoxGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixRedoxGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxGetgrnam(p0)")
private external fun wasmLibcUnixRedoxGetgrnam(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixRedoxGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixRedoxGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxMemalign(p0, p1)")
private external fun wasmLibcUnixRedoxMemalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixRedoxGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixRedoxGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixRedoxPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixRedoxPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixRedoxOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixRedoxOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxGetpwent()")
private external fun wasmLibcUnixRedoxGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxSetpwent()")
private external fun wasmLibcUnixRedoxSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixRedoxEndpwent()")
private external fun wasmLibcUnixRedoxEndpwent()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixRedoxGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixRedoxGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixRedoxGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixRedoxGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixRedoxPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxPthreadCancel(p0)")
private external fun wasmLibcUnixRedoxPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxPthreadKill(p0, p1)")
private external fun wasmLibcUnixRedoxPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixRedoxSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxSigwait(p0, p1)")
private external fun wasmLibcUnixRedoxSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxGetsubopt(p0, p1, p2)")
private external fun wasmLibcUnixRedoxGetsubopt(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxMkostemp(p0, p1)")
private external fun wasmLibcUnixRedoxMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixRedoxMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixRedoxReallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixRedoxRenameat2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixRedoxRenameat2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxExplicitBzero(p0, p1)")
private external fun wasmLibcUnixRedoxExplicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxStrlcat(p0, p1, p2)")
private external fun wasmLibcUnixRedoxStrlcat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxStrlcpy(p0, p1, p2)")
private external fun wasmLibcUnixRedoxStrlcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxEpollCreate(p0)")
private external fun wasmLibcUnixRedoxEpollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxEpollCreate1(p0)")
private external fun wasmLibcUnixRedoxEpollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxEpollWait(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxEpollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxEpollCtl(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxEpollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixRedoxIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixRedoxIoctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxMadvise(p0, p1, p2)")
private external fun wasmLibcUnixRedoxMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxMsync(p0, p1, p2)")
private external fun wasmLibcUnixRedoxMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxMprotect(p0, p1, p2)")
private external fun wasmLibcUnixRedoxMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixRedoxShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxShmUnlink(p0)")
private external fun wasmLibcUnixRedoxShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxGetpriority(p0, p1)")
private external fun wasmLibcUnixRedoxGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixRedoxSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxGetrlimit(p0, p1)")
private external fun wasmLibcUnixRedoxGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxSetrlimit(p0, p1)")
private external fun wasmLibcUnixRedoxSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxCmsgData(p0)")
private external fun wasmLibcUnixRedoxCmsgData(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxCmsgFirsthdr(p0)")
private external fun wasmLibcUnixRedoxCmsgFirsthdr(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxCmsgNxthdr(p0, p1)")
private external fun wasmLibcUnixRedoxCmsgNxthdr(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxBind(p0, p1, p2)")
private external fun wasmLibcUnixRedoxBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixRedoxRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixRedoxRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixRedoxRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixRedoxSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxFutimens(p0, p1)")
private external fun wasmLibcUnixRedoxFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxReadv(p0, p1, p2)")
private external fun wasmLibcUnixRedoxReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRedoxWritev(p0, p1, p2)")
private external fun wasmLibcUnixRedoxWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxUname(p0)")
private external fun wasmLibcUnixRedoxUname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxGettimeofday(p0, p1)")
private external fun wasmLibcUnixRedoxGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRedoxClockGettime(p0, p1)")
private external fun wasmLibcUnixRedoxClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRedoxStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixRedoxStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRedoxLoginTty(p0)")
private external fun wasmLibcUnixRedoxLoginTty(p0: Int): Int

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSetresgid(rgid, egid, sgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSetresuid(ruid, euid, suid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): MutPtr<Group> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixRedoxNapiAvailable) {
        wasmLibcUnixRedoxSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixRedoxNapiAvailable) {
        wasmLibcUnixRedoxEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxGetgrgid(gid).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetgrgidR(gid, grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetgrouplist(user.rawAddress.toString(), group, groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(addr: ConstPtr<Sockaddr>, addrlen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetnameinfo(addr.rawAddress.toString(), addrlen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(tid: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, start: PthreadCreateStartCallback, arg: MutPtr<CVoid>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPthreadCreate(tid.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixRedoxNapiAvailable) {
        wasmLibcUnixRedoxSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixRedoxNapiAvailable) {
        wasmLibcUnixRedoxEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetpwuidR(uid, pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPthreadCancel(thread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPthreadKill(thread.rawAddress.toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, sig: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSigtimedwait(set.rawAddress.toString(), sig.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(optionp: MutPtr<MutPtr<CChar>>, tokens: ConstPtr<MutPtr<CChar>>, valuep: MutPtr<MutPtr<CChar>>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetsubopt(optionp.rawAddress.toString(), tokens.rawAddress.toString(), valuep.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxRenameat2(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(p: MutPtr<CVoid>, len: SizeT) {
    if (unixRedoxNapiAvailable) {
        wasmLibcUnixRedoxExplicitBzero(p.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, siz: SizeT): SizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxStrlcat(dst.rawAddress.toString(), src.rawAddress.toString(), siz.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, siz: SizeT): SizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxStrlcpy(dst.rawAddress.toString(), src.rawAddress.toString(), siz.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxEpollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxEpollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxEpollCtl(epfd, op, fd, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxShmOpen(name.rawAddress.toString(), oflag, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxCmsgData(cmsg.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxCmsgFirsthdr(mhdr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> =
    if (unixRedoxNapiAvailable) MutPtr(wasmLibcUnixRedoxCmsgNxthdr(mhdr.rawAddress.toString(), cmsg.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxRecvmsg(socket, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxSendmsg(socket, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(utsname: MutPtr<Utsname>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxUname(utsname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixRedoxNapiAvailable) wasmLibcUnixRedoxLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")
