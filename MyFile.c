#include "JNIForAdd.h"

JNIEXPORT jint JNICALL Java_JNIForAdd_add
(JNIEnv *i, jobject j, jint k, jint l)
{
	return k+l;
}