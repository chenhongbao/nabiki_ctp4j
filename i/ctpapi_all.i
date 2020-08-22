%module(directors="1") ThostFtdcCtpApi 
%{
#pragma warning(disable:4267)
#include "ThostFtdcTraderApi.h"
#include "ThostFtdcMdApi.h"
#pragma comment(lib, "thostmduserapi_se.lib")
#pragma comment(lib, "thosttraderapi_se.lib")
#include <codecvt>
#include <locale>
#include <vector>
#include <string>
using namespace std;
#ifdef _MSC_VER
const static locale g_loc("zh-CN");
#else    
const static locale g_loc("zh_CN.GB18030");
#endif
%}
 
%typemap(out) char[ANY], char[] {
	jclass str_cls = jenv->FindClass("java/lang/String");
	jmethodID constructor_mid = jenv-> GetMethodID(str_cls,"<init>","([BLjava/lang/String;)V");
	jbyteArray bytes = jenv->NewByteArray(strlen(result));
	jenv->SetByteArrayRegion(bytes, 0, strlen(result),(const jbyte*) result);
	jstring charset = jenv->NewStringUTF("gb2312");
	jresult = (jstring)jenv->NewObject(str_cls, constructor_mid, bytes, charset);
	jenv->DeleteLocalRef(charset);
	jenv->DeleteLocalRef(bytes);
	jenv->DeleteLocalRef(str_cls);
}

%feature("director") CThostFtdcTraderSpi;
%feature("director") CThostFtdcMdSpi;

%ignore THOST_FTDC_VTC_BankBankToFuture;
%ignore THOST_FTDC_VTC_BankFutureToBank;
%ignore THOST_FTDC_VTC_FutureBankToFuture;
%ignore THOST_FTDC_VTC_FutureFutureToBank;
%ignore THOST_FTDC_FTC_BankLaunchBankToBroker;
%ignore THOST_FTDC_FTC_BrokerLaunchBankToBroker;
%ignore THOST_FTDC_FTC_BankLaunchBrokerToBank;
%ignore THOST_FTDC_FTC_BrokerLaunchBrokerToBank;  

%include "ThostFtdcUserApiDataType.h"
%include "ThostFtdcUserApiStruct.h" 
%include "ThostFtdcTraderApi.h"   
%include "ThostFtdcMdApi.h"