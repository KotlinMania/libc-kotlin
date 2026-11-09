@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

private val _unixLinuxlikeLinuxNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_getspnamR(name, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else 0

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqClose(mqd.toLong().toString()) as Int) else 0

public actual fun mqUnlink(name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqUnlink(name) as Int) else 0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else 0

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) as Int) else 0

public actual fun mrand48(): CLong =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mrand48() as String).toLong() else 0L

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_seed48((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixLinuxlikeLinuxNapiAddon != null) {
        _unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_lcong48((p?.value ?: 0L).toString())
    }
}

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_lutimes(file, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_shmUnlink(name) as Int) else 0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_ftok(pathname, projId) as Int) else 0

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_semget(key, nsems, semflag) as Int) else 0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) as Int) else 0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt): CInt =
    0

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_msgget(key, msgflg) as Int) else 0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else 0L

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) as Int) else 0

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fallocate(fd, mode, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_readahead(fd, offset.toString(), count.toString()) as String).toLong() else 0L

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_listxattr(path, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_removexattr(path, name) as Int) else 0

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_lremovexattr(path, name) as Int) else 0

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fremovexattr(filedes, name) as Int) else 0

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_signalfd(fd, (mask?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_timerfdCreate(clockid, flags) as Int) else 0

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_quotactl(cmd, special, id, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_epollPwait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout, (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_dup3(oldfd, newfd, flags) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) as Int) else 0

public actual fun reboot(howTo: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_reboot(howTo) as Int) else 0

public actual fun setfsgid(gid: GidT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_setfsgid(gid.toInt()) as Int) else 0

public actual fun setfsuid(uid: UidT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_setfsuid(uid.toInt()) as Int) else 0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_syncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) as Int) else 0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_remapFilePages((addr?.value ?: 0L).toString(), size.toString(), prot, pgoff.toString(), flags) as Int) else 0

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun vhangup(): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_vhangup() as Int) else 0

public actual fun sync() {
    if (_unixLinuxlikeLinuxNapiAddon != null) {
        _unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_sync()
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_syncfs(fd) as Int) else 0

public actual fun syscall(num: CLong): CLong =
    0L

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun epollCreate(size: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_epollCreate(size) as Int) else 0

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_epollCreate1(flags) as Int) else 0

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) as Int) else 0

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun unshare(flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_unshare(flags) as Int) else 0

public actual fun umount(target: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_umount(target) as Int) else 0

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_tee(fdIn, fdOut, len.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_splice(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_eventfd(initval.toInt(), flags) as Int) else 0

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_eventfdRead(fd, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_eventfdWrite(fd, value.toString()) as Int) else 0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_setns(fd, nstype) as Int) else 0

public actual fun swapoff(path: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_swapoff(path) as Int) else 0

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_vmsplice(fd, (iov?.value ?: 0L).toString(), nrSegs.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun personality(persona: CUlong): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_personality(persona.toString()) as Int) else 0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_schedGetscheduler(pid) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun umount2(target: String?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_umount2(target, flags) as Int) else 0

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_swapon(path, swapflags) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_sendfile(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_getdtablesize() as Int) else 0

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else 0

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_freadUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_inotifyRmWatch(fd, wd) as Int) else 0

public actual fun inotifyInit(): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_inotifyInit() as Int) else 0

public actual fun inotifyInit1(flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_inotifyInit1(flags) as Int) else 0

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_inotifyAddWatch(fd, path, mask.toInt()) as Int) else 0

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fanotifyInit(flags.toInt(), eventFFlags.toInt()) as Int) else 0

public actual fun gethostid(): CLong =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_gethostid() as String).toLong() else 0L

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_klogctl(syslogType, (bufp?.value ?: 0L).toString(), len) as Int) else 0

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fallocate64(fd, mode, offset.toString(), len.toString()) as Int) else 0

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fgetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_fopen64(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_posixFallocate64(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_sendfile64(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun tmpfile64(): FILE? =
    if (_unixLinuxlikeLinuxNapiAddon != null) (_unixLinuxlikeLinuxNapiAddon.libc_unix_linuxlike_linux_tmpfile64() as String).toLong().let { if (it == 0L) null else FILE(it) } else null
