// port-lint: source unix/solarish/compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.close
import io.github.kotlinmania.libc.unix.dup2
import io.github.kotlinmania.libc.unix.exit
import io.github.kotlinmania.libc.unix.fork
import io.github.kotlinmania.libc.unix.grantpt
import io.github.kotlinmania.libc.unix.open
import io.github.kotlinmania.libc.unix.posixOpenpt
import io.github.kotlinmania.libc.unix.ptsname
import io.github.kotlinmania.libc.unix.setsid
import io.github.kotlinmania.libc.unix.strcpy
import io.github.kotlinmania.libc.unix.unlockpt
import kotlin.math.min

// Common functions that are unfortunately missing on illumos and
// Solaris, but often needed by other crates.

public fun cfmakeraw(termios: Termios?) {
    if (termios == null) {
        return
    }
    termios.cIflag = termios.cIflag and
        (IMAXBEL or IGNBRK or BRKINT or PARMRK or ISTRIP or INLCR or IGNCR or ICRNL or IXON).inv()
    termios.cOflag = termios.cOflag and OPOST.inv()
    termios.cLflag = termios.cLflag and (ECHO or ECHONL or ICANON or ISIG or IEXTEN).inv()
    termios.cCflag = termios.cCflag and (CSIZE or PARENB).inv()
    termios.cCflag = termios.cCflag or CS8

    // By default, most software expects a pending read to block until at
    // least one byte becomes available. As per termio(7I), this requires
    // setting the MIN and TIME parameters appropriately.
    val cc = termios.cCc.toMutableList()
    if (VMIN.toInt() < cc.size) {
        cc[VMIN.toInt()] = 1u
    }
    if (VTIME.toInt() < cc.size) {
        cc[VTIME.toInt()] = 0u
    }
    termios.cCc = cc
}

public fun cfsetspeed(termios: Termios?, speed: UInt): Int {
    // Neither of these functions on illumos or Solaris actually ever
    // return an error
    solarishCfsetispeed(termios, speed)
    solarishCfsetospeed(termios, speed)
    return 0
}

internal fun bail(fdm: Int, fds: Int): Int {
    val e = solarishGetErrno()
    if (fds >= 0) {
        close(fds)
    }
    if (fdm >= 0) {
        close(fdm)
    }
    solarishSetErrno(e)
    return -1
}

public fun openpty(
    amain: IntArray?,
    asubord: IntArray?,
    name: String?,
    termp: Termios?,
    winp: Winsize?,
): Int {
    val ptem = "ptem"
    val ldterm = "ldterm"

    // Open the main pseudo-terminal device, making sure not to set it as the
    // controlling terminal for this process:
    val fdm = posixOpenpt(O_RDWR or O_NOCTTY)
    if (fdm < 0) {
        return -1
    }

    // Set permissions and ownership on the subordinate device and unlock it:
    if (grantpt(fdm) < 0 || unlockpt(fdm) < 0) {
        return bail(fdm, -1)
    }

    // Get the path name of the subordinate device:
    val subordpath = ptsname(fdm) ?: return bail(fdm, -1)

    // Open the subordinate device without setting it as the controlling
    // terminal for this process:
    val fds = open(subordpath, O_RDWR or O_NOCTTY)
    if (fds < 0) {
        return bail(fdm, -1)
    }

    // Check if the STREAMS modules are already pushed:
    val setup = ioctl(fds, I_FIND, ldterm)
    if (setup < 0) {
        return bail(fdm, fds)
    } else if (setup == 0) {
        // The line discipline is not present, so push the appropriate STREAMS
        // modules for the subordinate device:
        if (ioctl(fds, I_PUSH, ptem) < 0 || ioctl(fds, I_PUSH, ldterm) < 0) {
            return bail(fdm, fds)
        }
    }

    // If provided, set the terminal parameters:
    if (termp != null && solarishTcsetattr(fds, TCSAFLUSH, termp) != 0) {
        return bail(fdm, fds)
    }

    // If provided, set the window size:
    if (winp != null && ioctl(fds, TIOCSWINSZ, winp) < 0) {
        return bail(fdm, fds)
    }

    // If the caller wants the name of the subordinate device, copy it out.
    if (name != null) {
        strcpy(name, subordpath)
    }

    if (amain != null && amain.isNotEmpty()) {
        amain[0] = fdm
    }
    if (asubord != null && asubord.isNotEmpty()) {
        asubord[0] = fds
    }
    return 0
}

public fun forkpty(
    amain: IntArray?,
    name: String?,
    termp: Termios?,
    winp: Winsize?,
): Int {
    val fdsOut = intArrayOf(-1)

    if (openpty(amain, fdsOut, name, termp, winp) != 0) {
        return -1
    }

    val fds = fdsOut[0]
    val mainFd = if (amain != null && amain.isNotEmpty()) amain[0] else -1

    val pid = fork()
    if (pid < 0) {
        return bail(mainFd, fds)
    } else if (pid > 0) {
        // In the parent process, we close the subordinate device and return the
        // process ID of the new child:
        close(fds)
        return pid
    }

    // The rest of this function executes in the child process.

    // Close the main side of the pseudo-terminal pair:
    close(mainFd)

    // Use TIOCSCTTY to set the subordinate device as our controlling
    // terminal. This will fail (with ENOTTY) if we are not the leader in
    // our own session, so we call setsid() first. Finally, arrange for
    // the pseudo-terminal to occupy the standard I/O descriptors.
    if (setsid() < 0 ||
        ioctl(fds, TIOCSCTTY, 0) < 0 ||
        dup2(fds, 0) < 0 ||
        dup2(fds, 1) < 0 ||
        dup2(fds, 2) < 0
    ) {
        exit(EXIT_FAILURE)
    }
    // Close the inherited descriptor, taking care to avoid closing the standard
    // descriptors by mistake:
    if (fds > 2) {
        close(fds)
    }

    return 0
}

public fun getpwentR(
    pwd: Passwd?,
    buf: String?,
    buflen: ULong,
    result: COpaquePointer?,
): Int {
    val oldErrno = solarishGetErrno()
    solarishSetErrno(0)
    val entry = solarishNativeGetpwentR(pwd, buf, min(buflen, Int.MAX_VALUE.toULong()).toInt(), result)

    val ret = if (entry == null) solarishGetErrno() else 0
    solarishSetErrno(oldErrno)

    return ret
}

public fun getgrentR(
    grp: Group?,
    buf: String?,
    buflen: ULong,
    result: COpaquePointer?,
): Int {
    val oldErrno = solarishGetErrno()
    solarishSetErrno(0)
    val entry = solarishNativeGetgrentR(grp, buf, min(buflen, Int.MAX_VALUE.toULong()).toInt(), result)

    val ret = if (entry == null) solarishGetErrno() else 0
    solarishSetErrno(oldErrno)

    return ret
}
