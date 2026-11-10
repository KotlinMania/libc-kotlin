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

public actual fun fhlink(fhp: COpaquePointer?, to: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhlinkat(fhp: COpaquePointer?, tofd: CInt, to: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhreadlink(fhp: COpaquePointer?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: COpaquePointer?, flag: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun error(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioReadv(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioWritev(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyFileRange(infd: CInt, inoffp: COpaquePointer?, outfd: CInt, outoffp: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: COpaquePointer?, flags: CInt, rmsr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jail(jail: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jailAttach(jid: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jailRemove(jid: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jailGet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jailSet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getutxuser(user: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setutxdb(type: CInt, file: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfmakesane(termios: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdfork(fdp: COpaquePointer?, flags: CInt): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdgetpid(fd: CInt, pidp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidgen(store: COpaquePointer?, count: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun thrSelf(tid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetthreadidNp(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt, timeout: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhopen(fhp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhstat(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhstatfs(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getfh(path: String?, fhp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lgetfh(path: String?, fhp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getfsstat(buf: COpaquePointer?, bufsize: CLong, mode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nmount(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rfork(flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cpuset(setid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capEnter(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capGetmode(modep: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capIoctlsGet(fd: CInt, cmds: COpaquePointer?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capIoctlsLimit(fd: CInt, cmds: COpaquePointer?, ncmds: ULong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsInit(version: CInt, rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsSet(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsClear(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsIsSet(rights: COpaquePointer?, vararg variadicArgs: Long): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsIsValid(rights: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsLimit(fd: CInt, rights: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsMerge(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsRemove(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capRightsContains(big: COpaquePointer?, little: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun capSandboxed(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ffs(value: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ffsl(value: CLong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ffsll(value: CLonglong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fls(value: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flsl(value: CLong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flsll(value: CLonglong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallctlnametomib(name: String?, mibp: COpaquePointer?, miplen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallctlbymib(mib: COpaquePointer?, mible: SizeT, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setaudit(auditinfo: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setproctitleFast(fmt: String?, vararg variadicArgs: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpBindx(s: CInt, addrs: COpaquePointer?, num: CInt, tpe: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpConnectx(s: CInt, addrs: COpaquePointer?, addrcnt: CInt, id: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpFreepaddrs(addrs: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpFreeladdrs(addrs: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpSendv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, addrs: COpaquePointer?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sctpRecvv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, from: COpaquePointer?, fromlen: COpaquePointer?, info: COpaquePointer?, infolen: COpaquePointer?, infotype: COpaquePointer?, flags: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closefrom(lowfd: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatMtlAlloc(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatMtlFirst(list: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatMtlNext(mtp: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatMtlFind(list: COpaquePointer?, allocator: CInt, name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatMtlFree(list: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatMtlGeterror(list: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memstatGetName(mtp: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmDpcpuSetcpu(kd: COpaquePointer?, cpu: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetargv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetcptime(kd: COpaquePointer?, cpTime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetenvv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGeterr(kd: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetmaxcpu(kd: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetncpus(kd: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetpcpu(kd: COpaquePointer?, cpu: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmCounterU64Fetch(kd: COpaquePointer?, base: CUlong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmGetswapinfo(kd: COpaquePointer?, info: COpaquePointer?, maxswap: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmNative(kd: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmNlist(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmNlist2(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmReadZpcpu(kd: COpaquePointer?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmRead2(kd: COpaquePointer?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: COpaquePointer?, addrlen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kldIsloaded(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kldLoad(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flopen(path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getlocalbase(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pidfileWrite(path: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pidfileClose(path: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pidfileRemove(path: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pidfileFileno(path: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatOpenSysctl(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetfiles(procstat: COpaquePointer?, kp: COpaquePointer?, mmapped: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreefiles(procstat: COpaquePointer?, head: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetprocs(procstat: COpaquePointer?, what: CInt, arg: CInt, count: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreeprocs(procstat: COpaquePointer?, p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetvmmap(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreevmmap(procstat: COpaquePointer?, vmmap: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatClose(procstat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreeargv(procstat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreeenvv(procstat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreegroups(procstat: COpaquePointer?, groups: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatFreeptlwpinfo(procstat: COpaquePointer?, pl: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetargv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetenvv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetgroups(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetosrel(procstat: COpaquePointer?, kp: COpaquePointer?, osrelp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetpathname(procstat: COpaquePointer?, kp: COpaquePointer?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetrlimit(procstat: COpaquePointer?, kp: COpaquePointer?, which: CInt, rlimit: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetumask(procstat: COpaquePointer?, kp: COpaquePointer?, maskp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatOpenCore(filename: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetSocketInfo(proc: COpaquePointer?, fst: COpaquePointer?, sock: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetVnodeInfo(proc: COpaquePointer?, fst: COpaquePointer?, vn: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetPtsInfo(proc: COpaquePointer?, fst: COpaquePointer?, pts: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procstatGetShmInfo(proc: COpaquePointer?, fst: COpaquePointer?, shm: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devstatGetnumdevs(kd: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devstatGetgeneration(kd: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devstatGetversion(kd: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devstatCheckversion(kd: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: COpaquePointer?, numSelections: COpaquePointer?, selectGeneration: COpaquePointer?, currentGeneration: CLong, devices: COpaquePointer?, numdevs: CInt, matches: COpaquePointer?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
