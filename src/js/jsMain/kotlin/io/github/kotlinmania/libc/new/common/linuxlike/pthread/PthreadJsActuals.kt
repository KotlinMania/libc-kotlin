@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

private val _newCommonLinuxlikePthreadNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newCommonLinuxlikePthreadNapiAddon != null) (_newCommonLinuxlikePthreadNapiAddon.libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(thread.toLong().toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_newCommonLinuxlikePthreadNapiAddon != null) (_newCommonLinuxlikePthreadNapiAddon.libc_new_common_linuxlike_pthread_pthreadGetattrNp(native.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_newCommonLinuxlikePthreadNapiAddon != null) (_newCommonLinuxlikePthreadNapiAddon.libc_new_common_linuxlike_pthread_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newCommonLinuxlikePthreadNapiAddon != null) (_newCommonLinuxlikePthreadNapiAddon.libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(thread.toLong().toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_newCommonLinuxlikePthreadNapiAddon != null) (_newCommonLinuxlikePthreadNapiAddon.libc_new_common_linuxlike_pthread_pthreadSetnameNp(thread.toLong().toString(), name) as Int) else 0
