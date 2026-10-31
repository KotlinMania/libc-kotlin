@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import kotlinx.cinterop.ExperimentalForeignApi

public actual fun errnoLocation(): Int? = libc.cinterop.libc_get_errno()

internal actual fun setErrnoValue(value: Int) {
    libc.cinterop.libc_set_errno(value)
}
