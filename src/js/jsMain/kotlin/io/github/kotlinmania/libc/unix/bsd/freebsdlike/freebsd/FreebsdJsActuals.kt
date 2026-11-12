@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Statfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Vnstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.b64.Stat
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeFreebsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fhlink(fhp: MutPtr<FhandleT>, to: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhlink(fhp.rawAddress.toString(), to.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhlinkat(fhp: MutPtr<FhandleT>, tofd: CInt, to: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp.rawAddress.toString(), tofd, to.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhreadlink(fhp: MutPtr<FhandleT>, buf: MutPtr<CChar>, bufsize: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfhat(fd: CInt, path: MutPtr<CChar>, fhp: MutPtr<Fhandle>, flag: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetfhat(fd, path.rawAddress.toString(), fhp.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): MutPtr<CInt> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdError() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReadv(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWritev(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr<OffT>, outfd: CInt, outoffp: MutPtr<OffT>, len: SizeT, flags: CUint): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd, inoffp.rawAddress.toString(), outfd, outoffp.rawAddress.toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: CInt): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevnameR(dev.toInt(), mode.toInt(), buf.rawAddress.toString(), len) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd, attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr<SpacectlRange>, flags: CInt, rmsr: MutPtr<SpacectlRange>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFspacectl(fd, cmd, rqsr.rawAddress.toString(), flags, rmsr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jail(jail: MutPtr<Jail>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJail(jail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailAttach(jid: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailAttach(jid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailRemove(jid: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailRemove(jid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailGet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailGet(iov.rawAddress.toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailSet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdJailSet(iov.rawAddress.toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(user: ConstPtr<CChar>): MutPtr<Utmpx> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetutxuser(user.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CInt, file: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetutxdb(type, file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp.rawAddress.toString(), timeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdWaitid(idtype.toInt(), id.toString(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFtok(pathname.rawAddress.toString(), projId) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSemget(key.toString(), nsems, semflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMsgget(key.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakesane(termios: MutPtr<Termios>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pdfork(fdp: MutPtr<CInt>, flags: CInt): PidT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPdfork(fdp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdgetpid(fd: CInt, pidp: MutPtr<PidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd, pidp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRtprioThread(function, lwpid, rtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidgen(store: MutPtr<Uuid>, count: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdUuidgen(store.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdThrKill(id.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(tid: MutPtr<CLong>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdThrSelf(tid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetthreadidNp(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td.toLong().toString(), cpusetsize.toString(), cpusetp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td.toLong().toString(), cpusetsize.toString(), cpusetp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid, cpusetsz.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid, cpusetsz.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSchedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: MutPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr.rawAddress.toString(), robust.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr.rawAddress.toString(), robust) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread.toLong().toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xuname(nmln: CInt, buf: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdXuname(nmln, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt, timeout: ConstPtr<Timespec>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toString(), flags, timeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhopen(fhp: ConstPtr<FhandleT>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhopen(fhp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstat(fhp: ConstPtr<Fhandle>, buf: MutPtr<Stat>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhstat(fhp.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstatfs(fhp: ConstPtr<FhandleT>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetfh(path.rawAddress.toString(), fhp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdLgetfh(path.rawAddress.toString(), fhp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: CLong, mode: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf.rawAddress.toString(), bufsize.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mode: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(type: ConstPtr<CChar>, dir: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMount(type.rawAddress.toString(), dir.rawAddress.toString(), flags, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nmount(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdNmount(iov.rawAddress.toString(), niov.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rfork(flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRfork(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpuset(setid: MutPtr<CpusetidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpuset(setid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr<CpusetidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level, which, id.toString(), setid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id.toString(), setid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capEnter(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapEnter() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetmode(modep: MutPtr<CUint>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr<UInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd, fcntlrightsp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr<ULong>, maxcmds: ULong): Long =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd, cmds.rawAddress.toString(), maxcmds.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr<ULong>, ncmds: ULong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd, cmds.rawAddress.toString(), ncmds.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsInit(version: CInt, rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version, rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr<CapRightsT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version, fd, rightsp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsSet(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsClear(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsSet(rights: ConstPtr<CapRightsT>, vararg variadicArgs: Long): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsValid(rights: ConstPtr<CapRightsT>): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr<CapRightsT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd, rights.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsMerge(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsRemove(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsContains(big: ConstPtr<CapRightsT>, little: ConstPtr<CapRightsT>): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big.rawAddress.toString(), little.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capSandboxed(): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdCapSandboxed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
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

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr<CVoid>, opt: ConstPtr<CChar>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(0L.toString(), cbopaque.rawAddress.toString(), opt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallctl(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallctl(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<SizeT>, miplen: MutPtr<SizeT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), miplen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlbymib(mib: ConstPtr<SizeT>, mible: SizeT, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib.rawAddress.toString(), mible.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMallocx(size.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRallocx(ptr.rawAddress.toString(), size.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xallocx(ptr: MutPtr<CVoid>, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdXallocx(ptr.rawAddress.toString(), size.toString(), extra.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sallocx(ptr: ConstPtr<CVoid>, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSallocx(ptr.rawAddress.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dallocx(ptr: MutPtr<CVoid>, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDallocx(ptr.rawAddress.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sdallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr.rawAddress.toString(), size.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdNallocx(size.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcctl(idtype.toInt(), id.toString(), cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr<ClockidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1.toString(), arg2, arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdStrchrnul(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmCreateLargepage(path: ConstPtr<CChar>, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path.rawAddress.toString(), flags, psind, allocPolicy, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmRename(pathFrom: ConstPtr<CChar>, pathTo: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom.rawAddress.toString(), pathTo.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setaudit(auditinfo: ConstPtr<AuditinfoT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdEventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux, buf.rawAddress.toString(), buflen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitleFast(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxOp(obj: MutPtr<CVoid>, op: CInt, value: CUlong, uaddr: MutPtr<CVoid>, uaddr2: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj.rawAddress.toString(), op, value.toString(), uaddr.rawAddress.toString(), uaddr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpBindx(s: CInt, addrs: MutPtr<Sockaddr>, num: CInt, tpe: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpBindx(s, addrs.rawAddress.toString(), num, tpe) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr<Sockaddr>, addrcnt: CInt, id: MutPtr<SctpAssocT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s, addrs.rawAddress.toString(), addrcnt, id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s, asocid.toInt(), addrs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreepaddrs(addrs: MutPtr<Sockaddr>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s, asocid.toInt(), addrs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreeladdrs(addrs: MutPtr<Sockaddr>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr<CVoid>, size: MutPtr<SocklenT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s, id.toInt(), opt, arg.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpSendv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, addrs: MutPtr<Sockaddr>, addrcnt: CInt, info: MutPtr<CVoid>, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd, iov.rawAddress.toString(), iovcnt, addrs.rawAddress.toString(), addrcnt, info.rawAddress.toString(), infolen.toInt(), infotype.toInt(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<SocklenT>, info: MutPtr<CVoid>, infolen: MutPtr<SocklenT>, infotype: MutPtr<CUint>, flags: MutPtr<CInt>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd, iov.rawAddress.toString(), iovcnt, from.rawAddress.toString(), fromlen.rawAddress.toString(), info.rawAddress.toString(), infolen.rawAddress.toString(), infotype.rawAddress.toString(), flags.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
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

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1.toString(), idx2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatStrerror(error: CInt): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) ConstPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlAlloc(): MutPtr<MemoryTypeList> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFirst(list: MutPtr<MemoryTypeList>): MutPtr<MemoryType> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlNext(mtp: MutPtr<MemoryType>): MutPtr<MemoryType> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFind(list: MutPtr<MemoryTypeList>, allocator: CInt, name: ConstPtr<CChar>): MutPtr<MemoryType> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list.rawAddress.toString(), allocator, name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFree(list: MutPtr<MemoryTypeList>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memstatMtlGeterror(list: MutPtr<MemoryTypeList>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatGetName(mtp: ConstPtr<MemoryType>): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) ConstPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmDpcpuSetcpu(kd: MutPtr<KvmT>, cpu: CUint): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd.rawAddress.toString(), cpu.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetargv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd.rawAddress.toString(), p.rawAddress.toString(), nchr) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetcptime(kd: MutPtr<KvmT>, cpTime: MutPtr<CLong>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd.rawAddress.toString(), cpTime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetenvv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd.rawAddress.toString(), p.rawAddress.toString(), nchr) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGeterr(kd: MutPtr<KvmT>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetmaxcpu(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetncpus(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetpcpu(kd: MutPtr<KvmT>, cpu: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd.rawAddress.toString(), cpu) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmCounterU64Fetch(kd: MutPtr<KvmT>, base: CUlong): ULong =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd.rawAddress.toString(), base.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetswapinfo(kd: MutPtr<KvmT>, info: MutPtr<KvmSwap>, maxswap: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd.rawAddress.toString(), info.rawAddress.toString(), maxswap, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNative(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmNative(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist(kd: MutPtr<KvmT>, nl: MutPtr<Nlist>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd.rawAddress.toString(), nl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist2(kd: MutPtr<KvmT>, nl: MutPtr<KvmNlist>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd.rawAddress.toString(), nl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmReadZpcpu(kd: MutPtr<KvmT>, base: CUlong, buf: MutPtr<CVoid>, size: SizeT, cpu: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd.rawAddress.toString(), base.toString(), buf.rawAddress.toString(), size.toString(), cpu) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead2(kd: MutPtr<KvmT>, addr: KvaddrT, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string.rawAddress.toString(), attrnamespace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostname(host: MutPtr<CChar>, hsize: SizeT, ip: ConstPtr<InAddr>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRealhostname(host.rawAddress.toString(), hsize.toString(), ip.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostnameSa(host: MutPtr<CChar>, hsize: SizeT, addr: MutPtr<Sockaddr>, addrlen: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host.rawAddress.toString(), hsize.toString(), addr.rawAddress.toString(), addrlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldIsloaded(name: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldLoad(name: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKldLoad(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<CInt>): MutPtr<KinfoVmentry> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid, cntp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hexdump(ptr: ConstPtr<CVoid>, length: CInt, hdr: ConstPtr<CChar>, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdHexdump(ptr.rawAddress.toString(), length, hdr.rawAddress.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun humanizeNumber(buf: MutPtr<CChar>, len: SizeT, number: Long, suffix: ConstPtr<CChar>, scale: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf.rawAddress.toString(), len.toString(), number.toString(), suffix.rawAddress.toString(), scale, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopen(path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFlopen(path.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopenat(fd: CInt, path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdFlopenat(fd, path.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlocalbase(): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) ConstPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdGetlocalbase() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileOpen(path: ConstPtr<CChar>, mode: ModeT, pidptr: MutPtr<PidT>): MutPtr<Pidfh> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path.rawAddress.toString(), mode.toInt(), pidptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileWrite(path: MutPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileClose(path: MutPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileClose(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileRemove(path: MutPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileFileno(path: ConstPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenSysctl(): MutPtr<Procstat> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetfiles(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, mmapped: CInt): MutPtr<FilestatList> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat.rawAddress.toString(), kp.rawAddress.toString(), mmapped) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreefiles(procstat: MutPtr<Procstat>, head: MutPtr<FilestatList>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat.rawAddress.toString(), head.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetprocs(procstat: MutPtr<Procstat>, what: CInt, arg: CInt, count: MutPtr<CUint>): MutPtr<KinfoProc> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat.rawAddress.toString(), what, arg, count.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreeprocs(procstat: MutPtr<Procstat>, p: MutPtr<KinfoProc>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat.rawAddress.toString(), p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetvmmap(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<KinfoVmentry> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat.rawAddress.toString(), kp.rawAddress.toString(), count.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreevmmap(procstat: MutPtr<Procstat>, vmmap: MutPtr<KinfoVmentry>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat.rawAddress.toString(), vmmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatClose(procstat: MutPtr<Procstat>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeargv(procstat: MutPtr<Procstat>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeenvv(procstat: MutPtr<Procstat>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreegroups(procstat: MutPtr<Procstat>, groups: MutPtr<GidT>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat.rawAddress.toString(), groups.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeptlwpinfo(procstat: MutPtr<Procstat>, pl: MutPtr<PtraceLwpinfo>) {
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) {
        unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat.rawAddress.toString(), pl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetargv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat.rawAddress.toString(), kp.rawAddress.toString(), nchr.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetenvv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat.rawAddress.toString(), kp.rawAddress.toString(), nchr.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetgroups(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<GidT> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat.rawAddress.toString(), kp.rawAddress.toString(), count.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetosrel(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, osrelp: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat.rawAddress.toString(), kp.rawAddress.toString(), osrelp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetpathname(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, pathname: MutPtr<CChar>, maxlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat.rawAddress.toString(), kp.rawAddress.toString(), pathname.rawAddress.toString(), maxlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetrlimit(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, which: CInt, rlimit: MutPtr<Rlimit>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat.rawAddress.toString(), kp.rawAddress.toString(), which, rlimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetumask(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, maskp: MutPtr<CUshort>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat.rawAddress.toString(), kp.rawAddress.toString(), maskp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenCore(filename: ConstPtr<CChar>): MutPtr<Procstat> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenKvm(nlistf: ConstPtr<CChar>, memf: ConstPtr<CChar>): MutPtr<Procstat> =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf.rawAddress.toString(), memf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetSocketInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, sock: MutPtr<Sockstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), sock.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetVnodeInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, vn: MutPtr<Vnstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), vn.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetPtsInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, pts: MutPtr<Ptsstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), pts.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetShmInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, shm: MutPtr<Shmstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), shm.rawAddress.toString(), errbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId, evp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid.rawAddress.toString(), flags, value.rawAddress.toString(), ovalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetnumdevs(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetgeneration(kd: MutPtr<KvmT>): CLong =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetversion(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatCheckversion(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatSelectdevs(devSelect: MutPtr<MutPtr<DeviceSelection>>, numSelected: MutPtr<CInt>, numSelections: MutPtr<CInt>, selectGeneration: MutPtr<CLong>, currentGeneration: CLong, devices: MutPtr<Devstat>, numdevs: CInt, matches: MutPtr<DevstatMatch>, numMatches: CInt, devSelections: MutPtr<MutPtr<CChar>>, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatBuildmatch(matchStr: MutPtr<CChar>, matches: MutPtr<MutPtr<DevstatMatch>>, numMatches: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAddon != null) (unixBsdFreebsdlikeFreebsdNapiAddon.libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr.rawAddress.toString(), matches.rawAddress.toString(), numMatches.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
