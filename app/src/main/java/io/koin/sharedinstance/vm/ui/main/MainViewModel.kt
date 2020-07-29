package io.koin.sharedinstance.vm.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

  val text = MutableLiveData<String>().apply {
    value = "Default Value"
  }

  init {
    Log.d("MainViewModel", "init()")
  }

  override fun onCleared() {
    super.onCleared()
    Log.d("MainViewModel", "onCleared()")
  }
}