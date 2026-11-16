// port-lint: source unix/linux_like/linux/uclibc/mips/mips_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.TcflagT

public typealias PthreadT = CUlong

public val SFD_CLOEXEC: CInt = 0x080000

public val NCCS: Int = 32

public val O_TRUNC: CInt = 512

public val O_CLOEXEC: CInt = 0x80000

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EDOTDOT: CInt = 73

public val SA_NODEFER: CUint = 0x40000000u

public val SA_RESETHAND: CUint = 0x80000000u

public val SA_RESTART: CUint = 0x10000000u

public val SA_NOCLDSTOP: CUint = 0x00000001u

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EFD_CLOEXEC: CInt = 0x80000

public val TMP_MAX: CUint = 238328u

public val SC_2_C_VERSION: CInt = 96

public val O_ACCMODE: CInt = 3

public val O_DIRECT: CInt = 0x8000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_NOATIME: CInt = 0x40000

public val O_PATH: CInt = 2097152

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_NONBLOCK: CInt = 128

public val O_SYNC: CInt = 0x10

public val O_RSYNC: CInt = 0x10

public val O_DSYNC: CInt = 0x10

public val O_FSYNC: CInt = 0x10

public val O_ASYNC: CInt = 0x1000

public val O_LARGEFILE: CInt = 0x2000

public val O_NDELAY: CInt = 0x80

public val SOCK_NONBLOCK: CInt = 128

public val EDEADLK: CInt = 45

public val ENAMETOOLONG: CInt = 78

public val ENOLCK: CInt = 46

public val ENOSYS: CInt = 89

public val ENOTEMPTY: CInt = 93

public val ELOOP: CInt = 90

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val FFDLY: CInt = 32768

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EMULTIHOP: CInt = 74

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EBADMSG: CInt = 77

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

public val EUSERS: CInt = 94

public val ENOTSOCK: CInt = 95

public val EDESTADDRREQ: CInt = 96

public val EMSGSIZE: CInt = 97

public val EPROTOTYPE: CInt = 98

public val ENOPROTOOPT: CInt = 99

public val EPROTONOSUPPORT: CInt = 120

public val ESOCKTNOSUPPORT: CInt = 121

public val EOPNOTSUPP: CInt = 122

public val EPFNOSUPPORT: CInt = 123

public val EAFNOSUPPORT: CInt = 124

public val EADDRINUSE: CInt = 125

public val EADDRNOTAVAIL: CInt = 126

public val ENETDOWN: CInt = 127

public val ENETUNREACH: CInt = 128

public val ENETRESET: CInt = 129

public val ECONNABORTED: CInt = 130

public val ECONNRESET: CInt = 131

public val ENOBUFS: CInt = 132

public val EISCONN: CInt = 133

public val ENOTCONN: CInt = 134

public val ESHUTDOWN: CInt = 143

public val ETOOMANYREFS: CInt = 144

public val ETIMEDOUT: CInt = 145

public val ECONNREFUSED: CInt = 146

public val EHOSTDOWN: CInt = 147

public val EHOSTUNREACH: CInt = 148

public val EALREADY: CInt = 149

public val EINPROGRESS: CInt = 150

public val ESTALE: CInt = 151

public val EUCLEAN: CInt = 135

public val ENOTNAM: CInt = 137

public val ENAVAIL: CInt = 138

public val EISNAM: CInt = 139

public val EREMOTEIO: CInt = 140

public val EDQUOT: CInt = 1133

public val ENOMEDIUM: CInt = 159

public val EMEDIUMTYPE: CInt = 160

public val ECANCELED: CInt = 158

public val ENOKEY: CInt = 161

public val EKEYEXPIRED: CInt = 162

public val EKEYREVOKED: CInt = 163

public val EKEYREJECTED: CInt = 164

public val EOWNERDEAD: CInt = 165

public val ENOTRECOVERABLE: CInt = 166

public val ERFKILL: CInt = 167

public val MAP_NORESERVE: CInt = 0x400

public val MAP_ANON: CInt = 0x800

public val MAP_ANONYMOUS: CInt = 0x800

public val MAP_GROWSDOWN: CInt = 0x1000

public val MAP_DENYWRITE: CInt = 0x2000

public val MAP_EXECUTABLE: CInt = 0x4000

public val MAP_LOCKED: CInt = 0x8000

public val MAP_POPULATE: CInt = 0x10000

public val MAP_NONBLOCK: CInt = 0x20000

public val MAP_STACK: CInt = 0x40000

public val NLDLY: TcflagT = 256

public val SOCK_STREAM: CInt = 2

public val SOCK_DGRAM: CInt = 1

public val SOCK_SEQPACKET: CInt = 5

public val SA_ONSTACK: CUint = 0x08000000u

public val SA_SIGINFO: CUint = 0x00000008u

public val SA_NOCLDWAIT: CInt = 0x00010000

public val SIGEMT: CInt = 7

public val SIGCHLD: CInt = 18

public val SIGBUS: CInt = 10

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGWINCH: CInt = 20

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGCONT: CInt = 25

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGURG: CInt = 21

public val SIGIO: CInt = 22

public val SIGSYS: CInt = 12

public val SIGPWR: CInt = 19

public val SIG_SETMASK: CInt = 3

public val SIG_BLOCK: CInt = 0x1

public val SIG_UNBLOCK: CInt = 0x2

public val POLLWRNORM: CShort = 0x004

public val POLLWRBAND: CShort = 0x100

public val PTHREAD_STACK_MIN: SizeT = 16384uL

public val VEOF: Int = 16

public val VEOL: Int = 17

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val IEXTEN: TcflagT = 0x00000100

public val TOSTOP: TcflagT = 0x00008000

public val FLUSHO: TcflagT = 0x00002000

public val TCSANOW: CInt = 0x540e

public val TCSADRAIN: CInt = 0x540f

public val TCSAFLUSH: CInt = 0x5410

public val CPU_SETSIZE: CInt = 0x400

public val EFD_NONBLOCK: CInt = 0x80

public val F_GETLK: CInt = 14

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val SFD_NONBLOCK: CInt = 0x80

public val RTLD_GLOBAL: CInt = 0x4

public val SIGSTKSZ: SizeT = 8192uL

public val CBAUD: TcflagT = 4111

public val CBAUDEX: TcflagT = 4096

public val CIBAUD: TcflagT = 269418496

public val TAB1: TcflagT = 0x00000800

public val TAB2: TcflagT = 0x00001000

public val TAB3: TcflagT = 0x00001800

public val TABDLY: TcflagT = 6144

public val CR1: TcflagT = 0x00000200

public val CR2: TcflagT = 0x00000400

public val CR3: TcflagT = 0x00000600

public val FF1: TcflagT = 0x00008000

public val BS1: TcflagT = 0x00002000

public val BSDLY: TcflagT = 8192

public val VT1: TcflagT = 0x00004000

public val VWERASE: Int = 14

public val XTABS: TcflagT = 6144

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSWTC: Int = 7

public val VTDLY: CInt = 16384

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400

public val IXOFF: TcflagT = 0x00001000

public val OLCUC: TcflagT = 2

public val ONLCR: TcflagT = 0x4

public val CSIZE: TcflagT = 0x00000030

public val CS6: TcflagT = 0x00000010

public val CS7: TcflagT = 0x00000020

public val CS8: TcflagT = 0x00000030

public val CSTOPB: TcflagT = 0x00000040

public val CRDLY: CInt = 1536

public val CREAD: TcflagT = 0x00000080

public val PARENB: TcflagT = 0x00000100

public val PARODD: TcflagT = 0x00000200

public val HUPCL: TcflagT = 0x00000400

public val CLOCAL: TcflagT = 0x00000800

public val ECHOKE: TcflagT = 0x00000800

public val ECHOE: TcflagT = 0x00000010

public val ECHOK: TcflagT = 0x00000020

public val ECHONL: TcflagT = 0x00000040

public val ECHOPRT: TcflagT = 0x00000400

public val ECHOCTL: TcflagT = 0x00000200

public val ISIG: TcflagT = 0x00000001

public val ICANON: TcflagT = 0x00000002

public val PENDIN: TcflagT = 0x00004000

public val NOFLSH: TcflagT = 0x00000080

public val MAP_HUGETLB: CInt = 0x80000

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val B57600: SpeedT = 4097

public val B115200: SpeedT = 4098

public val B230400: SpeedT = 4099

public val B460800: SpeedT = 4100

public val B500000: SpeedT = 4101

public val B576000: SpeedT = 4102

public val B921600: SpeedT = 4103

public val B1000000: SpeedT = 4104

public val B1152000: SpeedT = 4105

public val B1500000: SpeedT = 4106

public val B2000000: SpeedT = 4107

public val B2500000: SpeedT = 4108

public val B3000000: SpeedT = 4109

public val B3500000: SpeedT = 4110

public val B4000000: SpeedT = 4111
