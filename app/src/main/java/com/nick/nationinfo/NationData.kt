package com.nick.nationinfo

data class NationDataDetailData (val name:String,
                                 val capital:String,
                                 val location:String,
                                 val volume:String,
                                 val weather:String,
                                 val lnaguage:String)

data class GsonData(val data:ArrayList<NationDataDetailData>)
