@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT

private val _newAppleLibpthreadPthreadQosNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun pthreadAttrSetQosClassNp(attr: COpaquePointer?, cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadAttrGetQosClassNp(attr: COpaquePointer?, cls: COpaquePointer?, priority: COpaquePointer?): CInt =
    if (_newAppleLibpthreadPthreadQosNapiAddon != null) (_newAppleLibpthreadPthreadQosNapiAddon.libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp((attr?.value ?: 0L).toString(), (cls?.value ?: 0L).toString(), (priority?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: COpaquePointer?, priority: COpaquePointer?): CInt =
    if (_newAppleLibpthreadPthreadQosNapiAddon != null) (_newAppleLibpthreadPthreadQosNapiAddon.libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp(thread.toLong().toString(), (cls?.value ?: 0L).toString(), (priority?.value ?: 0L).toString()) as Int) else 0
