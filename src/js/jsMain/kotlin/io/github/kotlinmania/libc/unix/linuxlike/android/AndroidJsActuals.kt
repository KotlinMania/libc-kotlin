@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeAndroidNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent() {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetrlimit64(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetrlimit64(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPrlimit(pid, resource, newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPrlimit64(pid, resource, newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMlock2(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPreadv(fd, iov.rawAddress.toString(), count, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPwritev(fd, iov.rawAddress.toString(), count, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidProcessVmReadv(pid, localIov.rawAddress.toString(), localIovCount.toString(), remoteIov.rawAddress.toString(), remoteIovCount.toString(), flags.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidProcessVmWritev(pid, localIov.rawAddress.toString(), localIovCount.toString(), remoteIov.rawAddress.toString(), remoteIovCount.toString(), flags.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPtrace(request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCpualloc(count: SizeT): MutPtr<CpuSetT> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedCpualloc(count.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCpufree(set: MutPtr<CpuSetT>) {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedCpufree(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun schedCpucount(setsize: SizeT, set: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedCpucount(setsize.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMallocInfo(options, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidUtmpname(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): MutPtr<Utmp> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetutent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFallocate(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFallocate64(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPosixFallocate64(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFlistxattr(filedes, list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFremovexattr(filedes, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSignalfd(fd, mask.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidTimerfdCreate(clock, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currentValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidTimerfdGettime(fd, currentValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSyscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEpollCreate(size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEpollCreate1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEpollCtl(epfd, op, fd, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unshare(flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidUnshare(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidUmount(target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidTee(fdIn, fdOut, len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSplice(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEventfdRead(fd, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidEventfdWrite(fd, value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedRrGetInterval(pid, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetns(fd, nstype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSwapoff(puath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidVmsplice(fd, iov.rawAddress.toString(), nrSegs.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMount(src.rawAddress.toString(), target.rawAddress.toString(), fstype.rawAddress.toString(), flags.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUint): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPersonality(persona.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPrctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidClone(0L.toString(), childStack.rawAddress.toString(), flags, arg.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSysinfo(info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidUmount2(target.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSwapon(path.rawAddress.toString(), swapflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSendfile(outFd, inFd, offset.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSendfile64(outFd, inFd, offset.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetfsgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSetfsuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidInitgroups(user.rawAddress.toString(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr<CInt> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidErrno() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidInotifyRmWatch(fd, wd.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidInotifyInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit1(flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidInotifyInit1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidInotifyAddWatch(fd, path.rawAddress.toString(), mask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun androidSetAbortMessage(msg: ConstPtr<CChar>) {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidAndroidSetAbortMessage(msg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettid(): PidT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGettid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidTgkill(tgid, tid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertySet(name: ConstPtr<CChar>, value: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSystemPropertySet(name.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyGet(name: ConstPtr<CChar>, value: MutPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSystemPropertyGet(name.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyFind(name: ConstPtr<CChar>): ConstPtr<PropInfo> =
    if (unixLinuxlikeAndroidNapiAddon != null) ConstPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSystemPropertyFind(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyFindNth(n: CUint): ConstPtr<PropInfo> =
    if (unixLinuxlikeAndroidNapiAddon != null) ConstPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSystemPropertyFindNth(n.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSystemPropertyForeach(0L.toString(), cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidArc4randomUniform(upperBound.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT) {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidArc4randomBuf(buf.rawAddress.toString(), n.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixLinuxlikeAndroidNapiAddon != null) {
        unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidSyncfs(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFreadUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwriteUnlocked(buf: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFwriteUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflushUnlocked(stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFflushUnlocked(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetsUnlocked(buf: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (unixLinuxlikeAndroidNapiAddon != null) MutPtr((unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidFgetsUnlocked(buf.rawAddress.toString(), size, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidKlogctl(syslogType, bufp.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidMemfdCreate(name.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeAndroidNapiAddon != null) (unixLinuxlikeAndroidNapiAddon.libcUnixLinuxlikeAndroidRenameat2(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
