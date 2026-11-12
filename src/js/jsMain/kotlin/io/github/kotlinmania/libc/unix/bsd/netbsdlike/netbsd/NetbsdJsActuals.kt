@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.statvfs.Statvfs
import io.github.kotlinmania.libc.new.netbsd.sys.time.Itimerspec
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.Utmpx
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdNetbsdlikeNetbsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarr(ptr: MutPtr<CVoid>, number: SizeT, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr.rawAddress.toString(), number.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdChflags(path.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLchflags(path.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd, attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string.rawAddress.toString(), attrnamespace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(sname: ConstPtr<CChar>, name: MutPtr<CInt>, namelenp: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname.rawAddress.toString(), name.rawAddress.toString(), namelenp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: SizeT, eventlist: MutPtr<Kevent>, nevents: SizeT, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdKevent(kq, changelist.rawAddress.toString(), nchanges.toString(), eventlist.rawAddress.toString(), nevents.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMount(src.rawAddress.toString(), target.rawAddress.toString(), flags, data.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd.toLong().toString(), notification.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CVoid>, data: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPtrace(request, pid, addr.rawAddress.toString(), data) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(label: ConstPtr<CChar>, addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdUtrace(label.rawAddress.toString(), addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t.toLong().toString(), name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr<CChar>, arg: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t.toLong().toString(), name.rawAddress.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread.toLong().toString(), size.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread.toLong().toString(), size.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetCreate(): MutPtr<CpusetT> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetCreate() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetDestroy(set: MutPtr<CpusetT>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSize(set: ConstPtr<CpusetT>): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetSize(set.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetZero(set: MutPtr<CpusetT>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdCpusetZero(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(loc: LocaleT): MutPtr<Lconv> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue1(flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdKqueue1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpSelf(): LwpidT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLwpSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlauxinfo(): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdDlauxinfo() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid, sevp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid.toLong().toString(), currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid.toLong().toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(b: MutPtr<CVoid>, c: CInt, len: SizeT) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b.rawAddress.toString(), c, len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun consttimeMemequal(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mremap(oldp: MutPtr<CVoid>, oldsize: SizeT, newp: MutPtr<CVoid>, newsize: SizeT, flags: CInt): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdMremap(oldp.rawAddress.toString(), oldsize.toString(), newp.rawAddress.toString(), newsize.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid, t.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollts(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdPollts(fds.rawAddress.toString(), nfds.toInt(), ts.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(mode: CInt, bootstr: MutPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdReboot(mode, bootstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr<Timespec>, unpark: LwpidT, hint: ConstPtr<CVoid>, unparkhint: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLwpPark(clock, flags, ts.rawAddress.toString(), unpark, hint.rawAddress.toString(), unparkhint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp, hint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpUnparkAll(targets: ConstPtr<LwpidT>, ntargets: SizeT, hint: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets.rawAddress.toString(), ntargets.toString(), hint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getvfsstat(buf: MutPtr<Statvfs>, bufsize: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf.rawAddress.toString(), bufsize.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEventfd(value.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(efd: CInt, valp: MutPtr<EventfdT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd, valp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun efopen(p: ConstPtr<CChar>, m: ConstPtr<CChar>): FILE =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emalloc(n: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEmalloc(n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEcalloc(n.toString(), c.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erealloc(p: MutPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdErealloc(p.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ereallocarr(p: MutPtr<CVoid>, n: SizeT, s: SizeT) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEreallocarr(p.rawAddress.toString(), n.toString(), s.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun estrdup(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEstrdup(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrndup(s: ConstPtr<CChar>, len: SizeT): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEstrndup(s.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst.rawAddress.toString(), src.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst.rawAddress.toString(), src.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrtoi(nptr: ConstPtr<CChar>, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr.rawAddress.toString(), base, lo.toString(), hi.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrtou(nptr: ConstPtr<CChar>, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr.rawAddress.toString(), base, lo.toString(), hi.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun easprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEasprintf(string.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evasprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdEvasprintf(string.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun securePath(path: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSecurePath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintb(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSnprintb(buf.rawAddress.toString(), buflen.toString(), fmt.rawAddress.toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintbM(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong, max: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf.rawAddress.toString(), buflen.toString(), fmt.rawAddress.toString(), value.toString(), max.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getbootfile(): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) ConstPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetbootfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getbyteorder(): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetbyteorder() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdiskrawname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) ConstPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf.rawAddress.toString(), buflen.toString(), name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdiskcookedname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) ConstPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf.rawAddress.toString(), buflen.toString(), name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsspecname(buf: MutPtr<CChar>, buflen: SizeT, spec: ConstPtr<CChar>): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) ConstPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf.rawAddress.toString(), buflen.toString(), spec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdStrpct(buf.rawAddress.toString(), bufsiz.toString(), numerator.toString(), denominator.toString(), precision.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdStrspct(buf.rawAddress.toString(), bufsiz.toString(), numerator.toString(), denominator.toString(), precision.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun login(ut: ConstPtr<Utmp>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLogin(ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun loginx(ut: ConstPtr<Utmpx>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLoginx(ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logout(line: ConstPtr<CChar>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLogout(line.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logoutx(line: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLogoutx(line.rawAddress.toString(), status, tpe)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logwtmp(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLogwtmp(line.rawAddress.toString(), name.rawAddress.toString(), host.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logwtmpx(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) {
        unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line.rawAddress.toString(), name.rawAddress.toString(), host.rawAddress.toString(), status, tpe)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes, list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(fd: CInt, path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd, path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringToFlags(stringP: MutPtr<MutPtr<CChar>>, setp: MutPtr<CUlong>, clrp: MutPtr<CUlong>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP.rawAddress.toString(), setp.rawAddress.toString(), clrp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flagsToString(flags: CUlong, def: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags.toString(), def.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<SizeT>): MutPtr<KinfoVmentry> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid, cntp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) MutPtr((unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist.rawAddress.toString(), len.toString(), fmt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt, fmt: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAddon != null) (unixBsdNetbsdlikeNetbsdNapiAddon.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist.rawAddress.toString(), len.toString(), fd, fmt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
