#include "libc_wrapper.h"

#if defined(_WIN32) || defined(__CYGWIN__)
#include <winsock2.h>
#include <ws2tcpip.h>
#else
#include <sys/socket.h>
#endif

void* libc_cmsg_data(void* cmsg) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_DATA((WSACMSGHDR*)cmsg);
#else
    return CMSG_DATA((struct cmsghdr*)cmsg);
#endif
}

void* libc_cmsg_firsthdr(void* mhdr) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_FIRSTHDR((WSAMSG*)mhdr);
#else
    return CMSG_FIRSTHDR((struct msghdr*)mhdr);
#endif
}

void* libc_cmsg_nxthdr(void* mhdr, void* cmsg) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_NXTHDR((WSAMSG*)mhdr, (WSACMSGHDR*)cmsg);
#else
    return CMSG_NXTHDR((struct msghdr*)mhdr, (struct cmsghdr*)cmsg);
#endif
}

size_t libc_cmsg_space(size_t length) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_SPACE(length);
#else
    return CMSG_SPACE(length);
#endif
}

size_t libc_cmsg_len(size_t length) {
#if defined(_WIN32) || defined(__CYGWIN__)
    return WSA_CMSG_LEN(length);
#else
    return CMSG_LEN(length);
#endif
}

size_t libc_cmsg_align(size_t len) {
    return (len + sizeof(size_t) - 1) & ~(sizeof(size_t) - 1);
}
