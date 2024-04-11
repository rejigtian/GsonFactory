package com.test.rejig

import com.google.gson.annotations.SerializedName

data class SimpleData (
    @SerializedName("data")
    val data : SimpleData2 = SimpleData2(),
    @SerializedName("desc")
    val introDesc : String = ""
)

data class SimpleData2 (
    @SerializedName("data")
    val shareData : SimpleJavaData = SimpleJavaData(),
    @SerializedName("desc")
    val introDesc : String = ""
)