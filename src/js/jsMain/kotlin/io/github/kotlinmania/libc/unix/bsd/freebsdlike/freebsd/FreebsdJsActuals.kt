@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeFreebsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fhlink(fhp: MutPtr, to: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhlink(fhp.rawAddress.toString(), to.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhlinkat(fhp: MutPtr, tofd: CInt, to: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp.rawAddress.toString(), tofd, to.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhreadlink(fhp: MutPtr, buf: MutPtr, bufsize: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfhat(fd: CInt, path: MutPtr, fhp: MutPtr, flag: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetfhat(fd, path.rawAddress.toString(), fhp.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdError() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReadv(aiocbp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWritev(aiocbp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr, outfd: CInt, outoffp: MutPtr, len: SizeT, flags: CUint): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd, inoffp.rawAddress.toString(), outfd, outoffp.rawAddress.toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr, len: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevnameR(dev.toInt(), mode.toInt(), buf.rawAddress.toString(), len) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd, attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr, flags: CInt, rmsr: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFspacectl(fd, cmd, rqsr.rawAddress.toString(), flags, rmsr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jail(jail: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJail(jail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailAttach(jid: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailAttach(jid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailRemove(jid: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailRemove(jid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailGet(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailGet(iov.rawAddress.toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailSet(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailSet(iov.rawAddress.toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(user: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetutxuser(user.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CInt, file: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetutxdb(type, file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: MutPtr, timeout: MutPtr): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp.rawAddress.toString(), timeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdWaitid(idtype.toInt(), id.toString(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFtok(pathname.rawAddress.toString(), projId) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSemget(key.toString(), nsems, semflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMsgget(key.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakesane(termios: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pdfork(fdp: MutPtr, flags: CInt): PidT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPdfork(fdp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdgetpid(fd: CInt, pidp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd, pidp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRtprioThread(function, lwpid, rtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidgen(store: MutPtr, count: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdUuidgen(store.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdThrKill(id.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(tid: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdThrSelf(tid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetthreadidNp(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td.toLong().toString(), cpusetsize.toString(), cpusetp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td.toLong().toString(), cpusetsize.toString(), cpusetp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid, cpusetsz.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid, cpusetsz.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSchedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: MutPtr, robust: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr.rawAddress.toString(), robust.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robust: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr.rawAddress.toString(), robust) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread.toLong().toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xuname(nmln: CInt, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdXuname(nmln, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt, timeout: ConstPtr): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toString(), flags, timeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhopen(fhp: ConstPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhopen(fhp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstat(fhp: ConstPtr, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhstat(fhp.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstatfs(fhp: ConstPtr, buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfh(path: ConstPtr, fhp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetfh(path.rawAddress.toString(), fhp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetfh(path: ConstPtr, fhp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdLgetfh(path.rawAddress.toString(), fhp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(buf: MutPtr, bufsize: CLong, mode: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf.rawAddress.toString(), bufsize.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr, mode: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(type: ConstPtr, dir: ConstPtr, flags: CInt, data: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMount(type.rawAddress.toString(), dir.rawAddress.toString(), flags, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nmount(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdNmount(iov.rawAddress.toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rfork(flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRfork(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpuset(setid: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpuset(setid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level, which, id.toString(), setid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id.toString(), setid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capEnter(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapEnter() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetmode(modep: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd, fcntlrightsp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr, maxcmds: ULong): Long =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd, cmds.rawAddress.toString(), maxcmds.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr, ncmds: ULong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd, cmds.rawAddress.toString(), ncmds.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsInit(version: CInt, rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version, rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version, fd, rightsp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsSet(rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsClear(rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsSet(rights: ConstPtr, vararg variadicArgs: Long): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsValid(rights: ConstPtr): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd, rights.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsMerge(dst: MutPtr, src: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsRemove(dst: MutPtr, src: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsContains(big: ConstPtr, little: ConstPtr): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big.rawAddress.toString(), little.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capSandboxed(): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapSandboxed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffs(value: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFfs(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFfsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFfsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fls(value: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFls(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsl(value: CLong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFlsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsll(value: CLonglong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFlsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr, opt: ConstPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(0L.toString(), cbopaque.rawAddress.toString(), opt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallctl(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallctl(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlnametomib(name: ConstPtr, mibp: MutPtr, miplen: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), miplen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlbymib(mib: ConstPtr, mible: SizeT, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib.rawAddress.toString(), mible.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallocx(size.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rallocx(ptr: MutPtr, size: SizeT, flags: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRallocx(ptr.rawAddress.toString(), size.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xallocx(ptr: MutPtr, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdXallocx(ptr.rawAddress.toString(), size.toString(), extra.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sallocx(ptr: ConstPtr, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSallocx(ptr.rawAddress.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dallocx(ptr: MutPtr, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDallocx(ptr.rawAddress.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sdallocx(ptr: MutPtr, size: SizeT, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr.rawAddress.toString(), size.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdNallocx(size.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcctl(idtype.toInt(), id.toString(), cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1.toString(), arg2, arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdStrchrnul(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmCreateLargepage(path: ConstPtr, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path.rawAddress.toString(), flags, psind, allocPolicy, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmRename(pathFrom: ConstPtr, pathTo: ConstPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom.rawAddress.toString(), pathTo.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setaudit(auditinfo: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdEventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux, buf.rawAddress.toString(), buflen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitleFast(fmt: ConstPtr, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxOp(obj: MutPtr, op: CInt, value: CUlong, uaddr: MutPtr, uaddr2: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj.rawAddress.toString(), op, value.toString(), uaddr.rawAddress.toString(), uaddr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpBindx(s: CInt, addrs: MutPtr, num: CInt, tpe: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpBindx(s, addrs.rawAddress.toString(), num, tpe) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr, addrcnt: CInt, id: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s, addrs.rawAddress.toString(), addrcnt, id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s, asocid.toInt(), addrs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreepaddrs(addrs: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s, asocid.toInt(), addrs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreeladdrs(addrs: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr, size: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s, id.toInt(), opt, arg.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpSendv(sd: CInt, iov: ConstPtr, iovcnt: CInt, addrs: MutPtr, addrcnt: CInt, info: MutPtr, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd, iov.rawAddress.toString(), iovcnt, addrs.rawAddress.toString(), addrcnt, info.rawAddress.toString(), infolen.toInt(), infotype.toInt(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr, iovcnt: CInt, from: MutPtr, fromlen: MutPtr, info: MutPtr, infolen: MutPtr, infotype: MutPtr, flags: MutPtr): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd, iov.rawAddress.toString(), iovcnt, from.rawAddress.toString(), fromlen.rawAddress.toString(), info.rawAddress.toString(), infolen.rawAddress.toString(), infotype.rawAddress.toString(), flags.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd.toInt(), highfd.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1.toString(), idx2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatStrerror(error: CInt): ConstPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) ConstPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlAlloc(): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFirst(list: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlNext(mtp: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFind(list: MutPtr, allocator: CInt, name: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list.rawAddress.toString(), allocator, name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFree(list: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memstatMtlGeterror(list: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatGetName(mtp: ConstPtr): ConstPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) ConstPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmDpcpuSetcpu(kd: MutPtr, cpu: CUint): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd.rawAddress.toString(), cpu.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetargv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd.rawAddress.toString(), p.rawAddress.toString(), nchr) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetcptime(kd: MutPtr, cpTime: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd.rawAddress.toString(), cpTime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetenvv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd.rawAddress.toString(), p.rawAddress.toString(), nchr) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGeterr(kd: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetmaxcpu(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetncpus(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetpcpu(kd: MutPtr, cpu: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd.rawAddress.toString(), cpu) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmCounterU64Fetch(kd: MutPtr, base: CUlong): ULong =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd.rawAddress.toString(), base.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetswapinfo(kd: MutPtr, info: MutPtr, maxswap: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd.rawAddress.toString(), info.rawAddress.toString(), maxswap, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNative(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmNative(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist(kd: MutPtr, nl: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd.rawAddress.toString(), nl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist2(kd: MutPtr, nl: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd.rawAddress.toString(), nl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmReadZpcpu(kd: MutPtr, base: CUlong, buf: MutPtr, size: SizeT, cpu: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd.rawAddress.toString(), base.toString(), buf.rawAddress.toString(), size.toString(), cpu) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead2(kd: MutPtr, addr: KvaddrT, buf: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string.rawAddress.toString(), attrnamespace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostname(host: MutPtr, hsize: SizeT, ip: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRealhostname(host.rawAddress.toString(), hsize.toString(), ip.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostnameSa(host: MutPtr, hsize: SizeT, addr: MutPtr, addrlen: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host.rawAddress.toString(), hsize.toString(), addr.rawAddress.toString(), addrlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldIsloaded(name: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldLoad(name: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKldLoad(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid, cntp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hexdump(ptr: ConstPtr, length: CInt, hdr: ConstPtr, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdHexdump(ptr.rawAddress.toString(), length, hdr.rawAddress.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun humanizeNumber(buf: MutPtr, len: SizeT, number: Long, suffix: ConstPtr, scale: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf.rawAddress.toString(), len.toString(), number.toString(), suffix.rawAddress.toString(), scale, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopen(path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFlopen(path.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopenat(fd: CInt, path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFlopenat(fd, path.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlocalbase(): ConstPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) ConstPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetlocalbase() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileOpen(path: ConstPtr, mode: ModeT, pidptr: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path.rawAddress.toString(), mode.toInt(), pidptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileWrite(path: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileClose(path: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileClose(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileRemove(path: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileFileno(path: ConstPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenSysctl(): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetfiles(procstat: MutPtr, kp: MutPtr, mmapped: CInt): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat.rawAddress.toString(), kp.rawAddress.toString(), mmapped) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreefiles(procstat: MutPtr, head: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat.rawAddress.toString(), head.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetprocs(procstat: MutPtr, what: CInt, arg: CInt, count: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat.rawAddress.toString(), what, arg, count.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreeprocs(procstat: MutPtr, p: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat.rawAddress.toString(), p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetvmmap(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat.rawAddress.toString(), kp.rawAddress.toString(), count.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreevmmap(procstat: MutPtr, vmmap: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat.rawAddress.toString(), vmmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatClose(procstat: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeargv(procstat: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeenvv(procstat: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreegroups(procstat: MutPtr, groups: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat.rawAddress.toString(), groups.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeptlwpinfo(procstat: MutPtr, pl: MutPtr) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat.rawAddress.toString(), pl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetargv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat.rawAddress.toString(), kp.rawAddress.toString(), nchr.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetenvv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat.rawAddress.toString(), kp.rawAddress.toString(), nchr.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetgroups(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat.rawAddress.toString(), kp.rawAddress.toString(), count.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetosrel(procstat: MutPtr, kp: MutPtr, osrelp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat.rawAddress.toString(), kp.rawAddress.toString(), osrelp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetpathname(procstat: MutPtr, kp: MutPtr, pathname: MutPtr, maxlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat.rawAddress.toString(), kp.rawAddress.toString(), pathname.rawAddress.toString(), maxlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetrlimit(procstat: MutPtr, kp: MutPtr, which: CInt, rlimit: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat.rawAddress.toString(), kp.rawAddress.toString(), which, rlimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetumask(procstat: MutPtr, kp: MutPtr, maskp: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat.rawAddress.toString(), kp.rawAddress.toString(), maskp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenCore(filename: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenKvm(nlistf: ConstPtr, memf: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf.rawAddress.toString(), memf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetSocketInfo(proc: MutPtr, fst: MutPtr, sock: MutPtr, errbuf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), sock.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetVnodeInfo(proc: MutPtr, fst: MutPtr, vn: MutPtr, errbuf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), vn.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetPtsInfo(proc: MutPtr, fst: MutPtr, pts: MutPtr, errbuf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), pts.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetShmInfo(proc: MutPtr, fst: MutPtr, shm: MutPtr, errbuf: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), shm.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId, evp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid.rawAddress.toString(), flags, value.rawAddress.toString(), ovalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetnumdevs(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetgeneration(kd: MutPtr): CLong =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetversion(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatCheckversion(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatSelectdevs(devSelect: MutPtr, numSelected: MutPtr, numSelections: MutPtr, selectGeneration: MutPtr, currentGeneration: CLong, devices: MutPtr, numdevs: CInt, matches: MutPtr, numMatches: CInt, devSelections: MutPtr, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatBuildmatch(matchStr: MutPtr, matches: MutPtr, numMatches: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr.rawAddress.toString(), matches.rawAddress.toString(), numMatches.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
