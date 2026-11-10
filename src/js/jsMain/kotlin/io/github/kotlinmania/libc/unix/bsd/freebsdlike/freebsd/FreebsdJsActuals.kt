@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT

private val _unixBsdFreebsdlikeFreebsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fhlink(fhp: COpaquePointer?, to: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fhlink((fhp?.value ?: 0L).toString(), to) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhlinkat(fhp: COpaquePointer?, tofd: CInt, to: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fhlinkat((fhp?.value ?: 0L).toString(), tofd, to) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhreadlink(fhp: COpaquePointer?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fhreadlink((fhp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getfhat(fd, (path?.value ?: 0L).toString(), (fhp?.value ?: 0L).toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_error() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioError((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReadv(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioReadv((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWritev(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioWritev((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(infd: CInt, inoffp: COpaquePointer?, outfd: CInt, outoffp: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_copyFileRange(infd, (inoffp?.value ?: 0L).toString(), outfd, (outoffp?.value ?: 0L).toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_devnameR(dev.toInt(), mode.toInt(), (buf?.value ?: 0L).toString(), len) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFd(fd, attrnamespace, attrname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFile(path, attrnamespace, attrname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteLink(path, attrnamespace, attrname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrGetFd(fd, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrGetFile(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrGetLink(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrListFd(fd, attrnamespace, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrListFile(path, attrnamespace, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrListLink(path, attrnamespace, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrSetFd(fd, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrSetFile(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrSetLink(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: COpaquePointer?, flags: CInt, rmsr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fspacectl(fd, cmd, (rqsr?.value ?: 0L).toString(), flags, (rmsr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jail(jail: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_jail((jail?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailAttach(jid: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_jailAttach(jid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailRemove(jid: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_jailRemove(jid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailGet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_jailGet((iov?.value ?: 0L).toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailSet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_jailSet((iov?.value ?: 0L).toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(user: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getutxuser(user) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CInt, file: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_setutxdb(type, file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_aioWaitcomplete((iocbp?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mqGetfdNp((mqd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_waitid(idtype.toInt(), id.toString(), (infop?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_ftok(pathname, projId) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_shmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_semget(key.toString(), nsems, semflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_msgget(key.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakesane(termios: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_cfmakesane((termios?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pdfork(fdp: COpaquePointer?, flags: CInt): PidT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pdfork((fdp?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdgetpid(fd: CInt, pidp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pdgetpid(fd, (pidp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pdkill(fd, signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_rtprioThread(function, lwpid, (rtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidgen(store: COpaquePointer?, count: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_uuidgen((store?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_thrKill(id.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_thrKill2(pid, id.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(tid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_thrSelf((tid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetthreadidNp(): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadGetthreadidNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadGetaffinityNp(td.toLong().toString(), cpusetsize.toString(), (cpusetp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadSetaffinityNp(td.toLong().toString(), cpusetsize.toString(), (cpusetp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_schedGetaffinity(pid, cpusetsz.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_schedSetaffinity(pid, cpusetsz.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_schedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexConsistent((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrGetrobust((attr?.value ?: 0L).toString(), (robust?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robust) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pthreadTimedjoinNp(thread.toLong().toString(), (retval?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_statfs(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_dup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_xuname(nmln, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt, timeout: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toString(), flags, (timeout?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhopen(fhp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fhopen((fhp?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstat(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fhstat((fhp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstatfs(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fhstatfs((fhp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfh(path: String?, fhp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getfh(path, (fhp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetfh(path: String?, fhp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_lgetfh(path, (fhp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(buf: COpaquePointer?, bufsize: CLong, mode: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getfsstat((buf?.value ?: 0L).toString(), bufsize.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getmntinfo((mntbufp?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mount(type, dir, flags, (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nmount(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_nmount((iov?.value ?: 0L).toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_setproctitle(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rfork(flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_rfork(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_cpusetGetaffinity(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_cpusetSetaffinity(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpuset(setid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_cpuset((setid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_cpusetGetid(level, which, id.toString(), (setid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_cpusetSetid(which, id.toString(), setid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capEnter(): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capEnter() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetmode(modep: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capGetmode((modep?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capFcntlsGet(fd, (fcntlrightsp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capFcntlsLimit(fd, fcntlrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsGet(fd: CInt, cmds: COpaquePointer?, maxcmds: ULong): Long =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capIoctlsGet(fd, (cmds?.value ?: 0L).toString(), maxcmds.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsLimit(fd: CInt, cmds: COpaquePointer?, ncmds: ULong): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capIoctlsLimit(fd, (cmds?.value ?: 0L).toString(), ncmds.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsInit(version: CInt, rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsInit(version, (rights?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsGet(version, fd, (rightsp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsSet(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsSet((rights?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsClear(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsClear((rights?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsSet(rights: COpaquePointer?, vararg variadicArgs: Long): Boolean =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsIsSet((rights?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsValid(rights: COpaquePointer?): Boolean =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsIsValid((rights?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsLimit(fd: CInt, rights: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsLimit(fd, (rights?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsMerge(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsMerge((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsRemove(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsRemove((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsContains(big: COpaquePointer?, little: COpaquePointer?): Boolean =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capRightsContains((big?.value ?: 0L).toString(), (little?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capSandboxed(): Boolean =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_capSandboxed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffs(value: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_ffs(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_ffsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_ffsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fls(value: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fls(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsl(value: CLong): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_flsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsll(value: CLonglong): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_flsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mallocStatsPrint(0L.toString(), (cbopaque?.value ?: 0L).toString(), opt)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mallctl(name, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlnametomib(name: String?, mibp: COpaquePointer?, miplen: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mallctlnametomib(name, (mibp?.value ?: 0L).toString(), (miplen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlbymib(mib: COpaquePointer?, mible: SizeT, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mallctlbymib((mib?.value ?: 0L).toString(), mible.toString(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_mallocx(size.toString(), flags) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_rallocx((ptr?.value ?: 0L).toString(), size.toString(), flags) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_xallocx((ptr?.value ?: 0L).toString(), size.toString(), extra.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sallocx((ptr?.value ?: 0L).toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_dallocx((ptr?.value ?: 0L).toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sdallocx((ptr?.value ?: 0L).toString(), size.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_nallocx(size.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procctl(idtype.toInt(), id.toString(), cmd, (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getpagesizes((pagesize?.value ?: 0L).toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_clockGetcpuclockid2(arg1.toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_strchrnul(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_shmCreateLargepage(path, flags, psind, allocPolicy, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_shmRename(pathFrom, pathTo, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memfdCreate(name, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setaudit(auditinfo: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_setaudit((auditinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_eventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_eventfdRead(fd, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_eventfdWrite(fd, value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_fdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_elfAuxInfo(aux, (buf?.value ?: 0L).toString(), buflen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitleFast(fmt: String?, vararg variadicArgs: Long) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_setproctitleFast(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timingsafeBcmp((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timingsafeMemcmp((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_umtxOp((obj?.value ?: 0L).toString(), op, value.toString(), (uaddr?.value ?: 0L).toString(), (uaddr2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpPeeloff(s, id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpBindx(s: CInt, addrs: COpaquePointer?, num: CInt, tpe: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpBindx(s, (addrs?.value ?: 0L).toString(), num, tpe) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpConnectx(s: CInt, addrs: COpaquePointer?, addrcnt: CInt, id: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpConnectx(s, (addrs?.value ?: 0L).toString(), addrcnt, (id?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpGetaddrlen(family.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpGetpaddrs(s, asocid.toInt(), (addrs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreepaddrs(addrs: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpFreepaddrs((addrs?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpGetladdrs(s, asocid.toInt(), (addrs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreeladdrs(addrs: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpFreeladdrs((addrs?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpOptInfo(s, id.toInt(), opt, (arg?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpSendv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, addrs: COpaquePointer?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpSendv(sd, (iov?.value ?: 0L).toString(), iovcnt, (addrs?.value ?: 0L).toString(), addrcnt, (info?.value ?: 0L).toString(), infolen.toInt(), infotype.toInt(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpRecvv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, from: COpaquePointer?, fromlen: COpaquePointer?, info: COpaquePointer?, infolen: COpaquePointer?, infotype: COpaquePointer?, flags: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_sctpRecvv(sd, (iov?.value ?: 0L).toString(), iovcnt, (from?.value ?: 0L).toString(), (fromlen?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (infolen?.value ?: 0L).toString(), (infotype?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_closefrom(lowfd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_closeRange(lowfd.toInt(), highfd.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kcmp(pid1, pid2, type, idx1.toString(), idx2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_dlvsym((handle?.value ?: 0L).toString(), symbol, version) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatStrerror(error) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlAlloc(): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatMtlAlloc() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFirst(list: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFirst((list?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlNext(mtp: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatMtlNext((mtp?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFind(list: COpaquePointer?, allocator: CInt, name: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFind((list?.value ?: 0L).toString(), allocator, name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFree(list: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFree((list?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memstatMtlGeterror(list: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatMtlGeterror((list?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatGetName(mtp: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_memstatGetName((mtp?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmDpcpuSetcpu(kd: COpaquePointer?, cpu: CUint): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmDpcpuSetcpu((kd?.value ?: 0L).toString(), cpu.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetargv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetargv((kd?.value ?: 0L).toString(), (p?.value ?: 0L).toString(), nchr) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetcptime(kd: COpaquePointer?, cpTime: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetcptime((kd?.value ?: 0L).toString(), (cpTime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetenvv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetenvv((kd?.value ?: 0L).toString(), (p?.value ?: 0L).toString(), nchr) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGeterr(kd: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGeterr((kd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetmaxcpu(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetmaxcpu((kd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetncpus(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetncpus((kd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetpcpu(kd: COpaquePointer?, cpu: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetpcpu((kd?.value ?: 0L).toString(), cpu) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmCounterU64Fetch(kd: COpaquePointer?, base: CUlong): ULong =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmCounterU64Fetch((kd?.value ?: 0L).toString(), base.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetswapinfo(kd: COpaquePointer?, info: COpaquePointer?, maxswap: CInt, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmGetswapinfo((kd?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), maxswap, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNative(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmNative((kd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmNlist((kd?.value ?: 0L).toString(), (nl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist2(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmNlist2((kd?.value ?: 0L).toString(), (nl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmReadZpcpu(kd: COpaquePointer?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmReadZpcpu((kd?.value ?: 0L).toString(), base.toString(), (buf?.value ?: 0L).toString(), size.toString(), cpu) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead2(kd: COpaquePointer?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kvmRead2((kd?.value ?: 0L).toString(), addr.toString(), (buf?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrNamespaceToString(attrnamespace, (string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_extattrStringToNamespace(string, (attrnamespace?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_realhostname((host?.value ?: 0L).toString(), hsize.toString(), (ip?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: COpaquePointer?, addrlen: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_realhostnameSa((host?.value ?: 0L).toString(), hsize.toString(), (addr?.value ?: 0L).toString(), addrlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldIsloaded(name: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kldIsloaded(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldLoad(name: String?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kldLoad(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_kinfoGetvmmap(pid, (cntp?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_hexdump((ptr?.value ?: 0L).toString(), length, hdr, flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_humanizeNumber((buf?.value ?: 0L).toString(), len.toString(), number.toString(), suffix, scale, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopen(path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_flopen(path, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_flopenat(fd, path, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlocalbase(): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_getlocalbase() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pidfileOpen(path, mode.toInt(), (pidptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileWrite(path: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pidfileWrite((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileClose(path: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pidfileClose((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileRemove(path: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pidfileRemove((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileFileno(path: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_pidfileFileno((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenSysctl(): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatOpenSysctl() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetfiles(procstat: COpaquePointer?, kp: COpaquePointer?, mmapped: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetfiles((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), mmapped) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreefiles(procstat: COpaquePointer?, head: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreefiles((procstat?.value ?: 0L).toString(), (head?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetprocs(procstat: COpaquePointer?, what: CInt, arg: CInt, count: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetprocs((procstat?.value ?: 0L).toString(), what, arg, (count?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreeprocs(procstat: COpaquePointer?, p: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreeprocs((procstat?.value ?: 0L).toString(), (p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetvmmap(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetvmmap((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreevmmap(procstat: COpaquePointer?, vmmap: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreevmmap((procstat?.value ?: 0L).toString(), (vmmap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatClose(procstat: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatClose((procstat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeargv(procstat: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreeargv((procstat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeenvv(procstat: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreeenvv((procstat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreegroups(procstat: COpaquePointer?, groups: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreegroups((procstat?.value ?: 0L).toString(), (groups?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeptlwpinfo(procstat: COpaquePointer?, pl: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatFreeptlwpinfo((procstat?.value ?: 0L).toString(), (pl?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetargv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetargv((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), nchr.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetenvv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetenvv((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), nchr.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetgroups(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetgroups((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetosrel(procstat: COpaquePointer?, kp: COpaquePointer?, osrelp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetosrel((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), (osrelp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetpathname(procstat: COpaquePointer?, kp: COpaquePointer?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetpathname((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), (pathname?.value ?: 0L).toString(), maxlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetrlimit(procstat: COpaquePointer?, kp: COpaquePointer?, which: CInt, rlimit: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetrlimit((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), which, (rlimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetumask(procstat: COpaquePointer?, kp: COpaquePointer?, maskp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetumask((procstat?.value ?: 0L).toString(), (kp?.value ?: 0L).toString(), (maskp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenCore(filename: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatOpenCore(filename) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatOpenKvm(nlistf, memf) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetSocketInfo(proc: COpaquePointer?, fst: COpaquePointer?, sock: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetSocketInfo((proc?.value ?: 0L).toString(), (fst?.value ?: 0L).toString(), (sock?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetVnodeInfo(proc: COpaquePointer?, fst: COpaquePointer?, vn: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetVnodeInfo((proc?.value ?: 0L).toString(), (fst?.value ?: 0L).toString(), (vn?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetPtsInfo(proc: COpaquePointer?, fst: COpaquePointer?, pts: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetPtsInfo((proc?.value ?: 0L).toString(), (fst?.value ?: 0L).toString(), (pts?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetShmInfo(proc: COpaquePointer?, fst: COpaquePointer?, shm: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_procstatGetShmInfo((proc?.value ?: 0L).toString(), (fst?.value ?: 0L).toString(), (shm?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerCreate(clockId, (evp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerDelete((timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerGetoverrun((timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerGettime((timerid?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_timerSettime((timerid?.value ?: 0L).toString(), flags, (value?.value ?: 0L).toString(), (ovalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetnumdevs(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_devstatGetnumdevs((kd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetgeneration(kd: COpaquePointer?): CLong =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_devstatGetgeneration((kd?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetversion(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_devstatGetversion((kd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatCheckversion(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_devstatCheckversion((kd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: COpaquePointer?, numSelections: COpaquePointer?, selectGeneration: COpaquePointer?, currentGeneration: CLong, devices: COpaquePointer?, numdevs: CInt, matches: COpaquePointer?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdNapiAddon != null) (_unixBsdFreebsdlikeFreebsdNapiAddon.libc_unix_bsd_freebsdlike_freebsd_devstatBuildmatch((matchStr?.value ?: 0L).toString(), (matches?.value ?: 0L).toString(), (numMatches?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
