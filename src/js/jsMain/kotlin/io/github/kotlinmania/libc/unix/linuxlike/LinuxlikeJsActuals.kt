@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Stat64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statvfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.powerpc64.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmax(): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeLibcCurrentSigrtmax() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmin(): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeLibcCurrentSigrtmin() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CUchar>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetitimer(which, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSetgroups(ngroups.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixLinuxlikeNapiAddon != null) {
        unixLinuxlikeNapiAddon.libcUnixLinuxlikeFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeAcct(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeBrk(addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfork(): PidT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeVfork() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetifaddrs(ifap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixLinuxlikeNapiAddon != null) {
        unixLinuxlikeNapiAddon.libcUnixLinuxlikeFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSendmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeRecvmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeStrchrnul(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>, locale: LocaleT): SizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStrftimeL(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString(), locale.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeSetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixLinuxlikeNapiAddon != null) {
        unixLinuxlikeNapiAddon.libcUnixLinuxlikeIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFstatfs64(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStatvfs64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFstatvfs64(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStatfs64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeCreat64(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFstat64(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat64(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFstatat64(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeFtruncate64(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeLseek64(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeLstat64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeMmap64(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeOpen64(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat64(fd: CInt, path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeOpenat64(fd, path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePosixFadvise64(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePread64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePwrite64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    if (unixLinuxlikeNapiAddon != null) MutPtr((unixLinuxlikeNapiAddon.libcUnixLinuxlikeReaddir64(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeReaddir64R(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStat64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeTruncate64(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePreadv64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikePwritev64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    if (unixLinuxlikeNapiAddon != null) (unixLinuxlikeNapiAddon.libcUnixLinuxlikeStatx(dirfd, pathname.rawAddress.toString(), flags, mask.toInt(), statxbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
