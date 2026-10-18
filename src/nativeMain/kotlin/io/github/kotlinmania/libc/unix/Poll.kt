@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import kotlinx.cinterop.allocArray
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import libc.cinterop.libc_poll_descriptor
import libc.cinterop.libc_poll_descriptors

/** Polls every supplied descriptor and copies each returned readiness mask back. */
public fun poll(fds: Array<Pollfd>, timeout: Int): Int =
    memScoped {
        val native = if (fds.isEmpty()) null else allocArray<libc_poll_descriptor>(fds.size)
        fds.forEachIndexed { index, fd ->
            native!![index].fd = fd.fd
            native[index].events = fd.events
            native[index].revents = 0
            fd.revents = 0
        }
        val result = libc_poll_descriptors(native, fds.size.toUInt(), timeout)
        fds.forEachIndexed { index, fd -> fd.revents = native!![index].revents }
        result
    }
