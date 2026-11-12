package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val ERFKILL: CInt = 132

public val EHWPOISON: CInt = 133

public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_DONTROUTE: CInt = 5

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_OOBINLINE: CInt = 10

public val SO_NO_CHECK: CInt = 11

public val SO_PRIORITY: CInt = 12

public val SO_LINGER: CInt = 13

public val SO_BSDCOMPAT: CInt = 14

public val SO_REUSEPORT: CInt = 15

public val SO_PASSCRED: CInt = 16

public val SO_PEERCRED: CInt = 17

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_RCVTIMEO: CInt = 20

public val SO_SNDTIMEO: CInt = 21

public val SO_BINDTODEVICE: CInt = 25

public val SO_ACCEPTCONN: CInt = 30

public val SO_SNDBUFFORCE: CInt = 32

public val SO_RCVBUFFORCE: CInt = 33

public val SO_TIMESTAMPNS: CInt = 35

public val SO_MARK: CInt = 36

public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SO_RXQ_OVFL: CInt = 40

public val SO_PEEK_OFF: CInt = 42

public val SO_BUSY_POLL: CInt = 46

public val SO_COOKIE: CInt = 57

public val SO_BINDTOIFINDEX: CInt = 62

public val SO_FUCHSIA_MARK: CInt = 10000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSTKFLT: CInt = 16

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val EXTPROC: TcflagT = 0x00010000u

public val MAP_HUGETLB: CInt = 0x040000

public val F_GETLK: CInt = 5

public val F_GETOWN: CInt = 9

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_SETOWN: CInt = 8

public val VEOF: Int = 4

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: TcflagT = 0x00008000u

public val TOSTOP: TcflagT = 0x00000100u

public val FLUSHO: TcflagT = 0x00001000u

public val TCGETS: CInt = 0x5401

public val TCSETS: CInt = 0x5402

public val TCSETSW: CInt = 0x5403

public val TCSETSF: CInt = 0x5404

public val TCGETA: CInt = 0x5405

public val TCSETA: CInt = 0x5406

public val TCSETAW: CInt = 0x5407

public val TCSETAF: CInt = 0x5408

public val TCSBRK: CInt = 0x5409

public val TCXONC: CInt = 0x540A

public val TCFLSH: CInt = 0x540B

public val TIOCGSOFTCAR: CInt = 0x5419

public val TIOCSSOFTCAR: CInt = 0x541A

public val TIOCLINUX: CInt = 0x541C

public val TIOCGSERIAL: CInt = 0x541E

public val TIOCEXCL: CInt = 0x540C

public val TIOCNXCL: CInt = 0x540D

public val TIOCSCTTY: CInt = 0x540E

public val TIOCGPGRP: CInt = 0x540F

public val TIOCSPGRP: CInt = 0x5410

public val TIOCOUTQ: CInt = 0x5411

public val TIOCSTI: CInt = 0x5412

public val TIOCGWINSZ: CInt = 0x5413

public val TIOCSWINSZ: CInt = 0x5414

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val TIOCCONS: CInt = 0x541D

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val TIOCM_LE: CInt = 0x001

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_ST: CInt = 0x008

public val TIOCM_SR: CInt = 0x010

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_DSR: CInt = 0x100

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val O_DIRECTORY: CInt = 0x00080000

public val O_DIRECT: CInt = 0x00000800

public val O_LARGEFILE: CInt = 0x00001000

public val O_NOFOLLOW: CInt = 0x00000080

public val HUGETLB_FLAG_ENCODE_SHIFT: UInt = 26u

public val MAP_HUGE_SHIFT: UInt = 26u

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public val ULONG_SIZE: Int = 64

public val RTLD_DEFAULT: MutPtr = MutPtr(0L)

public val SEM_FAILED: MutPtr = MutPtr(0L)
