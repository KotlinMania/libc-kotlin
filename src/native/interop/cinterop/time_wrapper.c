#include "time_wrapper.h"
#include <errno.h>
#include <time.h>

int64_t libc_time_time(void* tloc) {
    return (int64_t)time(tloc);
}

int32_t libc_time_clock(void) {
    return (int32_t)clock();
}

double libc_time_difftime(int64_t time1, int64_t time0) {
    return (double)difftime(time1, time0);
}

int64_t libc_time_mktime(void* tm) {
    return (int64_t)mktime(tm);
}

void* libc_time_gmtime(void* timep) {
    return (void*)gmtime(timep);
}

void* libc_time_gmtime_r(void* timep, void* result) {
    return (void*)gmtime_r(timep, result);
}

void* libc_time_localtime(void* timep) {
    return (void*)localtime(timep);
}

void* libc_time_localtime_r(void* timep, void* result) {
    return (void*)localtime_r(timep, result);
}

char* libc_time_asctime(void* tm) {
    return (char*)asctime(tm);
}

char* libc_time_asctime_r(void* tm, char* buf) {
    return (char*)asctime_r(tm, buf);
}

char* libc_time_ctime(void* timep) {
    return (char*)ctime(timep);
}

char* libc_time_ctime_r(void* timep, char* buf) {
    return (char*)ctime_r(timep, buf);
}

uint64_t libc_time_strftime(char* s, uint64_t maxsize, const char* format, void* timeptr) {
    return (uint64_t)strftime(s, maxsize, format, timeptr);
}

char* libc_time_strptime(const char* s, const char* format, void* tm) {
    return (char*)strptime(s, format, tm);
}

int32_t libc_time_clock_gettime(int32_t clk_id, void* tp) {
    return (int32_t)clock_gettime(clk_id, tp);
}

int32_t libc_time_nanosleep(void* req, void* rem) {
    return (int32_t)nanosleep(req, rem);
}

