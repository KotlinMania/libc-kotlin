package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun utmpname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpname(file)") as CInt

public actual fun setutent() {
    js("require('@kotlinmania/libc-native-bindings').setutent()")
}

public actual fun getutent(): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutent()") as Utmp?

public actual fun endutent() {
    js("require('@kotlinmania/libc-native-bindings').endutent()")
}
