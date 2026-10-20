@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc

@JsFun("() => typeof globalThis.process === 'undefined' || typeof globalThis.process.getBuiltinModule !== 'function'")
private external fun isBrowser(): Boolean

internal actual fun testIsBrowser(): Boolean = isBrowser()
