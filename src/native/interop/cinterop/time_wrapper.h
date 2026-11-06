#ifndef LIBC_TIME_TIME_WRAPPER_H
#define LIBC_TIME_TIME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t libc_time_time(void* tloc);
int32_t libc_time_clock(void);
double libc_time_difftime(int64_t time1, int64_t time0);
int64_t libc_time_mktime(void* tm);
void* libc_time_gmtime(void* timep);
void* libc_time_gmtime_r(void* timep, void* result);
void* libc_time_localtime(void* timep);
void* libc_time_localtime_r(void* timep, void* result);
char* libc_time_asctime(void* tm);
char* libc_time_asctime_r(void* tm, char* buf);
char* libc_time_ctime(void* timep);
char* libc_time_ctime_r(void* timep, char* buf);
uint64_t libc_time_strftime(char* s, uint64_t maxsize, const char* format, void* timeptr);
char* libc_time_strptime(const char* s, const char* format, void* tm);
int32_t libc_time_clock_gettime(int32_t clk_id, void* tp);
int32_t libc_time_nanosleep(void* req, void* rem);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_TIME_TIME_WRAPPER_H */
