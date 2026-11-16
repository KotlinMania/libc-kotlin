@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdAppleNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual var MACH_TASK_SELF: MachPortT
    get() = if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetMACHTASKSELF() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (unixBsdAppleNapiAddon != null) {
            unixBsdAppleNapiAddon.libcUnixBsdAppleSetMACHTASKSELF(value.toInt())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetVMPAGESIZE() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleChflags(path.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFchflags(fd, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleClockGetres(clkId.toInt(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleClockGettime(clkId.toInt(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdApplePututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleAsctime(tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(clock: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleCtime(clock.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdate(datestr: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleGetdate(datestr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(buf: ConstPtr, format: ConstPtr, timeptr: MutPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleStrptime(buf.rawAddress.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr, result: MutPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleAsctimeR(tm.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(clock: ConstPtr, result: MutPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleCtimeR(clock.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSysctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), sizep.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSemget(key, nsems, semflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleShmOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFtok(pathname.rawAddress.toString(), projId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleShmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: MutPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machAbsoluteTime(): ULong =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMachAbsoluteTime() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machTimebaseInfo(info: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMachTimebaseInfo(info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machHostSelf(): MachPortT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMachHostSelf() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machThreadSelf(): MachPortT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMachThreadSelf() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwaitRelativeNp(cond: MutPtr, lock: MutPtr, timeout: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadCondTimedwaitRelativeNp(cond.rawAddress.toString(), lock.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetscope(attr: ConstPtr, contentionscope: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadAttrGetscope(attr.rawAddress.toString(), contentionscope.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadAttrGetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadAttrGetdetachstate(attr.rawAddress.toString(), detachstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetscope(attr: MutPtr, contentionscope: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadAttrSetscope(attr.rawAddress.toString(), contentionscope) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadAttrSetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(name: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadSetnameNp(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadMachThreadNp(thread.toLong().toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadFromMachThreadNp(port.toInt()) as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdApplePthreadGetStackaddrNp(thread.toLong().toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadGetStacksizeNp(thread.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadMainNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadThreadidNp(thread.toLong().toString(), threadId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdApplePthreadJitWriteProtectNp(enabled)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadJitWriteProtectSupportedNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadJitWriteWithCallbackNp(0L.toString(), ctx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePthreadCpuNumberNp(cpuNumberOut.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddress(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSyncWaitOnAddress(addr.rawAddress.toString(), value.toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddressWithDeadline(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(addr.rawAddress.toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), deadline.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddressWithTimeout(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(addr.rawAddress.toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), timeoutNs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWakeByAddressAny(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSyncWakeByAddressAny(addr.rawAddress.toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWakeByAddressAll(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSyncWakeByAddressAll(addr.rawAddress.toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleOsUnfairLockLock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsUnfairLockTrylock(lock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleOsUnfairLockUnlock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleOsUnfairLockAssertOwner(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleOsUnfairLockAssertNotOwner(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osLogCreate(subsystem: ConstPtr, category: ConstPtr): OsLogT =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleOsLogCreate(subsystem.rawAddress.toString(), category.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsLogTypeEnabled(oslog.rawAddress.toString(), tpe.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr): OsSignpostIdT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSignpostIdMakeWithPointer(log.rawAddress.toString(), ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSignpostIdGenerate(log.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOsSignpostEnabled(log.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleThreadPolicySet(thread.toLong().toString(), flavor.toInt(), policyInfo.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr, getDefault: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleThreadPolicyGet(thread.toLong().toString(), flavor.toInt(), policyInfo.rawAddress.toString(), count.rawAddress.toString(), getDefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleThreadInfo(targetAct.toInt(), flavor.toInt(), threadInfoOut.rawAddress.toString(), threadInfoOutCnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleError() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleBacktrace(buf.rawAddress.toString(), sz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrs: ConstPtr, sz: CInt): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleBacktraceSymbols(addrs.rawAddress.toString(), sz) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrs: ConstPtr, sz: CInt, fd: CInt) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleBacktraceSymbolsFd(addrs.rawAddress.toString(), sz, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun backtraceFromFp(startfp: MutPtr, array: MutPtr, size: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleBacktraceFromFp(startfp.rawAddress.toString(), array.rawAddress.toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceImageOffsets(array: ConstPtr, imageOffsets: MutPtr, size: CInt) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleBacktraceImageOffsets(array.rawAddress.toString(), imageOffsets.rawAddress.toString(), size)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun backtraceAsync(array: MutPtr, length: SizeT, taskId: MutPtr): SizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleBacktraceAsync(array.rawAddress.toString(), length.toString(), taskId.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent64(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, flags: CUint, timeout: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleKevent64(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, flags.toInt(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMount(src.rawAddress.toString(), target.rawAddress.toString(), flags, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmount(src: ConstPtr, fd: CInt, flags: CInt, data: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFmount(src.rawAddress.toString(), fd, flags, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePtrace(request, pid, addr.rawAddress.toString(), data) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(special: ConstPtr, cmd: CInt, id: CInt, data: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleQuotactl(special.rawAddress.toString(), cmd, id, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSethostname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr, hdtr: MutPtr, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSendfile(fd, s, offset.toString(), len.rawAddress.toString(), hdtr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFreelocale(loc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconvL(loc: LocaleT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleLocaleconvL(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    if (unixBsdAppleNapiAddon != null) ConstPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleQuerylocale(mask, loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFlistxattr(filedes, list.rawAddress.toString(), size.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleRemovexattr(path.rawAddress.toString(), name.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renamexNp(from: ConstPtr, to: ConstPtr, flags: CUint): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleRenamexNp(from.rawAddress.toString(), to.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameatxNp(fromfd: CInt, from: ConstPtr, tofd: CInt, to: ConstPtr, flags: CUint): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleRenameatxNp(fromfd, from.rawAddress.toString(), tofd, to.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFremovexattr(filedes, name.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr, basegid: CInt, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetgrouplist(name.rawAddress.toString(), basegid, groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr, basegroup: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleInitgroups(user.rawAddress.toString(), basegroup) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleBrk(addr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: CInt): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleSbrk(increment) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldImageCount(): UInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleDyldImageCount() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageHeader(imageIndex: UInt): ConstPtr =
    if (unixBsdAppleNapiAddon != null) ConstPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleDyldGetImageHeader(imageIndex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageName(imageIndex: UInt): ConstPtr =
    if (unixBsdAppleNapiAddon != null) ConstPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleDyldGetImageName(imageIndex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetarchprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrSetarchprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), subpref.rawAddress.toString(), ocount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetarchprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrGetarchprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), subpref.rawAddress.toString(), ocount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetbinprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrGetbinprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), ocount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetbinprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnattrSetbinprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), ocount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdApplePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectx(socket: CInt, endpoints: ConstPtr, associd: SaeAssocidT, flags: CUint, iov: ConstPtr, iovcnt: CUint, len: MutPtr, connid: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleConnectx(socket, endpoints.rawAddress.toString(), associd.toInt(), flags.toInt(), iov.rawAddress.toString(), iovcnt.toInt(), len.rawAddress.toString(), connid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleDisconnectx(socket, associd.toInt(), connid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleNtpAdjtime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleNtpGettime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetmntinfo(mntbufp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(mntbufp: MutPtr, bufsize: CInt, flags: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetfsstat(mntbufp.rawAddress.toString(), bufsize, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clonefile(src: ConstPtr, dst: ConstPtr, flags: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleClonefile(src.rawAddress.toString(), dst.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clonefileat(srcDirfd: CInt, src: ConstPtr, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleClonefileat(srcDirfd, src.rawAddress.toString(), dstDirfd, dst.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFclonefileat(srcfd, dstDirfd, dst.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfile(from: ConstPtr, to: ConstPtr, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleCopyfile(from.rawAddress.toString(), to.rawAddress.toString(), state.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFcopyfile(from, to, state.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleCopyfileStateFree(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateAlloc(): CopyfileStateT =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleCopyfileStateAlloc() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleCopyfileStateGet(s.rawAddress.toString(), flags.toInt(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleCopyfileStateSet(s.rawAddress.toString(), flags.toInt(), src.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machErrorString(errorValue: MachErrorT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMachErrorString(errorValue) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetPattern4(b: MutPtr, pattern4: ConstPtr, len: SizeT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMemsetPattern4(b.rawAddress.toString(), pattern4.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetPattern8(b: MutPtr, pattern8: ConstPtr, len: SizeT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMemsetPattern8(b.rawAddress.toString(), pattern8.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetPattern16(b: MutPtr, pattern16: ConstPtr, len: SizeT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMemsetPattern16(b.rawAddress.toString(), pattern16.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtonum(numstr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr): CLonglong =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleStrtonum(numstr.rawAddress.toString(), minval.toString(), maxval.toString(), errstrp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mstats(): Mstats =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocPrintf(format: ConstPtr, vararg variadicArgs: Long) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMallocPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneCheck(zone: MutPtr): BooleanT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneCheck(zone.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZonePrint(zone: MutPtr, verbose: BooleanT) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZonePrint(zone.rawAddress.toString(), verbose)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneStatistics(zone: MutPtr, stats: MutPtr) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneStatistics(zone.rawAddress.toString(), stats.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneLog(zone: MutPtr, address: MutPtr) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneLog(zone.rawAddress.toString(), address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZonePrintPtrInfo(ptr: MutPtr) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZonePrintPtrInfo(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocDefaultZone(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMallocDefaultZone() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneFromPtr(ptr: ConstPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneFromPtr(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneMalloc(zone: MutPtr, size: SizeT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneMalloc(zone.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneValloc(zone: MutPtr, size: SizeT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneValloc(zone.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneCalloc(zone: MutPtr, numItems: SizeT, size: SizeT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneCalloc(zone.rawAddress.toString(), numItems.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneRealloc(zone: MutPtr, ptr: MutPtr, size: SizeT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneRealloc(zone.rawAddress.toString(), ptr.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneFree(zone: MutPtr, ptr: MutPtr) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleMallocZoneFree(zone.rawAddress.toString(), ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcListpids(t.toInt(), typeinfo.toInt(), buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListallpids(buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcListallpids(buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListpgrppids(pgrpid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcListpgrppids(pgrpid, buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListchildpids(ppid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcListchildpids(ppid, buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcPidinfo(pid, flavor, arg.toString(), buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcPidfdinfo(pid, fd, flavor, buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcPidfileportinfo(pid, fileport.toInt(), flavor, buffer.rawAddress.toString(), buffersize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidpath(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcPidpath(pid, buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procName(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcName(pid, buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcRegionfilename(pid, address.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procKmsgbuf(buffer: MutPtr, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcKmsgbuf(buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procLibversion(major: MutPtr, minor: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcLibversion(major.rawAddress.toString(), minor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcPidRusage(pid, flavor, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetNoSmt(): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcSetNoSmt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetthreadNoSmt(): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcSetthreadNoSmt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetCsm(flags: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcSetCsm(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetthreadCsm(flags: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleProcSetthreadCsm(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostuuid(id: MutPtr, timeout: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGethostuuid(id.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleSethostid(hostid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cCRandomGenerateBytes(bytes: MutPtr, size: SizeT): CCRNGStatus =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleCCRandomGenerateBytes(bytes.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetExecutablePath(buf: MutPtr, bufsize: MutPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleNsgetExecutablePath(buf.rawAddress.toString(), bufsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetArgv(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleNsgetArgv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetArgc(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleNsgetArgc() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetEnviron(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleNsgetEnviron() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetProgname(): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleNsgetProgname() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machVmMap(targetTask: VmMapT, address: MutPtr, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMachVmMap(targetTask.toLong().toString(), address.rawAddress.toString(), size.toString(), mask.toString(), flags, obj.toInt(), offset.toString(), copy, curProtection, maxProtection, inheritance.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmAllocate(targetTask: VmMapT, address: MutPtr, size: VmSizeT, flags: CInt): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleVmAllocate(targetTask.toLong().toString(), address.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleVmDeallocate(targetTask.toLong().toString(), address.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleHostStatistics64(hostPriv.toInt(), flavor, hostInfo64Out.rawAddress.toString(), hostInfo64OutCnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr, outProcessorInfo: MutPtr, outProcessorInfoCnt: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleHostProcessorInfo(host.toInt(), flavor, outProcessorCount.rawAddress.toString(), outProcessorInfo.rawAddress.toString(), outProcessorInfoCnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleTaskForPid(host.toInt(), pid, task.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleTaskInfo(host.toInt(), flavor.toInt(), taskInfoOut.rawAddress.toString(), taskInfoCount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleTaskCreate(targetTask.toInt(), ledgers.rawAddress.toString(), ledgersCnt.toInt(), inheritMemory, childTask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleTaskTerminate(targetTask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskThreads(targetTask: TaskInspectT, actList: MutPtr, actListCnt: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleTaskThreads(targetTask.toInt(), actList.rawAddress.toString(), actListCnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleHostStatistics(hostPriv.toInt(), flavor, hostInfoOut.rawAddress.toString(), hostInfoOutCnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr): SysdirSearchPathEnumerationState =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSysdirGetNextSearchPathEnumeration(state.toInt(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetattrlist(path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFgetattrlist(fd, attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlistat(fd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: CUlong): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetattrlistat(fd, path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSetattrlist(path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFsetattrlist(fd, attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setattrlistat(dirFd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleSetattrlistat(dirFd, path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlistbulk(dirfd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: ULong): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleGetattrlistbulk(dirfd, attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocSize(ptr: ConstPtr): SizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMallocSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocGoodSize(size: SizeT): SizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMallocGoodSize(size.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadlink(fd: CInt, buf: MutPtr, size: SizeT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleFreadlink(fd, buf.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleExecvP(file.rawAddress.toString(), searchPath.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    if (unixBsdAppleNapiAddon != null) {
        unixBsdAppleNapiAddon.libcUnixBsdAppleQsortR(base.rawAddress.toString(), num.toString(), size.toString(), arg.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleClockSettime(clockId.toInt(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleTaskSetInfo(targetTask.toInt(), flavor.toInt(), taskInfoIn.rawAddress.toString(), taskInfoInCnt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    if (unixBsdAppleNapiAddon != null) MutPtr((unixBsdAppleNapiAddon.libcUnixBsdAppleIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdAppleNapiAddon != null) (unixBsdAppleNapiAddon.libcUnixBsdAppleIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
