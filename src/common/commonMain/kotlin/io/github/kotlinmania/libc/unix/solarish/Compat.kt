// port-lint: source unix/solarish/compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
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
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun cfmakeraw(termios: MutPtr<Termios>) {
    val cur = (Termios.typeLayout()).readNative((termios).rawAddress)
    cur.cIflag = cur.cIflag and (IMAXBEL or IGNBRK or BRKINT or PARMRK or ISTRIP or INLCR or IGNCR or ICRNL or IXON).inv()
    cur.cOflag = cur.cOflag and OPOST.inv()
    cur.cLflag = cur.cLflag and (ECHO or ECHONL or ICANON or ISIG or IEXTEN).inv()
    cur.cCflag = cur.cCflag and (CSIZE or PARENB).inv()
    cur.cCflag = cur.cCflag or CS8
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
    cur.cCc[VMIN] = 1u
    cur.cCc[VTIME] = 0u
    (Termios.typeLayout()).writeNative((termios).rawAddress, cur)
}

public fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt {
    // Neither of these functions on illumos or Solaris actually ever
    // return an error
    cfsetispeed(MutPtr(termios.rawAddress, termios.rawMeta), speed)
    cfsetospeed(MutPtr(termios.rawAddress, termios.rawMeta), speed)
    return 0
}

public fun bail(fdm: CInt, fds: CInt): CInt {
    val e = (PrimitiveLayouts.I32).readNative((errno()).rawAddress)
    if (fds >= 0) {
        close(fds)
    }
    if (fdm >= 0) {
        close(fdm)
    }
    (PrimitiveLayouts.I32).writeNative((errno()).rawAddress, e)
    return -1
}

public fun openpty(amain: MutPtr<CInt>, asubord: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt {
    val amain1 = amain
    val asubord1 = asubord
    val ptemBytes: List<UByte> = "ptem\u0000".encodeToByteArray().map { it.toUByte() }
    val ldtermBytes: List<UByte> = "ldterm\u0000".encodeToByteArray().map { it.toUByte() }
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
    if (((subordpath).rawAddress == 0L)) {
        return bail(fdm, -1)
    }
    // Open the subordinate device without setting it as the controlling
    // terminal for this process:
    val fds = open(ConstPtr(subordpath.rawAddress, subordpath.rawMeta), O_RDWR or O_NOCTTY)
    if (fds < 0) {
        return bail(fdm, -1)
    }
    val ptemBuf =
        io.github.kotlinmania.rustlang.core.mem
            .AddressableArrayLocal(ptemBytes, PrimitiveLayouts.U8)
    val ldtermBuf =
        io.github.kotlinmania.rustlang.core.mem
            .AddressableArrayLocal(ldtermBytes, PrimitiveLayouts.U8)
    // Check if the STREAMS modules are already pushed:
    val setup = ioctl(fds, I_FIND, ldtermBuf.rawAddress)
    if (setup < 0) {
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(ptemBuf.rawAddress, maxOf(1L, ptemBuf.layout.sizeBytes), 1L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(ldtermBuf.rawAddress, maxOf(1L, ldtermBuf.layout.sizeBytes), 1L)
        return bail(fdm, fds)
    } else if (setup == 0) {
        // The line discipline is not present, so push the appropriate STREAMS
        // modules for the subordinate device:
        val pushFailed = ioctl(fds, I_PUSH, ptemBuf.rawAddress) < 0 || ioctl(fds, I_PUSH, ldtermBuf.rawAddress) < 0
        if (pushFailed) {
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmDealloc(ptemBuf.rawAddress, maxOf(1L, ptemBuf.layout.sizeBytes), 1L)
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmDealloc(ldtermBuf.rawAddress, maxOf(1L, ldtermBuf.layout.sizeBytes), 1L)
            return bail(fdm, fds)
        }
    }
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(ptemBuf.rawAddress, maxOf(1L, ptemBuf.layout.sizeBytes), 1L)
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(ldtermBuf.rawAddress, maxOf(1L, ldtermBuf.layout.sizeBytes), 1L)
    // If provided, set the terminal parameters:
    if (!((termp).rawAddress == 0L) && tcsetattr(fds, TCSAFLUSH, ConstPtr(termp.rawAddress, termp.rawMeta)) != 0) {
        return bail(fdm, fds)
    }
    // If provided, set the window size:
    if (!((winp).rawAddress == 0L) && ioctl(fds, TIOCSWINSZ, winp.rawAddress) < 0) {
        return bail(fdm, fds)
    }
    // If the caller wants the name of the subordinate device, copy it out.
    //
    // Note that this is a terrible interface: there appears to be no standard
    // upper bound on the copy length for this pointer.  Nobody should pass
    // anything but NULL here, preferring instead to use ptsname(3C) directly.
    if (!((name).rawAddress == 0L)) {
        strcpy(name, ConstPtr(subordpath.rawAddress, subordpath.rawMeta))
    }
    (PrimitiveLayouts.I32).writeNative((amain1).rawAddress, fdm)
    (PrimitiveLayouts.I32).writeNative((asubord1).rawAddress, fds)
    return 0
}

public fun forkpty(amain: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT {
    val fdsCell =
        io.github.kotlinmania.rustlang.core.mem
            .AddressableLocal(-1, PrimitiveLayouts.I32)
    if (openpty(amain, fdsCell.asMutPtr(), name, termp, winp) != 0) {
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(fdsCell.rawAddress, 4L, 4L)
        return -1
    }
    val fds = PrimitiveLayouts.I32.readNative(fdsCell.rawAddress)
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(fdsCell.rawAddress, 4L, 4L)
    val pid = fork()
    if (pid < 0) {
        return bail((PrimitiveLayouts.I32).readNative((amain).rawAddress), fds)
    } else if (pid > 0) {
        // In the parent process, we close the subordinate device and return the
        // process ID of the new child:
        close(fds)
        return pid
    }
    // The rest of this function executes in the child process.
    // Close the main side of the pseudo-terminal pair:
    close((PrimitiveLayouts.I32).readNative((amain).rawAddress))
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

public fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt {
    val result1 = result
    val oldErrno = (PrimitiveLayouts.I32).readNative((errno()).rawAddress)
    (PrimitiveLayouts.I32).writeNative((errno()).rawAddress, 0)
    (PrimitiveLayouts.mutPtrLayout<Passwd>(64L)).writeNative((result1).rawAddress, nativeGetpwentR(pwd, buf, minOf(buflen, CInt.MAX_VALUE.toULong()).toInt()))
    val ret =
        if ((((PrimitiveLayouts.mutPtrLayout<Passwd>(64L)).readNative((result1).rawAddress)).rawAddress == 0L)) {
            (PrimitiveLayouts.I32).readNative((errno()).rawAddress)
        } else {
            0
        }
    (PrimitiveLayouts.I32).writeNative((errno()).rawAddress, oldErrno)
    return ret
}

public fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt {
    val result1 = result
    val oldErrno = (PrimitiveLayouts.I32).readNative((errno()).rawAddress)
    (PrimitiveLayouts.I32).writeNative((errno()).rawAddress, 0)
    (PrimitiveLayouts.mutPtrLayout<Group>(64L)).writeNative((result1).rawAddress, nativeGetgrentR(grp, buf, minOf(buflen, CInt.MAX_VALUE.toULong()).toInt()))
    val ret =
        if ((((PrimitiveLayouts.mutPtrLayout<Group>(64L)).readNative((result1).rawAddress)).rawAddress == 0L)) {
            (PrimitiveLayouts.I32).readNative((errno()).rawAddress)
        } else {
            0
        }
    (PrimitiveLayouts.I32).writeNative((errno()).rawAddress, oldErrno)
    return ret
}
