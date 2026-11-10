@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private val _unixRedoxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_dirfd((dirp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_setresgid(rgid, egid, sgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_setresuid(ruid, euid, suid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixRedoxNapiAddon != null) {
        _unixRedoxNapiAddon.libc_unix_redox_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixRedoxNapiAddon != null) {
        _unixRedoxNapiAddon.libc_unix_redox_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getgrgid(gid) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getgrgidR(gid, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getgrouplist(user, group, (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(addr: COpaquePointer?, addrlen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getnameinfo((addr?.value ?: 0L).toString(), addrlen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(tid: COpaquePointer?, attr: COpaquePointer?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pthreadCreate((tid?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixRedoxNapiAddon != null) {
        _unixRedoxNapiAddon.libc_unix_redox_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixRedoxNapiAddon != null) {
        _unixRedoxNapiAddon.libc_unix_redox_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getpwuidR(uid, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pthreadCancel((thread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pthreadKill((thread?.value ?: 0L).toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, sig: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_sigtimedwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getsubopt((optionp?.value ?: 0L).toString(), (tokens?.value ?: 0L).toString(), (valuep?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    if (_unixRedoxNapiAddon != null) {
        _unixRedoxNapiAddon.libc_unix_redox_explicitBzero((p?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_strlcat((dst?.value ?: 0L).toString(), src, siz.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_strlcpy((dst?.value ?: 0L).toString(), src, siz.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_epollCreate(size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_epollCreate1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_shmOpen(name, oflag, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_shmUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_setpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_cmsgData((cmsg?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgFirsthdr(mhdr: COpaquePointer?): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_cmsgFirsthdr((mhdr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgNxthdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_cmsgNxthdr((mhdr?.value ?: 0L).toString(), (cmsg?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_recvmsg(socket, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_sendmsg(socket, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(utsname: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_uname((utsname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixRedoxNapiAddon != null) (_unixRedoxNapiAddon.libc_unix_redox_loginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
