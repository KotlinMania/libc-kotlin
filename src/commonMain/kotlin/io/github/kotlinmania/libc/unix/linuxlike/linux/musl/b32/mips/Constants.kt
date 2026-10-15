// port-lint: source unix/linux_like/linux/musl/b32/mips/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.mips

import io.github.kotlinmania.libc.*

public const val SIGSTKSZ: ULong = 8192uL

public const val MINSIGSTKSZ: ULong = 2048uL

public const val O_DIRECT: Int = 32768

public const val O_DIRECTORY: Int = 65536

public const val O_NOFOLLOW: Int = 131072

public const val O_ASYNC: Int = 4096

public const val O_LARGEFILE: Int = 0x2000

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val CBAUD: UInt = 4111u

public const val TAB1: Int = 0x00000800

public const val TAB2: Int = 0x00001000

public const val TAB3: Int = 0x00001800

public const val CR1: Int = 0x00000200

public const val CR2: Int = 0x00000400

public const val CR3: Int = 0x00000600

public const val FF1: Int = 0x00008000

public const val BS1: Int = 0x00002000

public const val VT1: Int = 0x00004000

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

public const val CREAD: UInt = 0x00000080u

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val ECHOKE: UInt = 0x00000800u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val ECHOPRT: UInt = 0x00000400u

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val PENDIN: UInt = 0x00004000u

public const val NOFLSH: UInt = 0x00000080u

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 4096u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XTABS: UInt = 6144u

public const val B57600: UInt = 4097u

public const val B115200: UInt = 4098u

public const val B230400: UInt = 4099u

public const val B460800: UInt = 4100u

public const val B500000: UInt = 4101u

public const val B576000: UInt = 4102u

public const val B921600: UInt = 4103u

public const val B1000000: UInt = 4104u

public const val B1152000: UInt = 4105u

public const val B1500000: UInt = 4106u

public const val B2000000: UInt = 4107u

public const val B2500000: UInt = 4108u

public const val B3000000: UInt = 4109u

public const val B3500000: UInt = 4110u

public const val B4000000: UInt = 4111u

public const val O_APPEND: Int = 8

public const val O_CREAT: Int = 256

public const val O_EXCL: Int = 1024

public const val O_NOCTTY: Int = 2048

public const val O_NONBLOCK: Int = 128

public const val O_SYNC: Int = 16400

public const val O_RSYNC: Int = 16400

public const val O_DSYNC: Int = 16

public const val MAP_ANON: Int = 0x800

public const val MAP_GROWSDOWN: Int = 0x1000

public const val MAP_DENYWRITE: Int = 0x2000

public const val MAP_EXECUTABLE: Int = 0x4000

public const val MAP_LOCKED: Int = 0x8000

public const val MAP_NORESERVE: Int = 0x0400

public const val MAP_POPULATE: Int = 0x10000

public const val MAP_NONBLOCK: Int = 0x20000

public const val MAP_STACK: Int = 0x40000

public const val MAP_HUGETLB: Int = 0x80000

public const val EDEADLK: Int = 45

public const val ENAMETOOLONG: Int = 78

public const val ENOLCK: Int = 46

public const val ENOSYS: Int = 89

public const val ENOTEMPTY: Int = 93

public const val ELOOP: Int = 90

public const val ENOMSG: Int = 35

public const val EIDRM: Int = 36

public const val ECHRNG: Int = 37

public const val EL2NSYNC: Int = 38

public const val EL3HLT: Int = 39

public const val EL3RST: Int = 40

public const val ELNRNG: Int = 41

public const val EUNATCH: Int = 42

public const val ENOCSI: Int = 43

public const val EL2HLT: Int = 44

public const val EBADE: Int = 50

public const val EBADR: Int = 51

public const val EXFULL: Int = 52

public const val ENOANO: Int = 53

public const val EBADRQC: Int = 54

public const val EBADSLT: Int = 55

public const val EDEADLOCK: Int = 56

public const val EMULTIHOP: Int = 74

public const val EOVERFLOW: Int = 79

public const val ENOTUNIQ: Int = 80

public const val EBADFD: Int = 81

public const val EBADMSG: Int = 77

public const val EREMCHG: Int = 82

public const val ELIBACC: Int = 83

public const val ELIBBAD: Int = 84

public const val ELIBSCN: Int = 85

public const val ELIBMAX: Int = 86

public const val ELIBEXEC: Int = 87

public const val EILSEQ: Int = 88

public const val ERESTART: Int = 91

public const val ESTRPIPE: Int = 92

public const val EUSERS: Int = 94

public const val ENOTSOCK: Int = 95

public const val EDESTADDRREQ: Int = 96

public const val EMSGSIZE: Int = 97

public const val EPROTOTYPE: Int = 98

public const val ENOPROTOOPT: Int = 99

public const val EPROTONOSUPPORT: Int = 120

public const val ESOCKTNOSUPPORT: Int = 121

public const val EOPNOTSUPP: Int = 122

public const val ENOTSUP: Int = EOPNOTSUPP

public const val EPFNOSUPPORT: Int = 123

public const val EAFNOSUPPORT: Int = 124

public const val EADDRINUSE: Int = 125

public const val EADDRNOTAVAIL: Int = 126

public const val ENETDOWN: Int = 127

public const val ENETUNREACH: Int = 128

public const val ENETRESET: Int = 129

public const val ECONNABORTED: Int = 130

public const val ECONNRESET: Int = 131

public const val ENOBUFS: Int = 132

public const val EISCONN: Int = 133

public const val ENOTCONN: Int = 134

public const val ESHUTDOWN: Int = 143

public const val ETOOMANYREFS: Int = 144

public const val ETIMEDOUT: Int = 145

public const val ECONNREFUSED: Int = 146

public const val EHOSTDOWN: Int = 147

public const val EHOSTUNREACH: Int = 148

public const val EALREADY: Int = 149

public const val EINPROGRESS: Int = 150

public const val ESTALE: Int = 151

public const val EUCLEAN: Int = 135

public const val ENOTNAM: Int = 137

public const val ENAVAIL: Int = 138

public const val EISNAM: Int = 139

public const val EREMOTEIO: Int = 140

public const val EDQUOT: Int = 1133

public const val ENOMEDIUM: Int = 159

public const val EMEDIUMTYPE: Int = 160

public const val ECANCELED: Int = 158

public const val ENOKEY: Int = 161

public const val EKEYEXPIRED: Int = 162

public const val EKEYREVOKED: Int = 163

public const val EKEYREJECTED: Int = 164

public const val EOWNERDEAD: Int = 165

public const val ENOTRECOVERABLE: Int = 166

public const val EHWPOISON: Int = 168

public const val ERFKILL: Int = 167

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 8

public const val SA_NOCLDWAIT: Int = 0x10000

public const val SIGEMT: Int = 7

public const val SIGCHLD: Int = 18

public const val SIGBUS: Int = 10

public const val SIGTTIN: Int = 26

public const val SIGTTOU: Int = 27

public const val SIGXCPU: Int = 30

public const val SIGXFSZ: Int = 31

public const val SIGVTALRM: Int = 28

public const val SIGPROF: Int = 29

public const val SIGWINCH: Int = 20

public const val SIGUSR1: Int = 16

public const val SIGUSR2: Int = 17

public const val SIGCONT: Int = 25

public const val SIGSTOP: Int = 23

public const val SIGTSTP: Int = 24

public const val SIGURG: Int = 21

public const val SIGIO: Int = 22

public const val SIGSYS: Int = 12

public const val SIGPOLL: Int = SIGIO

public const val SIGPWR: Int = 19

public const val SIG_SETMASK: Int = 3

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val EXTPROC: UInt = 65536u

public const val F_GETLK: Int = 33

public const val F_GETOWN: Int = 23

public const val F_SETLK: Int = 34

public const val F_SETLKW: Int = 35

public const val F_SETOWN: Int = 24

public const val VEOF: ULong = 16uL

public const val VEOL: ULong = 17uL

public const val VEOL2: ULong = 6uL

public const val VMIN: ULong = 4uL

public const val IEXTEN: UInt = 256u

public const val TOSTOP: UInt = 32768u

public const val FLUSHO: UInt = 8192u

public const val POLLWRNORM: Short = 0x4

public const val POLLWRBAND: Short = 0x100

public const val SYS_syscall: Long = 4000 + 0

public const val SYS_exit: Long = 4000 + 1

public const val SYS_fork: Long = 4000 + 2

public const val SYS_read: Long = 4000 + 3

public const val SYS_write: Long = 4000 + 4

public const val SYS_open: Long = 4000 + 5

public const val SYS_close: Long = 4000 + 6

public const val SYS_waitpid: Long = 4000 + 7

public const val SYS_creat: Long = 4000 + 8

public const val SYS_link: Long = 4000 + 9

public const val SYS_unlink: Long = 4000 + 10

public const val SYS_execve: Long = 4000 + 11

public const val SYS_chdir: Long = 4000 + 12

public const val SYS_time: Long = 4000 + 13

public const val SYS_mknod: Long = 4000 + 14

public const val SYS_chmod: Long = 4000 + 15

public const val SYS_lchown: Long = 4000 + 16

public const val SYS_break: Long = 4000 + 17

public const val SYS_lseek: Long = 4000 + 19

public const val SYS_getpid: Long = 4000 + 20

public const val SYS_mount: Long = 4000 + 21

public const val SYS_umount: Long = 4000 + 22

public const val SYS_setuid: Long = 4000 + 23

public const val SYS_getuid: Long = 4000 + 24

public const val SYS_stime: Long = 4000 + 25

public const val SYS_ptrace: Long = 4000 + 26

public const val SYS_alarm: Long = 4000 + 27

public const val SYS_pause: Long = 4000 + 29

public const val SYS_utime: Long = 4000 + 30

public const val SYS_stty: Long = 4000 + 31

public const val SYS_gtty: Long = 4000 + 32

public const val SYS_access: Long = 4000 + 33

public const val SYS_nice: Long = 4000 + 34

public const val SYS_ftime: Long = 4000 + 35

public const val SYS_sync: Long = 4000 + 36

public const val SYS_kill: Long = 4000 + 37

public const val SYS_rename: Long = 4000 + 38

public const val SYS_mkdir: Long = 4000 + 39

public const val SYS_rmdir: Long = 4000 + 40

public const val SYS_dup: Long = 4000 + 41

public const val SYS_pipe: Long = 4000 + 42

public const val SYS_times: Long = 4000 + 43

public const val SYS_prof: Long = 4000 + 44

public const val SYS_brk: Long = 4000 + 45

public const val SYS_setgid: Long = 4000 + 46

public const val SYS_getgid: Long = 4000 + 47

public const val SYS_signal: Long = 4000 + 48

public const val SYS_geteuid: Long = 4000 + 49

public const val SYS_getegid: Long = 4000 + 50

public const val SYS_acct: Long = 4000 + 51

public const val SYS_umount2: Long = 4000 + 52

public const val SYS_lock: Long = 4000 + 53

public const val SYS_ioctl: Long = 4000 + 54

public const val SYS_fcntl: Long = 4000 + 55

public const val SYS_mpx: Long = 4000 + 56

public const val SYS_setpgid: Long = 4000 + 57

public const val SYS_ulimit: Long = 4000 + 58

public const val SYS_umask: Long = 4000 + 60

public const val SYS_chroot: Long = 4000 + 61

public const val SYS_ustat: Long = 4000 + 62

public const val SYS_dup2: Long = 4000 + 63

public const val SYS_getppid: Long = 4000 + 64

public const val SYS_getpgrp: Long = 4000 + 65

public const val SYS_setsid: Long = 4000 + 66

public const val SYS_sigaction: Long = 4000 + 67

public const val SYS_sgetmask: Long = 4000 + 68

public const val SYS_ssetmask: Long = 4000 + 69

public const val SYS_setreuid: Long = 4000 + 70

public const val SYS_setregid: Long = 4000 + 71

public const val SYS_sigsuspend: Long = 4000 + 72

public const val SYS_sigpending: Long = 4000 + 73

public const val SYS_sethostname: Long = 4000 + 74

public const val SYS_setrlimit: Long = 4000 + 75

public const val SYS_getrlimit: Long = 4000 + 76

public const val SYS_getrusage: Long = 4000 + 77

public const val SYS_gettimeofday: Long = 4000 + 78

public const val SYS_settimeofday: Long = 4000 + 79

public const val SYS_getgroups: Long = 4000 + 80

public const val SYS_setgroups: Long = 4000 + 81

public const val SYS_symlink: Long = 4000 + 83

public const val SYS_readlink: Long = 4000 + 85

public const val SYS_uselib: Long = 4000 + 86

public const val SYS_swapon: Long = 4000 + 87

public const val SYS_reboot: Long = 4000 + 88

public const val SYS_readdir: Long = 4000 + 89

public const val SYS_mmap: Long = 4000 + 90

public const val SYS_munmap: Long = 4000 + 91

public const val SYS_truncate: Long = 4000 + 92

public const val SYS_ftruncate: Long = 4000 + 93

public const val SYS_fchmod: Long = 4000 + 94

public const val SYS_fchown: Long = 4000 + 95

public const val SYS_getpriority: Long = 4000 + 96

public const val SYS_setpriority: Long = 4000 + 97

public const val SYS_profil: Long = 4000 + 98

public const val SYS_statfs: Long = 4000 + 99

public const val SYS_fstatfs: Long = 4000 + 100

public const val SYS_ioperm: Long = 4000 + 101

public const val SYS_socketcall: Long = 4000 + 102

public const val SYS_syslog: Long = 4000 + 103

public const val SYS_setitimer: Long = 4000 + 104

public const val SYS_getitimer: Long = 4000 + 105

public const val SYS_stat: Long = 4000 + 106

public const val SYS_lstat: Long = 4000 + 107

public const val SYS_fstat: Long = 4000 + 108

public const val SYS_iopl: Long = 4000 + 110

public const val SYS_vhangup: Long = 4000 + 111

public const val SYS_idle: Long = 4000 + 112

public const val SYS_vm86: Long = 4000 + 113

public const val SYS_wait4: Long = 4000 + 114

public const val SYS_swapoff: Long = 4000 + 115

public const val SYS_sysinfo: Long = 4000 + 116

public const val SYS_ipc: Long = 4000 + 117

public const val SYS_fsync: Long = 4000 + 118

public const val SYS_sigreturn: Long = 4000 + 119

public const val SYS_clone: Long = 4000 + 120

public const val SYS_setdomainname: Long = 4000 + 121

public const val SYS_uname: Long = 4000 + 122

public const val SYS_modify_ldt: Long = 4000 + 123

public const val SYS_adjtimex: Long = 4000 + 124

public const val SYS_mprotect: Long = 4000 + 125

public const val SYS_sigprocmask: Long = 4000 + 126

public const val SYS_create_module: Long = 4000 + 127

public const val SYS_init_module: Long = 4000 + 128

public const val SYS_delete_module: Long = 4000 + 129

public const val SYS_get_kernel_syms: Long = 4000 + 130

public const val SYS_quotactl: Long = 4000 + 131

public const val SYS_getpgid: Long = 4000 + 132

public const val SYS_fchdir: Long = 4000 + 133

public const val SYS_bdflush: Long = 4000 + 134

public const val SYS_sysfs: Long = 4000 + 135

public const val SYS_personality: Long = 4000 + 136

public const val SYS_afs_syscall: Long = 4000 + 137

public const val SYS_setfsuid: Long = 4000 + 138

public const val SYS_setfsgid: Long = 4000 + 139

public const val SYS__llseek: Long = 4000 + 140

public const val SYS_getdents: Long = 4000 + 141

public const val SYS_flock: Long = 4000 + 143

public const val SYS_msync: Long = 4000 + 144

public const val SYS_readv: Long = 4000 + 145

public const val SYS_writev: Long = 4000 + 146

public const val SYS_cacheflush: Long = 4000 + 147

public const val SYS_cachectl: Long = 4000 + 148

public const val SYS_sysmips: Long = 4000 + 149

public const val SYS_getsid: Long = 4000 + 151

public const val SYS_fdatasync: Long = 4000 + 152

public const val SYS__sysctl: Long = 4000 + 153

public const val SYS_mlock: Long = 4000 + 154

public const val SYS_munlock: Long = 4000 + 155

public const val SYS_mlockall: Long = 4000 + 156

public const val SYS_munlockall: Long = 4000 + 157

public const val SYS_sched_setparam: Long = 4000 + 158

public const val SYS_sched_getparam: Long = 4000 + 159

public const val SYS_sched_setscheduler: Long = 4000 + 160

public const val SYS_sched_getscheduler: Long = 4000 + 161

public const val SYS_sched_yield: Long = 4000 + 162

public const val SYS_sched_get_priority_max: Long = 4000 + 163

public const val SYS_sched_get_priority_min: Long = 4000 + 164

public const val SYS_sched_rr_get_interval: Long = 4000 + 165

public const val SYS_nanosleep: Long = 4000 + 166

public const val SYS_mremap: Long = 4000 + 167

public const val SYS_accept: Long = 4000 + 168

public const val SYS_bind: Long = 4000 + 169

public const val SYS_connect: Long = 4000 + 170

public const val SYS_getpeername: Long = 4000 + 171

public const val SYS_getsockname: Long = 4000 + 172

public const val SYS_getsockopt: Long = 4000 + 173

public const val SYS_listen: Long = 4000 + 174

public const val SYS_recv: Long = 4000 + 175

public const val SYS_recvfrom: Long = 4000 + 176

public const val SYS_recvmsg: Long = 4000 + 177

public const val SYS_send: Long = 4000 + 178

public const val SYS_sendmsg: Long = 4000 + 179

public const val SYS_sendto: Long = 4000 + 180

public const val SYS_setsockopt: Long = 4000 + 181

public const val SYS_shutdown: Long = 4000 + 182

public const val SYS_socket: Long = 4000 + 183

public const val SYS_socketpair: Long = 4000 + 184

public const val SYS_setresuid: Long = 4000 + 185

public const val SYS_getresuid: Long = 4000 + 186

public const val SYS_query_module: Long = 4000 + 187

public const val SYS_poll: Long = 4000 + 188

public const val SYS_nfsservctl: Long = 4000 + 189

public const val SYS_setresgid: Long = 4000 + 190

public const val SYS_getresgid: Long = 4000 + 191

public const val SYS_prctl: Long = 4000 + 192

public const val SYS_rt_sigreturn: Long = 4000 + 193

public const val SYS_rt_sigaction: Long = 4000 + 194

public const val SYS_rt_sigprocmask: Long = 4000 + 195

public const val SYS_rt_sigpending: Long = 4000 + 196

public const val SYS_rt_sigtimedwait: Long = 4000 + 197

public const val SYS_rt_sigqueueinfo: Long = 4000 + 198

public const val SYS_rt_sigsuspend: Long = 4000 + 199

public const val SYS_chown: Long = 4000 + 202

public const val SYS_getcwd: Long = 4000 + 203

public const val SYS_capget: Long = 4000 + 204

public const val SYS_capset: Long = 4000 + 205

public const val SYS_sigaltstack: Long = 4000 + 206

public const val SYS_sendfile: Long = 4000 + 207

public const val SYS_getpmsg: Long = 4000 + 208

public const val SYS_putpmsg: Long = 4000 + 209

public const val SYS_mmap2: Long = 4000 + 210

public const val SYS_truncate64: Long = 4000 + 211

public const val SYS_ftruncate64: Long = 4000 + 212

public const val SYS_stat64: Long = 4000 + 213

public const val SYS_lstat64: Long = 4000 + 214

public const val SYS_fstat64: Long = 4000 + 215

public const val SYS_pivot_root: Long = 4000 + 216

public const val SYS_mincore: Long = 4000 + 217

public const val SYS_madvise: Long = 4000 + 218

public const val SYS_getdents64: Long = 4000 + 219

public const val SYS_fcntl64: Long = 4000 + 220

public const val SYS_gettid: Long = 4000 + 222

public const val SYS_readahead: Long = 4000 + 223

public const val SYS_setxattr: Long = 4000 + 224

public const val SYS_lsetxattr: Long = 4000 + 225

public const val SYS_fsetxattr: Long = 4000 + 226

public const val SYS_getxattr: Long = 4000 + 227

public const val SYS_lgetxattr: Long = 4000 + 228

public const val SYS_fgetxattr: Long = 4000 + 229

public const val SYS_listxattr: Long = 4000 + 230

public const val SYS_llistxattr: Long = 4000 + 231

public const val SYS_flistxattr: Long = 4000 + 232

public const val SYS_removexattr: Long = 4000 + 233

public const val SYS_lremovexattr: Long = 4000 + 234

public const val SYS_fremovexattr: Long = 4000 + 235

public const val SYS_tkill: Long = 4000 + 236

public const val SYS_sendfile64: Long = 4000 + 237

public const val SYS_futex: Long = 4000 + 238

public const val SYS_sched_setaffinity: Long = 4000 + 239

public const val SYS_sched_getaffinity: Long = 4000 + 240

public const val SYS_io_setup: Long = 4000 + 241

public const val SYS_io_destroy: Long = 4000 + 242

public const val SYS_io_getevents: Long = 4000 + 243

public const val SYS_io_submit: Long = 4000 + 244

public const val SYS_io_cancel: Long = 4000 + 245

public const val SYS_exit_group: Long = 4000 + 246

public const val SYS_lookup_dcookie: Long = 4000 + 247

public const val SYS_epoll_create: Long = 4000 + 248

public const val SYS_epoll_ctl: Long = 4000 + 249

public const val SYS_epoll_wait: Long = 4000 + 250

public const val SYS_remap_file_pages: Long = 4000 + 251

public const val SYS_set_tid_address: Long = 4000 + 252

public const val SYS_restart_syscall: Long = 4000 + 253

public const val SYS_statfs64: Long = 4000 + 255

public const val SYS_fstatfs64: Long = 4000 + 256

public const val SYS_timer_create: Long = 4000 + 257

public const val SYS_timer_settime: Long = 4000 + 258

public const val SYS_timer_gettime: Long = 4000 + 259

public const val SYS_timer_getoverrun: Long = 4000 + 260

public const val SYS_timer_delete: Long = 4000 + 261

public const val SYS_clock_settime: Long = 4000 + 262

public const val SYS_clock_gettime: Long = 4000 + 263

public const val SYS_clock_getres: Long = 4000 + 264

public const val SYS_clock_nanosleep: Long = 4000 + 265

public const val SYS_tgkill: Long = 4000 + 266

public const val SYS_utimes: Long = 4000 + 267

public const val SYS_mbind: Long = 4000 + 268

public const val SYS_get_mempolicy: Long = 4000 + 269

public const val SYS_set_mempolicy: Long = 4000 + 270

public const val SYS_mq_open: Long = 4000 + 271

public const val SYS_mq_unlink: Long = 4000 + 272

public const val SYS_mq_timedsend: Long = 4000 + 273

public const val SYS_mq_timedreceive: Long = 4000 + 274

public const val SYS_mq_notify: Long = 4000 + 275

public const val SYS_mq_getsetattr: Long = 4000 + 276

public const val SYS_vserver: Long = 4000 + 277

public const val SYS_waitid: Long = 4000 + 278

public const val SYS_sys_setaltroot: Long = 4000 + 279

public const val SYS_add_key: Long = 4000 + 280

public const val SYS_request_key: Long = 4000 + 281

public const val SYS_keyctl: Long = 4000 + 282

public const val SYS_set_thread_area: Long = 4000 + 283

public const val SYS_inotify_init: Long = 4000 + 284

public const val SYS_inotify_add_watch: Long = 4000 + 285

public const val SYS_inotify_rm_watch: Long = 4000 + 286

public const val SYS_migrate_pages: Long = 4000 + 287

public const val SYS_openat: Long = 4000 + 288

public const val SYS_mkdirat: Long = 4000 + 289

public const val SYS_mknodat: Long = 4000 + 290

public const val SYS_fchownat: Long = 4000 + 291

public const val SYS_futimesat: Long = 4000 + 292

public const val SYS_unlinkat: Long = 4000 + 294

public const val SYS_renameat: Long = 4000 + 295

public const val SYS_linkat: Long = 4000 + 296

public const val SYS_symlinkat: Long = 4000 + 297

public const val SYS_readlinkat: Long = 4000 + 298

public const val SYS_fchmodat: Long = 4000 + 299

public const val SYS_faccessat: Long = 4000 + 300

public const val SYS_pselect6: Long = 4000 + 301

public const val SYS_ppoll: Long = 4000 + 302

public const val SYS_unshare: Long = 4000 + 303

public const val SYS_splice: Long = 4000 + 304

public const val SYS_sync_file_range: Long = 4000 + 305

public const val SYS_tee: Long = 4000 + 306

public const val SYS_vmsplice: Long = 4000 + 307

public const val SYS_move_pages: Long = 4000 + 308

public const val SYS_set_robust_list: Long = 4000 + 309

public const val SYS_get_robust_list: Long = 4000 + 310

public const val SYS_kexec_load: Long = 4000 + 311

public const val SYS_getcpu: Long = 4000 + 312

public const val SYS_epoll_pwait: Long = 4000 + 313

public const val SYS_ioprio_set: Long = 4000 + 314

public const val SYS_ioprio_get: Long = 4000 + 315

public const val SYS_utimensat: Long = 4000 + 316

public const val SYS_signalfd: Long = 4000 + 317

public const val SYS_timerfd: Long = 4000 + 318

public const val SYS_eventfd: Long = 4000 + 319

public const val SYS_fallocate: Long = 4000 + 320

public const val SYS_timerfd_create: Long = 4000 + 321

public const val SYS_timerfd_gettime: Long = 4000 + 322

public const val SYS_timerfd_settime: Long = 4000 + 323

public const val SYS_signalfd4: Long = 4000 + 324

public const val SYS_eventfd2: Long = 4000 + 325

public const val SYS_epoll_create1: Long = 4000 + 326

public const val SYS_dup3: Long = 4000 + 327

public const val SYS_pipe2: Long = 4000 + 328

public const val SYS_inotify_init1: Long = 4000 + 329

public const val SYS_preadv: Long = 4000 + 330

public const val SYS_pwritev: Long = 4000 + 331

public const val SYS_rt_tgsigqueueinfo: Long = 4000 + 332

public const val SYS_perf_event_open: Long = 4000 + 333

public const val SYS_accept4: Long = 4000 + 334

public const val SYS_recvmmsg: Long = 4000 + 335

public const val SYS_fanotify_init: Long = 4000 + 336

public const val SYS_fanotify_mark: Long = 4000 + 337

public const val SYS_prlimit64: Long = 4000 + 338

public const val SYS_name_to_handle_at: Long = 4000 + 339

public const val SYS_open_by_handle_at: Long = 4000 + 340

public const val SYS_clock_adjtime: Long = 4000 + 341

public const val SYS_syncfs: Long = 4000 + 342

public const val SYS_sendmmsg: Long = 4000 + 343

public const val SYS_setns: Long = 4000 + 344

public const val SYS_process_vm_readv: Long = 4000 + 345

public const val SYS_process_vm_writev: Long = 4000 + 346

public const val SYS_kcmp: Long = 4000 + 347

public const val SYS_finit_module: Long = 4000 + 348

public const val SYS_sched_setattr: Long = 4000 + 349

public const val SYS_sched_getattr: Long = 4000 + 350

public const val SYS_renameat2: Long = 4000 + 351

public const val SYS_seccomp: Long = 4000 + 352

public const val SYS_getrandom: Long = 4000 + 353

public const val SYS_memfd_create: Long = 4000 + 354

public const val SYS_bpf: Long = 4000 + 355

public const val SYS_execveat: Long = 4000 + 356

public const val SYS_userfaultfd: Long = 4000 + 357

public const val SYS_membarrier: Long = 4000 + 358

public const val SYS_mlock2: Long = 4000 + 359

public const val SYS_copy_file_range: Long = 4000 + 360

public const val SYS_preadv2: Long = 4000 + 361

public const val SYS_pwritev2: Long = 4000 + 362

public const val SYS_pkey_mprotect: Long = 4000 + 363

public const val SYS_pkey_alloc: Long = 4000 + 364

public const val SYS_pkey_free: Long = 4000 + 365

public const val SYS_statx: Long = 4000 + 366

public const val SYS_pidfd_send_signal: Long = 4000 + 424

public const val SYS_io_uring_setup: Long = 4000 + 425

public const val SYS_io_uring_enter: Long = 4000 + 426

public const val SYS_io_uring_register: Long = 4000 + 427

public const val SYS_open_tree: Long = 4000 + 428

public const val SYS_move_mount: Long = 4000 + 429

public const val SYS_fsopen: Long = 4000 + 430

public const val SYS_fsconfig: Long = 4000 + 431

public const val SYS_fsmount: Long = 4000 + 432

public const val SYS_fspick: Long = 4000 + 433

public const val SYS_pidfd_open: Long = 4000 + 434

public const val SYS_clone3: Long = 4000 + 435

public const val SYS_close_range: Long = 4000 + 436

public const val SYS_openat2: Long = 4000 + 437

public const val SYS_pidfd_getfd: Long = 4000 + 438

public const val SYS_faccessat2: Long = 4000 + 439

public const val SYS_process_madvise: Long = 4000 + 440

public const val SYS_epoll_pwait2: Long = 4000 + 441

public const val SYS_mount_setattr: Long = 4000 + 442

public const val SYS_quotactl_fd: Long = 4000 + 443

public const val SYS_landlock_create_ruleset: Long = 4000 + 444

public const val SYS_landlock_add_rule: Long = 4000 + 445

public const val SYS_landlock_restrict_self: Long = 4000 + 446

public const val SYS_memfd_secret: Long = 4000 + 447

public const val SYS_process_mrelease: Long = 4000 + 448

public const val SYS_futex_waitv: Long = 4000 + 449

public const val SYS_set_mempolicy_home_node: Long = 4000 + 450
