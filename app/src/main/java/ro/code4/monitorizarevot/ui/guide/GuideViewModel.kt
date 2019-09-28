package ro.code4.monitorizarevot.ui.guide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ro.code4.monitorizarevot.BuildConfig
import ro.code4.monitorizarevot.ui.base.BaseViewModel

class GuideViewModel : BaseViewModel() {
    private val urlLiveData = MutableLiveData<String>().apply {
        value = "https://docs.google.com/gview?embedded=true&url=${BuildConfig.GUIDE_URL}"
    }

    fun url(): LiveData<String> = urlLiveData
}