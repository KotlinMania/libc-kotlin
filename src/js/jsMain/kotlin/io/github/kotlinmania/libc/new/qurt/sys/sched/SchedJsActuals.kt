@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

private val _newQurtSysSchedNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun schedYield(): CInt =
    if (_newQurtSysSchedNapiAddon != null) (_newQurtSysSchedNapiAddon.libc_new_qurt_sys_sched_schedYield() as Int) else 0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_newQurtSysSchedNapiAddon != null) (_newQurtSysSchedNapiAddon.libc_new_qurt_sys_sched_schedGetPriorityMax(policy) as Int) else 0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_newQurtSysSchedNapiAddon != null) (_newQurtSysSchedNapiAddon.libc_new_qurt_sys_sched_schedGetPriorityMin(policy) as Int) else 0
