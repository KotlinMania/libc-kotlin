@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private val _newQurtDlfcnNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_newQurtDlfcnNapiAddon != null) (_newQurtDlfcnNapiAddon.libc_new_qurt_dlfcn_dlopen(filename, flag) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_newQurtDlfcnNapiAddon != null) (_newQurtDlfcnNapiAddon.libc_new_qurt_dlfcn_dlclose((handle?.value ?: 0L).toString()) as Int) else 0

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_newQurtDlfcnNapiAddon != null) (_newQurtDlfcnNapiAddon.libc_new_qurt_dlfcn_dlsym((handle?.value ?: 0L).toString(), symbol) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlerror(): COpaquePointer? =
    if (_newQurtDlfcnNapiAddon != null) (_newQurtDlfcnNapiAddon.libc_new_qurt_dlfcn_dlerror() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null
