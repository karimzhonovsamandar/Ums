package com.sammy.ums

import com.sammy.ums.models.Service

object ServiceData {

    lateinit var tariflarList: ArrayList<Service>
    lateinit var daqiqalarList: ArrayList<Service>
    lateinit var internetList: ArrayList<Service>
    lateinit var xizmatlarList: ArrayList<Service>
    lateinit var smsList: ArrayList<Service>


    fun addService() {
        tariflarList = ArrayList()
        tariflarList.add(Service("Mobi 20", "20000 so'm", "*100*200#"))
        tariflarList.add(Service("Mobi 30", "30000 so'm", "*100*210#"))
        tariflarList.add(Service("Mobi 40", "40000 so'm", "*100*220#"))
        tariflarList.add(Service("Mobi 50", "50000 so'm", "*100*230#"))
        tariflarList.add(Service("Mobi 60", "60000 so'm", "*100*240#"))
        tariflarList.add(Service("Mobi 70", "70000 so'm", "*100*250#"))

        daqiqalarList = ArrayList()
        daqiqalarList.add(Service("20 daqiqa", "2000 so'm", "*200*200#"))
        daqiqalarList.add(Service("30 daqiqa", "3000 so'm", "*200*210#"))
        daqiqalarList.add(Service("40 daqiqa", "4000 so'm", "*200*220#"))
        daqiqalarList.add(Service("50 daqiqa", "5000 so'm", "*200*230#"))
        daqiqalarList.add(Service("60 daqiqa", "6000 so'm", "*200*240#"))
        daqiqalarList.add(Service("70 daqiqa", "7000 so'm", "*200*250#"))

        internetList = ArrayList()
        internetList.add(Service("1000 MB", "40000 so'm", "*300*200#"))
        internetList.add(Service("2000 MB", "50000 so'm", "*300*210#"))
        internetList.add(Service("3000 MB", "60000 so'm", "*300*220#"))
        internetList.add(Service("4000 MB", "70000 so'm", "*300*230#"))
        internetList.add(Service("5000 MB", "80000 so'm", "*300*240#"))
        internetList.add(Service("6000 MB", "90000 so'm", "*300*250#"))

        xizmatlarList = ArrayList()
        xizmatlarList.add(Service("Rouming 50", "100000 so'm", "*123*200#"))
        xizmatlarList.add(Service("Rouming 100", "500000 so'm", "*123*210#"))
        xizmatlarList.add(Service("Rouming 150", "600000 so'm", "*123*220#"))
        xizmatlarList.add(Service("Rouming 200", "700000 so'm", "*123*230#"))
        xizmatlarList.add(Service("Rouming 250", "800000 so'm", "*123*240#"))
        xizmatlarList.add(Service("Rouming 300", "900000 so'm", "*123*250#"))


        smsList = ArrayList()
        smsList.add(Service("SMS 400", "25000 so'm", "*456*200#"))
        smsList.add(Service("SMS 500", "30000 so'm", "*456*210#"))
        smsList.add(Service("SMS 600", "44000 so'm", "*456*220#"))
        smsList.add(Service("SMS 700", "55000 so'm", "*456*230#"))
        smsList.add(Service("SMS 800", "80000 so'm", "*456*240#"))
        smsList.add(Service("SMS 900", "70000 so'm", "*456*250#"))


    }
}