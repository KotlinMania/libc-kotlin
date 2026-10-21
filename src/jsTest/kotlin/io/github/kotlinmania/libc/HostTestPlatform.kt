package io.github.kotlinmania.libc

internal actual fun testIsBrowser(): Boolean = js("typeof globalThis.process === 'undefined' || typeof globalThis.process.getBuiltinModule !== 'function'")
