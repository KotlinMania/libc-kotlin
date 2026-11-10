@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxNapiAddon(): Boolean

private val _unixLinuxlikeLinuxNapiAvailable: Boolean = _initUnixLinuxlikeLinuxNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_getspnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_getspnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_linux_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqClose(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_mqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqUnlink(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_mqUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqGetattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mrand48()")
private external fun _wasm_libc_unix_linuxlike_linux_mrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_seed48(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_seed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_lcong48(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_lcong48(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_lutimes(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_shmUnlink(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_ftok(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_ftok(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_semget(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_semget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_semop(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_semop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_semctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_linuxlike_linux_semctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_msgctl(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_msgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_msgget(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_msgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_msgrcv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_msgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_msgsnd(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_msgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fallocate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_fallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_readahead(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_readahead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_getxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_getxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_lgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_lgetxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_fgetxattr(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_setxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_setxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_lsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_lsetxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_fsetxattr(p0: Int, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_listxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_listxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_llistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_llistxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_flistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_flistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_removexattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_removexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_lremovexattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_lremovexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fremovexattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_fremovexattr(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_signalfd(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_signalfd(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_timerfdCreate(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_timerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_timerfdGettime(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_timerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_timerfdSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_timerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_quotactl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_quotactl(p0: Int, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_epollPwait(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_epollPwait(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_dup3(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_reboot(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_reboot(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_setfsgid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_setfsgid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_setfsuid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_setfsuid(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_syncFileRange(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_syncFileRange(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_remapFilePages(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_remapFilePages(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_mkstemps(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_vhangup()")
private external fun _wasm_libc_unix_linuxlike_linux_vhangup(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_sync()")
private external fun _wasm_libc_unix_linuxlike_linux_sync()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_syncfs(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_syncfs(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_syscall(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_syscall(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_schedSetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_schedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_epollCreate(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_epollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_epollCreate1(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_epollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_epollWait(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_epollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_epollCtl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_epollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_unshare(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_unshare(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_umount(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_umount(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_tee(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_tee(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_splice(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_splice(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_eventfd(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_eventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_eventfdRead(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_eventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_eventfdWrite(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_eventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_setns(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_setns(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_swapoff(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_swapoff(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_vmsplice(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_vmsplice(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_personality(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_personality(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_clone(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_libc_unix_linuxlike_linux_clone(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_umount2(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_umount2(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_swapon(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_swapon(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_sendfile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_sendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_sigaltstack(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_getdtablesize()")
private external fun _wasm_libc_unix_linuxlike_linux_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_freadUnlocked(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_freadUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_inotifyRmWatch(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_inotifyRmWatch(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_inotifyInit()")
private external fun _wasm_libc_unix_linuxlike_linux_inotifyInit(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_inotifyInit1(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_inotifyInit1(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_inotifyAddWatch(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_inotifyAddWatch(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fanotifyInit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_fanotifyInit(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gethostid()")
private external fun _wasm_libc_unix_linuxlike_linux_gethostid(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_klogctl(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_klogctl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fallocate64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_fallocate64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fgetpos64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_fgetpos64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_fopen64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_fopen64(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_posixFallocate64(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_posixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_sendfile64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_sendfile64(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_tmpfile64()")
private external fun _wasm_libc_unix_linuxlike_linux_tmpfile64(): String

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_getspnamR(name, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_seed48((xseed?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixLinuxlikeLinuxNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_lcong48((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_ftok(pathname, projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_semget(key, nsems, semflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_msgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_readahead(fd, offset.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_listxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_removexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_lremovexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fremovexattr(filedes, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_signalfd(fd, (mask?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_timerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_quotactl(cmd, special, id, (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_epollPwait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout, (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_dup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_reboot(howTo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_setfsgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_setfsuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_syncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_remapFilePages((addr?.value ?: 0L).toString(), size.toString(), prot, pgoff.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_vhangup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixLinuxlikeLinuxNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_syncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_syscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_epollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_epollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unshare(flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_unshare(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_umount(target) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_tee(fdIn, fdOut, len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_splice(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_eventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_eventfdRead(fd, (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_eventfdWrite(fd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_setns(fd, nstype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(path: String?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_swapoff(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_vmsplice(fd, (iov?.value ?: 0L).toString(), nrSegs.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_personality(persona.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_clone(0L.toString(), (childStack?.value ?: 0L).toString(), flags, (arg?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: String?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_umount2(target, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_swapon(path, swapflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_sendfile(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_freadUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_inotifyRmWatch(fd, wd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_inotifyInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit1(flags: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_inotifyInit1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_inotifyAddWatch(fd, path, mask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fanotifyInit(flags.toInt(), eventFFlags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_klogctl(syslogType, (bufp?.value ?: 0L).toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fallocate64(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fgetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_fopen64(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_posixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_sendfile64(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile64(): FILE? =
    if (_unixLinuxlikeLinuxNapiAvailable) _wasm_libc_unix_linuxlike_linux_tmpfile64().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
