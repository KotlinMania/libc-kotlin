@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

private val _newQurtSemaphoreNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_newQurtSemaphoreNapiAddon != null) (_newQurtSemaphoreNapiAddon.libc_new_qurt_semaphore_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAddon != null) (_newQurtSemaphoreNapiAddon.libc_new_qurt_semaphore_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAddon != null) (_newQurtSemaphoreNapiAddon.libc_new_qurt_semaphore_semWait((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAddon != null) (_newQurtSemaphoreNapiAddon.libc_new_qurt_semaphore_semTrywait((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAddon != null) (_newQurtSemaphoreNapiAddon.libc_new_qurt_semaphore_semPost((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAddon != null) (_newQurtSemaphoreNapiAddon.libc_new_qurt_semaphore_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0
