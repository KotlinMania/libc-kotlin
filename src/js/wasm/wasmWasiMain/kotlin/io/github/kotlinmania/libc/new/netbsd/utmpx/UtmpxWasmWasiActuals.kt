@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.UidT

public actual fun setutxent() {
}

public actual fun endutxent() {
}

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    0

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    null

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    0

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
}

public actual fun utmpxname(file: String?): CInt =
    0
