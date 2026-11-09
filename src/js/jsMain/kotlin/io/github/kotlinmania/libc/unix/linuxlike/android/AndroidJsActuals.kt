@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT

private val _unixLinuxlikeAndroidNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun setgrent() {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setgrent()
    }
}

public actual fun endgrent() {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_endgrent()
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_prlimit(pid, resource, (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) as Int) else 0

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_prlimit64(pid, resource, (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_mlock2((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toString(), (serv?.value ?: 0L).toString(), servlen.toString(), flags) as Int) else 0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_preadv(fd, (iov?.value ?: 0L).toString(), count, offset.toString()) as String).toLong() else 0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_pwritev(fd, (iov?.value ?: 0L).toString(), count, offset.toString()) as String).toLong() else 0L

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_processVmReadv(pid, (localIov?.value ?: 0L).toString(), localIovCount.toString(), (remoteIov?.value ?: 0L).toString(), remoteIovCount.toString(), flags.toString()) as String).toLong() else 0L

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_processVmWritev(pid, (localIov?.value ?: 0L).toString(), localIovCount.toString(), (remoteIov?.value ?: 0L).toString(), remoteIovCount.toString(), flags.toString()) as String).toLong() else 0L

public actual fun ptrace(request: CInt): CLong =
    0L

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getpriority(which, who.toInt()) as Int) else 0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setpriority(which, who.toInt(), prio) as Int) else 0

public actual fun schedCpualloc(count: SizeT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedCpualloc(count.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun schedCpufree(set: COpaquePointer?) {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedCpufree((set?.value ?: 0L).toString())
    }
}

public actual fun schedCpucount(setsize: SizeT, set: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedCpucount(setsize.toString(), (set?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetcpu(): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedGetcpu() as Int) else 0

public actual fun mallinfo(): Mallinfo =
    null as Mallinfo

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_mallocInfo(options, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun utmpname(name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_utmpname(name) as Int) else 0

public actual fun setutent() {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setutent()
    }
}

public actual fun getutent(): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getutent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fallocate(fd, mode, offset.toString(), len.toString()) as Int) else 0

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fallocate64(fd, mode, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_posixFallocate64(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_listxattr(path, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_removexattr(path, name) as Int) else 0

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_lremovexattr(path, name) as Int) else 0

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fremovexattr(filedes, name) as Int) else 0

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_signalfd(fd, (mask?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_timerfdCreate(clock, flags) as Int) else 0

public actual fun timerfdGettime(fd: CInt, currentValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_timerfdGettime(fd, (currentValue?.value ?: 0L).toString()) as Int) else 0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun syscall(num: CLong): CLong =
    0L

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun epollCreate(size: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_epollCreate(size) as Int) else 0

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_epollCreate1(flags) as Int) else 0

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) as Int) else 0

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun unshare(flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_unshare(flags) as Int) else 0

public actual fun umount(target: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_umount(target) as Int) else 0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedGetPriorityMax(policy) as Int) else 0

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_tee(fdIn, fdOut, len.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_splice(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_eventfd(initval.toInt(), flags) as Int) else 0

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_eventfdRead(fd, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_eventfdWrite(fd, value.toString()) as Int) else 0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setns(fd, nstype) as Int) else 0

public actual fun swapoff(puath: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_swapoff(puath) as Int) else 0

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_vmsplice(fd, (iov?.value ?: 0L).toString(), nrSegs.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_mount(src, target, fstype, flags.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun personality(persona: CUint): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_personality(persona.toInt()) as Int) else 0

public actual fun prctl(option: CInt): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedGetscheduler(pid) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sethostname(name, len.toString()) as Int) else 0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedGetPriorityMin(policy) as Int) else 0

public actual fun sysinfo(info: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sysinfo((info?.value ?: 0L).toString()) as Int) else 0

public actual fun umount2(target: String?, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_umount2(target, flags) as Int) else 0

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_swapon(path, swapflags) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sendfile(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sendfile64(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun setfsgid(gid: GidT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setfsgid(gid.toInt()) as Int) else 0

public actual fun setfsuid(uid: UidT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_setfsuid(uid.toInt()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun semUnlink(name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_semUnlink(name) as Int) else 0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_daemon(nochdir, noclose) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_initgroups(user, group.toInt()) as Int) else 0

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun errno(): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_errno() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_inotifyRmWatch(fd, wd.toInt()) as Int) else 0

public actual fun inotifyInit(): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_inotifyInit() as Int) else 0

public actual fun inotifyInit1(flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_inotifyInit1(flags) as Int) else 0

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_inotifyAddWatch(fd, path, mask.toInt()) as Int) else 0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) as Int) else 0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else 0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else 0uL

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_regfree((preg?.value ?: 0L).toString())
    }
}

public actual fun androidSetAbortMessage(msg: String?) {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_androidSetAbortMessage(msg)
    }
}

public actual fun gettid(): PidT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_gettid() as Int) else 0

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_tgkill(tgid, tid, sig) as Int) else 0

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getauxval(type.toString()) as String).toULong() else 0uL

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_systemPropertySet(name, value) as Int) else 0

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_systemPropertyGet(name, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun systemPropertyFind(name: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_systemPropertyFind(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun systemPropertyFindNth(n: CUint): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_systemPropertyFindNth(n.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_systemPropertyForeach(0L.toString(), (cookie?.value ?: 0L).toString()) as Int) else 0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun arc4random(): UInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_arc4randomUniform(upperBound.toInt()) as Int).toUInt() else 0u

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_arc4randomBuf((buf?.value ?: 0L).toString(), n.toString())
    }
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dirname(path: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_dirname(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun basename(path: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_basename(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) as Int) else 0

public actual fun sync() {
    if (_unixLinuxlikeAndroidNapiAddon != null) {
        _unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_sync()
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_syncfs(fd) as Int) else 0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_freadUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fwriteUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fflushUnlocked(stream: FILE?): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fflushUnlocked((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_fgetsUnlocked((buf?.value ?: 0L).toString(), size, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_klogctl(syslogType, (bufp?.value ?: 0L).toString(), len) as Int) else 0

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_memfdCreate(name, flags.toInt()) as Int) else 0

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    if (_unixLinuxlikeAndroidNapiAddon != null) (_unixLinuxlikeAndroidNapiAddon.libc_unix_linuxlike_android_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt()) as Int) else 0
