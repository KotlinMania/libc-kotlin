@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

private val _unixLinuxlikeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmax(): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_libcCurrentSigrtmax() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmin(): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_libcCurrentSigrtmin() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_semDestroy((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_clockGetres(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_clockSettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getitimer(which, (currValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_dirfd((dirp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_setgroups(ngroups.toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_statfs(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_duplocale((base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixLinuxlikeNapiAddon != null) {
        _unixLinuxlikeNapiAddon.libc_unix_linuxlike_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_newlocale(mask, locale, (base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_uselocale((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_clearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: String?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_acct(filename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_brk((addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_sbrk(increment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfork(): PidT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_vfork() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_loginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixLinuxlikeNapiAddon != null) {
        _unixLinuxlikeNapiAddon.libc_unix_linuxlike_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_uname((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_strchrnul(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?, locale: LocaleT): SizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_strftimeL((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString(), (locale?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_strptime(s, format, (tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getdomainname((name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_setdomainname(name, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixLinuxlikeNapiAddon != null) {
        _unixLinuxlikeNapiAddon.libc_unix_linuxlike_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fstatfs64(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_statvfs64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fstatvfs64(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_statfs64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_creat64(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fstat64(fildes, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_fstatat64(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_ftruncate64(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_lseek64(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_lstat64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_mmap64((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_open64(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat64(fd: CInt, path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_openat64(fd, path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_posixFadvise64(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_pread64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_pwrite64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_readdir64((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_readdir64R((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_stat64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(path: String?, length: Off64T): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_truncate64(path, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_preadv64(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_pwritev64(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    if (_unixLinuxlikeNapiAddon != null) (_unixLinuxlikeNapiAddon.libc_unix_linuxlike_statx(dirfd, pathname, flags, mask.toInt(), (statxbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
