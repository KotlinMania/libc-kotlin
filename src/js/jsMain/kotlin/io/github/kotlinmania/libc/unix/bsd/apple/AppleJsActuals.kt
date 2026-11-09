@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT

private val _unixBsdAppleNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

private var _ffi_static_MACH_TASK_SELF: MachPortT = 0u
public actual var MACH_TASK_SELF: MachPortT
    get() = _ffi_static_MACH_TASK_SELF
    set(value) {
        _ffi_static_MACH_TASK_SELF = value
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = 0uL

public actual fun setgrent() {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_setgrent()
    }
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_daemon(nochdir, noclose) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioError((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun chflags(path: String?, flags: CUint): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_chflags(path, flags.toInt()) as Int) else 0

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fchflags(fd, flags.toInt()) as Int) else 0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_clockGetres(clkId.toInt(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_clockGettime(clkId.toInt(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) as Int) else 0

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_lutimes(file, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun getutxent(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setutxent() {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_setutxent()
    }
}

public actual fun endutxent() {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_endutxent()
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_utmpxname(file) as Int) else 0

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_asctime((tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctime(clock: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_ctime((clock?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getdate(datestr: String?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getdate(datestr) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_strptime(buf, format, (timeptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_asctimeR((tm?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_ctimeR((clock?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else 0

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sysctlnametomib(name, (mibp?.value ?: 0L).toString(), (sizep?.value ?: 0L).toString()) as Int) else 0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_semget(key, nsems, semflg) as Int) else 0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) as Int) else 0

public actual fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_ftok(pathname, projId) as Int) else 0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else 0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_shmget(key, size.toString(), shmflg) as Int) else 0

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sysctl((name?.value ?: 0L).toString(), namelen.toInt(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sysctlbyname(name, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun machAbsoluteTime(): ULong =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_machAbsoluteTime() as String).toULong() else 0uL

public actual fun machTimebaseInfo(info: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_machTimebaseInfo((info?.value ?: 0L).toString()) as Int) else 0

public actual fun machHostSelf(): MachPortT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_machHostSelf() as Int).toUInt() else 0u

public actual fun machThreadSelf(): MachPortT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_machThreadSelf() as Int).toUInt() else 0u

public actual fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadAttrGetscope((attr?.value ?: 0L).toString(), (contentionscope?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadAttrGetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadAttrGetdetachstate((attr?.value ?: 0L).toString(), (detachstate?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadAttrSetscope((attr?.value ?: 0L).toString(), contentionscope) as Int) else 0

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadAttrSetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetnameNp(name: String?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadSetnameNp(name) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadMachThreadNp(thread.toLong().toString()) as Int).toUInt() else 0u

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadFromMachThreadNp(port.toInt()) as String).toLong().toULong() else 0uL

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadGetStackaddrNp(thread.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadGetStacksizeNp(thread.toLong().toString()) as String).toULong() else 0uL

public actual fun pthreadMainNp(): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadMainNp() as Int) else 0

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadThreadidNp(thread.toLong().toString(), (threadId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadJitWriteProtectNp(enabled)
    }
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp() as Int) else 0

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(0L.toString(), (ctx?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()
    }
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pthreadCpuNumberNp((cpuNumberOut?.value ?: 0L).toString()) as Int) else 0

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSyncWaitOnAddress((addr?.value ?: 0L).toString(), value.toString(), size.toString(), flags.toInt()) as Int) else 0

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline((addr?.value ?: 0L).toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), deadline.toString()) as Int) else 0

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout((addr?.value ?: 0L).toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), timeoutNs.toString()) as Int) else 0

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSyncWakeByAddressAny((addr?.value ?: 0L).toString(), size.toString(), flags.toInt()) as Int) else 0

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSyncWakeByAddressAll((addr?.value ?: 0L).toString(), size.toString(), flags.toInt()) as Int) else 0

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_osUnfairLockLock((lock?.value ?: 0L).toString())
    }
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osUnfairLockTrylock((lock?.value ?: 0L).toString()) as Boolean) else false

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_osUnfairLockUnlock((lock?.value ?: 0L).toString())
    }
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_osUnfairLockAssertOwner((lock?.value ?: 0L).toString())
    }
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_osUnfairLockAssertNotOwner((lock?.value ?: 0L).toString())
    }
}

public actual fun osLogCreate(subsystem: String?, category: String?): OsLogT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osLogCreate(subsystem, category) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osLogTypeEnabled((oslog?.value ?: 0L).toString(), tpe.toInt()) as Boolean) else false

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSignpostIdMakeWithPointer((log?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSignpostIdGenerate((log?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_osSignpostEnabled((log?.value ?: 0L).toString()) as Boolean) else false

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_threadPolicySet(thread.toLong().toString(), flavor.toInt(), (policyInfo?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_threadPolicyGet(thread.toLong().toString(), flavor.toInt(), (policyInfo?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (getDefault?.value ?: 0L).toString()) as Int) else 0

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_threadInfo(targetAct.toInt(), flavor.toInt(), (threadInfoOut?.value ?: 0L).toString(), (threadInfoOutCnt?.value ?: 0L).toString()) as Int) else 0

public actual fun error(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_error() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_backtrace((buf?.value ?: 0L).toString(), sz) as Int) else 0

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_backtraceSymbols((addrs?.value ?: 0L).toString(), sz) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_backtraceSymbolsFd((addrs?.value ?: 0L).toString(), sz, fd)
    }
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_backtraceFromFp((startfp?.value ?: 0L).toString(), (array?.value ?: 0L).toString(), size) as Int) else 0

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_backtraceImageOffsets((array?.value ?: 0L).toString(), (imageOffsets?.value ?: 0L).toString(), size)
    }
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_backtraceAsync((array?.value ?: 0L).toString(), length.toString(), (taskId?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_statfs(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_kevent64(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, flags.toInt(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mount(src, target, flags, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fmount(src, fd, flags, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_ptrace(request, pid, (addr?.value ?: 0L).toString(), data) as Int) else 0

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_quotactl(special, cmd, id, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sethostname(name, len) as Int) else 0

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sendfile(fd, s, offset.toString(), (len?.value ?: 0L).toString(), (hdtr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun loginTty(fd: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_loginTty(fd) as Int) else 0

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_duplocale((base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun freelocale(loc: LocaleT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_freelocale((loc?.value ?: 0L).toString()) as Int) else 0

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_localeconvL((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_newlocale(mask, locale, (base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_uselocale((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_querylocale(mask, (loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getpriority(which, who.toInt()) as Int) else 0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_setpriority(which, who.toInt(), prio) as Int) else 0

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getdomainname((name?.value ?: 0L).toString(), len) as Int) else 0

public actual fun setdomainname(name: String?, len: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_setdomainname(name, len) as Int) else 0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags) as String).toLong() else 0L

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags) as String).toLong() else 0L

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags) as Int) else 0

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags) as Int) else 0

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_listxattr(path, (list?.value ?: 0L).toString(), size.toString(), flags) as String).toLong() else 0L

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString(), flags) as String).toLong() else 0L

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_removexattr(path, name, flags) as Int) else 0

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_renamexNp(from, to, flags.toInt()) as Int) else 0

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_renameatxNp(fromfd, from, tofd, to, flags.toInt()) as Int) else 0

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fremovexattr(filedes, name, flags) as Int) else 0

public actual fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getgrouplist(name, basegid, (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_initgroups(user, basegroup) as Int) else 0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) as Int) else 0

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_brk((addr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun sbrk(increment: CInt): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sbrk(increment) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun dyldImageCount(): UInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_dyldImageCount() as Int).toUInt() else 0u

public actual fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_dyldGetImageHeader(imageIndex.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_dyldGetImageVmaddrSlide(imageIndex.toInt()) as String).toLong() else 0L

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_dyldGetImageName(imageIndex.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrSetarchprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (subpref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrGetarchprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (subpref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrGetbinprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnattrSetbinprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else 0

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_uname((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_connectx(socket, (endpoints?.value ?: 0L).toString(), associd.toInt(), flags.toInt(), (iov?.value ?: 0L).toString(), iovcnt.toInt(), (len?.value ?: 0L).toString(), (connid?.value ?: 0L).toString()) as Int) else 0

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_disconnectx(socket, associd.toInt(), connid.toInt()) as Int) else 0

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_ntpAdjtime((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_ntpGettime((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getmntinfo((mntbufp?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getfsstat((mntbufp?.value ?: 0L).toString(), bufsize, flags) as Int) else 0

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_clonefile(src, dst, flags.toInt()) as Int) else 0

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_clonefileat(srcDirfd, src, dstDirfd, dst, flags.toInt()) as Int) else 0

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fclonefileat(srcfd, dstDirfd, dst, flags.toInt()) as Int) else 0

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_copyfile(from, to, (state?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fcopyfile(from, to, (state?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_copyfileStateFree((s?.value ?: 0L).toString()) as Int) else 0

public actual fun copyfileStateAlloc(): CopyfileStateT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_copyfileStateAlloc() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_copyfileStateGet((s?.value ?: 0L).toString(), flags.toInt(), (dst?.value ?: 0L).toString()) as Int) else 0

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_copyfileStateSet((s?.value ?: 0L).toString(), flags.toInt(), (src?.value ?: 0L).toString()) as Int) else 0

public actual fun machErrorString(errorValue: MachErrorT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_machErrorString(errorValue) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) as Int) else 0

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_memsetPattern4((b?.value ?: 0L).toString(), (pattern4?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_memsetPattern8((b?.value ?: 0L).toString(), (pattern8?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_memsetPattern16((b?.value ?: 0L).toString(), (pattern16?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_strtonum(numstr, minval.toString(), maxval.toString(), (errstrp?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mstats(): Mstats =
    Mstats()

public actual fun mallocPrintf(format: String?, vararg variadicArgs: Long) {
}

public actual fun mallocZoneCheck(zone: COpaquePointer?): BooleanT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneCheck((zone?.value ?: 0L).toString()) as Int) else 0

public actual fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZonePrint((zone?.value ?: 0L).toString(), verbose)
    }
}

public actual fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneStatistics((zone?.value ?: 0L).toString(), (stats?.value ?: 0L).toString())
    }
}

public actual fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneLog((zone?.value ?: 0L).toString(), (address?.value ?: 0L).toString())
    }
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZonePrintPtrInfo((ptr?.value ?: 0L).toString())
    }
}

public actual fun mallocDefaultZone(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocDefaultZone() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneFromPtr((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneMalloc((zone?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneValloc((zone?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneCalloc((zone?.value ?: 0L).toString(), numItems.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneRealloc((zone?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocZoneFree((zone?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString())
    }
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procListpids(t.toInt(), typeinfo.toInt(), (buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procListallpids((buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procListpgrppids(pgrpid, (buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procListchildpids(ppid, (buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procPidinfo(pid, flavor, arg.toString(), (buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procPidfdinfo(pid, fd, flavor, (buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procPidfileportinfo(pid, fileport.toInt(), flavor, (buffer?.value ?: 0L).toString(), buffersize) as Int) else 0

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procPidpath(pid, (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else 0

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procName(pid, (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else 0

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procRegionfilename(pid, address.toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else 0

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procKmsgbuf((buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else 0

public actual fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procLibversion((major?.value ?: 0L).toString(), (minor?.value ?: 0L).toString()) as Int) else 0

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procPidRusage(pid, flavor, (buffer?.value ?: 0L).toString()) as Int) else 0

public actual fun procSetNoSmt(): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procSetNoSmt() as Int) else 0

public actual fun procSetthreadNoSmt(): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procSetthreadNoSmt() as Int) else 0

public actual fun procSetCsm(flags: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procSetCsm(flags.toInt()) as Int) else 0

public actual fun procSetthreadCsm(flags: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_procSetthreadCsm(flags.toInt()) as Int) else 0

public actual fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_gethostuuid((id?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun gethostid(): CLong =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_gethostid() as String).toLong() else 0L

public actual fun sethostid(hostid: CLong) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_sethostid(hostid.toString())
    }
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_cCRandomGenerateBytes((bytes?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_nsgetExecutablePath((buf?.value ?: 0L).toString(), (bufsize?.value ?: 0L).toString()) as Int) else 0

public actual fun nsgetArgv(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_nsgetArgv() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nsgetArgc(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_nsgetArgc() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nsgetEnviron(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_nsgetEnviron() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nsgetProgname(): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_nsgetProgname() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_machVmMap(targetTask.toLong().toString(), (address?.value ?: 0L).toString(), size.toString(), mask.toString(), flags, obj.toInt(), offset.toString(), copy, curProtection, maxProtection, inheritance.toInt()) as Int) else 0

public actual fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_vmAllocate(targetTask.toLong().toString(), (address?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_vmDeallocate(targetTask.toLong().toString(), address.toString(), size.toString()) as Int) else 0

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_hostStatistics64(hostPriv.toInt(), flavor, (hostInfo64Out?.value ?: 0L).toString(), (hostInfo64OutCnt?.value ?: 0L).toString()) as Int) else 0

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_hostProcessorInfo(host.toInt(), flavor, (outProcessorCount?.value ?: 0L).toString(), (outProcessorInfo?.value ?: 0L).toString(), (outProcessorInfoCnt?.value ?: 0L).toString()) as Int) else 0

public actual fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_taskForPid(host.toInt(), pid, (task?.value ?: 0L).toString()) as Int) else 0

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_taskInfo(host.toInt(), flavor.toInt(), (taskInfoOut?.value ?: 0L).toString(), (taskInfoCount?.value ?: 0L).toString()) as Int) else 0

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_taskCreate(targetTask.toInt(), (ledgers?.value ?: 0L).toString(), ledgersCnt.toInt(), inheritMemory, (childTask?.value ?: 0L).toString()) as Int) else 0

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_taskTerminate(targetTask.toInt()) as Int) else 0

public actual fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_taskThreads(targetTask.toInt(), (actList?.value ?: 0L).toString(), (actListCnt?.value ?: 0L).toString()) as Int) else 0

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_hostStatistics(hostPriv.toInt(), flavor, (hostInfoOut?.value ?: 0L).toString(), (hostInfoOutCnt?.value ?: 0L).toString()) as Int) else 0

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(state.toInt(), (path?.value ?: 0L).toString()) as Int).toUInt() else 0u

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getattrlist(path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) as Int) else 0

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fgetattrlist(fd, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) as Int) else 0

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getattrlistat(fd, path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toString()) as Int) else 0

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_setattrlist(path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) as Int) else 0

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_fsetattrlist(fd, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) as Int) else 0

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_setattrlistat(dirFd, path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) as Int) else 0

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_getattrlistbulk(dirfd, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toString()) as Int) else 0

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocSize((ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun mallocGoodSize(size: SizeT): SizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mallocGoodSize(size.toString()) as String).toULong() else 0uL

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_mknodat(dirfd, pathname, mode.toInt(), dev) as Int) else 0

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_freadlink(fd, (buf?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_execvP(file, searchPath, (argv?.value ?: 0L).toString()) as Int) else 0

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    if (_unixBsdAppleNapiAddon != null) {
        _unixBsdAppleNapiAddon.libc_unix_bsd_apple_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), (arg?.value ?: 0L).toString(), 0L.toString())
    }
}

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_clockSettime(clockId.toInt(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_taskSetInfo(targetTask.toInt(), flavor.toInt(), (taskInfoIn?.value ?: 0L).toString(), taskInfoInCnt.toInt()) as Int) else 0

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_iconvOpen(tocode, fromcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixBsdAppleNapiAddon != null) (_unixBsdAppleNapiAddon.libc_unix_bsd_apple_iconvClose((cd?.value ?: 0L).toString()) as Int) else 0
