@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.Fpos64T
import io.github.kotlinmania.libc.unix.linuxlike.Itimerspec
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sembuf
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.MsqidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.StackT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeLinuxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getspnamR(name: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxGetspnamR(name.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixLinuxlikeLinuxNapiAddon != null) MutPtr((unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSeed48(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixLinuxlikeLinuxNapiAddon != null) {
        unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFtok(pathname.rawAddress.toString(), projId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSemget(key, nsems, semflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMsgctl(msqid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMsgget(key, msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFallocate(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxReadahead(fd, offset.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFlistxattr(filedes, list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFremovexattr(filedes, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSignalfd(fd, mask.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxTimerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxTimerfdGettime(fd, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxQuotactl(cmd, special.rawAddress.toString(), id, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEpollPwait(epfd, events.rawAddress.toString(), maxevents, timeout, sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxDup3(oldfd, newfd, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxReboot(howTo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSetfsgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSetfsuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSyncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remapFilePages(addr: MutPtr<CVoid>, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxRemapFilePages(addr.rawAddress.toString(), size.toString(), prot, pgoff.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxVhangup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixLinuxlikeLinuxNapiAddon != null) {
        unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSyncfs(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSyscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEpollCreate(size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEpollCreate1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEpollCtl(epfd, op, fd, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unshare(flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxUnshare(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxUmount(target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxTee(fdIn, fdOut, len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSplice(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEventfdRead(fd, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxEventfdWrite(fd, value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSchedRrGetInterval(pid, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSetns(fd, nstype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSwapoff(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxVmsplice(fd, iov.rawAddress.toString(), nrSegs.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPersonality(persona.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxClone(0L.toString(), childStack.rawAddress.toString(), flags, arg.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxUmount2(target.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSwapon(path.rawAddress.toString(), swapflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSendfile(outFd, inFd, offset.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFreadUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxInotifyRmWatch(fd, wd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxInotifyInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit1(flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxInotifyInit1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxInotifyAddWatch(fd, path.rawAddress.toString(), mask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFanotifyInit(flags.toInt(), eventFFlags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxKlogctl(syslogType, bufp.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFallocate64(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFgetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxNapiAddon != null) MutPtr((unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxFopen64(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxPosixFallocate64(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAddon != null) (unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxSendfile64(outFd, inFd, offset.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile64(): MutPtr<FILE> =
    if (unixLinuxlikeLinuxNapiAddon != null) MutPtr((unixLinuxlikeLinuxNapiAddon.libcUnixLinuxlikeLinuxTmpfile64() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
