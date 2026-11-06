package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    js("require('@kotlinmania/libc-native-bindings').updwtmpx(file, ut?.toLong() ?: 0L)") as CInt

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    js("require('@kotlinmania/libc-native-bindings').getlastlogx(fname, uid, ll?.toLong() ?: 0L)") as Lastlogx?

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    js("require('@kotlinmania/libc-native-bindings').updlastlogx(fname, uid, ll?.toLong() ?: 0L)") as CInt

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    js("require('@kotlinmania/libc-native-bindings').getutmp(ux?.toLong() ?: 0L, u?.toLong() ?: 0L)")
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    js("require('@kotlinmania/libc-native-bindings').getutmpx(u?.toLong() ?: 0L, ux?.toLong() ?: 0L)")
}

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt
