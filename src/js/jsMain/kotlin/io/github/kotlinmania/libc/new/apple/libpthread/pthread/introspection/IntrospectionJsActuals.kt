@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT

private val _newAppleLibpthreadPthreadIntrospectionNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    if (_newAppleLibpthreadPthreadIntrospectionNapiAddon != null) PthreadIntrospectionHookT { _, _, _, _ ->  } else PthreadIntrospectionHookT { _, _, _, _ ->  }

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_newAppleLibpthreadPthreadIntrospectionNapiAddon != null) (_newAppleLibpthreadPthreadIntrospectionNapiAddon.libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionSetspecificNp(thread.toLong().toString(), key.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    if (_newAppleLibpthreadPthreadIntrospectionNapiAddon != null) (_newAppleLibpthreadPthreadIntrospectionNapiAddon.libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionGetspecificNp(thread.toLong().toString(), key.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null
