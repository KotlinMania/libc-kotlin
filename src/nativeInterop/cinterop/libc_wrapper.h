#ifndef LIBC_WRAPPER_H
#define LIBC_WRAPPER_H

#include <stdint.h>
#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_cmsg_data(void* cmsg);
void* libc_cmsg_firsthdr(void* mhdr);
void* libc_cmsg_nxthdr(void* mhdr, void* cmsg);
size_t libc_cmsg_space(size_t length);
size_t libc_cmsg_len(size_t length);
size_t libc_cmsg_align(size_t len);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WRAPPER_H */
