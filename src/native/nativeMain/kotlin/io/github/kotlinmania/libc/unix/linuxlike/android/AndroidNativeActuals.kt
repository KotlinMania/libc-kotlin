@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_prlimit(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_prlimit64(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_mlock2(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_preadv(fd, iov?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_processVmReadv(pid, localIov?.value?.toCPointer<ByteVar>(), localIovCount, remoteIov?.value?.toCPointer<ByteVar>(), remoteIovCount, flags)

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_processVmWritev(pid, localIov?.value?.toCPointer<ByteVar>(), localIovCount, remoteIov?.value?.toCPointer<ByteVar>(), remoteIovCount, flags)

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_ptrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setpriority(which, who, prio)

public actual fun schedCpualloc(count: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedCpualloc(count)?.let { COpaquePointer(it.toLong()) }

public actual fun schedCpufree(set: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedCpufree(set?.value?.toCPointer<ByteVar>())
}

public actual fun schedCpucount(setsize: SizeT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedCpucount(setsize, set?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedGetcpu()

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_mallocInfo(options, stream?.handle?.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun utmpname(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_utmpname(name)

public actual fun setutent() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setutent()
}

public actual fun getutent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fallocate(fd, mode, offset, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_posixFallocate64(fd, offset, len)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_timerfdCreate(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_timerfdGettime(fd, currentValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_syscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedGetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_epollWait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_epollCtl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_unshare(flags)

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_tee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_eventfdRead(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_eventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setns(fd, nstype)

public actual fun swapoff(puath: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_mount(src, target, fstype, flags, data?.value?.toCPointer<ByteVar>())

public actual fun personality(persona: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_personality(persona)

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_prctl(option, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_clone(0L.toCPointer<ByteVar>(), childStack?.value?.toCPointer<ByteVar>(), flags, arg?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedGetPriorityMin(policy)

public actual fun sysinfo(info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sysinfo(info?.value?.toCPointer<ByteVar>())

public actual fun umount2(target: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun setfsgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_setfsuid(uid)

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_daemon(nochdir, noclose)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_initgroups(user, group)

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_faccessat(dirfd, pathname, mode, flags)

public actual fun errno(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_inotifyAddWatch(fd, path, mask)

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun androidSetAbortMessage(msg: String?) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_androidSetAbortMessage(msg)
}

public actual fun gettid(): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_gettid()

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_tgkill(tgid, tid, sig)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getauxval(type)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_systemPropertySet(name, value)

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_systemPropertyGet(name, value?.value?.toCPointer<ByteVar>())

public actual fun systemPropertyFind(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_systemPropertyFind(name)?.let { COpaquePointer(it.toLong()) }

public actual fun systemPropertyFindNth(n: CUint): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_systemPropertyFindNth(n)?.let { COpaquePointer(it.toLong()) }

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_systemPropertyForeach(0L.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_arc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_arc4randomUniform(upperBound)

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), n)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun dirname(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_dirname(path)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_syncfs(fd)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_freadUnlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fwriteUnlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fflushUnlocked(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fflushUnlocked(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_fgetsUnlocked(buf?.value?.toCPointer<ByteVar>(), size, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_klogctl(syslogType, bufp?.value?.toCPointer<ByteVar>(), len)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_memfdCreate(name, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_unix_linuxlike_android_renameat2(olddirfd, oldpath, newdirfd, newpath, flags)
