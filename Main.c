#include <jni.h>
#include "Main.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_Main_sayHello(JNIEnv* env, jobject obj) {
    printf("Hello from C!\n");
    fflush(stdout);  // 确保输出立即显示
} 