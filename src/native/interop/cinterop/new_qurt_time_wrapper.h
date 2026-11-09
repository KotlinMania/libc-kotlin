#ifndef LIBC_NEW_QURT_TIME_NEW_QURT_TIME_WRAPPER_H
#define LIBC_NEW_QURT_TIME_NEW_QURT_TIME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t libc_new_qurt_time_time(void* tloc);
int64_t libc_new_qurt_time_clock(void);
double libc_new_qurt_time_difftime(int64_t time1, int64_t time0);
int64_t libc_new_qurt_time_mktime(void* tm);
void* libc_new_qurt_time_gmtime(void* timep);
void* libc_new_qurt_time_gmtimeR(void* timep, void* result);
void* libc_new_qurt_time_localtime(void* timep);
void* libc_new_qurt_time_localtimeR(void* timep, void* result);
char* libc_new_qurt_time_asctime(void* tm);
char* libc_new_qurt_time_asctimeR(void* tm, char* buf);
char* libc_new_qurt_time_ctime(void* timep);
char* libc_new_qurt_time_ctimeR(void* timep, char* buf);
uint64_t libc_new_qurt_time_strftime(char* s, uint64_t maxsize, const char* format, void* timeptr);
char* libc_new_qurt_time_strptime(const char* s, const char* format, void* tm);
int32_t libc_new_qurt_time_clockGettime(int32_t clk_id, void* tp);
int32_t libc_new_qurt_time_nanosleep(void* req, void* rem);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_TIME_NEW_QURT_TIME_WRAPPER_H */
