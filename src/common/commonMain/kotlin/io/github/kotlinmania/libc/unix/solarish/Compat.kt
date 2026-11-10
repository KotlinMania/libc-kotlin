// port-lint: source unix/solarish/compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.cfsetispeed
import io.github.kotlinmania.libc.unix.cfsetospeed
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
import io.github.kotlinmania.libc.unix.tcsetattr
import io.github.kotlinmania.libc.unix.unlockpt

public fun cfmakeraw(termios: Termios?) {
    termios!!.cIflag = termios.cIflag and (IMAXBEL or IGNBRK or BRKINT or PARMRK or ISTRIP or INLCR or IGNCR or ICRNL or IXON).inv()
    termios.cOflag = termios.cOflag and OPOST.inv()
    termios.cLflag = termios.cLflag and (ECHO or ECHONL or ICANON or ISIG or IEXTEN).inv()
    termios.cCflag = termios.cCflag and (CSIZE or PARENB).inv()
    termios.cCflag = termios.cCflag or CS8
    // By default, most software expects a pending read to block until at
    // least one byte becomes available.  As per termio(7I), this requires
    // setting the MIN and TIME parameters appropriately.
    //
    // As a somewhat unfortunate artefact of history, the MIN and TIME slots
    // in the control character array overlap with the EOF and EOL slots used
    // for canonical mode processing.  Because the EOF character needs to be
    // the ASCII EOT value (aka Control-D), it has the byte value 4.  When
    // switching to raw mode, this is interpreted as a MIN value of 4; i.e.,
    // reads will block until at least four bytes have been input.
    //
    // Other platforms with a distinct MIN slot like Linux and FreeBSD appear
    // to default to a MIN value of 1, so we'll force that value here:
    termios.cCc[VMIN] = 1u
    termios.cCc[VTIME] = 0u
}

public fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt {
    // Neither of these functions on illumos or Solaris actually ever
    // return an error
    cfsetispeed(COpaquePointer((termios).hashCode().toLong()), speed)
    cfsetospeed(COpaquePointer((termios).hashCode().toLong()), speed)
    return 0
}

public fun bail(fdm: CInt, fds: CInt): CInt {
    if (fds >= 0) {
        close(fds)
    }
    if (fdm >= 0) {
        close(fdm)
    }
    errno()
    return -1
}

public fun openpty(amain: CInt?, asubord: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    var amain1 = amain
    var asubord1 = asubord
    val PTEM: List<UByte> = "ptem\u0000".encodeToByteArray().map { it.toUByte() }
    val LDTERM: List<UByte> = "ldterm\u0000".encodeToByteArray().map { it.toUByte() }
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
    val subordpath = ptsname(fdm)
    if ((subordpath == null)) {
        return bail(fdm, -1)
    }
    // Open the subordinate device without setting it as the controlling
    // terminal for this process:
    val fds = open(((subordpath).toString()), O_RDWR or O_NOCTTY)
    if (fds < 0) {
        return bail(fdm, -1)
    }
    // Check if the STREAMS modules are already pushed:
    val setup = ioctl(fds, I_FIND, ((LDTERM).hashCode().toLong()))
    if (setup < 0) {
        return bail(fdm, fds)
    } else if (setup == 0) {
        // The line discipline is not present, so push the appropriate STREAMS
        // modules for the subordinate device:
        if (ioctl(fds, I_PUSH, ((PTEM).hashCode().toLong())) < 0 || ioctl(fds, I_PUSH, ((LDTERM).hashCode().toLong())) < 0) {
            return bail(fdm, fds)
        }
    }
    // If provided, set the terminal parameters:
    if (!(termp == null) && tcsetattr(fds, TCSAFLUSH, COpaquePointer((termp).hashCode().toLong())) != 0) {
        return bail(fdm, fds)
    }
    // If provided, set the window size:
    if (!(winp == null) && ioctl(fds, TIOCSWINSZ, ((winp).hashCode().toLong())) < 0) {
        return bail(fdm, fds)
    }
    // If the caller wants the name of the subordinate device, copy it out.
    //
    // Note that this is a terrible interface: there appears to be no standard
    // upper bound on the copy length for this pointer.  Nobody should pass
    // anything but NULL here, preferring instead to use ptsname(3C) directly.
    if (!(name == null)) {
        strcpy(name, ((subordpath).toString()))
    }
    amain1 = fdm
    asubord1 = fds
    return 0
}

public fun forkpty(amain: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val fds = -1
    if (openpty(amain, fds, name, termp, winp) != 0) {
        return -1
    }
    val pid = fork()
    if (pid < 0) {
        return bail(amain!!, fds)
    } else if (pid > 0) {
        // In the parent process, we close the subordinate device and return the
        // process ID of the new child:
        close(fds)
        return pid
    }
    // The rest of this function executes in the child process.
    // Close the main side of the pseudo-terminal pair:
    close(amain!!)
    // Use TIOCSCTTY to set the subordinate device as our controlling
    // terminal.  This will fail (with ENOTTY) if we are not the leader in
    // our own session, so we call setsid() first.  Finally, arrange for
    // the pseudo-terminal to occupy the standard I/O descriptors.
    if (setsid() < 0 || ioctl(fds, TIOCSCTTY, 0L) < 0 || dup2(fds, 0) < 0 || dup2(fds, 1) < 0 || dup2(fds, 2) < 0) {
        // At this stage there are no particularly good ways to handle failure.
        // Exit as abruptly as possible, using _exit() to avoid messing with any
        // state still shared with the parent process.
        exit(EXIT_FAILURE)
    }
    // Close the inherited descriptor, taking care to avoid closing the standard
    // descriptors by mistake:
    if (fds > 2) {
        close(fds)
    }
    return 0
}

public fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    var result1 = result
    errno()
    result1 = nativeGetpwentR(COpaquePointer((pwd).hashCode().toLong()), buf, minOf(buflen, CInt.MAX_VALUE.toULong()).toInt())
    val ret = if ((result1 == null)) {
        (errno()?.rawValue ?: 0L).toInt()
    } else {
        0
    }
    errno()
    return ret
}

public fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    var result1 = result
    errno()
    result1 = nativeGetgrentR(COpaquePointer((grp).hashCode().toLong()), buf, minOf(buflen, CInt.MAX_VALUE.toULong()).toInt())
    val ret = if ((result1 == null)) {
        (errno()?.rawValue ?: 0L).toInt()
    } else {
        0
    }
    errno()
    return ret
}
